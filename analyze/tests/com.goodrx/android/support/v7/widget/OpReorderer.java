package android.support.v7.widget;

import android.support.v7.widget.AdapterHelper;
import java.util.List;

class OpReorderer {
   final OpReorderer.Callback mCallback;

   public OpReorderer(OpReorderer.Callback var1) {
      this.mCallback = var1;
   }

   private int getLastMoveOutOfOrder(List<AdapterHelper.UpdateOp> var1) {
      boolean var2 = false;

      for(int var3 = -1 + var1.size(); var3 >= 0; --var3) {
         if(((AdapterHelper.UpdateOp)var1.get(var3)).cmd == 8) {
            if(var2) {
               return var3;
            }
         } else {
            var2 = true;
         }
      }

      return -1;
   }

   private void swapMoveAdd(List<AdapterHelper.UpdateOp> var1, int var2, AdapterHelper.UpdateOp var3, int var4, AdapterHelper.UpdateOp var5) {
      int var6 = var3.itemCount;
      int var7 = var5.positionStart;
      int var8 = 0;
      if(var6 < var7) {
         var8 = 0 - 1;
      }

      if(var3.positionStart < var5.positionStart) {
         ++var8;
      }

      if(var5.positionStart <= var3.positionStart) {
         var3.positionStart += var5.itemCount;
      }

      if(var5.positionStart <= var3.itemCount) {
         var3.itemCount += var5.itemCount;
      }

      var5.positionStart += var8;
      var1.set(var2, var5);
      var1.set(var4, var3);
   }

   private void swapMoveOp(List<AdapterHelper.UpdateOp> var1, int var2, int var3) {
      AdapterHelper.UpdateOp var4 = (AdapterHelper.UpdateOp)var1.get(var2);
      AdapterHelper.UpdateOp var5 = (AdapterHelper.UpdateOp)var1.get(var3);
      switch(var5.cmd) {
      case 1:
         this.swapMoveAdd(var1, var2, var4, var3, var5);
         return;
      case 2:
         this.swapMoveRemove(var1, var2, var4, var3, var5);
         return;
      case 3:
      default:
         return;
      case 4:
         this.swapMoveUpdate(var1, var2, var4, var3, var5);
      }
   }

   void reorderOps(List<AdapterHelper.UpdateOp> var1) {
      while(true) {
         int var2 = this.getLastMoveOutOfOrder(var1);
         if(var2 == -1) {
            return;
         }

         this.swapMoveOp(var1, var2, var2 + 1);
      }
   }

   void swapMoveRemove(List<AdapterHelper.UpdateOp> var1, int var2, AdapterHelper.UpdateOp var3, int var4, AdapterHelper.UpdateOp var5) {
      AdapterHelper.UpdateOp var6 = null;
      boolean var7;
      boolean var10;
      if(var3.positionStart < var3.itemCount) {
         int var22 = var5.positionStart;
         int var23 = var3.positionStart;
         var7 = false;
         var10 = false;
         if(var22 == var23) {
            int var24 = var5.itemCount;
            int var25 = var3.itemCount - var3.positionStart;
            var7 = false;
            var10 = false;
            if(var24 == var25) {
               var10 = true;
            }
         }
      } else {
         var7 = true;
         int var8 = var5.positionStart;
         int var9 = 1 + var3.itemCount;
         var10 = false;
         if(var8 == var9) {
            int var11 = var5.itemCount;
            int var12 = var3.positionStart - var3.itemCount;
            var10 = false;
            if(var11 == var12) {
               var10 = true;
            }
         }
      }

      if(var3.itemCount < var5.positionStart) {
         var5.positionStart += -1;
      } else if(var3.itemCount < var5.positionStart + var5.itemCount) {
         var5.itemCount += -1;
         var3.cmd = 2;
         var3.itemCount = 1;
         if(var5.itemCount == 0) {
            var1.remove(var4);
            this.mCallback.recycleUpdateOp(var5);
            return;
         }

         return;
      }

      if(var3.positionStart <= var5.positionStart) {
         ++var5.positionStart;
      } else {
         int var14 = var3.positionStart;
         int var15 = var5.positionStart + var5.itemCount;
         var6 = null;
         if(var14 < var15) {
            int var16 = var5.positionStart + var5.itemCount - var3.positionStart;
            var6 = this.mCallback.obtainUpdateOp(2, 1 + var3.positionStart, var16, (Object)null);
            var5.itemCount = var3.positionStart - var5.positionStart;
         }
      }

      if(var10) {
         var1.set(var2, var5);
         var1.remove(var4);
         this.mCallback.recycleUpdateOp(var3);
      } else {
         if(var7) {
            if(var6 != null) {
               if(var3.positionStart > var6.positionStart) {
                  var3.positionStart -= var6.itemCount;
               }

               if(var3.itemCount > var6.positionStart) {
                  var3.itemCount -= var6.itemCount;
               }
            }

            if(var3.positionStart > var5.positionStart) {
               var3.positionStart -= var5.itemCount;
            }

            if(var3.itemCount > var5.positionStart) {
               var3.itemCount -= var5.itemCount;
            }
         } else {
            if(var6 != null) {
               if(var3.positionStart >= var6.positionStart) {
                  var3.positionStart -= var6.itemCount;
               }

               if(var3.itemCount >= var6.positionStart) {
                  var3.itemCount -= var6.itemCount;
               }
            }

            if(var3.positionStart >= var5.positionStart) {
               var3.positionStart -= var5.itemCount;
            }

            if(var3.itemCount >= var5.positionStart) {
               var3.itemCount -= var5.itemCount;
            }
         }

         var1.set(var2, var5);
         if(var3.positionStart != var3.itemCount) {
            var1.set(var4, var3);
         } else {
            var1.remove(var4);
         }

         if(var6 != null) {
            var1.add(var2, var6);
            return;
         }
      }

   }

   void swapMoveUpdate(List<AdapterHelper.UpdateOp> var1, int var2, AdapterHelper.UpdateOp var3, int var4, AdapterHelper.UpdateOp var5) {
      AdapterHelper.UpdateOp var6 = null;
      AdapterHelper.UpdateOp var7 = null;
      if(var3.itemCount < var5.positionStart) {
         var5.positionStart += -1;
      } else {
         int var8 = var3.itemCount;
         int var9 = var5.positionStart + var5.itemCount;
         var6 = null;
         if(var8 < var9) {
            var5.itemCount += -1;
            var6 = this.mCallback.obtainUpdateOp(4, var3.positionStart, 1, var5.payload);
         }
      }

      if(var3.positionStart <= var5.positionStart) {
         ++var5.positionStart;
      } else {
         int var10 = var3.positionStart;
         int var11 = var5.positionStart + var5.itemCount;
         var7 = null;
         if(var10 < var11) {
            int var12 = var5.positionStart + var5.itemCount - var3.positionStart;
            var7 = this.mCallback.obtainUpdateOp(4, 1 + var3.positionStart, var12, var5.payload);
            var5.itemCount -= var12;
         }
      }

      var1.set(var4, var3);
      if(var5.itemCount > 0) {
         var1.set(var2, var5);
      } else {
         var1.remove(var2);
         this.mCallback.recycleUpdateOp(var5);
      }

      if(var6 != null) {
         var1.add(var2, var6);
      }

      if(var7 != null) {
         var1.add(var2, var7);
      }

   }

   interface Callback {
      AdapterHelper.UpdateOp obtainUpdateOp(int var1, int var2, int var3, Object var4);

      void recycleUpdateOp(AdapterHelper.UpdateOp var1);
   }
}

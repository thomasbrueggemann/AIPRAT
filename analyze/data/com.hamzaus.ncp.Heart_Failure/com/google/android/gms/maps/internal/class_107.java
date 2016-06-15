package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

// $FF: renamed from: com.google.android.gms.maps.internal.k
public interface class_107 extends IInterface {
   void onMapLongClick(LatLng var1) throws RemoteException;

   public abstract static class class_1143 extends Binder implements class_107 {
      public class_1143() {
         this.attachInterface(this, "com.google.android.gms.maps.internal.IOnMapLongClickListener");
      }

      // $FF: renamed from: aJ (android.os.IBinder) com.google.android.gms.maps.internal.k
      public static class_107 method_3307(IBinder var0) {
         if(var0 == null) {
            return null;
         } else {
            IInterface var1 = var0.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
            return (class_107)(var1 != null && var1 instanceof class_107?(class_107)var1:new class_107.class_1144(var0));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException {
         switch(var1) {
         case 1:
            var2.enforceInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
            LatLng var5;
            if(var2.readInt() != 0) {
               var5 = LatLng.CREATOR.createFromParcel(var2);
            } else {
               var5 = null;
            }

            this.onMapLongClick(var5);
            var3.writeNoException();
            return true;
         case 1598968902:
            var3.writeString("com.google.android.gms.maps.internal.IOnMapLongClickListener");
            return true;
         default:
            return super.onTransact(var1, var2, var3, var4);
         }
      }
   }

   private static class class_1144 implements class_107 {
      // $FF: renamed from: ko android.os.IBinder
      private IBinder field_3516;

      class_1144(IBinder var1) {
         this.field_3516 = var1;
      }

      public IBinder asBinder() {
         return this.field_3516;
      }

      public void onMapLongClick(LatLng param1) throws RemoteException {
         // $FF: Couldn't be decompiled
      }
   }
}
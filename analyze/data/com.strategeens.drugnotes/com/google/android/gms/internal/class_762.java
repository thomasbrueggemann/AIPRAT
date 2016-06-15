package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_704;
import com.google.android.gms.common.internal.safeparcel.class_705;
import com.google.android.gms.internal.class_761;
import com.google.android.gms.internal.class_763;
import com.google.android.gms.internal.ns;

// $FF: renamed from: com.google.android.gms.internal.nt
public class class_762 implements Creator<ns> {
   // $FF: renamed from: a (com.google.android.gms.internal.ns, android.os.Parcel, int) void
   static void method_4361(class_761 var0, Parcel var1, int var2) {
      int var3 = class_704.method_4025(var1);
      class_704.method_4050(var1, 1, var0.method_4358());
      class_704.method_4050(var1, 1000, var0.getVersionCode());
      class_704.method_4050(var1, 2, var0.method_4359());
      class_704.method_4034(var1, 3, var0.method_4360(), var2, false);
      class_704.method_4026(var1, var3);
   }

   // $FF: renamed from: cP (android.os.Parcel) com.google.android.gms.internal.ns
   public class_761 method_4362(Parcel var1) {
      int var2 = 0;
      int var3 = class_705.method_4059(var1);
      int var4 = -1;
      class_763 var5 = null;
      int var6 = 0;

      while(var1.dataPosition() < var3) {
         int var7 = class_705.method_4058(var1);
         switch(class_705.method_4065(var7)) {
         case 1:
            var2 = class_705.method_4073(var1, var7);
            break;
         case 2:
            var4 = class_705.method_4073(var1, var7);
            break;
         case 3:
            var5 = (class_763)class_705.method_4061(var1, var7, class_763.CREATOR);
            break;
         case 1000:
            var6 = class_705.method_4073(var1, var7);
            break;
         default:
            class_705.method_4066(var1, var7);
         }
      }

      if(var1.dataPosition() != var3) {
         throw new class_705.class_1425("Overread allowed size end=" + var3, var1);
      } else {
         return new class_761(var6, var2, var4, var5);
      }
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_4362(var1);
   }

   // $FF: renamed from: eL (int) com.google.android.gms.internal.ns[]
   public class_761[] method_4363(int var1) {
      return new class_761[var1];
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_4363(var1);
   }
}
package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_704;
import com.google.android.gms.common.internal.safeparcel.class_705;
import com.google.android.gms.internal.class_788;
import com.google.android.gms.internal.py;

// $FF: renamed from: com.google.android.gms.internal.pz
public class class_789 implements Creator<py> {
   // $FF: renamed from: a (com.google.android.gms.internal.py, android.os.Parcel, int) void
   static void method_4412(class_788 var0, Parcel var1, int var2) {
      int var3 = class_704.method_4025(var1);
      class_704.method_4050(var1, 1, var0.getVersionCode());
      class_704.method_4045(var1, 2, var0.avY, false);
      class_704.method_4046(var1, 3, var0.avZ, false);
      class_704.method_4026(var1, var3);
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_4413(var1);
   }

   // $FF: renamed from: dY (android.os.Parcel) com.google.android.gms.internal.py
   public class_788 method_4413(Parcel var1) {
      String[] var2 = null;
      int var3 = class_705.method_4059(var1);
      int var4 = 0;
      byte[][] var5 = (byte[][])null;

      while(var1.dataPosition() < var3) {
         int var6 = class_705.method_4058(var1);
         switch(class_705.method_4065(var6)) {
         case 1:
            var4 = class_705.method_4073(var1, var6);
            break;
         case 2:
            var2 = class_705.method_4053(var1, var6);
            break;
         case 3:
            var5 = class_705.method_4085(var1, var6);
            break;
         default:
            class_705.method_4066(var1, var6);
         }
      }

      if(var1.dataPosition() != var3) {
         throw new class_705.class_1425("Overread allowed size end=" + var3, var1);
      } else {
         return new class_788(var4, var2, var5);
      }
   }

   // $FF: renamed from: gf (int) com.google.android.gms.internal.py[]
   public class_788[] method_4414(int var1) {
      return new class_788[var1];
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_4414(var1);
   }
}
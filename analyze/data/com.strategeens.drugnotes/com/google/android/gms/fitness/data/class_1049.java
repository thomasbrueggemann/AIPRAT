package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_704;
import com.google.android.gms.common.internal.safeparcel.class_705;
import com.google.android.gms.fitness.data.a;
import com.google.android.gms.fitness.data.class_1051;

// $FF: renamed from: com.google.android.gms.fitness.data.b
public class class_1049 implements Creator<a> {
   // $FF: renamed from: a (com.google.android.gms.fitness.data.a, android.os.Parcel, int) void
   static void method_5755(class_1051 var0, Parcel var1, int var2) {
      int var3 = class_704.method_4025(var1);
      class_704.method_4038(var1, 1, var0.getPackageName(), false);
      class_704.method_4050(var1, 1000, var0.getVersionCode());
      class_704.method_4038(var1, 2, var0.getVersion(), false);
      class_704.method_4038(var1, 3, var0.method_5762(), false);
      class_704.method_4026(var1, var3);
   }

   // $FF: renamed from: bq (android.os.Parcel) com.google.android.gms.fitness.data.a
   public class_1051 method_5756(Parcel var1) {
      String var2 = null;
      int var3 = class_705.method_4059(var1);
      int var4 = 0;
      String var5 = null;
      String var6 = null;

      while(var1.dataPosition() < var3) {
         int var7 = class_705.method_4058(var1);
         switch(class_705.method_4065(var7)) {
         case 1:
            var6 = class_705.method_4081(var1, var7);
            break;
         case 2:
            var5 = class_705.method_4081(var1, var7);
            break;
         case 3:
            var2 = class_705.method_4081(var1, var7);
            break;
         case 1000:
            var4 = class_705.method_4073(var1, var7);
            break;
         default:
            class_705.method_4066(var1, var7);
         }
      }

      if(var1.dataPosition() != var3) {
         throw new class_705.class_1425("Overread allowed size end=" + var3, var1);
      } else {
         return new class_1051(var4, var6, var5, var2);
      }
   }

   // $FF: renamed from: cH (int) com.google.android.gms.fitness.data.a[]
   public class_1051[] method_5757(int var1) {
      return new class_1051[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_5756(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_5757(var1);
   }
}
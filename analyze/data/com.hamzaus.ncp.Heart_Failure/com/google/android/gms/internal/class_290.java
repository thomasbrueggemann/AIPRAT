package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_599;
import com.google.android.gms.common.internal.safeparcel.class_600;
import com.google.android.gms.internal.class_296;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.internal.ie
public class class_290 implements Creator<class_296.class_957> {
   // $FF: renamed from: a (com.google.android.gms.internal.ic$a, android.os.Parcel, int) void
   static void method_1955(class_296.class_957 var0, Parcel var1, int var2) {
      int var3 = class_599.method_3354(var1);
      class_599.method_3381(var1, 1, var0.versionCode);
      class_599.method_3369(var1, 2, var0.className, false);
      class_599.method_3380(var1, 3, var0.field_3267, false);
      class_599.method_3357(var1, var3);
   }

   // $FF: renamed from: K (android.os.Parcel) com.google.android.gms.internal.ic$a
   public class_296.class_957 method_1956(Parcel var1) {
      ArrayList var2 = null;
      int var3 = class_600.method_3385(var1);
      int var4 = 0;
      String var5 = null;

      while(var1.dataPosition() < var3) {
         int var6 = class_600.method_3383(var1);
         switch(class_600.method_3394(var6)) {
         case 1:
            var4 = class_600.method_3402(var1, var6);
            break;
         case 2:
            var5 = class_600.method_3410(var1, var6);
            break;
         case 3:
            var2 = class_600.method_3397(var1, var6, class_296.class_958.CREATOR);
            break;
         default:
            class_600.method_3395(var1, var6);
         }
      }

      if(var1.dataPosition() != var3) {
         throw new class_600.class_1103("Overread allowed size end=" + var3, var1);
      } else {
         return new class_296.class_957(var4, var5, var2);
      }
   }

   // $FF: renamed from: az (int) com.google.android.gms.internal.ic$a[]
   public class_296.class_957[] method_1957(int var1) {
      return new class_296.class_957[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1956(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1957(var1);
   }
}
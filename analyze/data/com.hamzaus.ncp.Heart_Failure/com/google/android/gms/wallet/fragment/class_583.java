package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_599;
import com.google.android.gms.common.internal.safeparcel.class_600;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
import com.google.android.gms.wallet.fragment.WalletFragmentStyle;

// $FF: renamed from: com.google.android.gms.wallet.fragment.b
public class class_583 implements Creator<WalletFragmentOptions> {
   // $FF: renamed from: a (com.google.android.gms.wallet.fragment.WalletFragmentOptions, android.os.Parcel, int) void
   static void method_3264(WalletFragmentOptions var0, Parcel var1, int var2) {
      int var3 = class_599.method_3354(var1);
      class_599.method_3381(var1, 1, var0.field_4236);
      class_599.method_3381(var1, 2, var0.getEnvironment());
      class_599.method_3381(var1, 3, var0.getTheme());
      class_599.method_3365(var1, 4, var0.getFragmentStyle(), var2, false);
      class_599.method_3381(var1, 5, var0.getMode());
      class_599.method_3357(var1, var3);
   }

   // $FF: renamed from: ch (android.os.Parcel) com.google.android.gms.wallet.fragment.WalletFragmentOptions
   public WalletFragmentOptions method_3265(Parcel var1) {
      int var2 = 1;
      int var3 = 0;
      int var4 = class_600.method_3385(var1);
      WalletFragmentStyle var5 = null;
      int var6 = var2;
      int var7 = 0;

      while(var1.dataPosition() < var4) {
         int var8 = class_600.method_3383(var1);
         switch(class_600.method_3394(var8)) {
         case 1:
            var7 = class_600.method_3402(var1, var8);
            break;
         case 2:
            var6 = class_600.method_3402(var1, var8);
            break;
         case 3:
            var3 = class_600.method_3402(var1, var8);
            break;
         case 4:
            var5 = (WalletFragmentStyle)class_600.method_3390(var1, var8, WalletFragmentStyle.CREATOR);
            break;
         case 5:
            var2 = class_600.method_3402(var1, var8);
            break;
         default:
            class_600.method_3395(var1, var8);
         }
      }

      if(var1.dataPosition() != var4) {
         throw new class_600.class_1103("Overread allowed size end=" + var4, var1);
      } else {
         return new WalletFragmentOptions(var7, var6, var3, var5, var2);
      }
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_3265(var1);
   }

   // $FF: renamed from: dO (int) com.google.android.gms.wallet.fragment.WalletFragmentOptions[]
   public WalletFragmentOptions[] method_3266(int var1) {
      return new WalletFragmentOptions[var1];
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_3266(var1);
   }
}
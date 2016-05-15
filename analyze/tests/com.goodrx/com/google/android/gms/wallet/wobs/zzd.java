package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;

public class zzd implements Creator<LoyaltyPointsBalance> {
   static void zza(LoyaltyPointsBalance var0, Parcel var1, int var2) {
      int var3 = com.google.android.gms.common.internal.safeparcel.zzb.zzav(var1);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 1, var0.getVersionCode());
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 2, var0.zzbqJ);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 3, (String)var0.zzbqK, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 4, var0.zzbqL);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 5, (String)var0.zzboF, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 6, var0.zzbqM);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 7, var0.zzbqN);
      com.google.android.gms.common.internal.safeparcel.zzb.zzI(var1, var3);
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.zzhR(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.zzls(var1);
   }

   public LoyaltyPointsBalance zzhR(Parcel var1) {
      String var2 = null;
      int var3 = 0;
      int var4 = com.google.android.gms.common.internal.safeparcel.zza.zzau(var1);
      double var5 = 0.0D;
      long var7 = 0L;
      int var9 = -1;
      String var10 = null;
      int var11 = 0;

      while(var1.dataPosition() < var4) {
         int var12 = com.google.android.gms.common.internal.safeparcel.zza.zzat(var1);
         switch(com.google.android.gms.common.internal.safeparcel.zza.zzca(var12)) {
         case 1:
            var11 = com.google.android.gms.common.internal.safeparcel.zza.zzg(var1, var12);
            break;
         case 2:
            var3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(var1, var12);
            break;
         case 3:
            var10 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var12);
            break;
         case 4:
            var5 = com.google.android.gms.common.internal.safeparcel.zza.zzn(var1, var12);
            break;
         case 5:
            var2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var12);
            break;
         case 6:
            var7 = com.google.android.gms.common.internal.safeparcel.zza.zzi(var1, var12);
            break;
         case 7:
            var9 = com.google.android.gms.common.internal.safeparcel.zza.zzg(var1, var12);
            break;
         default:
            com.google.android.gms.common.internal.safeparcel.zza.zzb(var1, var12);
         }
      }

      if(var1.dataPosition() != var4) {
         throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + var4, var1);
      } else {
         return new LoyaltyPointsBalance(var11, var3, var10, var5, var2, var7, var9);
      }
   }

   public LoyaltyPointsBalance[] zzls(int var1) {
      return new LoyaltyPointsBalance[var1];
   }
}

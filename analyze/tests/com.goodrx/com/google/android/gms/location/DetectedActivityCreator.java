package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.DetectedActivity;

public class DetectedActivityCreator implements Creator<DetectedActivity> {
   static void zza(DetectedActivity var0, Parcel var1, int var2) {
      int var3 = com.google.android.gms.common.internal.safeparcel.zzb.zzav(var1);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 1, var0.zzaNA);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 1000, var0.getVersionCode());
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 2, var0.zzaNB);
      com.google.android.gms.common.internal.safeparcel.zzb.zzI(var1, var3);
   }

   public DetectedActivity createFromParcel(Parcel var1) {
      int var2 = 0;
      int var3 = com.google.android.gms.common.internal.safeparcel.zza.zzau(var1);
      int var4 = 0;
      int var5 = 0;

      while(var1.dataPosition() < var3) {
         int var6 = com.google.android.gms.common.internal.safeparcel.zza.zzat(var1);
         switch(com.google.android.gms.common.internal.safeparcel.zza.zzca(var6)) {
         case 1:
            var4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(var1, var6);
            break;
         case 2:
            var2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(var1, var6);
            break;
         case 1000:
            var5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(var1, var6);
            break;
         default:
            com.google.android.gms.common.internal.safeparcel.zza.zzb(var1, var6);
         }
      }

      if(var1.dataPosition() != var3) {
         throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + var3, var1);
      } else {
         return new DetectedActivity(var5, var4, var2);
      }
   }

   public DetectedActivity[] newArray(int var1) {
      return new DetectedActivity[var1];
   }
}

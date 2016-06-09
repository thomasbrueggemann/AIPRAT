package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.location.places.PlacePhotoResult;

public class zzi implements Creator<PlacePhotoResult> {
   static void zza(PlacePhotoResult var0, Parcel var1, int var2) {
      int var3 = com.google.android.gms.common.internal.safeparcel.zzb.zzav(var1);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 1, (Parcelable)var0.getStatus(), var2, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 1000, var0.mVersionCode);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 2, (Parcelable)var0.zzaPG, var2, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzI(var1, var3);
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.zzfg(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.zzhR(var1);
   }

   public PlacePhotoResult zzfg(Parcel var1) {
      BitmapTeleporter var2 = null;
      int var3 = com.google.android.gms.common.internal.safeparcel.zza.zzau(var1);
      int var4 = 0;

      Status var5;
      BitmapTeleporter var7;
      for(var5 = null; var1.dataPosition() < var3; var2 = var7) {
         int var6 = com.google.android.gms.common.internal.safeparcel.zza.zzat(var1);
         Status var8;
         int var9;
         switch(com.google.android.gms.common.internal.safeparcel.zza.zzca(var6)) {
         case 1:
            Status var12 = (Status)com.google.android.gms.common.internal.safeparcel.zza.zza(var1, var6, Status.CREATOR);
            var9 = var4;
            var7 = var2;
            var8 = var12;
            break;
         case 2:
            var7 = (BitmapTeleporter)com.google.android.gms.common.internal.safeparcel.zza.zza(var1, var6, BitmapTeleporter.CREATOR);
            var8 = var5;
            var9 = var4;
            break;
         case 1000:
            int var10 = com.google.android.gms.common.internal.safeparcel.zza.zzg(var1, var6);
            var8 = var5;
            var9 = var10;
            var7 = var2;
            break;
         default:
            com.google.android.gms.common.internal.safeparcel.zza.zzb(var1, var6);
            var7 = var2;
            var8 = var5;
            var9 = var4;
         }

         var4 = var9;
         var5 = var8;
      }

      if(var1.dataPosition() != var3) {
         throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + var3, var1);
      } else {
         return new PlacePhotoResult(var4, var5, var2);
      }
   }

   public PlacePhotoResult[] zzhR(int var1) {
      return new PlacePhotoResult[var1];
   }
}
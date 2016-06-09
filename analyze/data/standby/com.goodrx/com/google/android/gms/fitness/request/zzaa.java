package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionStartRequest;

public class zzaa implements Creator<SessionStartRequest> {
   static void zza(SessionStartRequest var0, Parcel var1, int var2) {
      int var3 = com.google.android.gms.common.internal.safeparcel.zzb.zzav(var1);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 1, (Parcelable)var0.getSession(), var2, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 1000, var0.getVersionCode());
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 2, (IBinder)var0.getCallbackBinder(), false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzI(var1, var3);
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.zzdF(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.zzfG(var1);
   }

   public SessionStartRequest zzdF(Parcel var1) {
      IBinder var2 = null;
      int var3 = zza.zzau(var1);
      int var4 = 0;

      Session var5;
      IBinder var7;
      for(var5 = null; var1.dataPosition() < var3; var2 = var7) {
         int var6 = zza.zzat(var1);
         Session var8;
         int var9;
         switch(zza.zzca(var6)) {
         case 1:
            Session var12 = (Session)zza.zza(var1, var6, Session.CREATOR);
            var9 = var4;
            var7 = var2;
            var8 = var12;
            break;
         case 2:
            var7 = zza.zzq(var1, var6);
            var8 = var5;
            var9 = var4;
            break;
         case 1000:
            int var10 = zza.zzg(var1, var6);
            var8 = var5;
            var9 = var10;
            var7 = var2;
            break;
         default:
            zza.zzb(var1, var6);
            var7 = var2;
            var8 = var5;
            var9 = var4;
         }

         var4 = var9;
         var5 = var8;
      }

      if(var1.dataPosition() != var3) {
         throw new zza.zza("Overread allowed size end=" + var3, var1);
      } else {
         return new SessionStartRequest(var4, var5, var2);
      }
   }

   public SessionStartRequest[] zzfG(int var1) {
      return new SessionStartRequest[var1];
   }
}
package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import java.util.ArrayList;

public class zzad implements Creator<StartBleScanRequest> {
   static void zza(StartBleScanRequest var0, Parcel var1, int var2) {
      int var3 = com.google.android.gms.common.internal.safeparcel.zzb.zzav(var1);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 1, var0.getDataTypes(), false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 1000, var0.getVersionCode());
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 2, (IBinder)var0.zzvg(), false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 3, var0.getTimeoutSecs());
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 4, (IBinder)var0.getCallbackBinder(), false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzI(var1, var3);
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.zzdI(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.zzfJ(var1);
   }

   public StartBleScanRequest zzdI(Parcel var1) {
      int var2 = 0;
      IBinder var3 = null;
      int var4 = zza.zzau(var1);
      IBinder var5 = null;
      ArrayList var6 = null;
      int var7 = 0;

      while(var1.dataPosition() < var4) {
         int var8 = zza.zzat(var1);
         switch(zza.zzca(var8)) {
         case 1:
            var6 = zza.zzc(var1, var8, DataType.CREATOR);
            break;
         case 2:
            var5 = zza.zzq(var1, var8);
            break;
         case 3:
            var2 = zza.zzg(var1, var8);
            break;
         case 4:
            var3 = zza.zzq(var1, var8);
            break;
         case 1000:
            var7 = zza.zzg(var1, var8);
            break;
         default:
            zza.zzb(var1, var8);
         }
      }

      if(var1.dataPosition() != var4) {
         throw new zza.zza("Overread allowed size end=" + var4, var1);
      } else {
         return new StartBleScanRequest(var7, var6, var5, var2, var3);
      }
   }

   public StartBleScanRequest[] zzfJ(int var1) {
      return new StartBleScanRequest[var1];
   }
}

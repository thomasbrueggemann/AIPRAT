package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.internal.FileUploadPreferencesImpl;
import com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse;

public class zzax implements Creator<OnDeviceUsagePreferenceResponse> {
   static void zza(OnDeviceUsagePreferenceResponse var0, Parcel var1, int var2) {
      int var3 = com.google.android.gms.common.internal.safeparcel.zzb.zzav(var1);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 1, var0.mVersionCode);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 2, (Parcelable)var0.zzasg, var2, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzI(var1, var3);
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.zzbA(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.zzdv(var1);
   }

   public OnDeviceUsagePreferenceResponse zzbA(Parcel var1) {
      int var2 = com.google.android.gms.common.internal.safeparcel.zza.zzau(var1);
      int var3 = 0;
      FileUploadPreferencesImpl var4 = null;

      while(var1.dataPosition() < var2) {
         int var5 = com.google.android.gms.common.internal.safeparcel.zza.zzat(var1);
         switch(com.google.android.gms.common.internal.safeparcel.zza.zzca(var5)) {
         case 1:
            var3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(var1, var5);
            break;
         case 2:
            var4 = (FileUploadPreferencesImpl)com.google.android.gms.common.internal.safeparcel.zza.zza(var1, var5, FileUploadPreferencesImpl.CREATOR);
            break;
         default:
            com.google.android.gms.common.internal.safeparcel.zza.zzb(var1, var5);
         }
      }

      if(var1.dataPosition() != var2) {
         throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + var2, var1);
      } else {
         return new OnDeviceUsagePreferenceResponse(var3, var4);
      }
   }

   public OnDeviceUsagePreferenceResponse[] zzdv(int var1) {
      return new OnDeviceUsagePreferenceResponse[var1];
   }
}

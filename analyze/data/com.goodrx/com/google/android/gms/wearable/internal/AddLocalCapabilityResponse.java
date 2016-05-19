package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.internal.zzd;

public class AddLocalCapabilityResponse implements SafeParcelable {
   public static final Creator<AddLocalCapabilityResponse> CREATOR = new zzd();
   public final int statusCode;
   public final int versionCode;

   AddLocalCapabilityResponse(int var1, int var2) {
      this.versionCode = var1;
      this.statusCode = var2;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      zzd.zza(this, var1, var2);
   }
}
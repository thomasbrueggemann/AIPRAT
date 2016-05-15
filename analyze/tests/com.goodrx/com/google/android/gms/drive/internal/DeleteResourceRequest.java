package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.zzq;

public class DeleteResourceRequest implements SafeParcelable {
   public static final Creator<DeleteResourceRequest> CREATOR = new zzq();
   final int mVersionCode;
   final DriveId zzaqj;

   DeleteResourceRequest(int var1, DriveId var2) {
      this.mVersionCode = var1;
      this.zzaqj = var2;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      zzq.zza(this, var1, var2);
   }
}

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.b;
import com.google.android.gms.wallet.wobs.class_555;

// $FF: renamed from: com.google.android.gms.wallet.wobs.b
public final class class_556 implements SafeParcelable {
   public static final Creator<b> CREATOR = new class_555();
   String label;
   String value;
   // $FF: renamed from: xJ int
   private final int field_2972;

   class_556() {
      this.field_2972 = 1;
   }

   class_556(int var1, String var2, String var3) {
      this.field_2972 = var1;
      this.label = var2;
      this.value = var3;
   }

   public int describeContents() {
      return 0;
   }

   public int getVersionCode() {
      return this.field_2972;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_555.method_3140(this, var1, var2);
   }
}
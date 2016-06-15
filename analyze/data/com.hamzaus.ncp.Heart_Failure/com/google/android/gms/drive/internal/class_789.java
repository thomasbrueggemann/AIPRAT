package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.class_599;
import com.google.android.gms.common.internal.safeparcel.class_600;
import com.google.android.gms.drive.internal.OnListParentsResponse;

// $FF: renamed from: com.google.android.gms.drive.internal.al
public class class_789 implements Creator<OnListParentsResponse> {
   // $FF: renamed from: a (com.google.android.gms.drive.internal.OnListParentsResponse, android.os.Parcel, int) void
   static void method_4404(OnListParentsResponse var0, Parcel var1, int var2) {
      int var3 = class_599.method_3354(var1);
      class_599.method_3381(var1, 1, var0.field_3228);
      class_599.method_3365(var1, 2, var0.field_3227, var2, false);
      class_599.method_3357(var1, var3);
   }

   // $FF: renamed from: am (android.os.Parcel) com.google.android.gms.drive.internal.OnListParentsResponse
   public OnListParentsResponse method_4405(Parcel var1) {
      int var2 = class_600.method_3385(var1);
      int var3 = 0;
      DataHolder var4 = null;

      while(var1.dataPosition() < var2) {
         int var5 = class_600.method_3383(var1);
         switch(class_600.method_3394(var5)) {
         case 1:
            var3 = class_600.method_3402(var1, var5);
            break;
         case 2:
            var4 = (DataHolder)class_600.method_3390(var1, var5, DataHolder.CREATOR);
            break;
         default:
            class_600.method_3395(var1, var5);
         }
      }

      if(var1.dataPosition() != var2) {
         throw new class_600.class_1103("Overread allowed size end=" + var2, var1);
      } else {
         return new OnListParentsResponse(var3, var4);
      }
   }

   // $FF: renamed from: bi (int) com.google.android.gms.drive.internal.OnListParentsResponse[]
   public OnListParentsResponse[] method_4406(int var1) {
      return new OnListParentsResponse[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_4405(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_4406(var1);
   }
}
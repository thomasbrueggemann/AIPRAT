package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_823;
import com.google.android.gms.common.internal.safeparcel.class_824;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.NotFilter;

// $FF: renamed from: com.google.android.gms.drive.query.internal.k
public class class_1041 implements Creator<NotFilter> {
    // $FF: renamed from: a (com.google.android.gms.drive.query.internal.NotFilter, android.os.Parcel, int) void
    static void method_5403(NotFilter var0, Parcel var1, int var2) {
        int var3 = class_823.method_4298(var1);
        class_823.method_4325(var1, 1000, var0.field_2040);
        class_823.method_4309(var1, 1, var0.field_2041, var2, false);
        class_823.method_4301(var1, var3);
    }

    // $FF: renamed from: aS (android.os.Parcel) com.google.android.gms.drive.query.internal.NotFilter
    public NotFilter method_5404(Parcel var1) {
        int var2 = class_824.method_4331(var1);
        int var3 = 0;
        FilterHolder var4 = null;

        while(var1.dataPosition() < var2) {
            int var5 = class_824.method_4329(var1);
            switch(class_824.method_4340(var5)) {
                case 1:
                    var4 = (FilterHolder)class_824.method_4336(var1, var5, FilterHolder.CREATOR);
                    break;
                case 1000:
                    var3 = class_824.method_4348(var1, var5);
                    break;
                default:
                    class_824.method_4341(var1, var5);
            }
        }

        if(var1.dataPosition() != var2) {
            throw new class_824.class_1307("Overread allowed size end=" + var2, var1);
        } else {
            return new NotFilter(var3, var4);
        }
    }

    // $FF: renamed from: ce (int) com.google.android.gms.drive.query.internal.NotFilter[]
    public NotFilter[] method_5405(int var1) {
        return new NotFilter[var1];
    }

    // $FF: synthetic method
    public Object createFromParcel(Parcel var1) {
        return this.method_5404(var1);
    }

    // $FF: synthetic method
    public Object[] newArray(int var1) {
        return this.method_5405(var1);
    }
}
package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_823;
import com.google.android.gms.common.internal.safeparcel.class_824;
import com.google.android.gms.maps.model.LatLng;

// $FF: renamed from: com.google.android.gms.maps.model.i
public class class_978 implements Creator<LatLng> {
    // $FF: renamed from: a (com.google.android.gms.maps.model.LatLng, android.os.Parcel, int) void
    static void method_5160(LatLng var0, Parcel var1, int var2) {
        int var3 = class_823.method_4298(var1);
        class_823.method_4325(var1, 1, var0.getVersionCode());
        class_823.method_4303(var1, 2, var0.latitude);
        class_823.method_4303(var1, 3, var0.longitude);
        class_823.method_4301(var1, var3);
    }

    // $FF: renamed from: cM (android.os.Parcel) com.google.android.gms.maps.model.LatLng
    public LatLng method_5161(Parcel var1) {
        double var2 = 0.0D;
        int var4 = class_824.method_4331(var1);
        int var5 = 0;
        double var6 = var2;

        while(var1.dataPosition() < var4) {
            int var8 = class_824.method_4329(var1);
            switch(class_824.method_4340(var8)) {
                case 1:
                    var5 = class_824.method_4348(var1, var8);
                    break;
                case 2:
                    var6 = class_824.method_4354(var1, var8);
                    break;
                case 3:
                    var2 = class_824.method_4354(var1, var8);
                    break;
                default:
                    class_824.method_4341(var1, var8);
            }
        }

        if(var1.dataPosition() != var4) {
            throw new class_824.class_1307("Overread allowed size end=" + var4, var1);
        } else {
            return new LatLng(var5, var6, var2);
        }
    }

    // $FF: synthetic method
    public Object createFromParcel(Parcel var1) {
        return this.method_5161(var1);
    }

    // $FF: renamed from: eC (int) com.google.android.gms.maps.model.LatLng[]
    public LatLng[] method_5162(int var1) {
        return new LatLng[var1];
    }

    // $FF: synthetic method
    public Object[] newArray(int var1) {
        return this.method_5162(var1);
    }
}
package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_823;
import com.google.android.gms.common.internal.safeparcel.class_824;
import com.google.android.gms.identity.intents.model.CountrySpecification;

// $FF: renamed from: com.google.android.gms.identity.intents.model.a
public class class_943 implements Creator<CountrySpecification> {
    // $FF: renamed from: a (com.google.android.gms.identity.intents.model.CountrySpecification, android.os.Parcel, int) void
    static void method_4926(CountrySpecification var0, Parcel var1, int var2) {
        int var3 = class_823.method_4298(var1);
        class_823.method_4325(var1, 1, var0.getVersionCode());
        class_823.method_4313(var1, 2, var0.field_3911, false);
        class_823.method_4301(var1, var3);
    }

    // $FF: renamed from: cq (android.os.Parcel) com.google.android.gms.identity.intents.model.CountrySpecification
    public CountrySpecification method_4927(Parcel var1) {
        int var2 = class_824.method_4331(var1);
        int var3 = 0;
        String var4 = null;

        while(var1.dataPosition() < var2) {
            int var5 = class_824.method_4329(var1);
            switch(class_824.method_4340(var5)) {
                case 1:
                    var3 = class_824.method_4348(var1, var5);
                    break;
                case 2:
                    var4 = class_824.method_4356(var1, var5);
                    break;
                default:
                    class_824.method_4341(var1, var5);
            }
        }

        if(var1.dataPosition() != var2) {
            throw new class_824.class_1307("Overread allowed size end=" + var2, var1);
        } else {
            return new CountrySpecification(var3, var4);
        }
    }

    // $FF: synthetic method
    public Object createFromParcel(Parcel var1) {
        return this.method_4927(var1);
    }

    // $FF: renamed from: dY (int) com.google.android.gms.identity.intents.model.CountrySpecification[]
    public CountrySpecification[] method_4928(int var1) {
        return new CountrySpecification[var1];
    }

    // $FF: synthetic method
    public Object[] newArray(int var1) {
        return this.method_4928(var1);
    }
}
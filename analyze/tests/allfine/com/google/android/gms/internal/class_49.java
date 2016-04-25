package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.class_206;

// $FF: renamed from: com.google.android.gms.internal.dt
public interface class_49 extends IInterface {
    // $FF: renamed from: a (com.google.android.gms.dynamic.d) android.os.IBinder
    IBinder method_186(class_206 var1) throws RemoteException;

    public abstract static class class_1217 extends Binder implements class_49 {
        // $FF: renamed from: q (android.os.IBinder) com.google.android.gms.internal.dt
        public static class_49 method_4746(IBinder var0) {
            if(var0 == null) {
                return null;
            } else {
                IInterface var1 = var0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return (class_49)(var1 != null && var1 instanceof class_49?(class_49)var1:new class_49.class_1218(var0));
            }
        }

        public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException {
            switch(var1) {
                case 1:
                    var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    IBinder var5 = this.a(class_206.class_1795.method_5435(var2.readStrongBinder()));
                    var3.writeNoException();
                    var3.writeStrongBinder(var5);
                    return true;
                case 1598968902:
                    var3.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    return true;
                default:
                    return super.onTransact(var1, var2, var3, var4);
            }
        }
    }

    private static class class_1218 implements class_49 {
        // $FF: renamed from: lb android.os.IBinder
        private IBinder field_1691;

        class_1218(IBinder var1) {
            this.field_1691 = var1;
        }

        // $FF: renamed from: a (com.google.android.gms.dynamic.d) android.os.IBinder
        public IBinder method_186(class_206 param1) throws RemoteException {
            // $FF: Couldn't be decompiled
        }

        public IBinder asBinder() {
            return this.field_1691;
        }
    }
}
package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.class_599;
import com.google.android.gms.maps.model.Tile;

// $FF: renamed from: com.google.android.gms.maps.model.i
public class class_689 {
   // $FF: renamed from: a (com.google.android.gms.maps.model.Tile, android.os.Parcel, int) void
   static void method_4005(Tile var0, Parcel var1, int var2) {
      int var3 = class_599.method_3354(var1);
      class_599.method_3381(var1, 1, var0.getVersionCode());
      class_599.method_3381(var1, 2, var0.width);
      class_599.method_3381(var1, 3, var0.height);
      class_599.method_3373(var1, 4, var0.data, false);
      class_599.method_3357(var1, var3);
   }
}
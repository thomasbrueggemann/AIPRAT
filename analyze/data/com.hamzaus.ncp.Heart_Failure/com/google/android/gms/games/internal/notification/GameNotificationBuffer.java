package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.games.internal.notification.GameNotification;
import com.google.android.gms.games.internal.notification.GameNotificationRef;

public final class GameNotificationBuffer extends DataBuffer<GameNotification> {
   // $FF: renamed from: ct (int) com.google.android.gms.games.internal.notification.GameNotification
   public GameNotification method_2620(int var1) {
      return new GameNotificationRef(this.DD, var1);
   }

   // $FF: synthetic method
   public Object get(int var1) {
      return this.method_2620(var1);
   }
}
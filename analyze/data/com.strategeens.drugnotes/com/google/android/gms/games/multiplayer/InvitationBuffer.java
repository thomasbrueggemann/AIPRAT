package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationRef;

public final class InvitationBuffer extends g<Invitation> {
   public InvitationBuffer(DataHolder var1) {
      super(var1);
   }

   // $FF: renamed from: f (int, int) java.lang.Object
   // $FF: synthetic method
   protected Object method_2987(int var1, int var2) {
      return this.method_2994(var1, var2);
   }

   // $FF: renamed from: ha () java.lang.String
   protected String method_2988() {
      return "external_invitation_id";
   }

   // $FF: renamed from: k (int, int) com.google.android.gms.games.multiplayer.Invitation
   protected Invitation method_2994(int var1, int var2) {
      return new InvitationRef(this.JG, var1, var2);
   }
}
package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.internal.zzx;

public final class Action extends Thing {
   private Action(Bundle var1) {
      super(var1);
   }

   // $FF: synthetic method
   Action(Bundle var1, Object var2) {
      this(var1);
   }

   public static Action newAction(String var0, String var1, Uri var2, Uri var3) {
      Action.Builder var4 = new Action.Builder(var0);
      Thing.Builder var5 = (new Thing.Builder()).setName(var1);
      String var6;
      if(var2 == null) {
         var6 = null;
      } else {
         var6 = var2.toString();
      }

      return var4.setObject(var5.setId(var6).setUrl(var3).build()).build();
   }

   public static final class Builder extends Thing.Builder {
      public Builder(String var1) {
         zzx.zzz(var1);
         super.put("type", var1);
      }

      public Action build() {
         zzx.zzb(this.zzUH.get("object"), "setObject is required before calling build().");
         zzx.zzb(this.zzUH.get("type"), "setType is required before calling build().");
         Bundle var3 = (Bundle)this.zzUH.getParcelable("object");
         zzx.zzb(var3.get("name"), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
         zzx.zzb(var3.get("url"), "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
         return new Action(this.zzUH);
      }

      public Action.Builder put(String var1, Thing var2) {
         return (Action.Builder)super.put(var1, var2);
      }

      public Action.Builder put(String var1, String var2) {
         return (Action.Builder)super.put(var1, var2);
      }

      public Action.Builder setActionStatus(String var1) {
         zzx.zzz(var1);
         return (Action.Builder)super.put("actionStatus", var1);
      }

      public Action.Builder setName(String var1) {
         return (Action.Builder)super.put("name", var1);
      }

      public Action.Builder setObject(Thing var1) {
         zzx.zzz(var1);
         return (Action.Builder)super.put("object", var1);
      }

      public Action.Builder setUrl(Uri var1) {
         if(var1 != null) {
            super.put("url", var1.toString());
         }

         return this;
      }
   }
}

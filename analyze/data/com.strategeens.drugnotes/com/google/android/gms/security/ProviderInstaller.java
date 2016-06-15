package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.class_335;
import java.lang.reflect.Method;

public class ProviderInstaller {
   public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
   private static Method apU = null;
   // $FF: renamed from: ut java.lang.Object
   private static final Object field_3440 = new Object();

   // $FF: renamed from: V (android.content.Context) void
   private static void method_4408(Context var0) throws ClassNotFoundException, NoSuchMethodException {
      apU = var0.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
   }

   public static void installIfNeeded(Context param0) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
      // $FF: Couldn't be decompiled
   }

   public static void installIfNeededAsync(final Context var0, final ProviderInstaller.ProviderInstallListener var1) {
      class_335.method_2306(var0, "Context must not be null");
      class_335.method_2306(var1, "Listener must not be null");
      class_335.method_2304("Must be called on the UI thread");
      (new AsyncTask() {
         // $FF: renamed from: c (java.lang.Void[]) java.lang.Integer
         protected Integer method_5419(Void... var1x) {
            try {
               ProviderInstaller.installIfNeeded(var0);
            } catch (GooglePlayServicesRepairableException var4) {
               return Integer.valueOf(var4.getConnectionStatusCode());
            } catch (GooglePlayServicesNotAvailableException var5) {
               return Integer.valueOf(var5.errorCode);
            }

            return Integer.valueOf(0);
         }

         // $FF: renamed from: d (java.lang.Integer) void
         protected void method_5420(Integer var1x) {
            if(var1x.intValue() == 0) {
               var1.onProviderInstalled();
            } else {
               Intent var2 = GooglePlayServicesUtil.method_4801(var1x.intValue());
               var1.onProviderInstallFailed(var1x.intValue(), var2);
            }
         }

         // $FF: synthetic method
         protected Object doInBackground(Object[] var1x) {
            return this.method_5419((Void[])var1x);
         }

         // $FF: synthetic method
         protected void onPostExecute(Object var1x) {
            this.method_5420((Integer)var1x);
         }
      }).execute(new Void[0]);
   }

   public interface ProviderInstallListener {
      void onProviderInstallFailed(int var1, Intent var2);

      void onProviderInstalled();
   }
}
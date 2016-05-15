package com.google.android.gms.internal;

import com.google.android.gms.internal.zzsu;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzsv {
   private static void zza(String var0, Object var1, StringBuffer var2, StringBuffer var3) throws IllegalAccessException, InvocationTargetException {
      if(var1 != null) {
         if(!(var1 instanceof zzsu)) {
            String var4 = zzgP(var0);
            var3.append(var2).append(var4).append(": ");
            if(var1 instanceof String) {
               String var8 = zzbZ((String)var1);
               var3.append("\"").append(var8).append("\"");
            } else if(var1 instanceof byte[]) {
               zza((byte[])((byte[])var1), var3);
            } else {
               var3.append(var1);
            }

            var3.append("\n");
            return;
         }

         int var10 = var2.length();
         if(var0 != null) {
            var3.append(var2).append(zzgP(var0)).append(" <\n");
            var2.append("  ");
         }

         Class var11 = var1.getClass();
         Field[] var12 = var11.getFields();
         int var13 = var12.length;

         for(int var14 = 0; var14 < var13; ++var14) {
            Field var25 = var12[var14];
            int var26 = var25.getModifiers();
            String var27 = var25.getName();
            if(!"cachedSize".equals(var27) && (var26 & 1) == 1 && (var26 & 8) != 8 && !var27.startsWith("_") && !var27.endsWith("_")) {
               Class var28 = var25.getType();
               Object var29 = var25.get(var1);
               if(var28.isArray()) {
                  if(var28.getComponentType() == Byte.TYPE) {
                     zza(var27, var29, var2, var3);
                  } else {
                     int var30;
                     if(var29 == null) {
                        var30 = 0;
                     } else {
                        var30 = Array.getLength(var29);
                     }

                     for(int var31 = 0; var31 < var30; ++var31) {
                        zza(var27, Array.get(var29, var31), var2, var3);
                     }
                  }
               } else {
                  zza(var27, var29, var2, var3);
               }
            }
         }

         Method[] var15 = var11.getMethods();
         int var16 = var15.length;

         for(int var17 = 0; var17 < var16; ++var17) {
            String var19 = var15[var17].getName();
            if(var19.startsWith("set")) {
               String var20 = var19.substring(3);

               Method var22;
               try {
                  var22 = var11.getMethod("has" + var20, new Class[0]);
               } catch (NoSuchMethodException var33) {
                  continue;
               }

               if(((Boolean)var22.invoke(var1, new Object[0])).booleanValue()) {
                  Method var24;
                  try {
                     var24 = var11.getMethod("get" + var20, new Class[0]);
                  } catch (NoSuchMethodException var32) {
                     continue;
                  }

                  zza(var20, var24.invoke(var1, new Object[0]), var2, var3);
               }
            }
         }

         if(var0 != null) {
            var2.setLength(var10);
            var3.append(var2).append(">\n");
            return;
         }
      }

   }

   private static void zza(byte[] var0, StringBuffer var1) {
      if(var0 == null) {
         var1.append("\"\"");
      } else {
         var1.append('\"');

         for(int var3 = 0; var3 < var0.length; ++var3) {
            int var5 = 255 & var0[var3];
            if(var5 != 92 && var5 != 34) {
               if(var5 >= 32 && var5 < 127) {
                  var1.append((char)var5);
               } else {
                  Object[] var7 = new Object[]{Integer.valueOf(var5)};
                  var1.append(String.format("\\%03o", var7));
               }
            } else {
               var1.append('\\').append((char)var5);
            }
         }

         var1.append('\"');
      }
   }

   private static String zzbZ(String var0) {
      if(!var0.startsWith("http") && var0.length() > 200) {
         var0 = var0.substring(0, 200) + "[...]";
      }

      return zzcU(var0);
   }

   private static String zzcU(String var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if(var4 >= 32 && var4 <= 126 && var4 != 34 && var4 != 39) {
            var2.append(var4);
         } else {
            Object[] var5 = new Object[]{Integer.valueOf(var4)};
            var2.append(String.format("\\u%04x", var5));
         }
      }

      return var2.toString();
   }

   public static <T extends zzsu> String zzf(T var0) {
      if(var0 == null) {
         return "";
      } else {
         StringBuffer var1 = new StringBuffer();

         try {
            zza((String)null, var0, new StringBuffer(), var1);
         } catch (IllegalAccessException var4) {
            return "Error printing proto: " + var4.getMessage();
         } catch (InvocationTargetException var5) {
            return "Error printing proto: " + var5.getMessage();
         }

         return var1.toString();
      }
   }

   private static String zzgP(String var0) {
      StringBuffer var1 = new StringBuffer();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         char var3 = var0.charAt(var2);
         if(var2 == 0) {
            var1.append(Character.toLowerCase(var3));
         } else if(Character.isUpperCase(var3)) {
            var1.append('_').append(Character.toLowerCase(var3));
         } else {
            var1.append(var3);
         }
      }

      return var1.toString();
   }
}

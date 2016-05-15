package org.joda.time;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.LocalTime.Property;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public final class LocalTime extends BaseLocal implements Serializable, ReadablePartial {
   private static final int HOUR_OF_DAY = 0;
   public static final LocalTime MIDNIGHT = new LocalTime(0, 0, 0, 0);
   private static final int MILLIS_OF_SECOND = 3;
   private static final int MINUTE_OF_HOUR = 1;
   private static final int SECOND_OF_MINUTE = 2;
   private static final Set<DurationFieldType> TIME_DURATION_TYPES = new HashSet();
   private static final long serialVersionUID = -12873158713873L;
   private final Chronology iChronology;
   private final long iLocalMillis;

   static {
      TIME_DURATION_TYPES.add(DurationFieldType.millis());
      TIME_DURATION_TYPES.add(DurationFieldType.seconds());
      TIME_DURATION_TYPES.add(DurationFieldType.minutes());
      TIME_DURATION_TYPES.add(DurationFieldType.hours());
   }

   public LocalTime() {
      this(DateTimeUtils.currentTimeMillis(), (Chronology)ISOChronology.getInstance());
   }

   public LocalTime(int var1, int var2) {
      this(var1, var2, 0, 0, ISOChronology.getInstanceUTC());
   }

   public LocalTime(int var1, int var2, int var3) {
      this(var1, var2, var3, 0, ISOChronology.getInstanceUTC());
   }

   public LocalTime(int var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, ISOChronology.getInstanceUTC());
   }

   public LocalTime(int var1, int var2, int var3, int var4, Chronology var5) {
      Chronology var6 = DateTimeUtils.getChronology(var5).withUTC();
      long var7 = var6.getDateTimeMillis(0L, var1, var2, var3, var4);
      this.iChronology = var6;
      this.iLocalMillis = var7;
   }

   public LocalTime(long var1) {
      this(var1, (Chronology)ISOChronology.getInstance());
   }

   public LocalTime(long var1, Chronology var3) {
      Chronology var4 = DateTimeUtils.getChronology(var3);
      long var5 = var4.getZone().getMillisKeepLocal(DateTimeZone.UTC, var1);
      Chronology var7 = var4.withUTC();
      this.iLocalMillis = (long)var7.millisOfDay().get(var5);
      this.iChronology = var7;
   }

   public LocalTime(long var1, DateTimeZone var3) {
      this(var1, (Chronology)ISOChronology.getInstance(var3));
   }

   public LocalTime(Object var1) {
      this(var1, (Chronology)null);
   }

   public LocalTime(Object var1, Chronology var2) {
      PartialConverter var3 = ConverterManager.getInstance().getPartialConverter(var1);
      Chronology var4 = DateTimeUtils.getChronology(var3.getChronology(var1, var2));
      this.iChronology = var4.withUTC();
      int[] var5 = var3.getPartialValues(this, var1, var4, ISODateTimeFormat.localTimeParser());
      this.iLocalMillis = this.iChronology.getDateTimeMillis(0L, var5[0], var5[1], var5[2], var5[3]);
   }

   public LocalTime(Object var1, DateTimeZone var2) {
      PartialConverter var3 = ConverterManager.getInstance().getPartialConverter(var1);
      Chronology var4 = DateTimeUtils.getChronology(var3.getChronology(var1, var2));
      this.iChronology = var4.withUTC();
      int[] var5 = var3.getPartialValues(this, var1, var4, ISODateTimeFormat.localTimeParser());
      this.iLocalMillis = this.iChronology.getDateTimeMillis(0L, var5[0], var5[1], var5[2], var5[3]);
   }

   public LocalTime(Chronology var1) {
      this(DateTimeUtils.currentTimeMillis(), var1);
   }

   public LocalTime(DateTimeZone var1) {
      this(DateTimeUtils.currentTimeMillis(), (Chronology)ISOChronology.getInstance(var1));
   }

   public static LocalTime fromCalendarFields(Calendar var0) {
      if(var0 == null) {
         throw new IllegalArgumentException("The calendar must not be null");
      } else {
         return new LocalTime(var0.get(11), var0.get(12), var0.get(13), var0.get(14));
      }
   }

   public static LocalTime fromDateFields(Date var0) {
      if(var0 == null) {
         throw new IllegalArgumentException("The date must not be null");
      } else {
         return new LocalTime(var0.getHours(), var0.getMinutes(), var0.getSeconds(), (1000 + (int)(var0.getTime() % 1000L)) % 1000);
      }
   }

   public static LocalTime fromMillisOfDay(long var0) {
      return fromMillisOfDay(var0, (Chronology)null);
   }

   public static LocalTime fromMillisOfDay(long var0, Chronology var2) {
      return new LocalTime(var0, DateTimeUtils.getChronology(var2).withUTC());
   }

   public static LocalTime now() {
      return new LocalTime();
   }

   public static LocalTime now(Chronology var0) {
      if(var0 == null) {
         throw new NullPointerException("Chronology must not be null");
      } else {
         return new LocalTime(var0);
      }
   }

   public static LocalTime now(DateTimeZone var0) {
      if(var0 == null) {
         throw new NullPointerException("Zone must not be null");
      } else {
         return new LocalTime(var0);
      }
   }

   @FromString
   public static LocalTime parse(String var0) {
      return parse(var0, ISODateTimeFormat.localTimeParser());
   }

   public static LocalTime parse(String var0, DateTimeFormatter var1) {
      return var1.parseLocalTime(var0);
   }

   private Object readResolve() {
      if(this.iChronology == null) {
         this = new LocalTime(this.iLocalMillis, ISOChronology.getInstanceUTC());
      } else if(!DateTimeZone.UTC.equals(this.iChronology.getZone())) {
         return new LocalTime(this.iLocalMillis, this.iChronology.withUTC());
      }

      return this;
   }

   public int compareTo(ReadablePartial var1) {
      if(this == var1) {
         return 0;
      } else {
         if(var1 instanceof LocalTime) {
            LocalTime var2 = (LocalTime)var1;
            if(this.iChronology.equals(var2.iChronology)) {
               byte var3;
               if(this.iLocalMillis < var2.iLocalMillis) {
                  var3 = -1;
               } else if(this.iLocalMillis == var2.iLocalMillis) {
                  var3 = 0;
               } else {
                  var3 = 1;
               }

               return var3;
            }
         }

         return super.compareTo(var1);
      }
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else {
         if(var1 instanceof LocalTime) {
            LocalTime var2 = (LocalTime)var1;
            if(this.iChronology.equals(var2.iChronology)) {
               boolean var3;
               if(this.iLocalMillis == var2.iLocalMillis) {
                  var3 = true;
               } else {
                  var3 = false;
               }

               return var3;
            }
         }

         return super.equals(var1);
      }
   }

   public int get(DateTimeFieldType var1) {
      if(var1 == null) {
         throw new IllegalArgumentException("The DateTimeFieldType must not be null");
      } else if(!this.isSupported(var1)) {
         throw new IllegalArgumentException("Field \'" + var1 + "\' is not supported");
      } else {
         return var1.getField(this.getChronology()).get(this.getLocalMillis());
      }
   }

   public Chronology getChronology() {
      return this.iChronology;
   }

   protected DateTimeField getField(int var1, Chronology var2) {
      switch(var1) {
      case 0:
         return var2.hourOfDay();
      case 1:
         return var2.minuteOfHour();
      case 2:
         return var2.secondOfMinute();
      case 3:
         return var2.millisOfSecond();
      default:
         throw new IndexOutOfBoundsException("Invalid index: " + var1);
      }
   }

   public int getHourOfDay() {
      return this.getChronology().hourOfDay().get(this.getLocalMillis());
   }

   protected long getLocalMillis() {
      return this.iLocalMillis;
   }

   public int getMillisOfDay() {
      return this.getChronology().millisOfDay().get(this.getLocalMillis());
   }

   public int getMillisOfSecond() {
      return this.getChronology().millisOfSecond().get(this.getLocalMillis());
   }

   public int getMinuteOfHour() {
      return this.getChronology().minuteOfHour().get(this.getLocalMillis());
   }

   public int getSecondOfMinute() {
      return this.getChronology().secondOfMinute().get(this.getLocalMillis());
   }

   public int getValue(int var1) {
      switch(var1) {
      case 0:
         return this.getChronology().hourOfDay().get(this.getLocalMillis());
      case 1:
         return this.getChronology().minuteOfHour().get(this.getLocalMillis());
      case 2:
         return this.getChronology().secondOfMinute().get(this.getLocalMillis());
      case 3:
         return this.getChronology().millisOfSecond().get(this.getLocalMillis());
      default:
         throw new IndexOutOfBoundsException("Invalid index: " + var1);
      }
   }

   public Property hourOfDay() {
      return new Property(this, this.getChronology().hourOfDay());
   }

   public boolean isSupported(DateTimeFieldType var1) {
      if(var1 != null && this.isSupported(var1.getDurationType())) {
         DurationFieldType var2 = var1.getRangeDurationType();
         if(this.isSupported(var2) || var2 == DurationFieldType.days()) {
            return true;
         }
      }

      return false;
   }

   public boolean isSupported(DurationFieldType var1) {
      if(var1 != null) {
         DurationField var2 = var1.getField(this.getChronology());
         if(TIME_DURATION_TYPES.contains(var1) || var2.getUnitMillis() < this.getChronology().days().getUnitMillis()) {
            return var2.isSupported();
         }
      }

      return false;
   }

   public Property millisOfDay() {
      return new Property(this, this.getChronology().millisOfDay());
   }

   public Property millisOfSecond() {
      return new Property(this, this.getChronology().millisOfSecond());
   }

   public LocalTime minus(ReadablePeriod var1) {
      return this.withPeriodAdded(var1, -1);
   }

   public LocalTime minusHours(int var1) {
      return var1 == 0?this:this.withLocalMillis(this.getChronology().hours().subtract(this.getLocalMillis(), var1));
   }

   public LocalTime minusMillis(int var1) {
      return var1 == 0?this:this.withLocalMillis(this.getChronology().millis().subtract(this.getLocalMillis(), var1));
   }

   public LocalTime minusMinutes(int var1) {
      return var1 == 0?this:this.withLocalMillis(this.getChronology().minutes().subtract(this.getLocalMillis(), var1));
   }

   public LocalTime minusSeconds(int var1) {
      return var1 == 0?this:this.withLocalMillis(this.getChronology().seconds().subtract(this.getLocalMillis(), var1));
   }

   public Property minuteOfHour() {
      return new Property(this, this.getChronology().minuteOfHour());
   }

   public LocalTime plus(ReadablePeriod var1) {
      return this.withPeriodAdded(var1, 1);
   }

   public LocalTime plusHours(int var1) {
      return var1 == 0?this:this.withLocalMillis(this.getChronology().hours().add(this.getLocalMillis(), var1));
   }

   public LocalTime plusMillis(int var1) {
      return var1 == 0?this:this.withLocalMillis(this.getChronology().millis().add(this.getLocalMillis(), var1));
   }

   public LocalTime plusMinutes(int var1) {
      return var1 == 0?this:this.withLocalMillis(this.getChronology().minutes().add(this.getLocalMillis(), var1));
   }

   public LocalTime plusSeconds(int var1) {
      return var1 == 0?this:this.withLocalMillis(this.getChronology().seconds().add(this.getLocalMillis(), var1));
   }

   public Property property(DateTimeFieldType var1) {
      if(var1 == null) {
         throw new IllegalArgumentException("The DateTimeFieldType must not be null");
      } else if(!this.isSupported(var1)) {
         throw new IllegalArgumentException("Field \'" + var1 + "\' is not supported");
      } else {
         return new Property(this, var1.getField(this.getChronology()));
      }
   }

   public Property secondOfMinute() {
      return new Property(this, this.getChronology().secondOfMinute());
   }

   public int size() {
      return 4;
   }

   public DateTime toDateTimeToday() {
      return this.toDateTimeToday((DateTimeZone)null);
   }

   public DateTime toDateTimeToday(DateTimeZone var1) {
      Chronology var2 = this.getChronology().withZone(var1);
      return new DateTime(var2.set(this, DateTimeUtils.currentTimeMillis()), var2);
   }

   @ToString
   public String toString() {
      return ISODateTimeFormat.time().print((ReadablePartial)this);
   }

   public String toString(String var1) {
      return var1 == null?this.toString():DateTimeFormat.forPattern(var1).print((ReadablePartial)this);
   }

   public String toString(String var1, Locale var2) throws IllegalArgumentException {
      return var1 == null?this.toString():DateTimeFormat.forPattern(var1).withLocale(var2).print((ReadablePartial)this);
   }

   public LocalTime withField(DateTimeFieldType var1, int var2) {
      if(var1 == null) {
         throw new IllegalArgumentException("Field must not be null");
      } else if(!this.isSupported(var1)) {
         throw new IllegalArgumentException("Field \'" + var1 + "\' is not supported");
      } else {
         return this.withLocalMillis(var1.getField(this.getChronology()).set(this.getLocalMillis(), var2));
      }
   }

   public LocalTime withFieldAdded(DurationFieldType var1, int var2) {
      if(var1 == null) {
         throw new IllegalArgumentException("Field must not be null");
      } else if(!this.isSupported(var1)) {
         throw new IllegalArgumentException("Field \'" + var1 + "\' is not supported");
      } else {
         return var2 == 0?this:this.withLocalMillis(var1.getField(this.getChronology()).add(this.getLocalMillis(), var2));
      }
   }

   public LocalTime withFields(ReadablePartial var1) {
      return var1 == null?this:this.withLocalMillis(this.getChronology().set(var1, this.getLocalMillis()));
   }

   public LocalTime withHourOfDay(int var1) {
      return this.withLocalMillis(this.getChronology().hourOfDay().set(this.getLocalMillis(), var1));
   }

   LocalTime withLocalMillis(long var1) {
      return var1 == this.getLocalMillis()?this:new LocalTime(var1, this.getChronology());
   }

   public LocalTime withMillisOfDay(int var1) {
      return this.withLocalMillis(this.getChronology().millisOfDay().set(this.getLocalMillis(), var1));
   }

   public LocalTime withMillisOfSecond(int var1) {
      return this.withLocalMillis(this.getChronology().millisOfSecond().set(this.getLocalMillis(), var1));
   }

   public LocalTime withMinuteOfHour(int var1) {
      return this.withLocalMillis(this.getChronology().minuteOfHour().set(this.getLocalMillis(), var1));
   }

   public LocalTime withPeriodAdded(ReadablePeriod var1, int var2) {
      return var1 != null && var2 != 0?this.withLocalMillis(this.getChronology().add(var1, this.getLocalMillis(), var2)):this;
   }

   public LocalTime withSecondOfMinute(int var1) {
      return this.withLocalMillis(this.getChronology().secondOfMinute().set(this.getLocalMillis(), var1));
   }
}

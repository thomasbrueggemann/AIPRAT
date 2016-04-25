package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.query.class_946;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SortOrder implements SafeParcelable {
    public static final Creator<SortOrder> CREATOR = new class_946();
    // $FF: renamed from: BR int
    final int field_1044;
    // $FF: renamed from: QI java.util.List
    final List<FieldWithSortOrder> field_1045;
    // $FF: renamed from: QJ boolean
    final boolean field_1046;

    SortOrder(int var1, List<FieldWithSortOrder> var2, boolean var3) {
        this.field_1044 = var1;
        this.field_1045 = var2;
        this.field_1046 = var3;
    }

    private SortOrder(List<FieldWithSortOrder> var1, boolean var2) {
        this(1, var1, var2);
    }

    // $FF: synthetic method
    SortOrder(List var1, boolean var2, Object var3) {
        this(var1, var2);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        Locale var1 = Locale.US;
        Object[] var2 = new Object[] {TextUtils.join(",", this.field_1045), Boolean.valueOf(this.field_1046)};
        return String.format(var1, "SortOrder[%s, %s]", var2);
    }

    public void writeToParcel(Parcel var1, int var2) {
        class_946.method_4942(this, var1, var2);
    }

    public static class Builder {
        // $FF: renamed from: QI java.util.List
        private final List<FieldWithSortOrder> field_4540 = new ArrayList();
        // $FF: renamed from: QJ boolean
        private boolean field_4541 = false;

        public SortOrder.Builder addSortAscending(SortableMetadataField var1) {
            this.field_4540.add(new FieldWithSortOrder(var1.getName(), true));
            return this;
        }

        public SortOrder.Builder addSortDescending(SortableMetadataField var1) {
            this.field_4540.add(new FieldWithSortOrder(var1.getName(), false));
            return this;
        }

        public SortOrder build() {
            return new SortOrder(this.field_4540, this.field_4541);
        }
    }
}
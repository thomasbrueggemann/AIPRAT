.class final Lorg/parceler/NonParcelRepository$LinkedListParcelable$1;
.super Lorg/parceler/converter/LinkedListParcelConverter;
.source "NonParcelRepository.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$LinkedListParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 311
    invoke-direct {p0}, Lorg/parceler/converter/LinkedListParcelConverter;-><init>()V

    return-void
.end method


# virtual methods
.method public itemFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1
    .param p1, "parcel"    # Landroid/os/Parcel;

    .prologue
    .line 315
    const-class v0, Lorg/parceler/NonParcelRepository$LinkedListParcelable;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, Lorg/parceler/Parcels;->unwrap(Landroid/os/Parcelable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public itemToParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .locals 2
    .param p1, "input"    # Ljava/lang/Object;
    .param p2, "parcel"    # Landroid/os/Parcel;

    .prologue
    .line 320
    invoke-static {p1}, Lorg/parceler/Parcels;->wrap(Ljava/lang/Object;)Landroid/os/Parcelable;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 321
    return-void
.end method

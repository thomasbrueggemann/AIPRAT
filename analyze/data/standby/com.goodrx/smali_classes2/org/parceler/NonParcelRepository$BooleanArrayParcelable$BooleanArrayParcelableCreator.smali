.class final Lorg/parceler/NonParcelRepository$BooleanArrayParcelable$BooleanArrayParcelableCreator;
.super Ljava/lang/Object;
.source "NonParcelRepository.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$BooleanArrayParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "BooleanArrayParcelableCreator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lorg/parceler/NonParcelRepository$BooleanArrayParcelable;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 1037
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/parceler/NonParcelRepository$1;

    .prologue
    .line 1037
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$BooleanArrayParcelable$BooleanArrayParcelableCreator;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1037
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$BooleanArrayParcelable$BooleanArrayParcelableCreator;->createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$BooleanArrayParcelable;

    move-result-object v0

    return-object v0
.end method

.method public createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$BooleanArrayParcelable;
    .locals 1
    .param p1, "parcel"    # Landroid/os/Parcel;

    .prologue
    .line 1041
    new-instance v0, Lorg/parceler/NonParcelRepository$BooleanArrayParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$BooleanArrayParcelable;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1037
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$BooleanArrayParcelable$BooleanArrayParcelableCreator;->newArray(I)[Lorg/parceler/NonParcelRepository$BooleanArrayParcelable;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lorg/parceler/NonParcelRepository$BooleanArrayParcelable;
    .locals 1
    .param p1, "size"    # I

    .prologue
    .line 1046
    new-array v0, p1, [Lorg/parceler/NonParcelRepository$BooleanArrayParcelable;

    return-object v0
.end method
.class public final Lorg/parceler/NonParcelRepository$CollectionParcelable;
.super Lorg/parceler/NonParcelRepository$ConverterParcelable;
.source "NonParcelRepository.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CollectionParcelable"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/parceler/NonParcelRepository$CollectionParcelable$CollectionParcelableCreator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/parceler/NonParcelRepository$ConverterParcelable",
        "<",
        "Ljava/util/Collection;",
        ">;"
    }
.end annotation


# static fields
.field private static final CONVERTER:Lorg/parceler/converter/CollectionParcelConverter;

.field public static final CREATOR:Lorg/parceler/NonParcelRepository$CollectionParcelable$CollectionParcelableCreator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 624
    new-instance v0, Lorg/parceler/NonParcelRepository$CollectionParcelable$1;

    invoke-direct {v0}, Lorg/parceler/NonParcelRepository$CollectionParcelable$1;-><init>()V

    sput-object v0, Lorg/parceler/NonParcelRepository$CollectionParcelable;->CONVERTER:Lorg/parceler/converter/CollectionParcelConverter;

    .line 646
    new-instance v0, Lorg/parceler/NonParcelRepository$CollectionParcelable$CollectionParcelableCreator;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/parceler/NonParcelRepository$CollectionParcelable$CollectionParcelableCreator;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    sput-object v0, Lorg/parceler/NonParcelRepository$CollectionParcelable;->CREATOR:Lorg/parceler/NonParcelRepository$CollectionParcelable$CollectionParcelableCreator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2
    .param p1, "parcel"    # Landroid/os/Parcel;

    .prologue
    .line 638
    sget-object v0, Lorg/parceler/NonParcelRepository$CollectionParcelable;->CONVERTER:Lorg/parceler/converter/CollectionParcelConverter;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lorg/parceler/NonParcelRepository$ConverterParcelable;-><init>(Landroid/os/Parcel;Lorg/parceler/TypeRangeParcelConverter;Lorg/parceler/NonParcelRepository$1;)V

    .line 639
    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 2
    .param p1, "value"    # Ljava/util/Collection;

    .prologue
    .line 642
    sget-object v0, Lorg/parceler/NonParcelRepository$CollectionParcelable;->CONVERTER:Lorg/parceler/converter/CollectionParcelConverter;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lorg/parceler/NonParcelRepository$ConverterParcelable;-><init>(Ljava/lang/Object;Lorg/parceler/TypeRangeParcelConverter;Lorg/parceler/NonParcelRepository$1;)V

    .line 643
    return-void
.end method


# virtual methods
.method public bridge synthetic describeContents()I
    .locals 1

    .prologue
    .line 622
    invoke-super {p0}, Lorg/parceler/NonParcelRepository$ConverterParcelable;->describeContents()I

    move-result v0

    return v0
.end method

.method public bridge synthetic writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 622
    invoke-super {p0, p1, p2}, Lorg/parceler/NonParcelRepository$ConverterParcelable;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

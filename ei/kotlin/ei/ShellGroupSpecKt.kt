//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ei.proto

package ei;

@kotlin.jvm.JvmName("-initializeshellGroupSpec")
public inline fun shellGroupSpec(block: ei.ShellGroupSpecKt.Dsl.() -> kotlin.Unit): ei.Ei.ShellGroupSpec =
  ei.ShellGroupSpecKt.Dsl._create(ei.Ei.ShellGroupSpec.newBuilder()).apply { block() }._build()
public object ShellGroupSpecKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.ShellGroupSpec.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.ShellGroupSpec.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.ShellGroupSpec = _builder.build()

    /**
     * <code>optional string identifier = 1;</code>
     */
    public var identifier: kotlin.String
      @JvmName("getIdentifier")
      get() = _builder.getIdentifier()
      @JvmName("setIdentifier")
      set(value) {
        _builder.setIdentifier(value)
      }
    /**
     * <code>optional string identifier = 1;</code>
     */
    public fun clearIdentifier() {
      _builder.clearIdentifier()
    }
    /**
     * <code>optional string identifier = 1;</code>
     * @return Whether the identifier field is set.
     */
    public fun hasIdentifier(): kotlin.Boolean {
      return _builder.hasIdentifier()
    }

    /**
     * <code>optional string name = 2;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>optional string name = 2;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }
    /**
     * <code>optional string name = 2;</code>
     * @return Whether the name field is set.
     */
    public fun hasName(): kotlin.Boolean {
      return _builder.hasName()
    }

    /**
     * <code>optional .ei.ShellSpec.AssetType asset_type = 5;</code>
     */
    public var assetType: ei.Ei.ShellSpec.AssetType
      @JvmName("getAssetType")
      get() = _builder.getAssetType()
      @JvmName("setAssetType")
      set(value) {
        _builder.setAssetType(value)
      }
    /**
     * <code>optional .ei.ShellSpec.AssetType asset_type = 5;</code>
     */
    public fun clearAssetType() {
      _builder.clearAssetType()
    }
    /**
     * <code>optional .ei.ShellSpec.AssetType asset_type = 5;</code>
     * @return Whether the assetType field is set.
     */
    public fun hasAssetType(): kotlin.Boolean {
      return _builder.hasAssetType()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class MemberIdsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string member_ids = 3;</code>
     * @return A list containing the memberIds.
     */
    public val memberIds: com.google.protobuf.kotlin.DslList<kotlin.String, MemberIdsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getMemberIdsList()
      )
    /**
     * <code>repeated string member_ids = 3;</code>
     * @param value The memberIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addMemberIds")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, MemberIdsProxy>.add(value: kotlin.String) {
      _builder.addMemberIds(value)
    }
    /**
     * <code>repeated string member_ids = 3;</code>
     * @param value The memberIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignMemberIds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, MemberIdsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string member_ids = 3;</code>
     * @param values The memberIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllMemberIds")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, MemberIdsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllMemberIds(values)
    }
    /**
     * <code>repeated string member_ids = 3;</code>
     * @param values The memberIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllMemberIds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, MemberIdsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string member_ids = 3;</code>
     * @param index The index to set the value at.
     * @param value The memberIds to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setMemberIds")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, MemberIdsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setMemberIds(index, value)
    }/**
     * <code>repeated string member_ids = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearMemberIds")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, MemberIdsProxy>.clear() {
      _builder.clearMemberIds()
    }
    /**
     * <code>optional double price_mult_DEPRECATED = 4;</code>
     */
    public var priceMultDEPRECATED: kotlin.Double
      @JvmName("getPriceMultDEPRECATED")
      get() = _builder.getPriceMultDEPRECATED()
      @JvmName("setPriceMultDEPRECATED")
      set(value) {
        _builder.setPriceMultDEPRECATED(value)
      }
    /**
     * <code>optional double price_mult_DEPRECATED = 4;</code>
     */
    public fun clearPriceMultDEPRECATED() {
      _builder.clearPriceMultDEPRECATED()
    }
    /**
     * <code>optional double price_mult_DEPRECATED = 4;</code>
     * @return Whether the priceMultDEPRECATED field is set.
     */
    public fun hasPriceMultDEPRECATED(): kotlin.Boolean {
      return _builder.hasPriceMultDEPRECATED()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.ShellGroupSpec.copy(block: ei.ShellGroupSpecKt.Dsl.() -> kotlin.Unit): ei.Ei.ShellGroupSpec =
  ei.ShellGroupSpecKt.Dsl._create(this.toBuilder()).apply { block() }._build()


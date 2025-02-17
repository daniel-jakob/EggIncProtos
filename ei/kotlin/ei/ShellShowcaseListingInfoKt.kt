//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ei.proto

package ei;

@kotlin.jvm.JvmName("-initializeshellShowcaseListingInfo")
public inline fun shellShowcaseListingInfo(block: ei.ShellShowcaseListingInfoKt.Dsl.() -> kotlin.Unit): ei.Ei.ShellShowcaseListingInfo =
  ei.ShellShowcaseListingInfoKt.Dsl._create(ei.Ei.ShellShowcaseListingInfo.newBuilder()).apply { block() }._build()
public object ShellShowcaseListingInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.ShellShowcaseListingInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.ShellShowcaseListingInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.ShellShowcaseListingInfo = _builder.build()

    /**
     * <code>optional string id = 1;</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>optional string id = 1;</code>
     */
    public fun clearId() {
      _builder.clearId()
    }
    /**
     * <code>optional string id = 1;</code>
     * @return Whether the id field is set.
     */
    public fun hasId(): kotlin.Boolean {
      return _builder.hasId()
    }

    /**
     * <code>optional string local_id = 12;</code>
     */
    public var localId: kotlin.String
      @JvmName("getLocalId")
      get() = _builder.getLocalId()
      @JvmName("setLocalId")
      set(value) {
        _builder.setLocalId(value)
      }
    /**
     * <code>optional string local_id = 12;</code>
     */
    public fun clearLocalId() {
      _builder.clearLocalId()
    }
    /**
     * <code>optional string local_id = 12;</code>
     * @return Whether the localId field is set.
     */
    public fun hasLocalId(): kotlin.Boolean {
      return _builder.hasLocalId()
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
     * <code>optional string description = 3;</code>
     */
    public var description: kotlin.String
      @JvmName("getDescription")
      get() = _builder.getDescription()
      @JvmName("setDescription")
      set(value) {
        _builder.setDescription(value)
      }
    /**
     * <code>optional string description = 3;</code>
     */
    public fun clearDescription() {
      _builder.clearDescription()
    }
    /**
     * <code>optional string description = 3;</code>
     * @return Whether the description field is set.
     */
    public fun hasDescription(): kotlin.Boolean {
      return _builder.hasDescription()
    }

    /**
     * <code>optional string creator_name = 14;</code>
     */
    public var creatorName: kotlin.String
      @JvmName("getCreatorName")
      get() = _builder.getCreatorName()
      @JvmName("setCreatorName")
      set(value) {
        _builder.setCreatorName(value)
      }
    /**
     * <code>optional string creator_name = 14;</code>
     */
    public fun clearCreatorName() {
      _builder.clearCreatorName()
    }
    /**
     * <code>optional string creator_name = 14;</code>
     * @return Whether the creatorName field is set.
     */
    public fun hasCreatorName(): kotlin.Boolean {
      return _builder.hasCreatorName()
    }

    /**
     * <code>optional .ei.ShellShowcaseListingInfo.Status status = 11;</code>
     */
    public var status: ei.Ei.ShellShowcaseListingInfo.Status
      @JvmName("getStatus")
      get() = _builder.getStatus()
      @JvmName("setStatus")
      set(value) {
        _builder.setStatus(value)
      }
    /**
     * <code>optional .ei.ShellShowcaseListingInfo.Status status = 11;</code>
     */
    public fun clearStatus() {
      _builder.clearStatus()
    }
    /**
     * <code>optional .ei.ShellShowcaseListingInfo.Status status = 11;</code>
     * @return Whether the status field is set.
     */
    public fun hasStatus(): kotlin.Boolean {
      return _builder.hasStatus()
    }

    /**
     * <code>optional .ei.ShellDB.FarmConfiguration farm_config = 4;</code>
     */
    public var farmConfig: ei.Ei.ShellDB.FarmConfiguration
      @JvmName("getFarmConfig")
      get() = _builder.getFarmConfig()
      @JvmName("setFarmConfig")
      set(value) {
        _builder.setFarmConfig(value)
      }
    /**
     * <code>optional .ei.ShellDB.FarmConfiguration farm_config = 4;</code>
     */
    public fun clearFarmConfig() {
      _builder.clearFarmConfig()
    }
    /**
     * <code>optional .ei.ShellDB.FarmConfiguration farm_config = 4;</code>
     * @return Whether the farmConfig field is set.
     */
    public fun hasFarmConfig(): kotlin.Boolean {
      return _builder.hasFarmConfig()
    }
    public val ShellShowcaseListingInfoKt.Dsl.farmConfigOrNull: ei.Ei.ShellDB.FarmConfiguration?
      get() = _builder.farmConfigOrNull

    /**
     * <code>optional uint32 sales = 5;</code>
     */
    public var sales: kotlin.Int
      @JvmName("getSales")
      get() = _builder.getSales()
      @JvmName("setSales")
      set(value) {
        _builder.setSales(value)
      }
    /**
     * <code>optional uint32 sales = 5;</code>
     */
    public fun clearSales() {
      _builder.clearSales()
    }
    /**
     * <code>optional uint32 sales = 5;</code>
     * @return Whether the sales field is set.
     */
    public fun hasSales(): kotlin.Boolean {
      return _builder.hasSales()
    }

    /**
     * <code>optional uint64 gross = 6;</code>
     */
    public var gross: kotlin.Long
      @JvmName("getGross")
      get() = _builder.getGross()
      @JvmName("setGross")
      set(value) {
        _builder.setGross(value)
      }
    /**
     * <code>optional uint64 gross = 6;</code>
     */
    public fun clearGross() {
      _builder.clearGross()
    }
    /**
     * <code>optional uint64 gross = 6;</code>
     * @return Whether the gross field is set.
     */
    public fun hasGross(): kotlin.Boolean {
      return _builder.hasGross()
    }

    /**
     * <code>optional uint64 views = 7;</code>
     */
    public var views: kotlin.Long
      @JvmName("getViews")
      get() = _builder.getViews()
      @JvmName("setViews")
      set(value) {
        _builder.setViews(value)
      }
    /**
     * <code>optional uint64 views = 7;</code>
     */
    public fun clearViews() {
      _builder.clearViews()
    }
    /**
     * <code>optional uint64 views = 7;</code>
     * @return Whether the views field is set.
     */
    public fun hasViews(): kotlin.Boolean {
      return _builder.hasViews()
    }

    /**
     * <code>optional uint64 equips = 13;</code>
     */
    public var equips: kotlin.Long
      @JvmName("getEquips")
      get() = _builder.getEquips()
      @JvmName("setEquips")
      set(value) {
        _builder.setEquips(value)
      }
    /**
     * <code>optional uint64 equips = 13;</code>
     */
    public fun clearEquips() {
      _builder.clearEquips()
    }
    /**
     * <code>optional uint64 equips = 13;</code>
     * @return Whether the equips field is set.
     */
    public fun hasEquips(): kotlin.Boolean {
      return _builder.hasEquips()
    }

    /**
     * <code>optional uint32 likes = 8;</code>
     */
    public var likes: kotlin.Int
      @JvmName("getLikes")
      get() = _builder.getLikes()
      @JvmName("setLikes")
      set(value) {
        _builder.setLikes(value)
      }
    /**
     * <code>optional uint32 likes = 8;</code>
     */
    public fun clearLikes() {
      _builder.clearLikes()
    }
    /**
     * <code>optional uint32 likes = 8;</code>
     * @return Whether the likes field is set.
     */
    public fun hasLikes(): kotlin.Boolean {
      return _builder.hasLikes()
    }

    /**
     * <code>optional uint32 dislikes = 9;</code>
     */
    public var dislikes: kotlin.Int
      @JvmName("getDislikes")
      get() = _builder.getDislikes()
      @JvmName("setDislikes")
      set(value) {
        _builder.setDislikes(value)
      }
    /**
     * <code>optional uint32 dislikes = 9;</code>
     */
    public fun clearDislikes() {
      _builder.clearDislikes()
    }
    /**
     * <code>optional uint32 dislikes = 9;</code>
     * @return Whether the dislikes field is set.
     */
    public fun hasDislikes(): kotlin.Boolean {
      return _builder.hasDislikes()
    }

    /**
     * <code>optional string share_url = 10;</code>
     */
    public var shareUrl: kotlin.String
      @JvmName("getShareUrl")
      get() = _builder.getShareUrl()
      @JvmName("setShareUrl")
      set(value) {
        _builder.setShareUrl(value)
      }
    /**
     * <code>optional string share_url = 10;</code>
     */
    public fun clearShareUrl() {
      _builder.clearShareUrl()
    }
    /**
     * <code>optional string share_url = 10;</code>
     * @return Whether the shareUrl field is set.
     */
    public fun hasShareUrl(): kotlin.Boolean {
      return _builder.hasShareUrl()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.ShellShowcaseListingInfo.copy(block: ei.ShellShowcaseListingInfoKt.Dsl.() -> kotlin.Unit): ei.Ei.ShellShowcaseListingInfo =
  ei.ShellShowcaseListingInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val ei.Ei.ShellShowcaseListingInfoOrBuilder.farmConfigOrNull: ei.Ei.ShellDB.FarmConfiguration?
  get() = if (hasFarmConfig()) getFarmConfig() else null


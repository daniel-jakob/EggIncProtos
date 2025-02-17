//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ei.proto

package ei;

@kotlin.jvm.JvmName("-initializecreateCoopRequest")
public inline fun createCoopRequest(block: ei.CreateCoopRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.CreateCoopRequest =
  ei.CreateCoopRequestKt.Dsl._create(ei.Ei.CreateCoopRequest.newBuilder()).apply { block() }._build()
public object CreateCoopRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.CreateCoopRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.CreateCoopRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.CreateCoopRequest = _builder.build()

    /**
     * <code>optional .ei.BasicRequestInfo rinfo = 10;</code>
     */
    public var rinfo: ei.Ei.BasicRequestInfo
      @JvmName("getRinfo")
      get() = _builder.getRinfo()
      @JvmName("setRinfo")
      set(value) {
        _builder.setRinfo(value)
      }
    /**
     * <code>optional .ei.BasicRequestInfo rinfo = 10;</code>
     */
    public fun clearRinfo() {
      _builder.clearRinfo()
    }
    /**
     * <code>optional .ei.BasicRequestInfo rinfo = 10;</code>
     * @return Whether the rinfo field is set.
     */
    public fun hasRinfo(): kotlin.Boolean {
      return _builder.hasRinfo()
    }
    public val CreateCoopRequestKt.Dsl.rinfoOrNull: ei.Ei.BasicRequestInfo?
      get() = _builder.rinfoOrNull

    /**
     * <code>optional string contract_identifier = 1;</code>
     */
    public var contractIdentifier: kotlin.String
      @JvmName("getContractIdentifier")
      get() = _builder.getContractIdentifier()
      @JvmName("setContractIdentifier")
      set(value) {
        _builder.setContractIdentifier(value)
      }
    /**
     * <code>optional string contract_identifier = 1;</code>
     */
    public fun clearContractIdentifier() {
      _builder.clearContractIdentifier()
    }
    /**
     * <code>optional string contract_identifier = 1;</code>
     * @return Whether the contractIdentifier field is set.
     */
    public fun hasContractIdentifier(): kotlin.Boolean {
      return _builder.hasContractIdentifier()
    }

    /**
     * <code>optional string coop_identifier = 2;</code>
     */
    public var coopIdentifier: kotlin.String
      @JvmName("getCoopIdentifier")
      get() = _builder.getCoopIdentifier()
      @JvmName("setCoopIdentifier")
      set(value) {
        _builder.setCoopIdentifier(value)
      }
    /**
     * <code>optional string coop_identifier = 2;</code>
     */
    public fun clearCoopIdentifier() {
      _builder.clearCoopIdentifier()
    }
    /**
     * <code>optional string coop_identifier = 2;</code>
     * @return Whether the coopIdentifier field is set.
     */
    public fun hasCoopIdentifier(): kotlin.Boolean {
      return _builder.hasCoopIdentifier()
    }

    /**
     * <code>optional bool public = 13;</code>
     */
    public var public: kotlin.Boolean
      @JvmName("getPublic")
      get() = _builder.getPublic()
      @JvmName("setPublic")
      set(value) {
        _builder.setPublic(value)
      }
    /**
     * <code>optional bool public = 13;</code>
     */
    public fun clearPublic() {
      _builder.clearPublic()
    }
    /**
     * <code>optional bool public = 13;</code>
     * @return Whether the public field is set.
     */
    public fun hasPublic(): kotlin.Boolean {
      return _builder.hasPublic()
    }

    /**
     * <code>optional bool cc_only = 14;</code>
     */
    public var ccOnly: kotlin.Boolean
      @JvmName("getCcOnly")
      get() = _builder.getCcOnly()
      @JvmName("setCcOnly")
      set(value) {
        _builder.setCcOnly(value)
      }
    /**
     * <code>optional bool cc_only = 14;</code>
     */
    public fun clearCcOnly() {
      _builder.clearCcOnly()
    }
    /**
     * <code>optional bool cc_only = 14;</code>
     * @return Whether the ccOnly field is set.
     */
    public fun hasCcOnly(): kotlin.Boolean {
      return _builder.hasCcOnly()
    }

    /**
     * <code>optional bool allow_all_grades = 16;</code>
     */
    public var allowAllGrades: kotlin.Boolean
      @JvmName("getAllowAllGrades")
      get() = _builder.getAllowAllGrades()
      @JvmName("setAllowAllGrades")
      set(value) {
        _builder.setAllowAllGrades(value)
      }
    /**
     * <code>optional bool allow_all_grades = 16;</code>
     */
    public fun clearAllowAllGrades() {
      _builder.clearAllowAllGrades()
    }
    /**
     * <code>optional bool allow_all_grades = 16;</code>
     * @return Whether the allowAllGrades field is set.
     */
    public fun hasAllowAllGrades(): kotlin.Boolean {
      return _builder.hasAllowAllGrades()
    }

    /**
     * <code>optional double seconds_remaining = 3;</code>
     */
    public var secondsRemaining: kotlin.Double
      @JvmName("getSecondsRemaining")
      get() = _builder.getSecondsRemaining()
      @JvmName("setSecondsRemaining")
      set(value) {
        _builder.setSecondsRemaining(value)
      }
    /**
     * <code>optional double seconds_remaining = 3;</code>
     */
    public fun clearSecondsRemaining() {
      _builder.clearSecondsRemaining()
    }
    /**
     * <code>optional double seconds_remaining = 3;</code>
     * @return Whether the secondsRemaining field is set.
     */
    public fun hasSecondsRemaining(): kotlin.Boolean {
      return _builder.hasSecondsRemaining()
    }

    /**
     * <code>optional string user_id = 4;</code>
     */
    public var userId: kotlin.String
      @JvmName("getUserId")
      get() = _builder.getUserId()
      @JvmName("setUserId")
      set(value) {
        _builder.setUserId(value)
      }
    /**
     * <code>optional string user_id = 4;</code>
     */
    public fun clearUserId() {
      _builder.clearUserId()
    }
    /**
     * <code>optional string user_id = 4;</code>
     * @return Whether the userId field is set.
     */
    public fun hasUserId(): kotlin.Boolean {
      return _builder.hasUserId()
    }

    /**
     * <code>optional string user_name = 5;</code>
     */
    public var userName: kotlin.String
      @JvmName("getUserName")
      get() = _builder.getUserName()
      @JvmName("setUserName")
      set(value) {
        _builder.setUserName(value)
      }
    /**
     * <code>optional string user_name = 5;</code>
     */
    public fun clearUserName() {
      _builder.clearUserName()
    }
    /**
     * <code>optional string user_name = 5;</code>
     * @return Whether the userName field is set.
     */
    public fun hasUserName(): kotlin.Boolean {
      return _builder.hasUserName()
    }

    /**
     * <code>optional double soul_power = 8;</code>
     */
    public var soulPower: kotlin.Double
      @JvmName("getSoulPower")
      get() = _builder.getSoulPower()
      @JvmName("setSoulPower")
      set(value) {
        _builder.setSoulPower(value)
      }
    /**
     * <code>optional double soul_power = 8;</code>
     */
    public fun clearSoulPower() {
      _builder.clearSoulPower()
    }
    /**
     * <code>optional double soul_power = 8;</code>
     * @return Whether the soulPower field is set.
     */
    public fun hasSoulPower(): kotlin.Boolean {
      return _builder.hasSoulPower()
    }

    /**
     * <code>optional double eop = 11;</code>
     */
    public var eop: kotlin.Double
      @JvmName("getEop")
      get() = _builder.getEop()
      @JvmName("setEop")
      set(value) {
        _builder.setEop(value)
      }
    /**
     * <code>optional double eop = 11;</code>
     */
    public fun clearEop() {
      _builder.clearEop()
    }
    /**
     * <code>optional double eop = 11;</code>
     * @return Whether the eop field is set.
     */
    public fun hasEop(): kotlin.Boolean {
      return _builder.hasEop()
    }

    /**
     * <code>optional uint32 league = 9;</code>
     */
    public var league: kotlin.Int
      @JvmName("getLeague")
      get() = _builder.getLeague()
      @JvmName("setLeague")
      set(value) {
        _builder.setLeague(value)
      }
    /**
     * <code>optional uint32 league = 9;</code>
     */
    public fun clearLeague() {
      _builder.clearLeague()
    }
    /**
     * <code>optional uint32 league = 9;</code>
     * @return Whether the league field is set.
     */
    public fun hasLeague(): kotlin.Boolean {
      return _builder.hasLeague()
    }

    /**
     * <code>optional .ei.Contract.PlayerGrade grade = 12;</code>
     */
    public var grade: ei.Ei.Contract.PlayerGrade
      @JvmName("getGrade")
      get() = _builder.getGrade()
      @JvmName("setGrade")
      set(value) {
        _builder.setGrade(value)
      }
    /**
     * <code>optional .ei.Contract.PlayerGrade grade = 12;</code>
     */
    public fun clearGrade() {
      _builder.clearGrade()
    }
    /**
     * <code>optional .ei.Contract.PlayerGrade grade = 12;</code>
     * @return Whether the grade field is set.
     */
    public fun hasGrade(): kotlin.Boolean {
      return _builder.hasGrade()
    }

    /**
     * <code>optional bool points_replay = 15;</code>
     */
    public var pointsReplay: kotlin.Boolean
      @JvmName("getPointsReplay")
      get() = _builder.getPointsReplay()
      @JvmName("setPointsReplay")
      set(value) {
        _builder.setPointsReplay(value)
      }
    /**
     * <code>optional bool points_replay = 15;</code>
     */
    public fun clearPointsReplay() {
      _builder.clearPointsReplay()
    }
    /**
     * <code>optional bool points_replay = 15;</code>
     * @return Whether the pointsReplay field is set.
     */
    public fun hasPointsReplay(): kotlin.Boolean {
      return _builder.hasPointsReplay()
    }

    /**
     * <code>optional .ei.Platform platform = 6;</code>
     */
    public var platform: ei.Ei.Platform
      @JvmName("getPlatform")
      get() = _builder.getPlatform()
      @JvmName("setPlatform")
      set(value) {
        _builder.setPlatform(value)
      }
    /**
     * <code>optional .ei.Platform platform = 6;</code>
     */
    public fun clearPlatform() {
      _builder.clearPlatform()
    }
    /**
     * <code>optional .ei.Platform platform = 6;</code>
     * @return Whether the platform field is set.
     */
    public fun hasPlatform(): kotlin.Boolean {
      return _builder.hasPlatform()
    }

    /**
     * <code>optional uint32 client_version = 7;</code>
     */
    public var clientVersion: kotlin.Int
      @JvmName("getClientVersion")
      get() = _builder.getClientVersion()
      @JvmName("setClientVersion")
      set(value) {
        _builder.setClientVersion(value)
      }
    /**
     * <code>optional uint32 client_version = 7;</code>
     */
    public fun clearClientVersion() {
      _builder.clearClientVersion()
    }
    /**
     * <code>optional uint32 client_version = 7;</code>
     * @return Whether the clientVersion field is set.
     */
    public fun hasClientVersion(): kotlin.Boolean {
      return _builder.hasClientVersion()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.CreateCoopRequest.copy(block: ei.CreateCoopRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.CreateCoopRequest =
  ei.CreateCoopRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val ei.Ei.CreateCoopRequestOrBuilder.rinfoOrNull: ei.Ei.BasicRequestInfo?
  get() = if (hasRinfo()) getRinfo() else null


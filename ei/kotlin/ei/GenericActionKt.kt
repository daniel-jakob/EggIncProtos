//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ei.proto

package ei;

@kotlin.jvm.JvmName("-initializegenericAction")
public inline fun genericAction(block: ei.GenericActionKt.Dsl.() -> kotlin.Unit): ei.Ei.GenericAction =
  ei.GenericActionKt.Dsl._create(ei.Ei.GenericAction.newBuilder()).apply { block() }._build()
public object GenericActionKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.GenericAction.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.GenericAction.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.GenericAction = _builder.build()

    /**
     * <code>optional string user_id = 1;</code>
     */
    public var userId: kotlin.String
      @JvmName("getUserId")
      get() = _builder.getUserId()
      @JvmName("setUserId")
      set(value) {
        _builder.setUserId(value)
      }
    /**
     * <code>optional string user_id = 1;</code>
     */
    public fun clearUserId() {
      _builder.clearUserId()
    }
    /**
     * <code>optional string user_id = 1;</code>
     * @return Whether the userId field is set.
     */
    public fun hasUserId(): kotlin.Boolean {
      return _builder.hasUserId()
    }

    /**
     * <code>optional bool cc_user = 9;</code>
     */
    public var ccUser: kotlin.Boolean
      @JvmName("getCcUser")
      get() = _builder.getCcUser()
      @JvmName("setCcUser")
      set(value) {
        _builder.setCcUser(value)
      }
    /**
     * <code>optional bool cc_user = 9;</code>
     */
    public fun clearCcUser() {
      _builder.clearCcUser()
    }
    /**
     * <code>optional bool cc_user = 9;</code>
     * @return Whether the ccUser field is set.
     */
    public fun hasCcUser(): kotlin.Boolean {
      return _builder.hasCcUser()
    }

    /**
     * <code>optional string advertising_id = 7;</code>
     */
    public var advertisingId: kotlin.String
      @JvmName("getAdvertisingId")
      get() = _builder.getAdvertisingId()
      @JvmName("setAdvertisingId")
      set(value) {
        _builder.setAdvertisingId(value)
      }
    /**
     * <code>optional string advertising_id = 7;</code>
     */
    public fun clearAdvertisingId() {
      _builder.clearAdvertisingId()
    }
    /**
     * <code>optional string advertising_id = 7;</code>
     * @return Whether the advertisingId field is set.
     */
    public fun hasAdvertisingId(): kotlin.Boolean {
      return _builder.hasAdvertisingId()
    }

    /**
     * <code>optional float approx_time_DEP = 2;</code>
     */
    public var approxTimeDEP: kotlin.Float
      @JvmName("getApproxTimeDEP")
      get() = _builder.getApproxTimeDEP()
      @JvmName("setApproxTimeDEP")
      set(value) {
        _builder.setApproxTimeDEP(value)
      }
    /**
     * <code>optional float approx_time_DEP = 2;</code>
     */
    public fun clearApproxTimeDEP() {
      _builder.clearApproxTimeDEP()
    }
    /**
     * <code>optional float approx_time_DEP = 2;</code>
     * @return Whether the approxTimeDEP field is set.
     */
    public fun hasApproxTimeDEP(): kotlin.Boolean {
      return _builder.hasApproxTimeDEP()
    }

    /**
     * <code>optional double approx_time = 8;</code>
     */
    public var approxTime: kotlin.Double
      @JvmName("getApproxTime")
      get() = _builder.getApproxTime()
      @JvmName("setApproxTime")
      set(value) {
        _builder.setApproxTime(value)
      }
    /**
     * <code>optional double approx_time = 8;</code>
     */
    public fun clearApproxTime() {
      _builder.clearApproxTime()
    }
    /**
     * <code>optional double approx_time = 8;</code>
     * @return Whether the approxTime field is set.
     */
    public fun hasApproxTime(): kotlin.Boolean {
      return _builder.hasApproxTime()
    }

    /**
     * <code>optional string action_name = 3;</code>
     */
    public var actionName: kotlin.String
      @JvmName("getActionName")
      get() = _builder.getActionName()
      @JvmName("setActionName")
      set(value) {
        _builder.setActionName(value)
      }
    /**
     * <code>optional string action_name = 3;</code>
     */
    public fun clearActionName() {
      _builder.clearActionName()
    }
    /**
     * <code>optional string action_name = 3;</code>
     * @return Whether the actionName field is set.
     */
    public fun hasActionName(): kotlin.Boolean {
      return _builder.hasActionName()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DataProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .ei.ActionKeyValuePair data = 4;</code>
     */
     public val data: com.google.protobuf.kotlin.DslList<ei.Ei.ActionKeyValuePair, DataProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDataList()
      )
    /**
     * <code>repeated .ei.ActionKeyValuePair data = 4;</code>
     * @param value The data to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addData")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ActionKeyValuePair, DataProxy>.add(value: ei.Ei.ActionKeyValuePair) {
      _builder.addData(value)
    }
    /**
     * <code>repeated .ei.ActionKeyValuePair data = 4;</code>
     * @param value The data to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignData")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ActionKeyValuePair, DataProxy>.plusAssign(value: ei.Ei.ActionKeyValuePair) {
      add(value)
    }
    /**
     * <code>repeated .ei.ActionKeyValuePair data = 4;</code>
     * @param values The data to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllData")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ActionKeyValuePair, DataProxy>.addAll(values: kotlin.collections.Iterable<ei.Ei.ActionKeyValuePair>) {
      _builder.addAllData(values)
    }
    /**
     * <code>repeated .ei.ActionKeyValuePair data = 4;</code>
     * @param values The data to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllData")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ActionKeyValuePair, DataProxy>.plusAssign(values: kotlin.collections.Iterable<ei.Ei.ActionKeyValuePair>) {
      addAll(values)
    }
    /**
     * <code>repeated .ei.ActionKeyValuePair data = 4;</code>
     * @param index The index to set the value at.
     * @param value The data to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setData")
    public operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ActionKeyValuePair, DataProxy>.set(index: kotlin.Int, value: ei.Ei.ActionKeyValuePair) {
      _builder.setData(index, value)
    }
    /**
     * <code>repeated .ei.ActionKeyValuePair data = 4;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearData")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ActionKeyValuePair, DataProxy>.clear() {
      _builder.clearData()
    }


    /**
     * <code>optional .ei.AppInfo app = 5;</code>
     */
    public var app: ei.Ei.AppInfo
      @JvmName("getApp")
      get() = _builder.getApp()
      @JvmName("setApp")
      set(value) {
        _builder.setApp(value)
      }
    /**
     * <code>optional .ei.AppInfo app = 5;</code>
     */
    public fun clearApp() {
      _builder.clearApp()
    }
    /**
     * <code>optional .ei.AppInfo app = 5;</code>
     * @return Whether the app field is set.
     */
    public fun hasApp(): kotlin.Boolean {
      return _builder.hasApp()
    }
    public val GenericActionKt.Dsl.appOrNull: ei.Ei.AppInfo?
      get() = _builder.appOrNull

    /**
     * <code>optional .ei.DeviceInfo device = 6;</code>
     */
    public var device: ei.Ei.DeviceInfo
      @JvmName("getDevice")
      get() = _builder.getDevice()
      @JvmName("setDevice")
      set(value) {
        _builder.setDevice(value)
      }
    /**
     * <code>optional .ei.DeviceInfo device = 6;</code>
     */
    public fun clearDevice() {
      _builder.clearDevice()
    }
    /**
     * <code>optional .ei.DeviceInfo device = 6;</code>
     * @return Whether the device field is set.
     */
    public fun hasDevice(): kotlin.Boolean {
      return _builder.hasDevice()
    }
    public val GenericActionKt.Dsl.deviceOrNull: ei.Ei.DeviceInfo?
      get() = _builder.deviceOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.GenericAction.copy(block: ei.GenericActionKt.Dsl.() -> kotlin.Unit): ei.Ei.GenericAction =
  ei.GenericActionKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val ei.Ei.GenericActionOrBuilder.appOrNull: ei.Ei.AppInfo?
  get() = if (hasApp()) getApp() else null

val ei.Ei.GenericActionOrBuilder.deviceOrNull: ei.Ei.DeviceInfo?
  get() = if (hasDevice()) getDevice() else null


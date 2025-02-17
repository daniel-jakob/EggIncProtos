//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ei.proto

package ei;

@kotlin.jvm.JvmName("-initializeclearAllUserDataRequest")
public inline fun clearAllUserDataRequest(block: ei.ClearAllUserDataRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.ClearAllUserDataRequest =
  ei.ClearAllUserDataRequestKt.Dsl._create(ei.Ei.ClearAllUserDataRequest.newBuilder()).apply { block() }._build()
public object ClearAllUserDataRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.ClearAllUserDataRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.ClearAllUserDataRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.ClearAllUserDataRequest = _builder.build()

    /**
     * <code>optional .ei.BasicRequestInfo rinfo = 4;</code>
     */
    public var rinfo: ei.Ei.BasicRequestInfo
      @JvmName("getRinfo")
      get() = _builder.getRinfo()
      @JvmName("setRinfo")
      set(value) {
        _builder.setRinfo(value)
      }
    /**
     * <code>optional .ei.BasicRequestInfo rinfo = 4;</code>
     */
    public fun clearRinfo() {
      _builder.clearRinfo()
    }
    /**
     * <code>optional .ei.BasicRequestInfo rinfo = 4;</code>
     * @return Whether the rinfo field is set.
     */
    public fun hasRinfo(): kotlin.Boolean {
      return _builder.hasRinfo()
    }
    public val ClearAllUserDataRequestKt.Dsl.rinfoOrNull: ei.Ei.BasicRequestInfo?
      get() = _builder.rinfoOrNull

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
     * <code>optional string device_id = 2;</code>
     */
    public var deviceId: kotlin.String
      @JvmName("getDeviceId")
      get() = _builder.getDeviceId()
      @JvmName("setDeviceId")
      set(value) {
        _builder.setDeviceId(value)
      }
    /**
     * <code>optional string device_id = 2;</code>
     */
    public fun clearDeviceId() {
      _builder.clearDeviceId()
    }
    /**
     * <code>optional string device_id = 2;</code>
     * @return Whether the deviceId field is set.
     */
    public fun hasDeviceId(): kotlin.Boolean {
      return _builder.hasDeviceId()
    }

    /**
     * <code>optional uint64 backup_checksum = 3;</code>
     */
    public var backupChecksum: kotlin.Long
      @JvmName("getBackupChecksum")
      get() = _builder.getBackupChecksum()
      @JvmName("setBackupChecksum")
      set(value) {
        _builder.setBackupChecksum(value)
      }
    /**
     * <code>optional uint64 backup_checksum = 3;</code>
     */
    public fun clearBackupChecksum() {
      _builder.clearBackupChecksum()
    }
    /**
     * <code>optional uint64 backup_checksum = 3;</code>
     * @return Whether the backupChecksum field is set.
     */
    public fun hasBackupChecksum(): kotlin.Boolean {
      return _builder.hasBackupChecksum()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.ClearAllUserDataRequest.copy(block: ei.ClearAllUserDataRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.ClearAllUserDataRequest =
  ei.ClearAllUserDataRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val ei.Ei.ClearAllUserDataRequestOrBuilder.rinfoOrNull: ei.Ei.BasicRequestInfo?
  get() = if (hasRinfo()) getRinfo() else null


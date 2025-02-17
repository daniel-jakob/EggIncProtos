//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ei.proto

package ei;

@kotlin.jvm.JvmName("-initializecontractsRequest")
public inline fun contractsRequest(block: ei.ContractsRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.ContractsRequest =
  ei.ContractsRequestKt.Dsl._create(ei.Ei.ContractsRequest.newBuilder()).apply { block() }._build()
public object ContractsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.ContractsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.ContractsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.ContractsRequest = _builder.build()

    /**
     * <code>optional double soul_eggs = 1;</code>
     */
    public var soulEggs: kotlin.Double
      @JvmName("getSoulEggs")
      get() = _builder.getSoulEggs()
      @JvmName("setSoulEggs")
      set(value) {
        _builder.setSoulEggs(value)
      }
    /**
     * <code>optional double soul_eggs = 1;</code>
     */
    public fun clearSoulEggs() {
      _builder.clearSoulEggs()
    }
    /**
     * <code>optional double soul_eggs = 1;</code>
     * @return Whether the soulEggs field is set.
     */
    public fun hasSoulEggs(): kotlin.Boolean {
      return _builder.hasSoulEggs()
    }

    /**
     * <code>optional uint32 client_version = 5;</code>
     */
    public var clientVersion: kotlin.Int
      @JvmName("getClientVersion")
      get() = _builder.getClientVersion()
      @JvmName("setClientVersion")
      set(value) {
        _builder.setClientVersion(value)
      }
    /**
     * <code>optional uint32 client_version = 5;</code>
     */
    public fun clearClientVersion() {
      _builder.clearClientVersion()
    }
    /**
     * <code>optional uint32 client_version = 5;</code>
     * @return Whether the clientVersion field is set.
     */
    public fun hasClientVersion(): kotlin.Boolean {
      return _builder.hasClientVersion()
    }

    /**
     * <code>optional string user_id = 2;</code>
     */
    public var userId: kotlin.String
      @JvmName("getUserId")
      get() = _builder.getUserId()
      @JvmName("setUserId")
      set(value) {
        _builder.setUserId(value)
      }
    /**
     * <code>optional string user_id = 2;</code>
     */
    public fun clearUserId() {
      _builder.clearUserId()
    }
    /**
     * <code>optional string user_id = 2;</code>
     * @return Whether the userId field is set.
     */
    public fun hasUserId(): kotlin.Boolean {
      return _builder.hasUserId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.ContractsRequest.copy(block: ei.ContractsRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.ContractsRequest =
  ei.ContractsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


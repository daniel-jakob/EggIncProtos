//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ei.proto

package ei;

@kotlin.jvm.JvmName("-initializecXPEvalRolloutInfo")
public inline fun cXPEvalRolloutInfo(block: ei.CXPEvalRolloutInfoKt.Dsl.() -> kotlin.Unit): ei.Ei.CXPEvalRolloutInfo =
  ei.CXPEvalRolloutInfoKt.Dsl._create(ei.Ei.CXPEvalRolloutInfo.newBuilder()).apply { block() }._build()
public object CXPEvalRolloutInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.CXPEvalRolloutInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.CXPEvalRolloutInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.CXPEvalRolloutInfo = _builder.build()

    /**
     * <code>optional string current_id = 1;</code>
     */
    public var currentId: kotlin.String
      @JvmName("getCurrentId")
      get() = _builder.getCurrentId()
      @JvmName("setCurrentId")
      set(value) {
        _builder.setCurrentId(value)
      }
    /**
     * <code>optional string current_id = 1;</code>
     */
    public fun clearCurrentId() {
      _builder.clearCurrentId()
    }
    /**
     * <code>optional string current_id = 1;</code>
     * @return Whether the currentId field is set.
     */
    public fun hasCurrentId(): kotlin.Boolean {
      return _builder.hasCurrentId()
    }

    /**
     * <code>optional uint32 basis_points = 2;</code>
     */
    public var basisPoints: kotlin.Int
      @JvmName("getBasisPoints")
      get() = _builder.getBasisPoints()
      @JvmName("setBasisPoints")
      set(value) {
        _builder.setBasisPoints(value)
      }
    /**
     * <code>optional uint32 basis_points = 2;</code>
     */
    public fun clearBasisPoints() {
      _builder.clearBasisPoints()
    }
    /**
     * <code>optional uint32 basis_points = 2;</code>
     * @return Whether the basisPoints field is set.
     */
    public fun hasBasisPoints(): kotlin.Boolean {
      return _builder.hasBasisPoints()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.CXPEvalRolloutInfo.copy(block: ei.CXPEvalRolloutInfoKt.Dsl.() -> kotlin.Unit): ei.Ei.CXPEvalRolloutInfo =
  ei.CXPEvalRolloutInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ei.proto

package ei;

@kotlin.jvm.JvmName("-initializegenericActionBatchRequest")
public inline fun genericActionBatchRequest(block: ei.GenericActionBatchRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.GenericActionBatchRequest =
  ei.GenericActionBatchRequestKt.Dsl._create(ei.Ei.GenericActionBatchRequest.newBuilder()).apply { block() }._build()
public object GenericActionBatchRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.GenericActionBatchRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.GenericActionBatchRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.GenericActionBatchRequest = _builder.build()

    /**
     * <code>optional .ei.BasicRequestInfo rinfo = 1;</code>
     */
    public var rinfo: ei.Ei.BasicRequestInfo
      @JvmName("getRinfo")
      get() = _builder.getRinfo()
      @JvmName("setRinfo")
      set(value) {
        _builder.setRinfo(value)
      }
    /**
     * <code>optional .ei.BasicRequestInfo rinfo = 1;</code>
     */
    public fun clearRinfo() {
      _builder.clearRinfo()
    }
    /**
     * <code>optional .ei.BasicRequestInfo rinfo = 1;</code>
     * @return Whether the rinfo field is set.
     */
    public fun hasRinfo(): kotlin.Boolean {
      return _builder.hasRinfo()
    }
    public val GenericActionBatchRequestKt.Dsl.rinfoOrNull: ei.Ei.BasicRequestInfo?
      get() = _builder.rinfoOrNull

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ActionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .ei.GenericAction actions = 2;</code>
     */
     public val actions: com.google.protobuf.kotlin.DslList<ei.Ei.GenericAction, ActionsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getActionsList()
      )
    /**
     * <code>repeated .ei.GenericAction actions = 2;</code>
     * @param value The actions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addActions")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.GenericAction, ActionsProxy>.add(value: ei.Ei.GenericAction) {
      _builder.addActions(value)
    }
    /**
     * <code>repeated .ei.GenericAction actions = 2;</code>
     * @param value The actions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignActions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.GenericAction, ActionsProxy>.plusAssign(value: ei.Ei.GenericAction) {
      add(value)
    }
    /**
     * <code>repeated .ei.GenericAction actions = 2;</code>
     * @param values The actions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllActions")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.GenericAction, ActionsProxy>.addAll(values: kotlin.collections.Iterable<ei.Ei.GenericAction>) {
      _builder.addAllActions(values)
    }
    /**
     * <code>repeated .ei.GenericAction actions = 2;</code>
     * @param values The actions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllActions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.GenericAction, ActionsProxy>.plusAssign(values: kotlin.collections.Iterable<ei.Ei.GenericAction>) {
      addAll(values)
    }
    /**
     * <code>repeated .ei.GenericAction actions = 2;</code>
     * @param index The index to set the value at.
     * @param value The actions to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setActions")
    public operator fun com.google.protobuf.kotlin.DslList<ei.Ei.GenericAction, ActionsProxy>.set(index: kotlin.Int, value: ei.Ei.GenericAction) {
      _builder.setActions(index, value)
    }
    /**
     * <code>repeated .ei.GenericAction actions = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearActions")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.GenericAction, ActionsProxy>.clear() {
      _builder.clearActions()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.GenericActionBatchRequest.copy(block: ei.GenericActionBatchRequestKt.Dsl.() -> kotlin.Unit): ei.Ei.GenericActionBatchRequest =
  ei.GenericActionBatchRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val ei.Ei.GenericActionBatchRequestOrBuilder.rinfoOrNull: ei.Ei.BasicRequestInfo?
  get() = if (hasRinfo()) getRinfo() else null


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ei.proto

package ei;

@kotlin.jvm.JvmName("-initializeartifactSpec")
public inline fun artifactSpec(block: ei.ArtifactSpecKt.Dsl.() -> kotlin.Unit): ei.Ei.ArtifactSpec =
  ei.ArtifactSpecKt.Dsl._create(ei.Ei.ArtifactSpec.newBuilder()).apply { block() }._build()
public object ArtifactSpecKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.ArtifactSpec.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.ArtifactSpec.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.ArtifactSpec = _builder.build()

    /**
     * <code>optional .ei.ArtifactSpec.Name name = 1;</code>
     */
    public var name: ei.Ei.ArtifactSpec.Name
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>optional .ei.ArtifactSpec.Name name = 1;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }
    /**
     * <code>optional .ei.ArtifactSpec.Name name = 1;</code>
     * @return Whether the name field is set.
     */
    public fun hasName(): kotlin.Boolean {
      return _builder.hasName()
    }

    /**
     * <code>optional .ei.ArtifactSpec.Level level = 2;</code>
     */
    public var level: ei.Ei.ArtifactSpec.Level
      @JvmName("getLevel")
      get() = _builder.getLevel()
      @JvmName("setLevel")
      set(value) {
        _builder.setLevel(value)
      }
    /**
     * <code>optional .ei.ArtifactSpec.Level level = 2;</code>
     */
    public fun clearLevel() {
      _builder.clearLevel()
    }
    /**
     * <code>optional .ei.ArtifactSpec.Level level = 2;</code>
     * @return Whether the level field is set.
     */
    public fun hasLevel(): kotlin.Boolean {
      return _builder.hasLevel()
    }

    /**
     * <code>optional .ei.ArtifactSpec.Rarity rarity = 3;</code>
     */
    public var rarity: ei.Ei.ArtifactSpec.Rarity
      @JvmName("getRarity")
      get() = _builder.getRarity()
      @JvmName("setRarity")
      set(value) {
        _builder.setRarity(value)
      }
    /**
     * <code>optional .ei.ArtifactSpec.Rarity rarity = 3;</code>
     */
    public fun clearRarity() {
      _builder.clearRarity()
    }
    /**
     * <code>optional .ei.ArtifactSpec.Rarity rarity = 3;</code>
     * @return Whether the rarity field is set.
     */
    public fun hasRarity(): kotlin.Boolean {
      return _builder.hasRarity()
    }

    /**
     * <code>optional .ei.Egg egg = 4;</code>
     */
    public var egg: ei.Ei.Egg
      @JvmName("getEgg")
      get() = _builder.getEgg()
      @JvmName("setEgg")
      set(value) {
        _builder.setEgg(value)
      }
    /**
     * <code>optional .ei.Egg egg = 4;</code>
     */
    public fun clearEgg() {
      _builder.clearEgg()
    }
    /**
     * <code>optional .ei.Egg egg = 4;</code>
     * @return Whether the egg field is set.
     */
    public fun hasEgg(): kotlin.Boolean {
      return _builder.hasEgg()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.ArtifactSpec.copy(block: ei.ArtifactSpecKt.Dsl.() -> kotlin.Unit): ei.Ei.ArtifactSpec =
  ei.ArtifactSpecKt.Dsl._create(this.toBuilder()).apply { block() }._build()


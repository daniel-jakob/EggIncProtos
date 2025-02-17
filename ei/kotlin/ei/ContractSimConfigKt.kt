//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ei.proto

package ei;

@kotlin.jvm.JvmName("-initializecontractSimConfig")
public inline fun contractSimConfig(block: ei.ContractSimConfigKt.Dsl.() -> kotlin.Unit): ei.Ei.ContractSimConfig =
  ei.ContractSimConfigKt.Dsl._create(ei.Ei.ContractSimConfig.newBuilder()).apply { block() }._build()
public object ContractSimConfigKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.ContractSimConfig.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.ContractSimConfig.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.ContractSimConfig = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class GradeConfigsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig grade_configs = 1;</code>
     */
     public val gradeConfigs: com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig, GradeConfigsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getGradeConfigsList()
      )
    /**
     * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig grade_configs = 1;</code>
     * @param value The gradeConfigs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addGradeConfigs")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig, GradeConfigsProxy>.add(value: ei.Ei.ContractSimConfig.ContractGradeSimConfig) {
      _builder.addGradeConfigs(value)
    }
    /**
     * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig grade_configs = 1;</code>
     * @param value The gradeConfigs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignGradeConfigs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig, GradeConfigsProxy>.plusAssign(value: ei.Ei.ContractSimConfig.ContractGradeSimConfig) {
      add(value)
    }
    /**
     * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig grade_configs = 1;</code>
     * @param values The gradeConfigs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllGradeConfigs")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig, GradeConfigsProxy>.addAll(values: kotlin.collections.Iterable<ei.Ei.ContractSimConfig.ContractGradeSimConfig>) {
      _builder.addAllGradeConfigs(values)
    }
    /**
     * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig grade_configs = 1;</code>
     * @param values The gradeConfigs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllGradeConfigs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig, GradeConfigsProxy>.plusAssign(values: kotlin.collections.Iterable<ei.Ei.ContractSimConfig.ContractGradeSimConfig>) {
      addAll(values)
    }
    /**
     * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig grade_configs = 1;</code>
     * @param index The index to set the value at.
     * @param value The gradeConfigs to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setGradeConfigs")
    public operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig, GradeConfigsProxy>.set(index: kotlin.Int, value: ei.Ei.ContractSimConfig.ContractGradeSimConfig) {
      _builder.setGradeConfigs(index, value)
    }
    /**
     * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig grade_configs = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearGradeConfigs")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig, GradeConfigsProxy>.clear() {
      _builder.clearGradeConfigs()
    }

  }
  @kotlin.jvm.JvmName("-initializecontractGradeSimConfig")
  public inline fun contractGradeSimConfig(block: ei.ContractSimConfigKt.ContractGradeSimConfigKt.Dsl.() -> kotlin.Unit): ei.Ei.ContractSimConfig.ContractGradeSimConfig =
    ei.ContractSimConfigKt.ContractGradeSimConfigKt.Dsl._create(ei.Ei.ContractSimConfig.ContractGradeSimConfig.newBuilder()).apply { block() }._build()
  public object ContractGradeSimConfigKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: ei.Ei.ContractSimConfig.ContractGradeSimConfig.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: ei.Ei.ContractSimConfig.ContractGradeSimConfig.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): ei.Ei.ContractSimConfig.ContractGradeSimConfig = _builder.build()

      /**
       * <code>optional .ei.Contract.PlayerGrade grade = 1;</code>
       */
      public var grade: ei.Ei.Contract.PlayerGrade
        @JvmName("getGrade")
        get() = _builder.getGrade()
        @JvmName("setGrade")
        set(value) {
          _builder.setGrade(value)
        }
      /**
       * <code>optional .ei.Contract.PlayerGrade grade = 1;</code>
       */
      public fun clearGrade() {
        _builder.clearGrade()
      }
      /**
       * <code>optional .ei.Contract.PlayerGrade grade = 1;</code>
       * @return Whether the grade field is set.
       */
      public fun hasGrade(): kotlin.Boolean {
        return _builder.hasGrade()
      }

      /**
       * An uninstantiable, behaviorless type to represent the field in
       * generics.
       */
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      public class GoalParamsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
      /**
       * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig.GoalParams goal_params = 2;</code>
       */
       public val goalParams: com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams, GoalParamsProxy>
        @kotlin.jvm.JvmSynthetic
        get() = com.google.protobuf.kotlin.DslList(
          _builder.getGoalParamsList()
        )
      /**
       * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig.GoalParams goal_params = 2;</code>
       * @param value The goalParams to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addGoalParams")
      public fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams, GoalParamsProxy>.add(value: ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams) {
        _builder.addGoalParams(value)
      }
      /**
       * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig.GoalParams goal_params = 2;</code>
       * @param value The goalParams to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignGoalParams")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams, GoalParamsProxy>.plusAssign(value: ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams) {
        add(value)
      }
      /**
       * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig.GoalParams goal_params = 2;</code>
       * @param values The goalParams to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addAllGoalParams")
      public fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams, GoalParamsProxy>.addAll(values: kotlin.collections.Iterable<ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams>) {
        _builder.addAllGoalParams(values)
      }
      /**
       * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig.GoalParams goal_params = 2;</code>
       * @param values The goalParams to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignAllGoalParams")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams, GoalParamsProxy>.plusAssign(values: kotlin.collections.Iterable<ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams>) {
        addAll(values)
      }
      /**
       * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig.GoalParams goal_params = 2;</code>
       * @param index The index to set the value at.
       * @param value The goalParams to set.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("setGoalParams")
      public operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams, GoalParamsProxy>.set(index: kotlin.Int, value: ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams) {
        _builder.setGoalParams(index, value)
      }
      /**
       * <code>repeated .ei.ContractSimConfig.ContractGradeSimConfig.GoalParams goal_params = 2;</code>
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("clearGoalParams")
      public fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams, GoalParamsProxy>.clear() {
        _builder.clearGoalParams()
      }

    }
    @kotlin.jvm.JvmName("-initializegoalParams")
    public inline fun goalParams(block: ei.ContractSimConfigKt.ContractGradeSimConfigKt.GoalParamsKt.Dsl.() -> kotlin.Unit): ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams =
      ei.ContractSimConfigKt.ContractGradeSimConfigKt.GoalParamsKt.Dsl._create(ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams.newBuilder()).apply { block() }._build()
    public object GoalParamsKt {
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      @com.google.protobuf.kotlin.ProtoDslMarker
      public class Dsl private constructor(
        private val _builder: ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams.Builder
      ) {
        public companion object {
          @kotlin.jvm.JvmSynthetic
          @kotlin.PublishedApi
          internal fun _create(builder: ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams.Builder): Dsl = Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams = _builder.build()

        /**
         * <code>optional double target_se = 1;</code>
         */
        public var targetSe: kotlin.Double
          @JvmName("getTargetSe")
          get() = _builder.getTargetSe()
          @JvmName("setTargetSe")
          set(value) {
            _builder.setTargetSe(value)
          }
        /**
         * <code>optional double target_se = 1;</code>
         */
        public fun clearTargetSe() {
          _builder.clearTargetSe()
        }
        /**
         * <code>optional double target_se = 1;</code>
         * @return Whether the targetSe field is set.
         */
        public fun hasTargetSe(): kotlin.Boolean {
          return _builder.hasTargetSe()
        }

        /**
         * <code>optional double cps_mult = 2;</code>
         */
        public var cpsMult: kotlin.Double
          @JvmName("getCpsMult")
          get() = _builder.getCpsMult()
          @JvmName("setCpsMult")
          set(value) {
            _builder.setCpsMult(value)
          }
        /**
         * <code>optional double cps_mult = 2;</code>
         */
        public fun clearCpsMult() {
          _builder.clearCpsMult()
        }
        /**
         * <code>optional double cps_mult = 2;</code>
         * @return Whether the cpsMult field is set.
         */
        public fun hasCpsMult(): kotlin.Boolean {
          return _builder.hasCpsMult()
        }

        /**
         * <code>optional double elr_mult = 7;</code>
         */
        public var elrMult: kotlin.Double
          @JvmName("getElrMult")
          get() = _builder.getElrMult()
          @JvmName("setElrMult")
          set(value) {
            _builder.setElrMult(value)
          }
        /**
         * <code>optional double elr_mult = 7;</code>
         */
        public fun clearElrMult() {
          _builder.clearElrMult()
        }
        /**
         * <code>optional double elr_mult = 7;</code>
         * @return Whether the elrMult field is set.
         */
        public fun hasElrMult(): kotlin.Boolean {
          return _builder.hasElrMult()
        }

        /**
         * <code>optional double earnings_mult = 3;</code>
         */
        public var earningsMult: kotlin.Double
          @JvmName("getEarningsMult")
          get() = _builder.getEarningsMult()
          @JvmName("setEarningsMult")
          set(value) {
            _builder.setEarningsMult(value)
          }
        /**
         * <code>optional double earnings_mult = 3;</code>
         */
        public fun clearEarningsMult() {
          _builder.clearEarningsMult()
        }
        /**
         * <code>optional double earnings_mult = 3;</code>
         * @return Whether the earningsMult field is set.
         */
        public fun hasEarningsMult(): kotlin.Boolean {
          return _builder.hasEarningsMult()
        }

        /**
         * <code>optional double time_efficacy = 4;</code>
         */
        public var timeEfficacy: kotlin.Double
          @JvmName("getTimeEfficacy")
          get() = _builder.getTimeEfficacy()
          @JvmName("setTimeEfficacy")
          set(value) {
            _builder.setTimeEfficacy(value)
          }
        /**
         * <code>optional double time_efficacy = 4;</code>
         */
        public fun clearTimeEfficacy() {
          _builder.clearTimeEfficacy()
        }
        /**
         * <code>optional double time_efficacy = 4;</code>
         * @return Whether the timeEfficacy field is set.
         */
        public fun hasTimeEfficacy(): kotlin.Boolean {
          return _builder.hasTimeEfficacy()
        }

        /**
         * <code>optional double hab_capacity_mult = 5;</code>
         */
        public var habCapacityMult: kotlin.Double
          @JvmName("getHabCapacityMult")
          get() = _builder.getHabCapacityMult()
          @JvmName("setHabCapacityMult")
          set(value) {
            _builder.setHabCapacityMult(value)
          }
        /**
         * <code>optional double hab_capacity_mult = 5;</code>
         */
        public fun clearHabCapacityMult() {
          _builder.clearHabCapacityMult()
        }
        /**
         * <code>optional double hab_capacity_mult = 5;</code>
         * @return Whether the habCapacityMult field is set.
         */
        public fun hasHabCapacityMult(): kotlin.Boolean {
          return _builder.hasHabCapacityMult()
        }

        /**
         * <code>optional double epic_research_budget = 6;</code>
         */
        public var epicResearchBudget: kotlin.Double
          @JvmName("getEpicResearchBudget")
          get() = _builder.getEpicResearchBudget()
          @JvmName("setEpicResearchBudget")
          set(value) {
            _builder.setEpicResearchBudget(value)
          }
        /**
         * <code>optional double epic_research_budget = 6;</code>
         */
        public fun clearEpicResearchBudget() {
          _builder.clearEpicResearchBudget()
        }
        /**
         * <code>optional double epic_research_budget = 6;</code>
         * @return Whether the epicResearchBudget field is set.
         */
        public fun hasEpicResearchBudget(): kotlin.Boolean {
          return _builder.hasEpicResearchBudget()
        }
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.ContractSimConfig.copy(block: ei.ContractSimConfigKt.Dsl.() -> kotlin.Unit): ei.Ei.ContractSimConfig =
  ei.ContractSimConfigKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.ContractSimConfig.ContractGradeSimConfig.copy(block: ei.ContractSimConfigKt.ContractGradeSimConfigKt.Dsl.() -> kotlin.Unit): ei.Ei.ContractSimConfig.ContractGradeSimConfig =
  ei.ContractSimConfigKt.ContractGradeSimConfigKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams.copy(block: ei.ContractSimConfigKt.ContractGradeSimConfigKt.GoalParamsKt.Dsl.() -> kotlin.Unit): ei.Ei.ContractSimConfig.ContractGradeSimConfig.GoalParams =
  ei.ContractSimConfigKt.ContractGradeSimConfigKt.GoalParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()


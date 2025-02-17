//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ei.proto

package ei;

@kotlin.jvm.JvmName("-initializecontractEvaluation")
public inline fun contractEvaluation(block: ei.ContractEvaluationKt.Dsl.() -> kotlin.Unit): ei.Ei.ContractEvaluation =
  ei.ContractEvaluationKt.Dsl._create(ei.Ei.ContractEvaluation.newBuilder()).apply { block() }._build()
public object ContractEvaluationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ei.Ei.ContractEvaluation.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ei.Ei.ContractEvaluation.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ei.Ei.ContractEvaluation = _builder.build()

    /**
     * <code>optional string contract_identifier = 40;</code>
     */
    public var contractIdentifier: kotlin.String
      @JvmName("getContractIdentifier")
      get() = _builder.getContractIdentifier()
      @JvmName("setContractIdentifier")
      set(value) {
        _builder.setContractIdentifier(value)
      }
    /**
     * <code>optional string contract_identifier = 40;</code>
     */
    public fun clearContractIdentifier() {
      _builder.clearContractIdentifier()
    }
    /**
     * <code>optional string contract_identifier = 40;</code>
     * @return Whether the contractIdentifier field is set.
     */
    public fun hasContractIdentifier(): kotlin.Boolean {
      return _builder.hasContractIdentifier()
    }

    /**
     * <code>optional string coop_identifier = 41;</code>
     */
    public var coopIdentifier: kotlin.String
      @JvmName("getCoopIdentifier")
      get() = _builder.getCoopIdentifier()
      @JvmName("setCoopIdentifier")
      set(value) {
        _builder.setCoopIdentifier(value)
      }
    /**
     * <code>optional string coop_identifier = 41;</code>
     */
    public fun clearCoopIdentifier() {
      _builder.clearCoopIdentifier()
    }
    /**
     * <code>optional string coop_identifier = 41;</code>
     * @return Whether the coopIdentifier field is set.
     */
    public fun hasCoopIdentifier(): kotlin.Boolean {
      return _builder.hasCoopIdentifier()
    }

    /**
     * <code>optional double cxp = 1;</code>
     */
    public var cxp: kotlin.Double
      @JvmName("getCxp")
      get() = _builder.getCxp()
      @JvmName("setCxp")
      set(value) {
        _builder.setCxp(value)
      }
    /**
     * <code>optional double cxp = 1;</code>
     */
    public fun clearCxp() {
      _builder.clearCxp()
    }
    /**
     * <code>optional double cxp = 1;</code>
     * @return Whether the cxp field is set.
     */
    public fun hasCxp(): kotlin.Boolean {
      return _builder.hasCxp()
    }

    /**
     * <code>optional bool replay = 24;</code>
     */
    public var replay: kotlin.Boolean
      @JvmName("getReplay")
      get() = _builder.getReplay()
      @JvmName("setReplay")
      set(value) {
        _builder.setReplay(value)
      }
    /**
     * <code>optional bool replay = 24;</code>
     */
    public fun clearReplay() {
      _builder.clearReplay()
    }
    /**
     * <code>optional bool replay = 24;</code>
     * @return Whether the replay field is set.
     */
    public fun hasReplay(): kotlin.Boolean {
      return _builder.hasReplay()
    }

    /**
     * <code>optional double cxp_change = 25;</code>
     */
    public var cxpChange: kotlin.Double
      @JvmName("getCxpChange")
      get() = _builder.getCxpChange()
      @JvmName("setCxpChange")
      set(value) {
        _builder.setCxpChange(value)
      }
    /**
     * <code>optional double cxp_change = 25;</code>
     */
    public fun clearCxpChange() {
      _builder.clearCxpChange()
    }
    /**
     * <code>optional double cxp_change = 25;</code>
     * @return Whether the cxpChange field is set.
     */
    public fun hasCxpChange(): kotlin.Boolean {
      return _builder.hasCxpChange()
    }

    /**
     * <code>optional int32 grade_performance = 2;</code>
     */
    public var gradePerformance: kotlin.Int
      @JvmName("getGradePerformance")
      get() = _builder.getGradePerformance()
      @JvmName("setGradePerformance")
      set(value) {
        _builder.setGradePerformance(value)
      }
    /**
     * <code>optional int32 grade_performance = 2;</code>
     */
    public fun clearGradePerformance() {
      _builder.clearGradePerformance()
    }
    /**
     * <code>optional int32 grade_performance = 2;</code>
     * @return Whether the gradePerformance field is set.
     */
    public fun hasGradePerformance(): kotlin.Boolean {
      return _builder.hasGradePerformance()
    }

    /**
     * <code>optional int32 old_league = 9;</code>
     */
    public var oldLeague: kotlin.Int
      @JvmName("getOldLeague")
      get() = _builder.getOldLeague()
      @JvmName("setOldLeague")
      set(value) {
        _builder.setOldLeague(value)
      }
    /**
     * <code>optional int32 old_league = 9;</code>
     */
    public fun clearOldLeague() {
      _builder.clearOldLeague()
    }
    /**
     * <code>optional int32 old_league = 9;</code>
     * @return Whether the oldLeague field is set.
     */
    public fun hasOldLeague(): kotlin.Boolean {
      return _builder.hasOldLeague()
    }

    /**
     * <code>optional bool old_goals = 10;</code>
     */
    public var oldGoals: kotlin.Boolean
      @JvmName("getOldGoals")
      get() = _builder.getOldGoals()
      @JvmName("setOldGoals")
      set(value) {
        _builder.setOldGoals(value)
      }
    /**
     * <code>optional bool old_goals = 10;</code>
     */
    public fun clearOldGoals() {
      _builder.clearOldGoals()
    }
    /**
     * <code>optional bool old_goals = 10;</code>
     * @return Whether the oldGoals field is set.
     */
    public fun hasOldGoals(): kotlin.Boolean {
      return _builder.hasOldGoals()
    }

    /**
     * <code>optional .ei.Contract.PlayerGrade grade = 3;</code>
     */
    public var grade: ei.Ei.Contract.PlayerGrade
      @JvmName("getGrade")
      get() = _builder.getGrade()
      @JvmName("setGrade")
      set(value) {
        _builder.setGrade(value)
      }
    /**
     * <code>optional .ei.Contract.PlayerGrade grade = 3;</code>
     */
    public fun clearGrade() {
      _builder.clearGrade()
    }
    /**
     * <code>optional .ei.Contract.PlayerGrade grade = 3;</code>
     * @return Whether the grade field is set.
     */
    public fun hasGrade(): kotlin.Boolean {
      return _builder.hasGrade()
    }

    /**
     * <code>optional double contribution_ratio = 4;</code>
     */
    public var contributionRatio: kotlin.Double
      @JvmName("getContributionRatio")
      get() = _builder.getContributionRatio()
      @JvmName("setContributionRatio")
      set(value) {
        _builder.setContributionRatio(value)
      }
    /**
     * <code>optional double contribution_ratio = 4;</code>
     */
    public fun clearContributionRatio() {
      _builder.clearContributionRatio()
    }
    /**
     * <code>optional double contribution_ratio = 4;</code>
     * @return Whether the contributionRatio field is set.
     */
    public fun hasContributionRatio(): kotlin.Boolean {
      return _builder.hasContributionRatio()
    }

    /**
     * <code>optional double completion_percent = 5;</code>
     */
    public var completionPercent: kotlin.Double
      @JvmName("getCompletionPercent")
      get() = _builder.getCompletionPercent()
      @JvmName("setCompletionPercent")
      set(value) {
        _builder.setCompletionPercent(value)
      }
    /**
     * <code>optional double completion_percent = 5;</code>
     */
    public fun clearCompletionPercent() {
      _builder.clearCompletionPercent()
    }
    /**
     * <code>optional double completion_percent = 5;</code>
     * @return Whether the completionPercent field is set.
     */
    public fun hasCompletionPercent(): kotlin.Boolean {
      return _builder.hasCompletionPercent()
    }

    /**
     * <code>optional double original_length = 11;</code>
     */
    public var originalLength: kotlin.Double
      @JvmName("getOriginalLength")
      get() = _builder.getOriginalLength()
      @JvmName("setOriginalLength")
      set(value) {
        _builder.setOriginalLength(value)
      }
    /**
     * <code>optional double original_length = 11;</code>
     */
    public fun clearOriginalLength() {
      _builder.clearOriginalLength()
    }
    /**
     * <code>optional double original_length = 11;</code>
     * @return Whether the originalLength field is set.
     */
    public fun hasOriginalLength(): kotlin.Boolean {
      return _builder.hasOriginalLength()
    }

    /**
     * <code>optional uint32 coop_size = 18;</code>
     */
    public var coopSize: kotlin.Int
      @JvmName("getCoopSize")
      get() = _builder.getCoopSize()
      @JvmName("setCoopSize")
      set(value) {
        _builder.setCoopSize(value)
      }
    /**
     * <code>optional uint32 coop_size = 18;</code>
     */
    public fun clearCoopSize() {
      _builder.clearCoopSize()
    }
    /**
     * <code>optional uint32 coop_size = 18;</code>
     * @return Whether the coopSize field is set.
     */
    public fun hasCoopSize(): kotlin.Boolean {
      return _builder.hasCoopSize()
    }

    /**
     * <code>optional bool solo = 26;</code>
     */
    public var solo: kotlin.Boolean
      @JvmName("getSolo")
      get() = _builder.getSolo()
      @JvmName("setSolo")
      set(value) {
        _builder.setSolo(value)
      }
    /**
     * <code>optional bool solo = 26;</code>
     */
    public fun clearSolo() {
      _builder.clearSolo()
    }
    /**
     * <code>optional bool solo = 26;</code>
     * @return Whether the solo field is set.
     */
    public fun hasSolo(): kotlin.Boolean {
      return _builder.hasSolo()
    }

    /**
     * <code>optional double soul_power = 23;</code>
     */
    public var soulPower: kotlin.Double
      @JvmName("getSoulPower")
      get() = _builder.getSoulPower()
      @JvmName("setSoulPower")
      set(value) {
        _builder.setSoulPower(value)
      }
    /**
     * <code>optional double soul_power = 23;</code>
     */
    public fun clearSoulPower() {
      _builder.clearSoulPower()
    }
    /**
     * <code>optional double soul_power = 23;</code>
     * @return Whether the soulPower field is set.
     */
    public fun hasSoulPower(): kotlin.Boolean {
      return _builder.hasSoulPower()
    }

    /**
     * <code>optional double last_contribution_time = 22;</code>
     */
    public var lastContributionTime: kotlin.Double
      @JvmName("getLastContributionTime")
      get() = _builder.getLastContributionTime()
      @JvmName("setLastContributionTime")
      set(value) {
        _builder.setLastContributionTime(value)
      }
    /**
     * <code>optional double last_contribution_time = 22;</code>
     */
    public fun clearLastContributionTime() {
      _builder.clearLastContributionTime()
    }
    /**
     * <code>optional double last_contribution_time = 22;</code>
     * @return Whether the lastContributionTime field is set.
     */
    public fun hasLastContributionTime(): kotlin.Boolean {
      return _builder.hasLastContributionTime()
    }

    /**
     * <code>optional double completion_time = 6;</code>
     */
    public var completionTime: kotlin.Double
      @JvmName("getCompletionTime")
      get() = _builder.getCompletionTime()
      @JvmName("setCompletionTime")
      set(value) {
        _builder.setCompletionTime(value)
      }
    /**
     * <code>optional double completion_time = 6;</code>
     */
    public fun clearCompletionTime() {
      _builder.clearCompletionTime()
    }
    /**
     * <code>optional double completion_time = 6;</code>
     * @return Whether the completionTime field is set.
     */
    public fun hasCompletionTime(): kotlin.Boolean {
      return _builder.hasCompletionTime()
    }

    /**
     * <code>optional uint32 chicken_runs_sent = 7;</code>
     */
    public var chickenRunsSent: kotlin.Int
      @JvmName("getChickenRunsSent")
      get() = _builder.getChickenRunsSent()
      @JvmName("setChickenRunsSent")
      set(value) {
        _builder.setChickenRunsSent(value)
      }
    /**
     * <code>optional uint32 chicken_runs_sent = 7;</code>
     */
    public fun clearChickenRunsSent() {
      _builder.clearChickenRunsSent()
    }
    /**
     * <code>optional uint32 chicken_runs_sent = 7;</code>
     * @return Whether the chickenRunsSent field is set.
     */
    public fun hasChickenRunsSent(): kotlin.Boolean {
      return _builder.hasChickenRunsSent()
    }

    /**
     * <code>optional uint32 gift_tokens_sent = 8;</code>
     */
    public var giftTokensSent: kotlin.Int
      @JvmName("getGiftTokensSent")
      get() = _builder.getGiftTokensSent()
      @JvmName("setGiftTokensSent")
      set(value) {
        _builder.setGiftTokensSent(value)
      }
    /**
     * <code>optional uint32 gift_tokens_sent = 8;</code>
     */
    public fun clearGiftTokensSent() {
      _builder.clearGiftTokensSent()
    }
    /**
     * <code>optional uint32 gift_tokens_sent = 8;</code>
     * @return Whether the giftTokensSent field is set.
     */
    public fun hasGiftTokensSent(): kotlin.Boolean {
      return _builder.hasGiftTokensSent()
    }

    /**
     * <code>optional uint32 gift_tokens_received = 15;</code>
     */
    public var giftTokensReceived: kotlin.Int
      @JvmName("getGiftTokensReceived")
      get() = _builder.getGiftTokensReceived()
      @JvmName("setGiftTokensReceived")
      set(value) {
        _builder.setGiftTokensReceived(value)
      }
    /**
     * <code>optional uint32 gift_tokens_received = 15;</code>
     */
    public fun clearGiftTokensReceived() {
      _builder.clearGiftTokensReceived()
    }
    /**
     * <code>optional uint32 gift_tokens_received = 15;</code>
     * @return Whether the giftTokensReceived field is set.
     */
    public fun hasGiftTokensReceived(): kotlin.Boolean {
      return _builder.hasGiftTokensReceived()
    }

    /**
     * <code>optional double gift_token_value_sent = 28;</code>
     */
    public var giftTokenValueSent: kotlin.Double
      @JvmName("getGiftTokenValueSent")
      get() = _builder.getGiftTokenValueSent()
      @JvmName("setGiftTokenValueSent")
      set(value) {
        _builder.setGiftTokenValueSent(value)
      }
    /**
     * <code>optional double gift_token_value_sent = 28;</code>
     */
    public fun clearGiftTokenValueSent() {
      _builder.clearGiftTokenValueSent()
    }
    /**
     * <code>optional double gift_token_value_sent = 28;</code>
     * @return Whether the giftTokenValueSent field is set.
     */
    public fun hasGiftTokenValueSent(): kotlin.Boolean {
      return _builder.hasGiftTokenValueSent()
    }

    /**
     * <code>optional double gift_token_value_received = 29;</code>
     */
    public var giftTokenValueReceived: kotlin.Double
      @JvmName("getGiftTokenValueReceived")
      get() = _builder.getGiftTokenValueReceived()
      @JvmName("setGiftTokenValueReceived")
      set(value) {
        _builder.setGiftTokenValueReceived(value)
      }
    /**
     * <code>optional double gift_token_value_received = 29;</code>
     */
    public fun clearGiftTokenValueReceived() {
      _builder.clearGiftTokenValueReceived()
    }
    /**
     * <code>optional double gift_token_value_received = 29;</code>
     * @return Whether the giftTokenValueReceived field is set.
     */
    public fun hasGiftTokenValueReceived(): kotlin.Boolean {
      return _builder.hasGiftTokenValueReceived()
    }

    /**
     * <code>optional uint32 boost_token_allotment = 16;</code>
     */
    public var boostTokenAllotment: kotlin.Int
      @JvmName("getBoostTokenAllotment")
      get() = _builder.getBoostTokenAllotment()
      @JvmName("setBoostTokenAllotment")
      set(value) {
        _builder.setBoostTokenAllotment(value)
      }
    /**
     * <code>optional uint32 boost_token_allotment = 16;</code>
     */
    public fun clearBoostTokenAllotment() {
      _builder.clearBoostTokenAllotment()
    }
    /**
     * <code>optional uint32 boost_token_allotment = 16;</code>
     * @return Whether the boostTokenAllotment field is set.
     */
    public fun hasBoostTokenAllotment(): kotlin.Boolean {
      return _builder.hasBoostTokenAllotment()
    }

    /**
     * <code>optional double buff_time_value = 17;</code>
     */
    public var buffTimeValue: kotlin.Double
      @JvmName("getBuffTimeValue")
      get() = _builder.getBuffTimeValue()
      @JvmName("setBuffTimeValue")
      set(value) {
        _builder.setBuffTimeValue(value)
      }
    /**
     * <code>optional double buff_time_value = 17;</code>
     */
    public fun clearBuffTimeValue() {
      _builder.clearBuffTimeValue()
    }
    /**
     * <code>optional double buff_time_value = 17;</code>
     * @return Whether the buffTimeValue field is set.
     */
    public fun hasBuffTimeValue(): kotlin.Boolean {
      return _builder.hasBuffTimeValue()
    }

    /**
     * <code>optional double teamwork_score = 13;</code>
     */
    public var teamworkScore: kotlin.Double
      @JvmName("getTeamworkScore")
      get() = _builder.getTeamworkScore()
      @JvmName("setTeamworkScore")
      set(value) {
        _builder.setTeamworkScore(value)
      }
    /**
     * <code>optional double teamwork_score = 13;</code>
     */
    public fun clearTeamworkScore() {
      _builder.clearTeamworkScore()
    }
    /**
     * <code>optional double teamwork_score = 13;</code>
     * @return Whether the teamworkScore field is set.
     */
    public fun hasTeamworkScore(): kotlin.Boolean {
      return _builder.hasTeamworkScore()
    }

    /**
     * <code>optional double other_bonuses = 14;</code>
     */
    public var otherBonuses: kotlin.Double
      @JvmName("getOtherBonuses")
      get() = _builder.getOtherBonuses()
      @JvmName("setOtherBonuses")
      set(value) {
        _builder.setOtherBonuses(value)
      }
    /**
     * <code>optional double other_bonuses = 14;</code>
     */
    public fun clearOtherBonuses() {
      _builder.clearOtherBonuses()
    }
    /**
     * <code>optional double other_bonuses = 14;</code>
     * @return Whether the otherBonuses field is set.
     */
    public fun hasOtherBonuses(): kotlin.Boolean {
      return _builder.hasOtherBonuses()
    }

    /**
     * <code>optional bool counted_in_season = 20;</code>
     */
    public var countedInSeason: kotlin.Boolean
      @JvmName("getCountedInSeason")
      get() = _builder.getCountedInSeason()
      @JvmName("setCountedInSeason")
      set(value) {
        _builder.setCountedInSeason(value)
      }
    /**
     * <code>optional bool counted_in_season = 20;</code>
     */
    public fun clearCountedInSeason() {
      _builder.clearCountedInSeason()
    }
    /**
     * <code>optional bool counted_in_season = 20;</code>
     * @return Whether the countedInSeason field is set.
     */
    public fun hasCountedInSeason(): kotlin.Boolean {
      return _builder.hasCountedInSeason()
    }

    /**
     * <code>optional string season_id = 21;</code>
     */
    public var seasonId: kotlin.String
      @JvmName("getSeasonId")
      get() = _builder.getSeasonId()
      @JvmName("setSeasonId")
      set(value) {
        _builder.setSeasonId(value)
      }
    /**
     * <code>optional string season_id = 21;</code>
     */
    public fun clearSeasonId() {
      _builder.clearSeasonId()
    }
    /**
     * <code>optional string season_id = 21;</code>
     * @return Whether the seasonId field is set.
     */
    public fun hasSeasonId(): kotlin.Boolean {
      return _builder.hasSeasonId()
    }

    /**
     * <code>optional uint32 time_cheats = 27;</code>
     */
    public var timeCheats: kotlin.Int
      @JvmName("getTimeCheats")
      get() = _builder.getTimeCheats()
      @JvmName("setTimeCheats")
      set(value) {
        _builder.setTimeCheats(value)
      }
    /**
     * <code>optional uint32 time_cheats = 27;</code>
     */
    public fun clearTimeCheats() {
      _builder.clearTimeCheats()
    }
    /**
     * <code>optional uint32 time_cheats = 27;</code>
     * @return Whether the timeCheats field is set.
     */
    public fun hasTimeCheats(): kotlin.Boolean {
      return _builder.hasTimeCheats()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class IssuesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .ei.ContractEvaluation.PoorBehavior issues = 19;</code>
     */
     public val issues: com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation.PoorBehavior, IssuesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getIssuesList()
      )
    /**
     * <code>repeated .ei.ContractEvaluation.PoorBehavior issues = 19;</code>
     * @param value The issues to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addIssues")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation.PoorBehavior, IssuesProxy>.add(value: ei.Ei.ContractEvaluation.PoorBehavior) {
      _builder.addIssues(value)
    }/**
     * <code>repeated .ei.ContractEvaluation.PoorBehavior issues = 19;</code>
     * @param value The issues to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignIssues")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation.PoorBehavior, IssuesProxy>.plusAssign(value: ei.Ei.ContractEvaluation.PoorBehavior) {
      add(value)
    }/**
     * <code>repeated .ei.ContractEvaluation.PoorBehavior issues = 19;</code>
     * @param values The issues to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllIssues")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation.PoorBehavior, IssuesProxy>.addAll(values: kotlin.collections.Iterable<ei.Ei.ContractEvaluation.PoorBehavior>) {
      _builder.addAllIssues(values)
    }/**
     * <code>repeated .ei.ContractEvaluation.PoorBehavior issues = 19;</code>
     * @param values The issues to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllIssues")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation.PoorBehavior, IssuesProxy>.plusAssign(values: kotlin.collections.Iterable<ei.Ei.ContractEvaluation.PoorBehavior>) {
      addAll(values)
    }/**
     * <code>repeated .ei.ContractEvaluation.PoorBehavior issues = 19;</code>
     * @param index The index to set the value at.
     * @param value The issues to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setIssues")
    public operator fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation.PoorBehavior, IssuesProxy>.set(index: kotlin.Int, value: ei.Ei.ContractEvaluation.PoorBehavior) {
      _builder.setIssues(index, value)
    }/**
     * <code>repeated .ei.ContractEvaluation.PoorBehavior issues = 19;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearIssues")
    public fun com.google.protobuf.kotlin.DslList<ei.Ei.ContractEvaluation.PoorBehavior, IssuesProxy>.clear() {
      _builder.clearIssues()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class NotesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string notes = 12;</code>
     * @return A list containing the notes.
     */
    public val notes: com.google.protobuf.kotlin.DslList<kotlin.String, NotesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getNotesList()
      )
    /**
     * <code>repeated string notes = 12;</code>
     * @param value The notes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addNotes")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, NotesProxy>.add(value: kotlin.String) {
      _builder.addNotes(value)
    }
    /**
     * <code>repeated string notes = 12;</code>
     * @param value The notes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignNotes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, NotesProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string notes = 12;</code>
     * @param values The notes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllNotes")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, NotesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllNotes(values)
    }
    /**
     * <code>repeated string notes = 12;</code>
     * @param values The notes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllNotes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, NotesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string notes = 12;</code>
     * @param index The index to set the value at.
     * @param value The notes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setNotes")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, NotesProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setNotes(index, value)
    }/**
     * <code>repeated string notes = 12;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearNotes")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, NotesProxy>.clear() {
      _builder.clearNotes()
    }
    /**
     * <code>optional string version = 50;</code>
     */
    public var version: kotlin.String
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <code>optional string version = 50;</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }
    /**
     * <code>optional string version = 50;</code>
     * @return Whether the version field is set.
     */
    public fun hasVersion(): kotlin.Boolean {
      return _builder.hasVersion()
    }

    /**
     * <code>optional double evaluation_start_time = 51;</code>
     */
    public var evaluationStartTime: kotlin.Double
      @JvmName("getEvaluationStartTime")
      get() = _builder.getEvaluationStartTime()
      @JvmName("setEvaluationStartTime")
      set(value) {
        _builder.setEvaluationStartTime(value)
      }
    /**
     * <code>optional double evaluation_start_time = 51;</code>
     */
    public fun clearEvaluationStartTime() {
      _builder.clearEvaluationStartTime()
    }
    /**
     * <code>optional double evaluation_start_time = 51;</code>
     * @return Whether the evaluationStartTime field is set.
     */
    public fun hasEvaluationStartTime(): kotlin.Boolean {
      return _builder.hasEvaluationStartTime()
    }

    /**
     * <code>optional .ei.ContractEvaluation.Status status = 52;</code>
     */
    public var status: ei.Ei.ContractEvaluation.Status
      @JvmName("getStatus")
      get() = _builder.getStatus()
      @JvmName("setStatus")
      set(value) {
        _builder.setStatus(value)
      }
    /**
     * <code>optional .ei.ContractEvaluation.Status status = 52;</code>
     */
    public fun clearStatus() {
      _builder.clearStatus()
    }
    /**
     * <code>optional .ei.ContractEvaluation.Status status = 52;</code>
     * @return Whether the status field is set.
     */
    public fun hasStatus(): kotlin.Boolean {
      return _builder.hasStatus()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ei.Ei.ContractEvaluation.copy(block: ei.ContractEvaluationKt.Dsl.() -> kotlin.Unit): ei.Ei.ContractEvaluation =
  ei.ContractEvaluationKt.Dsl._create(this.toBuilder()).apply { block() }._build()


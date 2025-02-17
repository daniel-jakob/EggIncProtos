// source: ei.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.ei.AppInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.ei.AppInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ei.AppInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ei.AppInfo.displayName = 'proto.ei.AppInfo';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.ei.AppInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.ei.AppInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ei.AppInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ei.AppInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    versionStr: (f = jspb.Message.getField(msg, 1)) == null ? undefined : f,
    sessions: (f = jspb.Message.getField(msg, 2)) == null ? undefined : f,
    numPrestiges: (f = jspb.Message.getField(msg, 3)) == null ? undefined : f,
    soulEggs: (f = jspb.Message.getField(msg, 4)) == null ? undefined : f,
    currentEgg: (f = jspb.Message.getField(msg, 5)) == null ? undefined : f,
    goldEarned: (f = jspb.Message.getField(msg, 6)) == null ? undefined : f,
    goldSpent: (f = jspb.Message.getField(msg, 7)) == null ? undefined : f,
    currentMission: (f = jspb.Message.getField(msg, 8)) == null ? undefined : f,
    piggySize: (f = jspb.Message.getField(msg, 9)) == null ? undefined : f,
    numPiggyBreaks: (f = jspb.Message.getField(msg, 10)) == null ? undefined : f,
    verifiedPiggyBreaks: (f = jspb.Message.getField(msg, 29)) == null ? undefined : f,
    iapPacksPurchased: (f = jspb.Message.getField(msg, 11)) == null ? undefined : f,
    permitLevel: (f = jspb.Message.getField(msg, 12)) == null ? undefined : f,
    videoDoublerUses: (f = jspb.Message.getField(msg, 15)) == null ? undefined : f,
    droneTakedowns: (f = jspb.Message.getField(msg, 18)) == null ? undefined : f,
    droneTakedownsElite: (f = jspb.Message.getField(msg, 19)) == null ? undefined : f,
    trophiesUnlocked: (f = jspb.Message.getBooleanField(msg, 20)) == null ? undefined : f,
    eggLevel: (f = jspb.Message.getOptionalFloatingPointField(msg, 21)) == null ? undefined : f,
    struggleFactor: (f = jspb.Message.getOptionalFloatingPointField(msg, 22)) == null ? undefined : f,
    piggyFull: (f = jspb.Message.getBooleanField(msg, 23)) == null ? undefined : f,
    piggyFoundFull: (f = jspb.Message.getBooleanField(msg, 24)) == null ? undefined : f,
    timePiggyFullRealtime: (f = jspb.Message.getOptionalFloatingPointField(msg, 25)) == null ? undefined : f,
    timePiggyFullGametime: (f = jspb.Message.getOptionalFloatingPointField(msg, 26)) == null ? undefined : f,
    lostPiggyIncrements: (f = jspb.Message.getField(msg, 27)) == null ? undefined : f,
    saleId: (f = jspb.Message.getField(msg, 28)) == null ? undefined : f,
    unlimitedChickensUses: (f = jspb.Message.getField(msg, 13)) == null ? undefined : f,
    refillUses: (f = jspb.Message.getField(msg, 14)) == null ? undefined : f,
    shortWarpUses: (f = jspb.Message.getField(msg, 16)) == null ? undefined : f,
    longWarpUses: (f = jspb.Message.getField(msg, 17)) == null ? undefined : f
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.ei.AppInfo}
 */
proto.ei.AppInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ei.AppInfo;
  return proto.ei.AppInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ei.AppInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ei.AppInfo}
 */
proto.ei.AppInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setVersionStr(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setSessions(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setNumPrestiges(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSoulEggs(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setCurrentEgg(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGoldEarned(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGoldSpent(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setCurrentMission(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setPiggySize(value);
      break;
    case 10:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setNumPiggyBreaks(value);
      break;
    case 29:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setVerifiedPiggyBreaks(value);
      break;
    case 11:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setIapPacksPurchased(value);
      break;
    case 12:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setPermitLevel(value);
      break;
    case 15:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setVideoDoublerUses(value);
      break;
    case 18:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setDroneTakedowns(value);
      break;
    case 19:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setDroneTakedownsElite(value);
      break;
    case 20:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setTrophiesUnlocked(value);
      break;
    case 21:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setEggLevel(value);
      break;
    case 22:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setStruggleFactor(value);
      break;
    case 23:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setPiggyFull(value);
      break;
    case 24:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setPiggyFoundFull(value);
      break;
    case 25:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setTimePiggyFullRealtime(value);
      break;
    case 26:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setTimePiggyFullGametime(value);
      break;
    case 27:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLostPiggyIncrements(value);
      break;
    case 28:
      var value = /** @type {string} */ (reader.readString());
      msg.setSaleId(value);
      break;
    case 13:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setUnlimitedChickensUses(value);
      break;
    case 14:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRefillUses(value);
      break;
    case 16:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setShortWarpUses(value);
      break;
    case 17:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLongWarpUses(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.ei.AppInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ei.AppInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ei.AppInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ei.AppInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = /** @type {string} */ (jspb.Message.getField(message, 1));
  if (f != null) {
    writer.writeString(
      1,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 2));
  if (f != null) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 3));
  if (f != null) {
    writer.writeUint32(
      3,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 4));
  if (f != null) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 5));
  if (f != null) {
    writer.writeUint32(
      5,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 6));
  if (f != null) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 7));
  if (f != null) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 8));
  if (f != null) {
    writer.writeUint32(
      8,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 9));
  if (f != null) {
    writer.writeUint32(
      9,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 10));
  if (f != null) {
    writer.writeUint64(
      10,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 29));
  if (f != null) {
    writer.writeUint64(
      29,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 11));
  if (f != null) {
    writer.writeUint64(
      11,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 12));
  if (f != null) {
    writer.writeUint32(
      12,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 15));
  if (f != null) {
    writer.writeUint64(
      15,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 18));
  if (f != null) {
    writer.writeUint64(
      18,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 19));
  if (f != null) {
    writer.writeUint64(
      19,
      f
    );
  }
  f = /** @type {boolean} */ (jspb.Message.getField(message, 20));
  if (f != null) {
    writer.writeBool(
      20,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 21));
  if (f != null) {
    writer.writeFloat(
      21,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 22));
  if (f != null) {
    writer.writeFloat(
      22,
      f
    );
  }
  f = /** @type {boolean} */ (jspb.Message.getField(message, 23));
  if (f != null) {
    writer.writeBool(
      23,
      f
    );
  }
  f = /** @type {boolean} */ (jspb.Message.getField(message, 24));
  if (f != null) {
    writer.writeBool(
      24,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 25));
  if (f != null) {
    writer.writeDouble(
      25,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 26));
  if (f != null) {
    writer.writeDouble(
      26,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 27));
  if (f != null) {
    writer.writeUint64(
      27,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 28));
  if (f != null) {
    writer.writeString(
      28,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 13));
  if (f != null) {
    writer.writeUint64(
      13,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 14));
  if (f != null) {
    writer.writeUint64(
      14,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 16));
  if (f != null) {
    writer.writeUint64(
      16,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 17));
  if (f != null) {
    writer.writeUint64(
      17,
      f
    );
  }
};


/**
 * optional string version_str = 1;
 * @return {string}
 */
proto.ei.AppInfo.prototype.getVersionStr = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setVersionStr = function(value) {
  return jspb.Message.setField(this, 1, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearVersionStr = function() {
  return jspb.Message.setField(this, 1, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasVersionStr = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional uint32 sessions = 2;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getSessions = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setSessions = function(value) {
  return jspb.Message.setField(this, 2, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearSessions = function() {
  return jspb.Message.setField(this, 2, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasSessions = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional uint32 num_prestiges = 3;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getNumPrestiges = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setNumPrestiges = function(value) {
  return jspb.Message.setField(this, 3, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearNumPrestiges = function() {
  return jspb.Message.setField(this, 3, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasNumPrestiges = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional uint64 soul_eggs = 4;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getSoulEggs = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setSoulEggs = function(value) {
  return jspb.Message.setField(this, 4, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearSoulEggs = function() {
  return jspb.Message.setField(this, 4, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasSoulEggs = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional uint32 current_egg = 5;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getCurrentEgg = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setCurrentEgg = function(value) {
  return jspb.Message.setField(this, 5, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearCurrentEgg = function() {
  return jspb.Message.setField(this, 5, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasCurrentEgg = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional uint64 gold_earned = 6;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getGoldEarned = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setGoldEarned = function(value) {
  return jspb.Message.setField(this, 6, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearGoldEarned = function() {
  return jspb.Message.setField(this, 6, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasGoldEarned = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional uint64 gold_spent = 7;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getGoldSpent = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setGoldSpent = function(value) {
  return jspb.Message.setField(this, 7, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearGoldSpent = function() {
  return jspb.Message.setField(this, 7, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasGoldSpent = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional uint32 current_mission = 8;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getCurrentMission = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setCurrentMission = function(value) {
  return jspb.Message.setField(this, 8, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearCurrentMission = function() {
  return jspb.Message.setField(this, 8, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasCurrentMission = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional uint32 piggy_size = 9;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getPiggySize = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setPiggySize = function(value) {
  return jspb.Message.setField(this, 9, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearPiggySize = function() {
  return jspb.Message.setField(this, 9, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasPiggySize = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional uint64 num_piggy_breaks = 10;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getNumPiggyBreaks = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setNumPiggyBreaks = function(value) {
  return jspb.Message.setField(this, 10, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearNumPiggyBreaks = function() {
  return jspb.Message.setField(this, 10, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasNumPiggyBreaks = function() {
  return jspb.Message.getField(this, 10) != null;
};


/**
 * optional uint64 verified_piggy_breaks = 29;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getVerifiedPiggyBreaks = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 29, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setVerifiedPiggyBreaks = function(value) {
  return jspb.Message.setField(this, 29, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearVerifiedPiggyBreaks = function() {
  return jspb.Message.setField(this, 29, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasVerifiedPiggyBreaks = function() {
  return jspb.Message.getField(this, 29) != null;
};


/**
 * optional uint64 iap_packs_purchased = 11;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getIapPacksPurchased = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 11, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setIapPacksPurchased = function(value) {
  return jspb.Message.setField(this, 11, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearIapPacksPurchased = function() {
  return jspb.Message.setField(this, 11, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasIapPacksPurchased = function() {
  return jspb.Message.getField(this, 11) != null;
};


/**
 * optional uint32 permit_level = 12;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getPermitLevel = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 12, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setPermitLevel = function(value) {
  return jspb.Message.setField(this, 12, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearPermitLevel = function() {
  return jspb.Message.setField(this, 12, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasPermitLevel = function() {
  return jspb.Message.getField(this, 12) != null;
};


/**
 * optional uint64 video_doubler_uses = 15;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getVideoDoublerUses = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 15, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setVideoDoublerUses = function(value) {
  return jspb.Message.setField(this, 15, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearVideoDoublerUses = function() {
  return jspb.Message.setField(this, 15, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasVideoDoublerUses = function() {
  return jspb.Message.getField(this, 15) != null;
};


/**
 * optional uint64 drone_takedowns = 18;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getDroneTakedowns = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 18, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setDroneTakedowns = function(value) {
  return jspb.Message.setField(this, 18, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearDroneTakedowns = function() {
  return jspb.Message.setField(this, 18, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasDroneTakedowns = function() {
  return jspb.Message.getField(this, 18) != null;
};


/**
 * optional uint64 drone_takedowns_elite = 19;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getDroneTakedownsElite = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 19, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setDroneTakedownsElite = function(value) {
  return jspb.Message.setField(this, 19, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearDroneTakedownsElite = function() {
  return jspb.Message.setField(this, 19, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasDroneTakedownsElite = function() {
  return jspb.Message.getField(this, 19) != null;
};


/**
 * optional bool trophies_unlocked = 20;
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.getTrophiesUnlocked = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 20, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setTrophiesUnlocked = function(value) {
  return jspb.Message.setField(this, 20, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearTrophiesUnlocked = function() {
  return jspb.Message.setField(this, 20, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasTrophiesUnlocked = function() {
  return jspb.Message.getField(this, 20) != null;
};


/**
 * optional float egg_level = 21;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getEggLevel = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 21, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setEggLevel = function(value) {
  return jspb.Message.setField(this, 21, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearEggLevel = function() {
  return jspb.Message.setField(this, 21, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasEggLevel = function() {
  return jspb.Message.getField(this, 21) != null;
};


/**
 * optional float struggle_factor = 22;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getStruggleFactor = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 22, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setStruggleFactor = function(value) {
  return jspb.Message.setField(this, 22, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearStruggleFactor = function() {
  return jspb.Message.setField(this, 22, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasStruggleFactor = function() {
  return jspb.Message.getField(this, 22) != null;
};


/**
 * optional bool piggy_full = 23;
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.getPiggyFull = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 23, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setPiggyFull = function(value) {
  return jspb.Message.setField(this, 23, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearPiggyFull = function() {
  return jspb.Message.setField(this, 23, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasPiggyFull = function() {
  return jspb.Message.getField(this, 23) != null;
};


/**
 * optional bool piggy_found_full = 24;
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.getPiggyFoundFull = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 24, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setPiggyFoundFull = function(value) {
  return jspb.Message.setField(this, 24, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearPiggyFoundFull = function() {
  return jspb.Message.setField(this, 24, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasPiggyFoundFull = function() {
  return jspb.Message.getField(this, 24) != null;
};


/**
 * optional double time_piggy_full_realtime = 25;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getTimePiggyFullRealtime = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 25, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setTimePiggyFullRealtime = function(value) {
  return jspb.Message.setField(this, 25, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearTimePiggyFullRealtime = function() {
  return jspb.Message.setField(this, 25, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasTimePiggyFullRealtime = function() {
  return jspb.Message.getField(this, 25) != null;
};


/**
 * optional double time_piggy_full_gametime = 26;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getTimePiggyFullGametime = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 26, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setTimePiggyFullGametime = function(value) {
  return jspb.Message.setField(this, 26, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearTimePiggyFullGametime = function() {
  return jspb.Message.setField(this, 26, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasTimePiggyFullGametime = function() {
  return jspb.Message.getField(this, 26) != null;
};


/**
 * optional uint64 lost_piggy_increments = 27;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getLostPiggyIncrements = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 27, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setLostPiggyIncrements = function(value) {
  return jspb.Message.setField(this, 27, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearLostPiggyIncrements = function() {
  return jspb.Message.setField(this, 27, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasLostPiggyIncrements = function() {
  return jspb.Message.getField(this, 27) != null;
};


/**
 * optional string sale_id = 28;
 * @return {string}
 */
proto.ei.AppInfo.prototype.getSaleId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 28, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setSaleId = function(value) {
  return jspb.Message.setField(this, 28, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearSaleId = function() {
  return jspb.Message.setField(this, 28, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasSaleId = function() {
  return jspb.Message.getField(this, 28) != null;
};


/**
 * optional uint64 unlimited_chickens_uses = 13;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getUnlimitedChickensUses = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 13, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setUnlimitedChickensUses = function(value) {
  return jspb.Message.setField(this, 13, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearUnlimitedChickensUses = function() {
  return jspb.Message.setField(this, 13, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasUnlimitedChickensUses = function() {
  return jspb.Message.getField(this, 13) != null;
};


/**
 * optional uint64 refill_uses = 14;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getRefillUses = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 14, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setRefillUses = function(value) {
  return jspb.Message.setField(this, 14, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearRefillUses = function() {
  return jspb.Message.setField(this, 14, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasRefillUses = function() {
  return jspb.Message.getField(this, 14) != null;
};


/**
 * optional uint64 short_warp_uses = 16;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getShortWarpUses = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 16, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setShortWarpUses = function(value) {
  return jspb.Message.setField(this, 16, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearShortWarpUses = function() {
  return jspb.Message.setField(this, 16, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasShortWarpUses = function() {
  return jspb.Message.getField(this, 16) != null;
};


/**
 * optional uint64 long_warp_uses = 17;
 * @return {number}
 */
proto.ei.AppInfo.prototype.getLongWarpUses = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 17, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.setLongWarpUses = function(value) {
  return jspb.Message.setField(this, 17, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.AppInfo} returns this
 */
proto.ei.AppInfo.prototype.clearLongWarpUses = function() {
  return jspb.Message.setField(this, 17, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.AppInfo.prototype.hasLongWarpUses = function() {
  return jspb.Message.getField(this, 17) != null;
};



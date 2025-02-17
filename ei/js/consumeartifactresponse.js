// source: ei.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.ei.ConsumeArtifactResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ei.ArtifactSpec');
goog.require('proto.ei.Reward');

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
proto.ei.ConsumeArtifactResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ei.ConsumeArtifactResponse.repeatedFields_, null);
};
goog.inherits(proto.ei.ConsumeArtifactResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ei.ConsumeArtifactResponse.displayName = 'proto.ei.ConsumeArtifactResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ei.ConsumeArtifactResponse.repeatedFields_ = [6,3,4];



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
proto.ei.ConsumeArtifactResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.ei.ConsumeArtifactResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ei.ConsumeArtifactResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ei.ConsumeArtifactResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    success: (f = jspb.Message.getBooleanField(msg, 1)) == null ? undefined : f,
    originalItemId: (f = jspb.Message.getField(msg, 2)) == null ? undefined : f,
    additionalItemIdsList: (f = jspb.Message.getRepeatedField(msg, 6)) == null ? undefined : f,
    byproductsList: jspb.Message.toObjectList(msg.getByproductsList(),
    proto.ei.ArtifactSpec.toObject, includeInstance),
    otherRewardsList: jspb.Message.toObjectList(msg.getOtherRewardsList(),
    proto.ei.Reward.toObject, includeInstance),
    eiUserId: (f = jspb.Message.getField(msg, 5)) == null ? undefined : f
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
 * @return {!proto.ei.ConsumeArtifactResponse}
 */
proto.ei.ConsumeArtifactResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ei.ConsumeArtifactResponse;
  return proto.ei.ConsumeArtifactResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ei.ConsumeArtifactResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ei.ConsumeArtifactResponse}
 */
proto.ei.ConsumeArtifactResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setSuccess(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setOriginalItemId(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.addAdditionalItemIds(value);
      break;
    case 3:
      var value = new proto.ei.ArtifactSpec;
      reader.readMessage(value,proto.ei.ArtifactSpec.deserializeBinaryFromReader);
      msg.addByproducts(value);
      break;
    case 4:
      var value = new proto.ei.Reward;
      reader.readMessage(value,proto.ei.Reward.deserializeBinaryFromReader);
      msg.addOtherRewards(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setEiUserId(value);
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
proto.ei.ConsumeArtifactResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ei.ConsumeArtifactResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ei.ConsumeArtifactResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ei.ConsumeArtifactResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = /** @type {boolean} */ (jspb.Message.getField(message, 1));
  if (f != null) {
    writer.writeBool(
      1,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 2));
  if (f != null) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getAdditionalItemIdsList();
  if (f.length > 0) {
    writer.writeRepeatedUint64(
      6,
      f
    );
  }
  f = message.getByproductsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.ei.ArtifactSpec.serializeBinaryToWriter
    );
  }
  f = message.getOtherRewardsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.ei.Reward.serializeBinaryToWriter
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 5));
  if (f != null) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional bool success = 1;
 * @return {boolean}
 */
proto.ei.ConsumeArtifactResponse.prototype.getSuccess = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 1, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ei.ConsumeArtifactResponse} returns this
 */
proto.ei.ConsumeArtifactResponse.prototype.setSuccess = function(value) {
  return jspb.Message.setField(this, 1, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.ConsumeArtifactResponse} returns this
 */
proto.ei.ConsumeArtifactResponse.prototype.clearSuccess = function() {
  return jspb.Message.setField(this, 1, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.ConsumeArtifactResponse.prototype.hasSuccess = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional uint64 original_item_id = 2;
 * @return {number}
 */
proto.ei.ConsumeArtifactResponse.prototype.getOriginalItemId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.ConsumeArtifactResponse} returns this
 */
proto.ei.ConsumeArtifactResponse.prototype.setOriginalItemId = function(value) {
  return jspb.Message.setField(this, 2, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.ConsumeArtifactResponse} returns this
 */
proto.ei.ConsumeArtifactResponse.prototype.clearOriginalItemId = function() {
  return jspb.Message.setField(this, 2, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.ConsumeArtifactResponse.prototype.hasOriginalItemId = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated uint64 additional_item_ids = 6;
 * @return {!Array<number>}
 */
proto.ei.ConsumeArtifactResponse.prototype.getAdditionalItemIdsList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 6));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.ei.ConsumeArtifactResponse} returns this
 */
proto.ei.ConsumeArtifactResponse.prototype.setAdditionalItemIdsList = function(value) {
  return jspb.Message.setField(this, 6, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.ei.ConsumeArtifactResponse} returns this
 */
proto.ei.ConsumeArtifactResponse.prototype.addAdditionalItemIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 6, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ei.ConsumeArtifactResponse} returns this
 */
proto.ei.ConsumeArtifactResponse.prototype.clearAdditionalItemIdsList = function() {
  return this.setAdditionalItemIdsList([]);
};


/**
 * repeated ArtifactSpec byproducts = 3;
 * @return {!Array<!proto.ei.ArtifactSpec>}
 */
proto.ei.ConsumeArtifactResponse.prototype.getByproductsList = function() {
  return /** @type{!Array<!proto.ei.ArtifactSpec>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ei.ArtifactSpec, 3));
};


/**
 * @param {!Array<!proto.ei.ArtifactSpec>} value
 * @return {!proto.ei.ConsumeArtifactResponse} returns this
*/
proto.ei.ConsumeArtifactResponse.prototype.setByproductsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.ei.ArtifactSpec=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ei.ArtifactSpec}
 */
proto.ei.ConsumeArtifactResponse.prototype.addByproducts = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.ei.ArtifactSpec, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ei.ConsumeArtifactResponse} returns this
 */
proto.ei.ConsumeArtifactResponse.prototype.clearByproductsList = function() {
  return this.setByproductsList([]);
};


/**
 * repeated Reward other_rewards = 4;
 * @return {!Array<!proto.ei.Reward>}
 */
proto.ei.ConsumeArtifactResponse.prototype.getOtherRewardsList = function() {
  return /** @type{!Array<!proto.ei.Reward>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ei.Reward, 4));
};


/**
 * @param {!Array<!proto.ei.Reward>} value
 * @return {!proto.ei.ConsumeArtifactResponse} returns this
*/
proto.ei.ConsumeArtifactResponse.prototype.setOtherRewardsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.ei.Reward=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ei.Reward}
 */
proto.ei.ConsumeArtifactResponse.prototype.addOtherRewards = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.ei.Reward, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ei.ConsumeArtifactResponse} returns this
 */
proto.ei.ConsumeArtifactResponse.prototype.clearOtherRewardsList = function() {
  return this.setOtherRewardsList([]);
};


/**
 * optional string ei_user_id = 5;
 * @return {string}
 */
proto.ei.ConsumeArtifactResponse.prototype.getEiUserId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.ConsumeArtifactResponse} returns this
 */
proto.ei.ConsumeArtifactResponse.prototype.setEiUserId = function(value) {
  return jspb.Message.setField(this, 5, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.ConsumeArtifactResponse} returns this
 */
proto.ei.ConsumeArtifactResponse.prototype.clearEiUserId = function() {
  return jspb.Message.setField(this, 5, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.ConsumeArtifactResponse.prototype.hasEiUserId = function() {
  return jspb.Message.getField(this, 5) != null;
};



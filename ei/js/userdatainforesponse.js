// source: ei.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.ei.UserDataInfoResponse');

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
proto.ei.UserDataInfoResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ei.UserDataInfoResponse.repeatedFields_, null);
};
goog.inherits(proto.ei.UserDataInfoResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ei.UserDataInfoResponse.displayName = 'proto.ei.UserDataInfoResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ei.UserDataInfoResponse.repeatedFields_ = [3];



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
proto.ei.UserDataInfoResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.ei.UserDataInfoResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ei.UserDataInfoResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ei.UserDataInfoResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    backupChecksum: (f = jspb.Message.getField(msg, 1)) == null ? undefined : f,
    backupTotalCash: (f = jspb.Message.getOptionalFloatingPointField(msg, 2)) == null ? undefined : f,
    coopMembershipsList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f
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
 * @return {!proto.ei.UserDataInfoResponse}
 */
proto.ei.UserDataInfoResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ei.UserDataInfoResponse;
  return proto.ei.UserDataInfoResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ei.UserDataInfoResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ei.UserDataInfoResponse}
 */
proto.ei.UserDataInfoResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBackupChecksum(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setBackupTotalCash(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addCoopMemberships(value);
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
proto.ei.UserDataInfoResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ei.UserDataInfoResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ei.UserDataInfoResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ei.UserDataInfoResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = /** @type {number} */ (jspb.Message.getField(message, 1));
  if (f != null) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 2));
  if (f != null) {
    writer.writeDouble(
      2,
      f
    );
  }
  f = message.getCoopMembershipsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
};


/**
 * optional uint64 backup_checksum = 1;
 * @return {number}
 */
proto.ei.UserDataInfoResponse.prototype.getBackupChecksum = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.UserDataInfoResponse} returns this
 */
proto.ei.UserDataInfoResponse.prototype.setBackupChecksum = function(value) {
  return jspb.Message.setField(this, 1, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.UserDataInfoResponse} returns this
 */
proto.ei.UserDataInfoResponse.prototype.clearBackupChecksum = function() {
  return jspb.Message.setField(this, 1, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.UserDataInfoResponse.prototype.hasBackupChecksum = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional double backup_total_cash = 2;
 * @return {number}
 */
proto.ei.UserDataInfoResponse.prototype.getBackupTotalCash = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 2, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.ei.UserDataInfoResponse} returns this
 */
proto.ei.UserDataInfoResponse.prototype.setBackupTotalCash = function(value) {
  return jspb.Message.setField(this, 2, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.UserDataInfoResponse} returns this
 */
proto.ei.UserDataInfoResponse.prototype.clearBackupTotalCash = function() {
  return jspb.Message.setField(this, 2, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.UserDataInfoResponse.prototype.hasBackupTotalCash = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated string coop_memberships = 3;
 * @return {!Array<string>}
 */
proto.ei.UserDataInfoResponse.prototype.getCoopMembershipsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.ei.UserDataInfoResponse} returns this
 */
proto.ei.UserDataInfoResponse.prototype.setCoopMembershipsList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.ei.UserDataInfoResponse} returns this
 */
proto.ei.UserDataInfoResponse.prototype.addCoopMemberships = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ei.UserDataInfoResponse} returns this
 */
proto.ei.UserDataInfoResponse.prototype.clearCoopMembershipsList = function() {
  return this.setCoopMembershipsList([]);
};



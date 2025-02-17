// source: ei.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.ei.CraftArtifactRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ei.ArtifactInventoryItem');
goog.require('proto.ei.ArtifactSpec');
goog.require('proto.ei.BasicRequestInfo');

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
proto.ei.CraftArtifactRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ei.CraftArtifactRequest.repeatedFields_, null);
};
goog.inherits(proto.ei.CraftArtifactRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ei.CraftArtifactRequest.displayName = 'proto.ei.CraftArtifactRequest';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ei.CraftArtifactRequest.repeatedFields_ = [4];



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
proto.ei.CraftArtifactRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.ei.CraftArtifactRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ei.CraftArtifactRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ei.CraftArtifactRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    rinfo: (f = msg.getRinfo()) && proto.ei.BasicRequestInfo.toObject(includeInstance, f),
    eiUserId: (f = jspb.Message.getField(msg, 1)) == null ? undefined : f,
    spec: (f = msg.getSpec()) && proto.ei.ArtifactSpec.toObject(includeInstance, f),
    itemId: (f = jspb.Message.getField(msg, 3)) == null ? undefined : f,
    goldPricePaid: (f = jspb.Message.getOptionalFloatingPointField(msg, 6)) == null ? undefined : f,
    craftingCount: (f = jspb.Message.getField(msg, 7)) == null ? undefined : f,
    craftingXp: (f = jspb.Message.getOptionalFloatingPointField(msg, 8)) == null ? undefined : f,
    ingredientsList: jspb.Message.toObjectList(msg.getIngredientsList(),
    proto.ei.ArtifactInventoryItem.toObject, includeInstance)
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
 * @return {!proto.ei.CraftArtifactRequest}
 */
proto.ei.CraftArtifactRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ei.CraftArtifactRequest;
  return proto.ei.CraftArtifactRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ei.CraftArtifactRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ei.CraftArtifactRequest}
 */
proto.ei.CraftArtifactRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 5:
      var value = new proto.ei.BasicRequestInfo;
      reader.readMessage(value,proto.ei.BasicRequestInfo.deserializeBinaryFromReader);
      msg.setRinfo(value);
      break;
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setEiUserId(value);
      break;
    case 2:
      var value = new proto.ei.ArtifactSpec;
      reader.readMessage(value,proto.ei.ArtifactSpec.deserializeBinaryFromReader);
      msg.setSpec(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setItemId(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setGoldPricePaid(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setCraftingCount(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setCraftingXp(value);
      break;
    case 4:
      var value = new proto.ei.ArtifactInventoryItem;
      reader.readMessage(value,proto.ei.ArtifactInventoryItem.deserializeBinaryFromReader);
      msg.addIngredients(value);
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
proto.ei.CraftArtifactRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ei.CraftArtifactRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ei.CraftArtifactRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ei.CraftArtifactRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRinfo();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.ei.BasicRequestInfo.serializeBinaryToWriter
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 1));
  if (f != null) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getSpec();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.ei.ArtifactSpec.serializeBinaryToWriter
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 3));
  if (f != null) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 6));
  if (f != null) {
    writer.writeDouble(
      6,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 7));
  if (f != null) {
    writer.writeUint32(
      7,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 8));
  if (f != null) {
    writer.writeDouble(
      8,
      f
    );
  }
  f = message.getIngredientsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.ei.ArtifactInventoryItem.serializeBinaryToWriter
    );
  }
};


/**
 * optional BasicRequestInfo rinfo = 5;
 * @return {?proto.ei.BasicRequestInfo}
 */
proto.ei.CraftArtifactRequest.prototype.getRinfo = function() {
  return /** @type{?proto.ei.BasicRequestInfo} */ (
    jspb.Message.getWrapperField(this, proto.ei.BasicRequestInfo, 5));
};


/**
 * @param {?proto.ei.BasicRequestInfo|undefined} value
 * @return {!proto.ei.CraftArtifactRequest} returns this
*/
proto.ei.CraftArtifactRequest.prototype.setRinfo = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ei.CraftArtifactRequest} returns this
 */
proto.ei.CraftArtifactRequest.prototype.clearRinfo = function() {
  return this.setRinfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.CraftArtifactRequest.prototype.hasRinfo = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional string ei_user_id = 1;
 * @return {string}
 */
proto.ei.CraftArtifactRequest.prototype.getEiUserId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.CraftArtifactRequest} returns this
 */
proto.ei.CraftArtifactRequest.prototype.setEiUserId = function(value) {
  return jspb.Message.setField(this, 1, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.CraftArtifactRequest} returns this
 */
proto.ei.CraftArtifactRequest.prototype.clearEiUserId = function() {
  return jspb.Message.setField(this, 1, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.CraftArtifactRequest.prototype.hasEiUserId = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional ArtifactSpec spec = 2;
 * @return {?proto.ei.ArtifactSpec}
 */
proto.ei.CraftArtifactRequest.prototype.getSpec = function() {
  return /** @type{?proto.ei.ArtifactSpec} */ (
    jspb.Message.getWrapperField(this, proto.ei.ArtifactSpec, 2));
};


/**
 * @param {?proto.ei.ArtifactSpec|undefined} value
 * @return {!proto.ei.CraftArtifactRequest} returns this
*/
proto.ei.CraftArtifactRequest.prototype.setSpec = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ei.CraftArtifactRequest} returns this
 */
proto.ei.CraftArtifactRequest.prototype.clearSpec = function() {
  return this.setSpec(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.CraftArtifactRequest.prototype.hasSpec = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional uint64 item_id = 3;
 * @return {number}
 */
proto.ei.CraftArtifactRequest.prototype.getItemId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.CraftArtifactRequest} returns this
 */
proto.ei.CraftArtifactRequest.prototype.setItemId = function(value) {
  return jspb.Message.setField(this, 3, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.CraftArtifactRequest} returns this
 */
proto.ei.CraftArtifactRequest.prototype.clearItemId = function() {
  return jspb.Message.setField(this, 3, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.CraftArtifactRequest.prototype.hasItemId = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional double gold_price_paid = 6;
 * @return {number}
 */
proto.ei.CraftArtifactRequest.prototype.getGoldPricePaid = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 6, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.ei.CraftArtifactRequest} returns this
 */
proto.ei.CraftArtifactRequest.prototype.setGoldPricePaid = function(value) {
  return jspb.Message.setField(this, 6, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.CraftArtifactRequest} returns this
 */
proto.ei.CraftArtifactRequest.prototype.clearGoldPricePaid = function() {
  return jspb.Message.setField(this, 6, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.CraftArtifactRequest.prototype.hasGoldPricePaid = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional uint32 crafting_count = 7;
 * @return {number}
 */
proto.ei.CraftArtifactRequest.prototype.getCraftingCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.CraftArtifactRequest} returns this
 */
proto.ei.CraftArtifactRequest.prototype.setCraftingCount = function(value) {
  return jspb.Message.setField(this, 7, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.CraftArtifactRequest} returns this
 */
proto.ei.CraftArtifactRequest.prototype.clearCraftingCount = function() {
  return jspb.Message.setField(this, 7, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.CraftArtifactRequest.prototype.hasCraftingCount = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional double crafting_xp = 8;
 * @return {number}
 */
proto.ei.CraftArtifactRequest.prototype.getCraftingXp = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 8, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.ei.CraftArtifactRequest} returns this
 */
proto.ei.CraftArtifactRequest.prototype.setCraftingXp = function(value) {
  return jspb.Message.setField(this, 8, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.CraftArtifactRequest} returns this
 */
proto.ei.CraftArtifactRequest.prototype.clearCraftingXp = function() {
  return jspb.Message.setField(this, 8, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.CraftArtifactRequest.prototype.hasCraftingXp = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * repeated ArtifactInventoryItem ingredients = 4;
 * @return {!Array<!proto.ei.ArtifactInventoryItem>}
 */
proto.ei.CraftArtifactRequest.prototype.getIngredientsList = function() {
  return /** @type{!Array<!proto.ei.ArtifactInventoryItem>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ei.ArtifactInventoryItem, 4));
};


/**
 * @param {!Array<!proto.ei.ArtifactInventoryItem>} value
 * @return {!proto.ei.CraftArtifactRequest} returns this
*/
proto.ei.CraftArtifactRequest.prototype.setIngredientsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.ei.ArtifactInventoryItem=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ei.ArtifactInventoryItem}
 */
proto.ei.CraftArtifactRequest.prototype.addIngredients = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.ei.ArtifactInventoryItem, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ei.CraftArtifactRequest} returns this
 */
proto.ei.CraftArtifactRequest.prototype.clearIngredientsList = function() {
  return this.setIngredientsList([]);
};



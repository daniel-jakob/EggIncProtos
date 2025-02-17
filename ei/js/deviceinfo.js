// source: ei.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.ei.DeviceInfo');

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
proto.ei.DeviceInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ei.DeviceInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ei.DeviceInfo.displayName = 'proto.ei.DeviceInfo';
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
proto.ei.DeviceInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.ei.DeviceInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ei.DeviceInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ei.DeviceInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    deviceId: (f = jspb.Message.getField(msg, 1)) == null ? undefined : f,
    advertisingId: (f = jspb.Message.getField(msg, 13)) == null ? undefined : f,
    platform: (f = jspb.Message.getField(msg, 2)) == null ? undefined : f,
    formFactor: (f = jspb.Message.getField(msg, 3)) == null ? undefined : f,
    deviceName: (f = jspb.Message.getField(msg, 4)) == null ? undefined : f,
    platformVersion: (f = jspb.Message.getField(msg, 5)) == null ? undefined : f,
    localeCountry: (f = jspb.Message.getField(msg, 6)) == null ? undefined : f,
    localeLanguage: (f = jspb.Message.getField(msg, 7)) == null ? undefined : f,
    gpuVendor: (f = jspb.Message.getField(msg, 8)) == null ? undefined : f,
    gpuModel: (f = jspb.Message.getField(msg, 9)) == null ? undefined : f,
    deviceBucket: (f = jspb.Message.getField(msg, 10)) == null ? undefined : f,
    screenWidth: (f = jspb.Message.getField(msg, 11)) == null ? undefined : f,
    screenHeight: (f = jspb.Message.getField(msg, 12)) == null ? undefined : f
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
 * @return {!proto.ei.DeviceInfo}
 */
proto.ei.DeviceInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ei.DeviceInfo;
  return proto.ei.DeviceInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ei.DeviceInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ei.DeviceInfo}
 */
proto.ei.DeviceInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDeviceId(value);
      break;
    case 13:
      var value = /** @type {string} */ (reader.readString());
      msg.setAdvertisingId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setPlatform(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setFormFactor(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setDeviceName(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setPlatformVersion(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setLocaleCountry(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setLocaleLanguage(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setGpuVendor(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setGpuModel(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setDeviceBucket(value);
      break;
    case 11:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setScreenWidth(value);
      break;
    case 12:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setScreenHeight(value);
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
proto.ei.DeviceInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ei.DeviceInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ei.DeviceInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ei.DeviceInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = /** @type {string} */ (jspb.Message.getField(message, 1));
  if (f != null) {
    writer.writeString(
      1,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 13));
  if (f != null) {
    writer.writeString(
      13,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 2));
  if (f != null) {
    writer.writeString(
      2,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 3));
  if (f != null) {
    writer.writeString(
      3,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 4));
  if (f != null) {
    writer.writeString(
      4,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 5));
  if (f != null) {
    writer.writeString(
      5,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 6));
  if (f != null) {
    writer.writeString(
      6,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 7));
  if (f != null) {
    writer.writeString(
      7,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 8));
  if (f != null) {
    writer.writeString(
      8,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 9));
  if (f != null) {
    writer.writeString(
      9,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 10));
  if (f != null) {
    writer.writeString(
      10,
      f
    );
  }
  f = /** @type {number} */ (jspb.Message.getField(message, 11));
  if (f != null) {
    writer.writeUint32(
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
};


/**
 * optional string device_id = 1;
 * @return {string}
 */
proto.ei.DeviceInfo.prototype.getDeviceId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.setDeviceId = function(value) {
  return jspb.Message.setField(this, 1, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.clearDeviceId = function() {
  return jspb.Message.setField(this, 1, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.DeviceInfo.prototype.hasDeviceId = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string advertising_id = 13;
 * @return {string}
 */
proto.ei.DeviceInfo.prototype.getAdvertisingId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 13, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.setAdvertisingId = function(value) {
  return jspb.Message.setField(this, 13, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.clearAdvertisingId = function() {
  return jspb.Message.setField(this, 13, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.DeviceInfo.prototype.hasAdvertisingId = function() {
  return jspb.Message.getField(this, 13) != null;
};


/**
 * optional string platform = 2;
 * @return {string}
 */
proto.ei.DeviceInfo.prototype.getPlatform = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.setPlatform = function(value) {
  return jspb.Message.setField(this, 2, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.clearPlatform = function() {
  return jspb.Message.setField(this, 2, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.DeviceInfo.prototype.hasPlatform = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional string form_factor = 3;
 * @return {string}
 */
proto.ei.DeviceInfo.prototype.getFormFactor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.setFormFactor = function(value) {
  return jspb.Message.setField(this, 3, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.clearFormFactor = function() {
  return jspb.Message.setField(this, 3, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.DeviceInfo.prototype.hasFormFactor = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string device_name = 4;
 * @return {string}
 */
proto.ei.DeviceInfo.prototype.getDeviceName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.setDeviceName = function(value) {
  return jspb.Message.setField(this, 4, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.clearDeviceName = function() {
  return jspb.Message.setField(this, 4, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.DeviceInfo.prototype.hasDeviceName = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional string platform_version = 5;
 * @return {string}
 */
proto.ei.DeviceInfo.prototype.getPlatformVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.setPlatformVersion = function(value) {
  return jspb.Message.setField(this, 5, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.clearPlatformVersion = function() {
  return jspb.Message.setField(this, 5, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.DeviceInfo.prototype.hasPlatformVersion = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional string locale_country = 6;
 * @return {string}
 */
proto.ei.DeviceInfo.prototype.getLocaleCountry = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.setLocaleCountry = function(value) {
  return jspb.Message.setField(this, 6, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.clearLocaleCountry = function() {
  return jspb.Message.setField(this, 6, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.DeviceInfo.prototype.hasLocaleCountry = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional string locale_language = 7;
 * @return {string}
 */
proto.ei.DeviceInfo.prototype.getLocaleLanguage = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.setLocaleLanguage = function(value) {
  return jspb.Message.setField(this, 7, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.clearLocaleLanguage = function() {
  return jspb.Message.setField(this, 7, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.DeviceInfo.prototype.hasLocaleLanguage = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional string gpu_vendor = 8;
 * @return {string}
 */
proto.ei.DeviceInfo.prototype.getGpuVendor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.setGpuVendor = function(value) {
  return jspb.Message.setField(this, 8, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.clearGpuVendor = function() {
  return jspb.Message.setField(this, 8, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.DeviceInfo.prototype.hasGpuVendor = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional string gpu_model = 9;
 * @return {string}
 */
proto.ei.DeviceInfo.prototype.getGpuModel = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.setGpuModel = function(value) {
  return jspb.Message.setField(this, 9, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.clearGpuModel = function() {
  return jspb.Message.setField(this, 9, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.DeviceInfo.prototype.hasGpuModel = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional string device_bucket = 10;
 * @return {string}
 */
proto.ei.DeviceInfo.prototype.getDeviceBucket = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.setDeviceBucket = function(value) {
  return jspb.Message.setField(this, 10, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.clearDeviceBucket = function() {
  return jspb.Message.setField(this, 10, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.DeviceInfo.prototype.hasDeviceBucket = function() {
  return jspb.Message.getField(this, 10) != null;
};


/**
 * optional uint32 screen_width = 11;
 * @return {number}
 */
proto.ei.DeviceInfo.prototype.getScreenWidth = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 11, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.setScreenWidth = function(value) {
  return jspb.Message.setField(this, 11, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.clearScreenWidth = function() {
  return jspb.Message.setField(this, 11, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.DeviceInfo.prototype.hasScreenWidth = function() {
  return jspb.Message.getField(this, 11) != null;
};


/**
 * optional uint32 screen_height = 12;
 * @return {number}
 */
proto.ei.DeviceInfo.prototype.getScreenHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 12, 0));
};


/**
 * @param {number} value
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.setScreenHeight = function(value) {
  return jspb.Message.setField(this, 12, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.ei.DeviceInfo} returns this
 */
proto.ei.DeviceInfo.prototype.clearScreenHeight = function() {
  return jspb.Message.setField(this, 12, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ei.DeviceInfo.prototype.hasScreenHeight = function() {
  return jspb.Message.getField(this, 12) != null;
};



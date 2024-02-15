/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/monitored_resource.proto

// Protobuf Java Version: 3.25.2
package com.google.api;

/**
 *
 *
 * <pre>
 * An object representing a resource that can be used for monitoring, logging,
 * billing, or other purposes. Examples include virtual machine instances,
 * databases, and storage devices such as disks. The `type` field identifies a
 * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object
 * that describes the resource's schema. Information in the `labels` field
 * identifies the actual resource and its attributes according to the schema.
 * For example, a particular Compute Engine VM instance could be represented by
 * the following object, because the
 * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] for
 * `"gce_instance"` has labels
 * `"project_id"`, `"instance_id"` and `"zone"`:
 *
 *     { "type": "gce_instance",
 *       "labels": { "project_id": "my-project",
 *                   "instance_id": "12345678901234",
 *                   "zone": "us-central1-a" }}
 * </pre>
 *
 * Protobuf type {@code google.api.MonitoredResource}
 */
public final class MonitoredResource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.MonitoredResource)
    MonitoredResourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MonitoredResource.newBuilder() to construct.
  private MonitoredResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MonitoredResource() {
    type_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MonitoredResource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.MonitoredResourceProto
        .internal_static_google_api_MonitoredResource_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 2:
        return internalGetLabels();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.MonitoredResourceProto
        .internal_static_google_api_MonitoredResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.MonitoredResource.class, com.google.api.MonitoredResource.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   *
   *
   * <pre>
   * Required. The monitored resource type. This field must match
   * the `type` field of a
   * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor]
   * object. For example, the type of a Compute Engine VM instance is
   * `gce_instance`. Some descriptors include the service name in the type; for
   * example, the type of a Datastream stream is
   * `datastream.googleapis.com/Stream`.
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The monitored resource type. This field must match
   * the `type` field of a
   * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor]
   * object. For example, the type of a Compute Engine VM instance is
   * `gce_instance`. Some descriptors include the service name in the type; for
   * example, the type of a Datastream stream is
   * `datastream.googleapis.com/Stream`.
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LABELS_FIELD_NUMBER = 2;

  private static final class LabelsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.api.MonitoredResourceProto
                .internal_static_google_api_MonitoredResource_LabelsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> labels_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLabels() {
    if (labels_ == null) {
      return com.google.protobuf.MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry);
    }
    return labels_;
  }

  public int getLabelsCount() {
    return internalGetLabels().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Compute Engine VM instances use the
   * labels `"project_id"`, `"instance_id"`, and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  @java.lang.Override
  public boolean containsLabels(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetLabels().getMap().containsKey(key);
  }
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getLabels() {
    return getLabelsMap();
  }
  /**
   *
   *
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Compute Engine VM instances use the
   * labels `"project_id"`, `"instance_id"`, and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
    return internalGetLabels().getMap();
  }
  /**
   *
   *
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Compute Engine VM instances use the
   * labels `"project_id"`, `"instance_id"`, and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Compute Engine VM instances use the
   * labels `"project_id"`, `"instance_id"`, and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  @java.lang.Override
  public java.lang.String getLabelsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetLabels(), LabelsDefaultEntryHolder.defaultEntry, 2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetLabels().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> labels__ =
          LabelsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, labels__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.api.MonitoredResource)) {
      return super.equals(obj);
    }
    com.google.api.MonitoredResource other = (com.google.api.MonitoredResource) obj;

    if (!getType().equals(other.getType())) return false;
    if (!internalGetLabels().equals(other.internalGetLabels())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (!internalGetLabels().getMap().isEmpty()) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLabels().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.MonitoredResource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.MonitoredResource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.MonitoredResource parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.MonitoredResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.MonitoredResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.MonitoredResource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.MonitoredResource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.MonitoredResource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.MonitoredResource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.MonitoredResource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.MonitoredResource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.MonitoredResource parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.api.MonitoredResource prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * An object representing a resource that can be used for monitoring, logging,
   * billing, or other purposes. Examples include virtual machine instances,
   * databases, and storage devices such as disks. The `type` field identifies a
   * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object
   * that describes the resource's schema. Information in the `labels` field
   * identifies the actual resource and its attributes according to the schema.
   * For example, a particular Compute Engine VM instance could be represented by
   * the following object, because the
   * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] for
   * `"gce_instance"` has labels
   * `"project_id"`, `"instance_id"` and `"zone"`:
   *
   *     { "type": "gce_instance",
   *       "labels": { "project_id": "my-project",
   *                   "instance_id": "12345678901234",
   *                   "zone": "us-central1-a" }}
   * </pre>
   *
   * Protobuf type {@code google.api.MonitoredResource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.MonitoredResource)
      com.google.api.MonitoredResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.MonitoredResourceProto
          .internal_static_google_api_MonitoredResource_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetLabels();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableLabels();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.MonitoredResourceProto
          .internal_static_google_api_MonitoredResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.MonitoredResource.class,
              com.google.api.MonitoredResource.Builder.class);
    }

    // Construct using com.google.api.MonitoredResource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = "";
      internalGetMutableLabels().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.MonitoredResourceProto
          .internal_static_google_api_MonitoredResource_descriptor;
    }

    @java.lang.Override
    public com.google.api.MonitoredResource getDefaultInstanceForType() {
      return com.google.api.MonitoredResource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.MonitoredResource build() {
      com.google.api.MonitoredResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.MonitoredResource buildPartial() {
      com.google.api.MonitoredResource result = new com.google.api.MonitoredResource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.MonitoredResource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.labels_ = internalGetLabels();
        result.labels_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.MonitoredResource) {
        return mergeFrom((com.google.api.MonitoredResource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.MonitoredResource other) {
      if (other == com.google.api.MonitoredResource.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableLabels().mergeFrom(other.internalGetLabels());
      bitField0_ |= 0x00000002;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                type_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> labels__ =
                    input.readMessage(
                        LabelsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableLabels()
                    .getMutableMap()
                    .put(labels__.getKey(), labels__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object type_ = "";
    /**
     *
     *
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a
     * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor]
     * object. For example, the type of a Compute Engine VM instance is
     * `gce_instance`. Some descriptors include the service name in the type; for
     * example, the type of a Datastream stream is
     * `datastream.googleapis.com/Stream`.
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a
     * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor]
     * object. For example, the type of a Compute Engine VM instance is
     * `gce_instance`. Some descriptors include the service name in the type; for
     * example, the type of a Datastream stream is
     * `datastream.googleapis.com/Stream`.
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a
     * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor]
     * object. For example, the type of a Compute Engine VM instance is
     * `gce_instance`. Some descriptors include the service name in the type; for
     * example, the type of a Datastream stream is
     * `datastream.googleapis.com/Stream`.
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a
     * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor]
     * object. For example, the type of a Compute Engine VM instance is
     * `gce_instance`. Some descriptors include the service name in the type; for
     * example, the type of a Datastream stream is
     * `datastream.googleapis.com/Stream`.
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a
     * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor]
     * object. For example, the type of a Compute Engine VM instance is
     * `gce_instance`. Some descriptors include the service name in the type; for
     * example, the type of a Datastream stream is
     * `datastream.googleapis.com/Stream`.
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> labels_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLabels() {
      if (labels_ == null) {
        return com.google.protobuf.MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry);
      }
      return labels_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableLabels() {
      if (labels_ == null) {
        labels_ = com.google.protobuf.MapField.newMapField(LabelsDefaultEntryHolder.defaultEntry);
      }
      if (!labels_.isMutable()) {
        labels_ = labels_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return labels_;
    }

    public int getLabelsCount() {
      return internalGetLabels().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Compute Engine VM instances use the
     * labels `"project_id"`, `"instance_id"`, and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    @java.lang.Override
    public boolean containsLabels(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetLabels().getMap().containsKey(key);
    }
    /** Use {@link #getLabelsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getLabels() {
      return getLabelsMap();
    }
    /**
     *
     *
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Compute Engine VM instances use the
     * labels `"project_id"`, `"instance_id"`, and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
      return internalGetLabels().getMap();
    }
    /**
     *
     *
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Compute Engine VM instances use the
     * labels `"project_id"`, `"instance_id"`, and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getLabelsOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Compute Engine VM instances use the
     * labels `"project_id"`, `"instance_id"`, and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getLabelsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearLabels() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableLabels().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Compute Engine VM instances use the
     * labels `"project_id"`, `"instance_id"`, and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    public Builder removeLabels(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableLabels().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableLabels() {
      bitField0_ |= 0x00000002;
      return internalGetMutableLabels().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Compute Engine VM instances use the
     * labels `"project_id"`, `"instance_id"`, and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    public Builder putLabels(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableLabels().getMutableMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Compute Engine VM instances use the
     * labels `"project_id"`, `"instance_id"`, and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    public Builder putAllLabels(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableLabels().getMutableMap().putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.api.MonitoredResource)
  }

  // @@protoc_insertion_point(class_scope:google.api.MonitoredResource)
  private static final com.google.api.MonitoredResource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.MonitoredResource();
  }

  public static com.google.api.MonitoredResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MonitoredResource> PARSER =
      new com.google.protobuf.AbstractParser<MonitoredResource>() {
        @java.lang.Override
        public MonitoredResource parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<MonitoredResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MonitoredResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.MonitoredResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

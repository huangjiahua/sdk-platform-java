// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/consumer.proto

package com.google.api;

public interface PropertyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Property)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the property (a.k.a key).
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  String getName();
  /**
   * <pre>
   * The name of the property (a.k.a key).
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The type of this property.
   * </pre>
   *
   * <code>.google.api.Property.PropertyType type = 2;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of this property.
   * </pre>
   *
   * <code>.google.api.Property.PropertyType type = 2;</code>
   */
  Property.PropertyType getType();

  /**
   * <pre>
   * The description of the property
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  String getDescription();
  /**
   * <pre>
   * The description of the property
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}

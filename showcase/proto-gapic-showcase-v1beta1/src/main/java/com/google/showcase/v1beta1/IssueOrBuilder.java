// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/testing.proto

// Protobuf Java Version: 3.25.3
package com.google.showcase.v1beta1;

public interface IssueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.Issue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of the issue.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Issue.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of the issue.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Issue.Type type = 1;</code>
   * @return The type.
   */
  com.google.showcase.v1beta1.Issue.Type getType();

  /**
   * <pre>
   * The severity of the issue.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Issue.Severity severity = 2;</code>
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   * <pre>
   * The severity of the issue.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Issue.Severity severity = 2;</code>
   * @return The severity.
   */
  com.google.showcase.v1beta1.Issue.Severity getSeverity();

  /**
   * <pre>
   * A description of the issue.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A description of the issue.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}

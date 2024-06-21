/*
 * Copyright 2024 Google LLC
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
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/iam/v2beta/policy.proto
// Protobuf Java Version: 4.27.1

package com.google.iam.v2beta;

public interface DeletePolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.v2beta.DeletePolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the policy to delete. Format:
   * `policies/{attachment_point}/denypolicies/{policy_id}`
   *
   *
   * Use the URL-encoded full resource name, which means that the forward-slash
   * character, `/`, must be written as `%2F`. For example,
   * `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-project/denypolicies/my-policy`.
   *
   * For organizations and folders, use the numeric ID in the full resource
   * name. For projects, you can use the alphanumeric or the numeric ID.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the policy to delete. Format:
   * `policies/{attachment_point}/denypolicies/{policy_id}`
   *
   *
   * Use the URL-encoded full resource name, which means that the forward-slash
   * character, `/`, must be written as `%2F`. For example,
   * `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-project/denypolicies/my-policy`.
   *
   * For organizations and folders, use the numeric ID in the full resource
   * name. For projects, you can use the alphanumeric or the numeric ID.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The expected `etag` of the policy to delete. If the value does not match
   * the value that is stored in IAM, the request fails with a `409` error code
   * and `ABORTED` status.
   *
   * If you omit this field, the policy is deleted regardless of its current
   * `etag`.
   * </pre>
   *
   * <code>string etag = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. The expected `etag` of the policy to delete. If the value does not match
   * the value that is stored in IAM, the request fails with a `409` error code
   * and `ABORTED` status.
   *
   * If you omit this field, the policy is deleted regardless of its current
   * `etag`.
   * </pre>
   *
   * <code>string etag = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}

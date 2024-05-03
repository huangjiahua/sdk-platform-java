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
// source: google/api/launch_stage.proto

// Protobuf Java Version: 3.25.3
package com.google.api;

public final class LaunchStageProto {
  private LaunchStageProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\035google/api/launch_stage.proto\022\ngoogle."
          + "api*\214\001\n\013LaunchStage\022\034\n\030LAUNCH_STAGE_UNSP"
          + "ECIFIED\020\000\022\021\n\rUNIMPLEMENTED\020\006\022\r\n\tPRELAUNC"
          + "H\020\007\022\020\n\014EARLY_ACCESS\020\001\022\t\n\005ALPHA\020\002\022\010\n\004BETA"
          + "\020\003\022\006\n\002GA\020\004\022\016\n\nDEPRECATED\020\005BZ\n\016com.google"
          + ".apiB\020LaunchStageProtoP\001Z-google.golang."
          + "org/genproto/googleapis/api;api\242\002\004GAPIb\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/annotations.proto

package com.google.api;

public final class AnnotationsProto {
  private AnnotationsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(AnnotationsProto.http);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int HTTP_FIELD_NUMBER = 72295728;
  /**
   * <pre>
   * See `HttpRule`.
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MethodOptions,
      HttpRule> http = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        HttpRule.class,
        HttpRule.getDefaultInstance());

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\034google/api/annotations.proto\022\ngoogle.a" +
      "pi\032\025google/api/http.proto\032 google/protob" +
      "uf/descriptor.proto:E\n\004http\022\036.google.pro" +
      "tobuf.MethodOptions\030\260\312\274\" \001(\0132\024.google.ap" +
      "i.HttpRuleBn\n\016com.google.apiB\020Annotation" +
      "sProtoP\001ZAgoogle.golang.org/genproto/goo" +
      "gleapis/api/annotations;annotations\242\002\004GA" +
      "PIb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          HttpProto.getDescriptor(),
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        }, assigner);
    http.internalInit(descriptor.getExtensions().get(0));
    HttpProto.getDescriptor();
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

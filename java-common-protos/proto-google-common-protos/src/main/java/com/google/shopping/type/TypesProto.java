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
// source: google/shopping/type/types.proto
// Protobuf Java Version: 4.27.1

package com.google.shopping.type;

public final class TypesProto {
  private TypesProto() {}

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 1,
        /* suffix= */ "",
        TypesProto.class.getName());
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_type_Weight_descriptor;
  static final com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_shopping_type_Weight_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_type_Price_descriptor;
  static final com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_shopping_type_Price_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_type_CustomAttribute_descriptor;
  static final com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_shopping_type_CustomAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_type_Destination_descriptor;
  static final com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_shopping_type_Destination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_type_ReportingContext_descriptor;
  static final com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_shopping_type_ReportingContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_type_Channel_descriptor;
  static final com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_shopping_type_Channel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n google/shopping/type/types.proto\022\024goog"
          + "le.shopping.type\"\261\001\n\006Weight\022\032\n\ramount_mi"
          + "cros\030\001 \001(\003H\000\210\001\001\0225\n\004unit\030\002 \001(\0162\'.google.s"
          + "hopping.type.Weight.WeightUnit\"B\n\nWeight"
          + "Unit\022\033\n\027WEIGHT_UNIT_UNSPECIFIED\020\000\022\t\n\005POU"
          + "ND\020\001\022\014\n\010KILOGRAM\020\002B\020\n\016_amount_micros\"c\n\005"
          + "Price\022\032\n\ramount_micros\030\001 \001(\003H\000\210\001\001\022\032\n\rcur"
          + "rency_code\030\002 \001(\tH\001\210\001\001B\020\n\016_amount_microsB"
          + "\020\n\016_currency_code\"\210\001\n\017CustomAttribute\022\021\n"
          + "\004name\030\001 \001(\tH\000\210\001\001\022\022\n\005value\030\002 \001(\tH\001\210\001\001\022;\n\014"
          + "group_values\030\003 \003(\0132%.google.shopping.typ"
          + "e.CustomAttributeB\007\n\005_nameB\010\n\006_value\"\301\001\n"
          + "\013Destination\"\261\001\n\017DestinationEnum\022 \n\034DEST"
          + "INATION_ENUM_UNSPECIFIED\020\000\022\020\n\014SHOPPING_A"
          + "DS\020\001\022\017\n\013DISPLAY_ADS\020\002\022\027\n\023LOCAL_INVENTORY"
          + "_ADS\020\003\022\021\n\rFREE_LISTINGS\020\004\022\027\n\023FREE_LOCAL_"
          + "LISTINGS\020\005\022\024\n\020YOUTUBE_SHOPPING\020\006\"\226\003\n\020Rep"
          + "ortingContext\"\201\003\n\024ReportingContextEnum\022&"
          + "\n\"REPORTING_CONTEXT_ENUM_UNSPECIFIED\020\000\022\020"
          + "\n\014SHOPPING_ADS\020\001\022\025\n\rDISCOVERY_ADS\020\002\032\002\010\001\022"
          + "\022\n\016DEMAND_GEN_ADS\020\r\022#\n\037DEMAND_GEN_ADS_DI"
          + "SCOVER_SURFACE\020\016\022\r\n\tVIDEO_ADS\020\003\022\017\n\013DISPL"
          + "AY_ADS\020\004\022\027\n\023LOCAL_INVENTORY_ADS\020\005\022\031\n\025VEH"
          + "ICLE_INVENTORY_ADS\020\006\022\021\n\rFREE_LISTINGS\020\007\022"
          + "\027\n\023FREE_LOCAL_LISTINGS\020\010\022\037\n\033FREE_LOCAL_V"
          + "EHICLE_LISTINGS\020\t\022\024\n\020YOUTUBE_SHOPPING\020\n\022"
          + "\020\n\014CLOUD_RETAIL\020\013\022\026\n\022LOCAL_CLOUD_RETAIL\020"
          + "\014\"M\n\007Channel\"B\n\013ChannelEnum\022\034\n\030CHANNEL_E"
          + "NUM_UNSPECIFIED\020\000\022\n\n\006ONLINE\020\001\022\t\n\005LOCAL\020\002"
          + "Bp\n\030com.google.shopping.typeB\nTypesProto"
          + "P\001Z/cloud.google.com/go/shopping/type/ty"
          + "pepb;typepb\252\002\024Google.Shopping.Typeb\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_shopping_type_Weight_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_type_Weight_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_google_shopping_type_Weight_descriptor,
            new java.lang.String[] {
              "AmountMicros", "Unit",
            });
    internal_static_google_shopping_type_Price_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_shopping_type_Price_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_google_shopping_type_Price_descriptor,
            new java.lang.String[] {
              "AmountMicros", "CurrencyCode",
            });
    internal_static_google_shopping_type_CustomAttribute_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_shopping_type_CustomAttribute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_google_shopping_type_CustomAttribute_descriptor,
            new java.lang.String[] {
              "Name", "Value", "GroupValues",
            });
    internal_static_google_shopping_type_Destination_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_shopping_type_Destination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_google_shopping_type_Destination_descriptor, new java.lang.String[] {});
    internal_static_google_shopping_type_ReportingContext_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_shopping_type_ReportingContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_google_shopping_type_ReportingContext_descriptor,
            new java.lang.String[] {});
    internal_static_google_shopping_type_Channel_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_shopping_type_Channel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_google_shopping_type_Channel_descriptor, new java.lang.String[] {});
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

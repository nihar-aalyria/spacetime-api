// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/localized_text.proto

package com.google.type;

public final class LocalizedTextProto {
  private LocalizedTextProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_type_LocalizedText_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_type_LocalizedText_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n google/type/localized_text.proto\022\013goog" +
      "le.type\"4\n\rLocalizedText\022\014\n\004text\030\001 \001(\t\022\025" +
      "\n\rlanguage_code\030\002 \001(\tBz\n\017com.google.type" +
      "B\022LocalizedTextProtoP\001ZHgoogle.golang.or" +
      "g/genproto/googleapis/type/localized_tex" +
      "t;localized_text\370\001\001\242\002\003GTPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_type_LocalizedText_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_type_LocalizedText_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_type_LocalizedText_descriptor,
        new java.lang.String[] { "Text", "LanguageCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
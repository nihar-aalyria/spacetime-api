// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/api.proto

package com.google.protobuf;

public final class ApiProto {
  private ApiProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Api_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Api_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Method_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Method_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Mixin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Mixin_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031google/protobuf/api.proto\022\017google.prot" +
      "obuf\032$google/protobuf/source_context.pro" +
      "to\032\032google/protobuf/type.proto\"\301\002\n\003Api\022\022" +
      "\n\004name\030\001 \001(\tR\004name\0221\n\007methods\030\002 \003(\0132\027.go" +
      "ogle.protobuf.MethodR\007methods\0221\n\007options" +
      "\030\003 \003(\0132\027.google.protobuf.OptionR\007options" +
      "\022\030\n\007version\030\004 \001(\tR\007version\022E\n\016source_con" +
      "text\030\005 \001(\0132\036.google.protobuf.SourceConte" +
      "xtR\rsourceContext\022.\n\006mixins\030\006 \003(\0132\026.goog" +
      "le.protobuf.MixinR\006mixins\022/\n\006syntax\030\007 \001(" +
      "\0162\027.google.protobuf.SyntaxR\006syntax\"\262\002\n\006M" +
      "ethod\022\022\n\004name\030\001 \001(\tR\004name\022(\n\020request_typ" +
      "e_url\030\002 \001(\tR\016requestTypeUrl\022+\n\021request_s" +
      "treaming\030\003 \001(\010R\020requestStreaming\022*\n\021resp" +
      "onse_type_url\030\004 \001(\tR\017responseTypeUrl\022-\n\022" +
      "response_streaming\030\005 \001(\010R\021responseStream" +
      "ing\0221\n\007options\030\006 \003(\0132\027.google.protobuf.O" +
      "ptionR\007options\022/\n\006syntax\030\007 \001(\0162\027.google." +
      "protobuf.SyntaxR\006syntax\"/\n\005Mixin\022\022\n\004name" +
      "\030\001 \001(\tR\004name\022\022\n\004root\030\002 \001(\tR\004rootBv\n\023com." +
      "google.protobufB\010ApiProtoP\001Z,google.gola" +
      "ng.org/protobuf/types/known/apipb\242\002\003GPB\252" +
      "\002\036Google.Protobuf.WellKnownTypesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.SourceContextProto.getDescriptor(),
          com.google.protobuf.TypeProto.getDescriptor(),
        });
    internal_static_google_protobuf_Api_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_protobuf_Api_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Api_descriptor,
        new java.lang.String[] { "Name", "Methods", "Options", "Version", "SourceContext", "Mixins", "Syntax", });
    internal_static_google_protobuf_Method_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_protobuf_Method_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Method_descriptor,
        new java.lang.String[] { "Name", "RequestTypeUrl", "RequestStreaming", "ResponseTypeUrl", "ResponseStreaming", "Options", "Syntax", });
    internal_static_google_protobuf_Mixin_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_protobuf_Mixin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Mixin_descriptor,
        new java.lang.String[] { "Name", "Root", });
    com.google.protobuf.SourceContextProto.getDescriptor();
    com.google.protobuf.TypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

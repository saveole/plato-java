// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: org/saveole/user.proto
// Protobuf Java Version: 4.31.1

package org.saveole.model;

@com.google.protobuf.Generated
public final class UserOuterClass {
  private UserOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      UserOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_saveole_model_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_saveole_model_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_saveole_model_GetUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_saveole_model_GetUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_saveole_model_GetUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_saveole_model_GetUserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\026org/saveole/user.proto\022\021org.saveole.mo" +
      "del\"F\n\004User\022\n\n\002id\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\r\n" +
      "\005email\030\003 \001(\t\022\025\n\rphone_numbers\030\004 \003(\t\"\034\n\016G" +
      "etUserRequest\022\n\n\002id\030\001 \001(\t\"8\n\017GetUserResp" +
      "onse\022%\n\004user\030\001 \001(\0132\027.org.saveole.model.U" +
      "serB\025\n\021org.saveole.modelP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_saveole_model_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_saveole_model_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_org_saveole_model_User_descriptor,
        new String[] { "Id", "Name", "Email", "PhoneNumbers", });
    internal_static_org_saveole_model_GetUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_saveole_model_GetUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_org_saveole_model_GetUserRequest_descriptor,
        new String[] { "Id", });
    internal_static_org_saveole_model_GetUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_saveole_model_GetUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_org_saveole_model_GetUserResponse_descriptor,
        new String[] { "User", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

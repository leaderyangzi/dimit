// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dimitStoreConf.proto

package dimit.store.conf;

public final class DimitStoreConf {
  private DimitStoreConf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DimitConf_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DimitConf_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelGroupConf_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelGroupConf_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelConf_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelConf_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024dimitStoreConf.proto\"H\n\tDimitConf\022\t\n\001v" +
      "\030\001 \001(\r\022\n\n\002id\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\n\n\002ct\030\t" +
      " \001(\004\022\n\n\002mt\030\n \001(\004\"\\\n\020ChannelGroupConf\022\t\n\001" +
      "v\030\001 \001(\r\022\n\n\002id\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\013\n\003did" +
      "\030\004 \001(\t\022\n\n\002ct\030\t \001(\004\022\n\n\002mt\030\n \001(\004\"\243\001\n\013Chann" +
      "elConf\022\t\n\001v\030\001 \001(\r\022\n\n\002id\030\002 \001(\t\022\014\n\004name\030\003 " +
      "\001(\t\022\036\n\006status\030\004 \001(\0162\016.ChannelStatus\022\013\n\003g" +
      "id\030\005 \001(\t\022\013\n\003tps\030\006 \001(\002\022\020\n\010priority\030\007 \001(\005\022" +
      "\013\n\003tag\030\010 \003(\t\022\n\n\002ct\030\t \001(\004\022\n\n\002mt\030\n \001(\004*\266\001\n" +
      "\tMagicFlag\022\016\n\nDIMIT_CONF\020\000\022\026\n\022CHANNEL_GR" +
      "OUP_CONF\020\001\022\020\n\014CHANNEL_CONF\020\002\022\t\n\005DIMIT\020\003\022" +
      "\021\n\rCHANNEL_GROUP\020\004\022\013\n\007CHANNEL\020\005\022\025\n\021CHANN" +
      "EL_SEND_STAT\020\006\022\025\n\021CHANNEL_RECV_STAT\020\007\022\026\n" +
      "\022CHANNEL_TOTAL_STAT\020\010*B\n\rChannelStatus\022\n" +
      "\n\006CLOSED\020\000\022\013\n\007PRIMARY\020\001\022\013\n\007STANDBY\020\002\022\013\n\007" +
      "INVALID\020\003B\024\n\020dimit.store.confP\001b\006proto3"
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
        }, assigner);
    internal_static_DimitConf_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DimitConf_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DimitConf_descriptor,
        new java.lang.String[] { "V", "Id", "Name", "Ct", "Mt", });
    internal_static_ChannelGroupConf_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ChannelGroupConf_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelGroupConf_descriptor,
        new java.lang.String[] { "V", "Id", "Name", "Did", "Ct", "Mt", });
    internal_static_ChannelConf_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ChannelConf_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelConf_descriptor,
        new java.lang.String[] { "V", "Id", "Name", "Status", "Gid", "Tps", "Priority", "Tag", "Ct", "Mt", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
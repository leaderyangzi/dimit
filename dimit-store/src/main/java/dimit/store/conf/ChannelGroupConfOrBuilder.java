// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dimitStoreConf.proto

package dimit.store.conf;

public interface ChannelGroupConfOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ChannelGroupConf)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 v = 1;</code>
   */
  int getV();

  /**
   * <pre>
   * group id
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * group id
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * group name, unique
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * group name, unique
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * dimit id
   * </pre>
   *
   * <code>string did = 4;</code>
   */
  java.lang.String getDid();
  /**
   * <pre>
   * dimit id
   * </pre>
   *
   * <code>string did = 4;</code>
   */
  com.google.protobuf.ByteString
      getDidBytes();

  /**
   * <pre>
   * timestamp
   * </pre>
   *
   * <code>uint64 ct = 9;</code>
   */
  long getCt();

  /**
   * <pre>
   * modify timestamp
   * </pre>
   *
   * <code>uint64 mt = 10;</code>
   */
  long getMt();
}

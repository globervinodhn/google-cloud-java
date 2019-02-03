// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public interface BatchDeleteEntityTypesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the agent to delete all entities types for. Format:
   * `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the agent to delete all entities types for. Format:
   * `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2;</code>
   */
  java.util.List<java.lang.String> getEntityTypeNamesList();
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2;</code>
   */
  int getEntityTypeNamesCount();
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2;</code>
   */
  java.lang.String getEntityTypeNames(int index);
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2;</code>
   */
  com.google.protobuf.ByteString getEntityTypeNamesBytes(int index);
}

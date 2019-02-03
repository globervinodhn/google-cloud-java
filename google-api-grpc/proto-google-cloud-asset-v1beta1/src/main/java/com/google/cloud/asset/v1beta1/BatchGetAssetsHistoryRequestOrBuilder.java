// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1beta1/asset_service.proto

package com.google.cloud.asset.v1beta1;

public interface BatchGetAssetsHistoryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1beta1.BatchGetAssetsHistoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The relative name of the root asset. It can only be an
   * organization number (such as "organizations/123"), a project ID (such as
   * "projects/my-project-id")", or a project number (such as "projects/12345").
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The relative name of the root asset. It can only be an
   * organization number (such as "organizations/123"), a project ID (such as
   * "projects/my-project-id")", or a project number (such as "projects/12345").
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * A list of the full names of the assets. For example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more info.
   * The request becomes a no-op if the asset name list is empty, and the max
   * size of the asset name list is 100 in one request.
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   */
  java.util.List<java.lang.String> getAssetNamesList();
  /**
   *
   *
   * <pre>
   * A list of the full names of the assets. For example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more info.
   * The request becomes a no-op if the asset name list is empty, and the max
   * size of the asset name list is 100 in one request.
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   */
  int getAssetNamesCount();
  /**
   *
   *
   * <pre>
   * A list of the full names of the assets. For example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more info.
   * The request becomes a no-op if the asset name list is empty, and the max
   * size of the asset name list is 100 in one request.
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   */
  java.lang.String getAssetNames(int index);
  /**
   *
   *
   * <pre>
   * A list of the full names of the assets. For example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more info.
   * The request becomes a no-op if the asset name list is empty, and the max
   * size of the asset name list is 100 in one request.
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   */
  com.google.protobuf.ByteString getAssetNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. The content type.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.ContentType content_type = 3;</code>
   */
  int getContentTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The content type.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.ContentType content_type = 3;</code>
   */
  com.google.cloud.asset.v1beta1.ContentType getContentType();

  /**
   *
   *
   * <pre>
   * Optional. The time window for the asset history. Both start_time and
   * end_time are optional and if set, it must be after 2018-10-02 UTC. If
   * end_time is not set, it is default to current timestamp. If start_time is
   * not set, the snapshot of the assets at end_time will be returned. The
   * returned results contain all temporal assets whose time window overlap with
   * read_time_window.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.TimeWindow read_time_window = 4;</code>
   */
  boolean hasReadTimeWindow();
  /**
   *
   *
   * <pre>
   * Optional. The time window for the asset history. Both start_time and
   * end_time are optional and if set, it must be after 2018-10-02 UTC. If
   * end_time is not set, it is default to current timestamp. If start_time is
   * not set, the snapshot of the assets at end_time will be returned. The
   * returned results contain all temporal assets whose time window overlap with
   * read_time_window.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.TimeWindow read_time_window = 4;</code>
   */
  com.google.cloud.asset.v1beta1.TimeWindow getReadTimeWindow();
  /**
   *
   *
   * <pre>
   * Optional. The time window for the asset history. Both start_time and
   * end_time are optional and if set, it must be after 2018-10-02 UTC. If
   * end_time is not set, it is default to current timestamp. If start_time is
   * not set, the snapshot of the assets at end_time will be returned. The
   * returned results contain all temporal assets whose time window overlap with
   * read_time_window.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.TimeWindow read_time_window = 4;</code>
   */
  com.google.cloud.asset.v1beta1.TimeWindowOrBuilder getReadTimeWindowOrBuilder();
}

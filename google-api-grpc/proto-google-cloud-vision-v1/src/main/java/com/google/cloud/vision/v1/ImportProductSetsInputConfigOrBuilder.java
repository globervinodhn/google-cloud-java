// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/product_search_service.proto

package com.google.cloud.vision.v1;

public interface ImportProductSetsInputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.ImportProductSetsInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for a csv file which preserves a list
   * of ImportProductSetRequests in each line.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ImportProductSetsGcsSource gcs_source = 1;</code>
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for a csv file which preserves a list
   * of ImportProductSetRequests in each line.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ImportProductSetsGcsSource gcs_source = 1;</code>
   */
  com.google.cloud.vision.v1.ImportProductSetsGcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for a csv file which preserves a list
   * of ImportProductSetRequests in each line.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ImportProductSetsGcsSource gcs_source = 1;</code>
   */
  com.google.cloud.vision.v1.ImportProductSetsGcsSourceOrBuilder getGcsSourceOrBuilder();

  public com.google.cloud.vision.v1.ImportProductSetsInputConfig.SourceCase getSourceCase();
}

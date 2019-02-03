// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

public interface CreateModelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.CreateModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the parent project where the model is being created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Resource name of the parent project where the model is being created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The model to create.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Model model = 4;</code>
   */
  boolean hasModel();
  /**
   *
   *
   * <pre>
   * The model to create.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Model model = 4;</code>
   */
  com.google.cloud.automl.v1beta1.Model getModel();
  /**
   *
   *
   * <pre>
   * The model to create.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Model model = 4;</code>
   */
  com.google.cloud.automl.v1beta1.ModelOrBuilder getModelOrBuilder();
}

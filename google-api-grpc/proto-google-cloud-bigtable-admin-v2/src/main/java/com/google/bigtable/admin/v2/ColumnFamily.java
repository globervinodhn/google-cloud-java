// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/table.proto

package com.google.bigtable.admin.v2;

/**
 *
 *
 * <pre>
 * A set of columns within a table which share a common configuration.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.admin.v2.ColumnFamily}
 */
public final class ColumnFamily extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.v2.ColumnFamily)
    ColumnFamilyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ColumnFamily.newBuilder() to construct.
  private ColumnFamily(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ColumnFamily() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ColumnFamily(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.bigtable.admin.v2.GcRule.Builder subBuilder = null;
              if (gcRule_ != null) {
                subBuilder = gcRule_.toBuilder();
              }
              gcRule_ =
                  input.readMessage(
                      com.google.bigtable.admin.v2.GcRule.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gcRule_);
                gcRule_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.bigtable.admin.v2.TableProto
        .internal_static_google_bigtable_admin_v2_ColumnFamily_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.v2.TableProto
        .internal_static_google_bigtable_admin_v2_ColumnFamily_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.v2.ColumnFamily.class,
            com.google.bigtable.admin.v2.ColumnFamily.Builder.class);
  }

  public static final int GC_RULE_FIELD_NUMBER = 1;
  private com.google.bigtable.admin.v2.GcRule gcRule_;
  /**
   *
   *
   * <pre>
   * Garbage collection rule specified as a protobuf.
   * Must serialize to at most 500 bytes.
   * NOTE: Garbage collection executes opportunistically in the background, and
   * so it's possible for reads to return a cell even if it matches the active
   * GC expression for its family.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
   */
  public boolean hasGcRule() {
    return gcRule_ != null;
  }
  /**
   *
   *
   * <pre>
   * Garbage collection rule specified as a protobuf.
   * Must serialize to at most 500 bytes.
   * NOTE: Garbage collection executes opportunistically in the background, and
   * so it's possible for reads to return a cell even if it matches the active
   * GC expression for its family.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
   */
  public com.google.bigtable.admin.v2.GcRule getGcRule() {
    return gcRule_ == null ? com.google.bigtable.admin.v2.GcRule.getDefaultInstance() : gcRule_;
  }
  /**
   *
   *
   * <pre>
   * Garbage collection rule specified as a protobuf.
   * Must serialize to at most 500 bytes.
   * NOTE: Garbage collection executes opportunistically in the background, and
   * so it's possible for reads to return a cell even if it matches the active
   * GC expression for its family.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
   */
  public com.google.bigtable.admin.v2.GcRuleOrBuilder getGcRuleOrBuilder() {
    return getGcRule();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (gcRule_ != null) {
      output.writeMessage(1, getGcRule());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gcRule_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGcRule());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.bigtable.admin.v2.ColumnFamily)) {
      return super.equals(obj);
    }
    com.google.bigtable.admin.v2.ColumnFamily other =
        (com.google.bigtable.admin.v2.ColumnFamily) obj;

    boolean result = true;
    result = result && (hasGcRule() == other.hasGcRule());
    if (hasGcRule()) {
      result = result && getGcRule().equals(other.getGcRule());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGcRule()) {
      hash = (37 * hash) + GC_RULE_FIELD_NUMBER;
      hash = (53 * hash) + getGcRule().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.admin.v2.ColumnFamily parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.ColumnFamily parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.ColumnFamily parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.ColumnFamily parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.ColumnFamily parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.ColumnFamily parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.ColumnFamily parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.ColumnFamily parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.ColumnFamily parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.ColumnFamily parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.ColumnFamily parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.ColumnFamily parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.bigtable.admin.v2.ColumnFamily prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A set of columns within a table which share a common configuration.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.admin.v2.ColumnFamily}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.v2.ColumnFamily)
      com.google.bigtable.admin.v2.ColumnFamilyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.bigtable.admin.v2.TableProto
          .internal_static_google_bigtable_admin_v2_ColumnFamily_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.v2.TableProto
          .internal_static_google_bigtable_admin_v2_ColumnFamily_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.v2.ColumnFamily.class,
              com.google.bigtable.admin.v2.ColumnFamily.Builder.class);
    }

    // Construct using com.google.bigtable.admin.v2.ColumnFamily.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (gcRuleBuilder_ == null) {
        gcRule_ = null;
      } else {
        gcRule_ = null;
        gcRuleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.bigtable.admin.v2.TableProto
          .internal_static_google_bigtable_admin_v2_ColumnFamily_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.ColumnFamily getDefaultInstanceForType() {
      return com.google.bigtable.admin.v2.ColumnFamily.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.ColumnFamily build() {
      com.google.bigtable.admin.v2.ColumnFamily result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.ColumnFamily buildPartial() {
      com.google.bigtable.admin.v2.ColumnFamily result =
          new com.google.bigtable.admin.v2.ColumnFamily(this);
      if (gcRuleBuilder_ == null) {
        result.gcRule_ = gcRule_;
      } else {
        result.gcRule_ = gcRuleBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.v2.ColumnFamily) {
        return mergeFrom((com.google.bigtable.admin.v2.ColumnFamily) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.v2.ColumnFamily other) {
      if (other == com.google.bigtable.admin.v2.ColumnFamily.getDefaultInstance()) return this;
      if (other.hasGcRule()) {
        mergeGcRule(other.getGcRule());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.admin.v2.ColumnFamily parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.v2.ColumnFamily) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.bigtable.admin.v2.GcRule gcRule_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.bigtable.admin.v2.GcRule,
            com.google.bigtable.admin.v2.GcRule.Builder,
            com.google.bigtable.admin.v2.GcRuleOrBuilder>
        gcRuleBuilder_;
    /**
     *
     *
     * <pre>
     * Garbage collection rule specified as a protobuf.
     * Must serialize to at most 500 bytes.
     * NOTE: Garbage collection executes opportunistically in the background, and
     * so it's possible for reads to return a cell even if it matches the active
     * GC expression for its family.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
     */
    public boolean hasGcRule() {
      return gcRuleBuilder_ != null || gcRule_ != null;
    }
    /**
     *
     *
     * <pre>
     * Garbage collection rule specified as a protobuf.
     * Must serialize to at most 500 bytes.
     * NOTE: Garbage collection executes opportunistically in the background, and
     * so it's possible for reads to return a cell even if it matches the active
     * GC expression for its family.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
     */
    public com.google.bigtable.admin.v2.GcRule getGcRule() {
      if (gcRuleBuilder_ == null) {
        return gcRule_ == null ? com.google.bigtable.admin.v2.GcRule.getDefaultInstance() : gcRule_;
      } else {
        return gcRuleBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Garbage collection rule specified as a protobuf.
     * Must serialize to at most 500 bytes.
     * NOTE: Garbage collection executes opportunistically in the background, and
     * so it's possible for reads to return a cell even if it matches the active
     * GC expression for its family.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
     */
    public Builder setGcRule(com.google.bigtable.admin.v2.GcRule value) {
      if (gcRuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcRule_ = value;
        onChanged();
      } else {
        gcRuleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Garbage collection rule specified as a protobuf.
     * Must serialize to at most 500 bytes.
     * NOTE: Garbage collection executes opportunistically in the background, and
     * so it's possible for reads to return a cell even if it matches the active
     * GC expression for its family.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
     */
    public Builder setGcRule(com.google.bigtable.admin.v2.GcRule.Builder builderForValue) {
      if (gcRuleBuilder_ == null) {
        gcRule_ = builderForValue.build();
        onChanged();
      } else {
        gcRuleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Garbage collection rule specified as a protobuf.
     * Must serialize to at most 500 bytes.
     * NOTE: Garbage collection executes opportunistically in the background, and
     * so it's possible for reads to return a cell even if it matches the active
     * GC expression for its family.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
     */
    public Builder mergeGcRule(com.google.bigtable.admin.v2.GcRule value) {
      if (gcRuleBuilder_ == null) {
        if (gcRule_ != null) {
          gcRule_ =
              com.google.bigtable.admin.v2.GcRule.newBuilder(gcRule_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          gcRule_ = value;
        }
        onChanged();
      } else {
        gcRuleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Garbage collection rule specified as a protobuf.
     * Must serialize to at most 500 bytes.
     * NOTE: Garbage collection executes opportunistically in the background, and
     * so it's possible for reads to return a cell even if it matches the active
     * GC expression for its family.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
     */
    public Builder clearGcRule() {
      if (gcRuleBuilder_ == null) {
        gcRule_ = null;
        onChanged();
      } else {
        gcRule_ = null;
        gcRuleBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Garbage collection rule specified as a protobuf.
     * Must serialize to at most 500 bytes.
     * NOTE: Garbage collection executes opportunistically in the background, and
     * so it's possible for reads to return a cell even if it matches the active
     * GC expression for its family.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
     */
    public com.google.bigtable.admin.v2.GcRule.Builder getGcRuleBuilder() {

      onChanged();
      return getGcRuleFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Garbage collection rule specified as a protobuf.
     * Must serialize to at most 500 bytes.
     * NOTE: Garbage collection executes opportunistically in the background, and
     * so it's possible for reads to return a cell even if it matches the active
     * GC expression for its family.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
     */
    public com.google.bigtable.admin.v2.GcRuleOrBuilder getGcRuleOrBuilder() {
      if (gcRuleBuilder_ != null) {
        return gcRuleBuilder_.getMessageOrBuilder();
      } else {
        return gcRule_ == null ? com.google.bigtable.admin.v2.GcRule.getDefaultInstance() : gcRule_;
      }
    }
    /**
     *
     *
     * <pre>
     * Garbage collection rule specified as a protobuf.
     * Must serialize to at most 500 bytes.
     * NOTE: Garbage collection executes opportunistically in the background, and
     * so it's possible for reads to return a cell even if it matches the active
     * GC expression for its family.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.bigtable.admin.v2.GcRule,
            com.google.bigtable.admin.v2.GcRule.Builder,
            com.google.bigtable.admin.v2.GcRuleOrBuilder>
        getGcRuleFieldBuilder() {
      if (gcRuleBuilder_ == null) {
        gcRuleBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.bigtable.admin.v2.GcRule,
                com.google.bigtable.admin.v2.GcRule.Builder,
                com.google.bigtable.admin.v2.GcRuleOrBuilder>(
                getGcRule(), getParentForChildren(), isClean());
        gcRule_ = null;
      }
      return gcRuleBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.v2.ColumnFamily)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.v2.ColumnFamily)
  private static final com.google.bigtable.admin.v2.ColumnFamily DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.v2.ColumnFamily();
  }

  public static com.google.bigtable.admin.v2.ColumnFamily getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ColumnFamily> PARSER =
      new com.google.protobuf.AbstractParser<ColumnFamily>() {
        @java.lang.Override
        public ColumnFamily parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ColumnFamily(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ColumnFamily> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ColumnFamily> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.admin.v2.ColumnFamily getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

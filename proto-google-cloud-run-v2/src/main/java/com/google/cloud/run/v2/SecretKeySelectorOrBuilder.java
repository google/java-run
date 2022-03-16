/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/k8s.min.proto

package com.google.cloud.run.v2;

public interface SecretKeySelectorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.SecretKeySelector)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the secret in Cloud Secret Manager.
   * Format: {secret_name} if the secret is in the same project.
   * projects/{project}/secrets/{secret_name} if the secret is
   * in a different project.
   * </pre>
   *
   * <code>
   * string secret = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The secret.
   */
  java.lang.String getSecret();
  /**
   *
   *
   * <pre>
   * Required. The name of the secret in Cloud Secret Manager.
   * Format: {secret_name} if the secret is in the same project.
   * projects/{project}/secrets/{secret_name} if the secret is
   * in a different project.
   * </pre>
   *
   * <code>
   * string secret = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for secret.
   */
  com.google.protobuf.ByteString getSecretBytes();

  /**
   *
   *
   * <pre>
   * The Cloud Secret Manager secret version.
   * Can be 'latest' for the latest value or an integer for a specific version.
   * </pre>
   *
   * <code>string version = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The Cloud Secret Manager secret version.
   * Can be 'latest' for the latest value or an integer for a specific version.
   * </pre>
   *
   * <code>string version = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();
}
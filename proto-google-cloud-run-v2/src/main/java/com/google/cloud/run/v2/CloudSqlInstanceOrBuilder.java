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

public interface CloudSqlInstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.CloudSqlInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Cloud SQL instance connection names, as can be found in
   * https://console.cloud.google.com/sql/instances. Visit
   * https://cloud.google.com/sql/docs/mysql/connect-run for more information on
   * how to connect Cloud SQL and Cloud Run. Format:
   * {project}:{location}:{instance}
   * </pre>
   *
   * <code>repeated string connections = 1;</code>
   *
   * @return A list containing the connections.
   */
  java.util.List<java.lang.String> getConnectionsList();
  /**
   *
   *
   * <pre>
   * The Cloud SQL instance connection names, as can be found in
   * https://console.cloud.google.com/sql/instances. Visit
   * https://cloud.google.com/sql/docs/mysql/connect-run for more information on
   * how to connect Cloud SQL and Cloud Run. Format:
   * {project}:{location}:{instance}
   * </pre>
   *
   * <code>repeated string connections = 1;</code>
   *
   * @return The count of connections.
   */
  int getConnectionsCount();
  /**
   *
   *
   * <pre>
   * The Cloud SQL instance connection names, as can be found in
   * https://console.cloud.google.com/sql/instances. Visit
   * https://cloud.google.com/sql/docs/mysql/connect-run for more information on
   * how to connect Cloud SQL and Cloud Run. Format:
   * {project}:{location}:{instance}
   * </pre>
   *
   * <code>repeated string connections = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The connections at the given index.
   */
  java.lang.String getConnections(int index);
  /**
   *
   *
   * <pre>
   * The Cloud SQL instance connection names, as can be found in
   * https://console.cloud.google.com/sql/instances. Visit
   * https://cloud.google.com/sql/docs/mysql/connect-run for more information on
   * how to connect Cloud SQL and Cloud Run. Format:
   * {project}:{location}:{instance}
   * </pre>
   *
   * <code>repeated string connections = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the connections at the given index.
   */
  com.google.protobuf.ByteString getConnectionsBytes(int index);
}
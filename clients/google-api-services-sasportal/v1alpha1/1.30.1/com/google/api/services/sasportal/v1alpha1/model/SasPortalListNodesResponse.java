/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.sasportal.v1alpha1.model;

/**
 * Response for ListNodes method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalListNodesResponse extends com.google.api.client.json.GenericJson {

  /**
   * A pagination token returned from a previous call to ListNodes method that indicates from where
   * listing should continue. If the field is missing or empty, it means there is no more nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The nodes that match the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SasPortalNode> nodes;

  /**
   * A pagination token returned from a previous call to ListNodes method that indicates from where
   * listing should continue. If the field is missing or empty, it means there is no more nodes.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A pagination token returned from a previous call to ListNodes method that indicates from where
   * listing should continue. If the field is missing or empty, it means there is no more nodes.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SasPortalListNodesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The nodes that match the request.
   * @return value or {@code null} for none
   */
  public java.util.List<SasPortalNode> getNodes() {
    return nodes;
  }

  /**
   * The nodes that match the request.
   * @param nodes nodes or {@code null} for none
   */
  public SasPortalListNodesResponse setNodes(java.util.List<SasPortalNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  @Override
  public SasPortalListNodesResponse set(String fieldName, Object value) {
    return (SasPortalListNodesResponse) super.set(fieldName, value);
  }

  @Override
  public SasPortalListNodesResponse clone() {
    return (SasPortalListNodesResponse) super.clone();
  }

}

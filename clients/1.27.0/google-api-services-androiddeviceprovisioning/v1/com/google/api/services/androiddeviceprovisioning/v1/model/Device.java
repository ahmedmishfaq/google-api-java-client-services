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

package com.google.api.services.androiddeviceprovisioning.v1.model;

/**
 * An Android device registered for zero-touch enrollment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Device Provisioning Partner API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Device extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The provisioning claims for a device. Devices claimed for zero-touch enrollment
   * have a claim with the type `SECTION_TYPE_ZERO_TOUCH`. Call `partners.devices.unclaim` or
   * `partners.devices.unclaimAsync` to remove the device from zero-touch enrollment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DeviceClaim> claims;

  static {
    // hack to force ProGuard to consider DeviceClaim used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DeviceClaim.class);
  }

  /**
   * Not available to resellers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String configuration;

  /**
   * Output only. The ID of the device. Assigned by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long deviceId;

  /**
   * The hardware IDs that identify a manufactured device. To learn more, read [Identifiers](/zero-
   * touch/guides/identifiers).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceIdentifier deviceIdentifier;

  /**
   * The metadata attached to the device. Structured as key-value pairs. To learn more, read [Device
   * metadata](/zero-touch/guides/metadata).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceMetadata deviceMetadata;

  /**
   * Output only. The API resource name in the format `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
   * Assigned by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The provisioning claims for a device. Devices claimed for zero-touch enrollment
   * have a claim with the type `SECTION_TYPE_ZERO_TOUCH`. Call `partners.devices.unclaim` or
   * `partners.devices.unclaimAsync` to remove the device from zero-touch enrollment.
   * @return value or {@code null} for none
   */
  public java.util.List<DeviceClaim> getClaims() {
    return claims;
  }

  /**
   * Output only. The provisioning claims for a device. Devices claimed for zero-touch enrollment
   * have a claim with the type `SECTION_TYPE_ZERO_TOUCH`. Call `partners.devices.unclaim` or
   * `partners.devices.unclaimAsync` to remove the device from zero-touch enrollment.
   * @param claims claims or {@code null} for none
   */
  public Device setClaims(java.util.List<DeviceClaim> claims) {
    this.claims = claims;
    return this;
  }

  /**
   * Not available to resellers.
   * @return value or {@code null} for none
   */
  public java.lang.String getConfiguration() {
    return configuration;
  }

  /**
   * Not available to resellers.
   * @param configuration configuration or {@code null} for none
   */
  public Device setConfiguration(java.lang.String configuration) {
    this.configuration = configuration;
    return this;
  }

  /**
   * Output only. The ID of the device. Assigned by the server.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDeviceId() {
    return deviceId;
  }

  /**
   * Output only. The ID of the device. Assigned by the server.
   * @param deviceId deviceId or {@code null} for none
   */
  public Device setDeviceId(java.lang.Long deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * The hardware IDs that identify a manufactured device. To learn more, read [Identifiers](/zero-
   * touch/guides/identifiers).
   * @return value or {@code null} for none
   */
  public DeviceIdentifier getDeviceIdentifier() {
    return deviceIdentifier;
  }

  /**
   * The hardware IDs that identify a manufactured device. To learn more, read [Identifiers](/zero-
   * touch/guides/identifiers).
   * @param deviceIdentifier deviceIdentifier or {@code null} for none
   */
  public Device setDeviceIdentifier(DeviceIdentifier deviceIdentifier) {
    this.deviceIdentifier = deviceIdentifier;
    return this;
  }

  /**
   * The metadata attached to the device. Structured as key-value pairs. To learn more, read [Device
   * metadata](/zero-touch/guides/metadata).
   * @return value or {@code null} for none
   */
  public DeviceMetadata getDeviceMetadata() {
    return deviceMetadata;
  }

  /**
   * The metadata attached to the device. Structured as key-value pairs. To learn more, read [Device
   * metadata](/zero-touch/guides/metadata).
   * @param deviceMetadata deviceMetadata or {@code null} for none
   */
  public Device setDeviceMetadata(DeviceMetadata deviceMetadata) {
    this.deviceMetadata = deviceMetadata;
    return this;
  }

  /**
   * Output only. The API resource name in the format `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
   * Assigned by the server.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The API resource name in the format `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
   * Assigned by the server.
   * @param name name or {@code null} for none
   */
  public Device setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Device set(String fieldName, Object value) {
    return (Device) super.set(fieldName, value);
  }

  @Override
  public Device clone() {
    return (Device) super.clone();
  }

}

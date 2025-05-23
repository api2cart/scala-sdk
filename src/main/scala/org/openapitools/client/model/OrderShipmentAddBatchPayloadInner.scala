/**
 * API2Cart OpenAPI
 * API2Cart
 *
 * The version of the OpenAPI document: 1.1
 * Contact: contact@api2cart.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class OrderShipmentAddBatchPayloadInner (
  orderId: String,
  storeId: Option[String] = None,
  warehouseId: Option[String] = None,
  carrierId: Option[String] = None,
  carrierName: Option[String] = None,
  trackingNumber: String,
  trackingLink: Option[String] = None,
  shipmentProvider: Option[String] = None,
  items: Option[Seq[OrderShipmentAddBatchPayloadInnerItemsInner]] = None,
  sendNotifications: Option[Boolean] = None
) extends ApiModel


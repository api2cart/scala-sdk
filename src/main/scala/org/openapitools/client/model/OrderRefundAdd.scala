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

import java.math.BigDecimal
import org.openapitools.client.core.ApiModel

case class OrderRefundAdd (
  /* Defines the order for which the refund will be created. */
  orderId: Option[String] = None,
  /* Defines items in the order that will be refunded */
  items: Option[Seq[OrderRefundAddItemsInner]] = None,
  /* Defines order refund amount. */
  totalPrice: Option[BigDecimal] = None,
  /* Defines refund shipping amount. */
  shippingPrice: Option[BigDecimal] = None,
  /* Specifies refund's fee price */
  feePrice: Option[BigDecimal] = None,
  /* Refund reason, or some else message which assigned to refund. */
  message: Option[String] = None,
  /* Boolean, whether or not to add the line items back to the store inventory. */
  itemRestock: Option[Boolean] = None,
  /* Send notifications to customer after refund was created */
  sendNotifications: Option[Boolean] = None,
  /* Specifies an order creation date in format Y-m-d H:i:s */
  date: Option[String] = None,
  /* Indicates whether refund type is online */
  isOnline: Option[Boolean] = None
) extends ApiModel


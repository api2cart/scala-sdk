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

case class OrderPreestimateShippingListOrderItemInner (
  /* Defines orders specified by order item id */
  orderItemId: String,
  /* Defines orders specified by order item model */
  orderItemModel: Option[String] = None,
  /* Defines orders specified by order item quantity */
  orderItemQuantity: Int,
  /* Defines orders specified by order item weight */
  orderItemWeight: Option[BigDecimal] = None,
  /* Ordered product variant. Where x is order item ID */
  orderItemVariantId: Option[String] = None,
  orderItemOption: Option[Seq[OrderPreestimateShippingListOrderItemInnerOrderItemOptionInner]] = None
) extends ApiModel


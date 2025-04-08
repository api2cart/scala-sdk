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

case class OrderPreestimateShippingListOrderItemInnerOrderItemOptionInner (
  /* Ordered Product Option Name. Where x is order item ID, y is order item option ID */
  orderItemOptionName: Option[String] = None,
  /* Product Option ID. Where x is order item ID, y is order item option ID */
  orderItemOptionId: Option[String] = None,
  /* Ordered product option value Where x is order item ID, y - order item option ID */
  orderItemOptionValue: Option[String] = None,
  /* Product option value ID, where x is order item ID, y - order item option ID */
  orderItemOptionValueId: Option[String] = None,
  /* Product option used in combinations flag, where x is order item ID, y - order item option ID */
  orderItemOptionUsedInCombinations: Option[Boolean] = None
) extends ApiModel


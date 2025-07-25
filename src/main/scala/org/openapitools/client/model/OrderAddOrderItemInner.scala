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

case class OrderAddOrderItemInner (
  /* Defines orders specified by order item id */
  orderItemId: String,
  /* Defines orders specified by order item name */
  orderItemName: String,
  /* Defines orders specified by order item model */
  orderItemModel: Option[String] = None,
  /* Defines orders specified by order item price */
  orderItemPrice: BigDecimal,
  /* Defines orders specified by order item quantity */
  orderItemQuantity: Int,
  /* Defines orders specified by order item weight */
  orderItemWeight: Option[BigDecimal] = None,
  /* Ordered product variant. Where x is order item ID */
  orderItemVariantId: Option[String] = None,
  /* Percentage of tax for product order */
  orderItemTax: Option[BigDecimal] = None,
  /* Id of the tax class of product. */
  orderItemTaxClass: Option[String] = None,
  /* Defines if item price includes tax */
  orderItemPriceIncludesTax: Option[Boolean] = None,
  /* Index of the parent grouped/bundle product */
  orderItemParent: Option[Int] = None,
  /* Option name of the parent grouped/bundle product */
  orderItemParentOptionName: Option[String] = None,
  /* Indicates whether subitems of the grouped/bundle product can be refunded separately */
  orderItemAllowRefundItemsSeparately: Option[Boolean] = None,
  /* Indicates whether subitems of the grouped/bundle product can be shipped separately */
  orderItemAllowShipItemsSeparately: Option[Boolean] = None,
  orderItemOption: Option[Seq[OrderAddOrderItemInnerOrderItemOptionInner]] = None,
  orderItemProperty: Option[Seq[OrderAddOrderItemInnerOrderItemPropertyInner]] = None
) extends ApiModel


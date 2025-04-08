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

case class CartCouponAdd (
  /* Store Id */
  storeId: Option[String] = None,
  /* Coupon code */
  code: String,
  /* Coupon name */
  name: Option[String] = None,
  /* Entity codes */
  codes: Option[Seq[String]] = None,
  /* Coupon discount type */
  actionType: CartCouponAddEnums.ActionType,
  /* Defines where discount should be applied */
  actionApplyTo: CartCouponAddEnums.ActionApplyTo,
  /* Specify how discount should be applied. If scope=matching_items, then discount will be applied to each of the items that match action conditions. Scope order means that discount will be applied once. */
  actionScope: CartCouponAddEnums.ActionScope,
  /* Defines the discount amount value. */
  actionAmount: BigDecimal,
  /* Date start */
  dateStart: Option[String] = None,
  /* Defines when discount code will be expired. */
  dateEnd: Option[String] = None,
  /* Usage limit for coupon. */
  usageLimit: Option[Int] = None,
  /* Usage limit per customer. */
  usageLimitPerCustomer: Option[Int] = None,
  /* Defines entity for action condition. */
  actionConditionEntity: Option[String] = None,
  /* Defines entity attribute code for action condition. */
  actionConditionKey: Option[String] = None,
  /* Defines condition operator. */
  actionConditionOperator: Option[String] = None,
  /* Defines condition attribute value/s. Can be comma separated string. */
  actionConditionValue: Option[String] = None,
  /* Indicates whether to apply a discount for taxes. */
  includeTax: Option[Boolean] = None
) extends ApiModel

object CartCouponAddEnums {

  type ActionType = ActionType.Value
  type ActionApplyTo = ActionApplyTo.Value
  type ActionScope = ActionScope.Value
  object ActionType extends Enumeration {
    val Percent = Value("percent")
    val Fixed = Value("fixed")
  }

  object ActionApplyTo extends Enumeration {
    val OrderTotal = Value("order_total")
    val ItemPrice = Value("item_price")
    val Shipping = Value("shipping")
  }

  object ActionScope extends Enumeration {
    val Order = Value("order")
    val MatchingItems = Value("matching_items")
  }

}

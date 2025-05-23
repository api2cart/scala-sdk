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

case class Coupon (
  id: Option[String] = None,
  code: Option[String] = None,
  codes: Option[Seq[CouponCode]] = None,
  name: Option[String] = None,
  description: Option[String] = None,
  actions: Option[Seq[CouponAction]] = None,
  dateStart: Option[A2CDateTime] = None,
  dateEnd: Option[A2CDateTime] = None,
  avail: Option[Boolean] = None,
  priority: Option[Int] = None,
  usedTimes: Option[Int] = None,
  usageLimit: Option[Int] = None,
  usageLimitPerCustomer: Option[Int] = None,
  logicOperator: Option[String] = None,
  conditions: Option[Seq[CouponCondition]] = None,
  usageHistory: Option[Seq[CouponHistory]] = None,
  additionalFields: Option[Any] = None,
  customFields: Option[Any] = None
) extends ApiModel


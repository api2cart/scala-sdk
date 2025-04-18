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

case class ProductReview (
  id: Option[String] = None,
  productId: Option[String] = None,
  customerId: Option[String] = None,
  nickName: Option[String] = None,
  email: Option[String] = None,
  summary: Option[String] = None,
  message: Option[String] = None,
  rating: Option[BigDecimal] = None,
  ratings: Option[Seq[ProductReviewRating]] = None,
  status: Option[String] = None,
  createdTime: Option[A2CDateTime] = None,
  medias: Option[Seq[Media]] = None,
  additionalFields: Option[Any] = None,
  customFields: Option[Any] = None
) extends ApiModel


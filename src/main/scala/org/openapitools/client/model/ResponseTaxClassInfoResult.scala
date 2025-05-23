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

case class ResponseTaxClassInfoResult (
  id: Option[String] = None,
  name: Option[String] = None,
  avail: Option[Boolean] = None,
  tax: Option[BigDecimal] = None,
  taxType: Option[Int] = None,
  createdAt: Option[A2CDateTime] = None,
  modifiedAt: Option[A2CDateTime] = None,
  taxRates: Option[Seq[TaxClassRate]] = None,
  additionalFields: Option[Any] = None,
  customFields: Option[Any] = None
) extends ApiModel


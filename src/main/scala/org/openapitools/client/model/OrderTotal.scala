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

case class OrderTotal (
  subtotalExTax: Option[BigDecimal] = None,
  wrappingExTax: Option[BigDecimal] = None,
  shippingExTax: Option[BigDecimal] = None,
  totalDiscount: Option[BigDecimal] = None,
  totalTax: Option[BigDecimal] = None,
  total: Option[BigDecimal] = None,
  totalPaid: Option[BigDecimal] = None,
  additionalFields: Option[Any] = None,
  customFields: Option[Any] = None
) extends ApiModel


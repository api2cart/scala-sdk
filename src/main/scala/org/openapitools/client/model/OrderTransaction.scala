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

case class OrderTransaction (
  id: Option[String] = None,
  transactionId: Option[String] = None,
  orderId: Option[String] = None,
  parentId: Option[String] = None,
  description: Option[String] = None,
  status: Option[String] = None,
  gateway: Option[String] = None,
  referenceNumber: Option[String] = None,
  currency: Option[String] = None,
  amount: Option[BigDecimal] = None,
  createdTime: Option[A2CDateTime] = None,
  settlementCurrency: Option[String] = None,
  settlementAmount: Option[BigDecimal] = None,
  settlementCreatedTime: Option[A2CDateTime] = None,
  cardBrand: Option[String] = None,
  cardBin: Option[String] = None,
  cardLastFour: Option[String] = None,
  avsStreetRespCode: Option[String] = None,
  avsPostalRespCode: Option[String] = None,
  avsMessage: Option[String] = None,
  cvvCode: Option[String] = None,
  cvvMessage: Option[String] = None,
  isTestMode: Option[Boolean] = None,
  additionalFields: Option[Any] = None,
  customFields: Option[Any] = None
) extends ApiModel


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

case class BasketItemOption (
  id: Option[String] = None,
  valueId: Option[String] = None,
  name: Option[String] = None,
  value: Option[String] = None,
  usedInCombination: Option[Boolean] = None,
  additionalFields: Option[Any] = None,
  customFields: Option[Any] = None
) extends ApiModel


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

case class ProductOptionItem (
  id: Option[String] = None,
  productOptionItemId: Option[String] = None,
  name: Option[String] = None,
  sortOrder: Option[Int] = None,
  price: Option[String] = None,
  weight: Option[String] = None,
  quantity: Option[Int] = None,
  typePrice: Option[String] = None,
  sku: Option[String] = None,
  isDefault: Option[Boolean] = None,
  additionalFields: Option[Any] = None,
  customFields: Option[Any] = None
) extends ApiModel


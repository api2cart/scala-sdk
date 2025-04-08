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

case class ProductVariantImageAdd (
  /* Defines product id where the variant image has to be added */
  productId: Option[String] = None,
  /* Defines product's variants specified by variant id */
  productVariantId: String,
  /* Defines image's name */
  imageName: String,
  /* Defines image's types that are specified by comma-separated list */
  `type`: ProductVariantImageAddEnums.`Type`,
  /* Defines URL of the image that has to be added */
  url: Option[String] = None,
  /* Content(body) encoded in base64 of image file */
  content: Option[String] = None,
  /* Defines alternative text that has to be attached to the picture */
  label: Option[String] = None,
  /* Mime type of image http://en.wikipedia.org/wiki/Internet_media_type. */
  mime: Option[String] = None,
  /* Defines image’s position in the list */
  position: Option[Int] = None,
  /* Store Id */
  storeId: Option[String] = None,
  /* Defines option id of the product variant for which the image will be added */
  optionId: Option[String] = None
) extends ApiModel

object ProductVariantImageAddEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Small = Value("small")
    val Base = Value("base")
    val Additional = Value("additional")
    val Thumbnail = Value("thumbnail")
  }

}

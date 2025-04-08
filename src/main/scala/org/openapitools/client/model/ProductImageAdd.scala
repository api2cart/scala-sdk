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

case class ProductImageAdd (
  /* Defines product id where the image should be added */
  productId: Option[String] = None,
  /* Defines image's name */
  imageName: String,
  /* Defines image's types that are specified by comma-separated list */
  `type`: ProductImageAddEnums.`Type`,
  /* Defines URL of the image that has to be added */
  url: Option[String] = None,
  /* Defines alternative text that has to be attached to the picture */
  label: Option[String] = None,
  /* Mime type of image http://en.wikipedia.org/wiki/Internet_media_type. */
  mime: Option[String] = None,
  /* Defines image’s position in the list */
  position: Option[Int] = None,
  /* Content(body) encoded in base64 of image file */
  content: Option[String] = None,
  /* Defines product's variants specified by variant id */
  productVariantId: Option[String] = None,
  /* Defines product's variants ids */
  variantIds: Option[String] = None,
  /* Defines product's option values ids */
  optionValueIds: Option[String] = None,
  /* Store Id */
  storeId: Option[String] = None,
  /* Add product image on specified language id */
  langId: Option[String] = None,
  /* Use the latest platform API version */
  useLatestApiVersion: Option[Boolean] = None
) extends ApiModel

object ProductImageAddEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Small = Value("small")
    val Base = Value("base")
    val Additional = Value("additional")
    val Thumbnail = Value("thumbnail")
  }

}

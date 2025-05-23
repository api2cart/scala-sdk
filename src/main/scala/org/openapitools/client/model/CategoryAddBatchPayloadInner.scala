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

case class CategoryAddBatchPayloadInner (
  name: String,
  avail: Option[Boolean] = None,
  description: Option[String] = None,
  metaTitle: Option[String] = None,
  metaDescription: Option[String] = None,
  metaKeywords: Option[Seq[String]] = None,
  parentId: Option[String] = None,
  sortOrder: Option[Int] = None,
  seoUrl: Option[String] = None,
  storeId: Option[String] = None,
  images: Option[Seq[CategoryAddBatchPayloadInnerImagesInner]] = None,
  storesIds: Option[Seq[String]] = None
) extends ApiModel


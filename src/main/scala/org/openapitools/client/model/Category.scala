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

case class Category (
  id: Option[String] = None,
  parentId: Option[String] = None,
  createdAt: Option[A2CDateTime] = None,
  modifiedAt: Option[A2CDateTime] = None,
  name: Option[String] = None,
  shortDescription: Option[String] = None,
  description: Option[String] = None,
  storesIds: Option[Seq[String]] = None,
  keywords: Option[String] = None,
  metaDescription: Option[String] = None,
  metaTitle: Option[String] = None,
  avail: Option[Boolean] = None,
  path: Option[String] = None,
  seoUrl: Option[String] = None,
  sortOrder: Option[Int] = None,
  images: Option[Seq[Image]] = None,
  additionalFields: Option[Any] = None,
  customFields: Option[Any] = None
) extends ApiModel


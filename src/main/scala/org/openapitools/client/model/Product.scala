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

case class Product (
  id: Option[String] = None,
  `type`: Option[String] = None,
  uModel: Option[String] = None,
  uSku: Option[String] = None,
  name: Option[String] = None,
  description: Option[String] = None,
  shortDescription: Option[String] = None,
  price: Option[BigDecimal] = None,
  advancedPrice: Option[Seq[ProductAdvancedPrice]] = None,
  costPrice: Option[BigDecimal] = None,
  quantity: Option[BigDecimal] = None,
  inventory: Option[Seq[ProductInventory]] = None,
  groupItems: Option[Seq[ProductGroupItem]] = None,
  uBrandId: Option[String] = None,
  uBrand: Option[String] = None,
  categoriesIds: Option[Seq[String]] = None,
  storesIds: Option[Seq[String]] = None,
  url: Option[String] = None,
  seoUrl: Option[String] = None,
  metaTitle: Option[String] = None,
  metaKeywords: Option[String] = None,
  metaDescription: Option[String] = None,
  availSale: Option[Boolean] = None,
  availView: Option[Boolean] = None,
  isVirtual: Option[Boolean] = None,
  isDownloadable: Option[Boolean] = None,
  weight: Option[BigDecimal] = None,
  weightUnit: Option[String] = None,
  sortOrder: Option[Int] = None,
  inStock: Option[Boolean] = None,
  onSale: Option[Boolean] = None,
  backorders: Option[String] = None,
  manageStock: Option[String] = None,
  isStockManaged: Option[Boolean] = None,
  createAt: Option[A2CDateTime] = None,
  modifiedAt: Option[A2CDateTime] = None,
  taxClassId: Option[String] = None,
  specialPrice: Option[SpecialPrice] = None,
  tierPrice: Option[Seq[ProductTierPrice]] = None,
  groupPrice: Option[Seq[ProductGroupPrice]] = None,
  images: Option[Seq[Image]] = None,
  productOptions: Option[Seq[ProductOption]] = None,
  uUpc: Option[String] = None,
  uMpn: Option[String] = None,
  uGtin: Option[String] = None,
  uIsbn: Option[String] = None,
  uEan: Option[String] = None,
  relatedProductsIds: Option[Seq[String]] = None,
  upSellProductsIds: Option[Seq[String]] = None,
  crossSellProductsIds: Option[Seq[String]] = None,
  dimensionsUnit: Option[String] = None,
  width: Option[BigDecimal] = None,
  height: Option[BigDecimal] = None,
  length: Option[BigDecimal] = None,
  discounts: Option[Seq[Discount]] = None,
  additionalFields: Option[Any] = None,
  customFields: Option[Any] = None
) extends ApiModel


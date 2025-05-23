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

case class ProductUpdateBatchPayloadInner (
  id: String,
  name: Option[String] = None,
  description: Option[String] = None,
  shortDescription: Option[String] = None,
  sku: Option[String] = None,
  model: Option[String] = None,
  price: Option[BigDecimal] = None,
  specialPrice: Option[BigDecimal] = None,
  spriceCreate: Option[String] = None,
  spriceExpire: Option[String] = None,
  costPrice: Option[BigDecimal] = None,
  oldPrice: Option[BigDecimal] = None,
  fixedCostShippingPrice: Option[BigDecimal] = None,
  /* If an empty array is passed, all entries will be deleted when the 'nested_items_update_behaviour' parameter is set to 'replace'. */
  advancedPrices: Option[Seq[ProductUpdateBatchPayloadInnerAdvancedPricesInner]] = None,
  quantity: Option[BigDecimal] = None,
  increaseQuantity: Option[BigDecimal] = None,
  reduceQuantity: Option[BigDecimal] = None,
  reserveQuantity: Option[BigDecimal] = None,
  storeId: Option[String] = None,
  langId: Option[String] = None,
  status: Option[String] = None,
  `type`: Option[String] = None,
  condition: Option[String] = None,
  visible: Option[String] = None,
  availableForView: Option[Boolean] = None,
  availableForSale: Option[Boolean] = None,
  availFrom: Option[String] = None,
  weight: Option[BigDecimal] = None,
  length: Option[BigDecimal] = None,
  width: Option[BigDecimal] = None,
  height: Option[BigDecimal] = None,
  dimensionsUnit: Option[String] = None,
  weightUnit: Option[String] = None,
  manageStock: Option[Boolean] = None,
  inStock: Option[Boolean] = None,
  backorderStatus: Option[String] = None,
  isFreeShipping: Option[Boolean] = None,
  isVirtual: Option[Boolean] = None,
  taxable: Option[Boolean] = None,
  downloadable: Option[Boolean] = None,
  warehouseId: Option[String] = None,
  taxClassId: Option[String] = None,
  categoriesIds: Option[Seq[String]] = None,
  metaTitle: Option[String] = None,
  metaDescription: Option[String] = None,
  metaKeywords: Option[Seq[String]] = None,
  url: Option[String] = None,
  seoUrl: Option[String] = None,
  manufacturer: Option[String] = None,
  manufacturerId: Option[String] = None,
  mpn: Option[String] = None,
  gtin: Option[String] = None,
  upc: Option[String] = None,
  isbn: Option[String] = None,
  ean: Option[String] = None,
  barcode: Option[String] = None,
  /* Property 'nested_items_update_behaviour' does not apply. Specified items will be added to existing product images */
  images: Option[Seq[ProductUpdateBatchPayloadInnerImagesInner]] = None,
  /* If an empty array is passed, all entries will be deleted when the 'nested_items_update_behaviour' parameter is set to 'replace'. */
  relatedProductsIds: Option[Seq[String]] = None,
  /* If an empty array is passed, all entries will be deleted when the 'nested_items_update_behaviour' parameter is set to 'replace'. */
  upSellProductsIds: Option[Seq[String]] = None,
  /* If an empty array is passed, all entries will be deleted when the 'nested_items_update_behaviour' parameter is set to 'replace'. */
  crossSellProductsIds: Option[Seq[String]] = None,
  tags: Option[Seq[String]] = None,
  searchKeywords: Option[Seq[String]] = None,
  harmonizedSystemCode: Option[String] = None
) extends ApiModel


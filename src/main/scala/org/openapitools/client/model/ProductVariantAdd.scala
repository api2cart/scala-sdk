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

case class ProductVariantAdd (
  /* Defines product's id where the variant has to be added */
  productId: Option[String] = None,
  /* Defines variant's name that has to be added */
  name: Option[String] = None,
  /* Specifies variant's model that has to be added */
  model: String,
  /* Defines variant's sku that has to be added */
  sku: Option[String] = None,
  /* A barcode is a unique code composed of numbers used as a product identifier. */
  barcode: Option[String] = None,
  /* Global Trade Item Number. An GTIN is an identifier for trade items. */
  gtin: Option[String] = None,
  /* Defines new product's variant price */
  price: Option[BigDecimal] = None,
  /* Defines product's old price */
  oldPrice: Option[BigDecimal] = None,
  /* Defines new product's cost price */
  costPrice: Option[BigDecimal] = None,
  /* Specifies fixed cost shipping price */
  fixedCostShippingPrice: Option[BigDecimal] = None,
  /* Defines variant's attributes list */
  attributes: Option[Seq[ProductVariantAddAttributesInner]] = None,
  /* Specifies variant's description */
  description: Option[String] = None,
  /* Specifies variant's model that has to be added */
  specialPrice: Option[BigDecimal] = None,
  /* Defines the date of special price creation */
  spriceCreate: Option[String] = None,
  /* Defines the date of special price modification */
  spriceModified: Option[String] = None,
  /* Defines the term of special price offer duration */
  spriceExpire: Option[String] = None,
  /* Specifies the set of visible/invisible product's variants for users */
  availableForView: Option[Boolean] = None,
  /* Specifies the set of visible/invisible product's variants for sale */
  availableForSale: Option[Boolean] = None,
  /* Weight */
  weight: Option[BigDecimal] = None,
  /* Defines product's width */
  width: Option[BigDecimal] = None,
  /* Defines product's height */
  height: Option[BigDecimal] = None,
  /* Defines product's length */
  length: Option[BigDecimal] = None,
  /* Weight Unit */
  weightUnit: Option[String] = None,
  /* Defines short description */
  shortDescription: Option[String] = None,
  /* This parameter is used for selecting a warehouse where you need to set/modify a product quantity. */
  warehouseId: Option[String] = None,
  /* Defines product variant's quantity that has to be added */
  quantity: Option[BigDecimal] = None,
  /* Defines the date of entity creation */
  createdAt: Option[String] = None,
  /* Specifies the product variant's manufacturer */
  manufacturer: Option[String] = None,
  /* Defines tax classes where entity has to be added */
  taxClassId: Option[String] = None,
  /* Defines unique meta title for each entity */
  metaTitle: Option[String] = None,
  /* Defines unique meta keywords for each entity */
  metaKeywords: Option[String] = None,
  /* Defines unique meta description of a entity */
  metaDescription: Option[String] = None,
  /* Defines unique product variant's URL */
  url: Option[String] = None,
  /* Add variants specified by store id */
  storeId: Option[String] = None,
  /* Language id */
  langId: Option[String] = None,
  /* Is cache clear required */
  clearCache: Option[Boolean] = None,
  /* Specifies whether a tax is charged */
  taxable: Option[Boolean] = None,
  /* Harmonized System Code. An HSC is a 6-digit identifier that allows participating countries to classify traded goods on a common basis for customs purposes */
  harmonizedSystemCode: Option[String] = None,
  /* The country where the inventory item was made */
  countryOfOrigin: Option[String] = None,
  /* Defines inventory tracking for product variant */
  manageStock: Option[Boolean] = None,
  /* Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products. */
  upc: Option[String] = None,
  /* Manufacturer Part Number. A MPN is an identifier of a particular part design or material used. */
  mpn: Option[String] = None,
  /* European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products. */
  ean: Option[String] = None,
  /* International Standard Book Number. An ISBN is a unique identifier for books. */
  isbn: Option[String] = None,
  /* Assign variant to the stores that is specified by comma-separated stores' id */
  storesIds: Option[String] = None,
  /* Defines as a default variant */
  isDefault: Option[Boolean] = None,
  /* Specifies variant's free shipping flag that has to be added */
  isFreeShipping: Option[Boolean] = None,
  /* String containing the JSON representation of the supplied data */
  marketplaceItemProperties: Option[String] = None,
  /* Set stock status */
  inStock: Option[Boolean] = None,
  /* Set backorder status */
  backorderStatus: Option[String] = None,
  /* Defines product's tier prices */
  tierPrices: Option[Seq[ProductAddTierPricesInner]] = None,
  /* Defines whether the product is virtual */
  isVirtual: Option[Boolean] = None
) extends ApiModel


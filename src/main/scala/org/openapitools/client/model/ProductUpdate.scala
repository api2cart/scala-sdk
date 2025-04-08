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

case class ProductUpdate (
  /* Defines product id that has to be updated */
  id: Option[String] = None,
  /* Defines product model that has to be updated */
  model: Option[String] = None,
  /* Defines product's old price */
  oldPrice: Option[BigDecimal] = None,
  /* Defines new product's price */
  price: Option[BigDecimal] = None,
  /* Defines new product's special price */
  specialPrice: Option[BigDecimal] = None,
  /* Defines the date of special price creation */
  spriceCreate: Option[String] = None,
  /* Defines the term of special price offer duration */
  spriceExpire: Option[String] = None,
  /* Defines new product's cost price */
  costPrice: Option[BigDecimal] = None,
  /* Specifies product's fixed cost shipping price */
  fixedCostShippingPrice: Option[BigDecimal] = None,
  /* Defines new product's retail price */
  retailPrice: Option[BigDecimal] = None,
  /* Defines new product's quantity */
  quantity: Option[BigDecimal] = None,
  /* Specifies the set of visible/invisible products for users */
  availableForView: Option[Boolean] = None,
  /* Weight */
  weight: Option[BigDecimal] = None,
  /* Weight Unit */
  weightUnit: Option[String] = None,
  /* Weight Unit */
  dimensionsUnit: Option[String] = None,
  /* Defines the incremental changes in product quantity */
  increaseQuantity: Option[BigDecimal] = None,
  /* Defines the decrement changes in product quantity */
  reduceQuantity: Option[BigDecimal] = None,
  /* This parameter is used for selecting a warehouse where you need to set/modify a product quantity. */
  warehouseId: Option[String] = None,
  /* This parameter allows to reserve/unreserve product quantity. */
  reserveQuantity: Option[BigDecimal] = None,
  /* Defines inventory tracking for product */
  manageStock: Option[Boolean] = None,
  /* Set backorder status */
  backorderStatus: Option[String] = None,
  /* Defines product's name that has to be updated */
  name: Option[String] = None,
  /* Defines new product's sku */
  sku: Option[String] = None,
  /* Set visibility status */
  visible: Option[String] = None,
  /* Defines product's manufacturer */
  manufacturer: Option[String] = None,
  /* Defines product's manufacturer by manufacturer_id */
  manufacturerId: Option[String] = None,
  /* Defines product add that is specified by comma-separated categories id */
  categoriesIds: Option[String] = None,
  /* Defines product related products ids that has to be updated */
  relatedProductsIds: Option[String] = None,
  /* Defines product up-sell products ids that has to be updated */
  upSellProductsIds: Option[String] = None,
  /* Defines product cross-sells products ids that has to be updated */
  crossSellProductsIds: Option[String] = None,
  /* Defines new product's description */
  description: Option[String] = None,
  /* Defines short description */
  shortDescription: Option[String] = None,
  /* Defines unique meta title for each entity */
  metaTitle: Option[String] = None,
  /* Defines unique meta keywords for each entity */
  metaKeywords: Option[String] = None,
  /* Defines unique meta description of a entity */
  metaDescription: Option[String] = None,
  /* Defines store id where the product should be found */
  storeId: Option[String] = None,
  /* Language id */
  langId: Option[String] = None,
  /* Set stock status */
  inStock: Option[Boolean] = None,
  /* Defines product's status */
  status: Option[String] = None,
  /* Defines unique URL for SEO */
  seoUrl: Option[String] = None,
  /* Report request id */
  reportRequestId: Option[String] = None,
  /* Disable report cache for current request */
  disableReportCache: Option[Boolean] = None,
  /* Is reindex required */
  reindex: Option[Boolean] = None,
  /* Product tags */
  tags: Option[String] = None,
  /* Is cache clear required */
  clearCache: Option[Boolean] = None,
  /* Global Trade Item Number. An GTIN is an identifier for trade items. */
  gtin: Option[String] = None,
  /* Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products. */
  upc: Option[String] = None,
  /* Manufacturer Part Number. A MPN is an identifier of a particular part design or material used. */
  mpn: Option[String] = None,
  /* European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products. */
  ean: Option[String] = None,
  /* International Standard Book Number. An ISBN is a unique identifier for books. */
  isbn: Option[String] = None,
  /* Specifies whether a tax is charged */
  taxable: Option[Boolean] = None,
  /* A categorization for the product */
  productClass: Option[String] = None,
  /* Defines product's height */
  height: Option[BigDecimal] = None,
  /* Defines product's length */
  length: Option[BigDecimal] = None,
  /* Defines product's width */
  width: Option[BigDecimal] = None,
  /* Harmonized System Code. An HSC is a 6-digit identifier that allows participating countries to classify traded goods on a common basis for customs purposes */
  harmonizedSystemCode: Option[String] = None,
  /* The country where the inventory item was made */
  countryOfOrigin: Option[String] = None,
  /* Defines unique search keywords */
  searchKeywords: Option[String] = None,
  /* A barcode is a unique code composed of numbers used as a product identifier. */
  barcode: Option[String] = None,
  /* Defines whether the product is virtual */
  isVirtual: Option[Boolean] = None,
  /* Specifies product free shipping flag that has to be updated */
  isFreeShipping: Option[Boolean] = None,
  /* Defines reserve price value */
  reservePrice: Option[BigDecimal] = None,
  /* Defines buy it now value */
  buyitnowPrice: Option[BigDecimal] = None,
  /* Allows to schedule a time in the future that the item becomes available. The value should be greater than the current date and time. */
  availFrom: Option[String] = None,
  /* Defines tax classes where entity has to be added */
  taxClassId: Option[String] = None,
  /* Defines product's type */
  `type`: Option[String] = None,
  /* Defines category's visibility status */
  avail: Option[Boolean] = None,
  /* The delivery promise that applies to offer */
  deliveryCode: Option[String] = None,
  /* Disable or enable check process status. Please note that the response will be slower due to additional requests to the store. */
  checkProcessStatus: Option[Boolean] = None,
  packageDetails: Option[ProductAddPackageDetails] = None,
  /* Assign product to the stores that is specified by comma-separated stores' id */
  storesIds: Option[String] = None,
  manufacturerInfo: Option[ProductAddManufacturerInfo] = None,
  /* Defines product production partner ids that has to be updated */
  productionPartnerIds: Option[String] = None,
  /* The numeric ID of the shipping template associated with the products in Etsy. You can find possible values in the \"cart.info\" API method response, in the field shipping_zones[]->id. */
  shippingTemplateId: Option[Int] = None,
  /* An enumerated string for the era in which the maker made the product. */
  whenMade: Option[String] = None,
  /* If true, it indicates the product as a supply, otherwise it indicates that it is a finished product. */
  isSupply: Option[Boolean] = None,
  /* Defines whether the product is downloadable */
  downloadable: Option[Boolean] = None,
  /* A list of material strings for materials used in the product. */
  materials: Option[Seq[String]] = None,
  /* When true, automatically renews a listing upon its expiration. */
  autoRenew: Option[Boolean] = None
) extends ApiModel


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
package org.openapitools.client.api

import org.openapitools.client.model.ModelResponseMarketplaceProductFind
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object MarketplaceApi {

  def apply(baseUrl: String = "https://api.api2cart.com/v1.1") = new MarketplaceApi(baseUrl)
}

class MarketplaceApi(baseUrl: String) {

  /**
   * Search product in global catalog.
   * 
   * Expected answers:
   *   code 200 : ModelResponseMarketplaceProductFind (successful operation)
   * 
   * Available security schemes:
   *   StoreKeyAuth (apiKey)
   *   ApiKeyAuth (apiKey)
   * 
   * @param storeId Store Id
   * @param count This parameter sets the entity amount that has to be retrieved. Max allowed count=250
   * @param pageCursor Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
   * @param categoriesIds Defines product add that is specified by comma-separated categories id
   * @param keyword Defines search keyword
   * @param asin Amazon Standard Identification Number.
   * @param ean European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products.
   * @param gtin Global Trade Item Number. An GTIN is an identifier for trade items.
   * @param upc Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products.
   * @param mpn Manufacturer Part Number. A MPN is an identifier of a particular part design or material used.
   * @param isbn International Standard Book Number. An ISBN is a unique identifier for books.
   * @param params Set this parameter in order to choose which entity fields you want to retrieve
   * @param exclude Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
   * @param responseFields Set this parameter in order to choose which entity fields you want to retrieve
   */
  def marketplaceProductFind(storeId: Option[String] = None, count: Option[Int] = None, pageCursor: Option[String] = None, categoriesIds: Option[String] = None, keyword: Option[String] = None, asin: Option[String] = None, ean: Option[String] = None, gtin: Option[String] = None, upc: Option[String] = None, mpn: Option[String] = None, isbn: Option[String] = None, params: Option[String] = None, exclude: Option[String] = None, responseFields: Option[String] = None)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[ModelResponseMarketplaceProductFind] =
    ApiRequest[ModelResponseMarketplaceProductFind](ApiMethods.GET, baseUrl, "/marketplace.product.find.json", "application/json")
      .withApiKey(apiKey, "x-store-key", HEADER)
      .withApiKey(apiKey, "x-api-key", HEADER)
      .withQueryParam("store_id", storeId)
      .withQueryParam("count", count)
      .withQueryParam("page_cursor", pageCursor)
      .withQueryParam("categories_ids", categoriesIds)
      .withQueryParam("keyword", keyword)
      .withQueryParam("asin", asin)
      .withQueryParam("ean", ean)
      .withQueryParam("gtin", gtin)
      .withQueryParam("upc", upc)
      .withQueryParam("mpn", mpn)
      .withQueryParam("isbn", isbn)
      .withQueryParam("params", params)
      .withQueryParam("exclude", exclude)
      .withQueryParam("response_fields", responseFields)
      .withSuccessResponse[ModelResponseMarketplaceProductFind](200)
      



}


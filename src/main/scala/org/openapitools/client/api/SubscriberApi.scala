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

import org.openapitools.client.model.ModelResponseSubscriberList
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object SubscriberApi {

  def apply(baseUrl: String = "https://api.api2cart.com/v1.1") = new SubscriberApi(baseUrl)
}

class SubscriberApi(baseUrl: String) {

  /**
   * Get subscribers list
   * 
   * Expected answers:
   *   code 200 : ModelResponseSubscriberList (successful operation)
   * 
   * Available security schemes:
   *   StoreKeyAuth (apiKey)
   *   ApiKeyAuth (apiKey)
   * 
   * @param start This parameter sets the number from which you want to get entities
   * @param count This parameter sets the entity amount that has to be retrieved. Max allowed count=250
   * @param subscribed Filter by subscription status
   * @param storeId Store Id
   * @param email Filter subscribers by email
   * @param params Set this parameter in order to choose which entity fields you want to retrieve
   * @param exclude Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
   * @param createdFrom Retrieve entities from their creation date
   * @param createdTo Retrieve entities to their creation date
   * @param modifiedFrom Retrieve entities from their modification date
   * @param modifiedTo Retrieve entities to their modification date
   * @param pageCursor Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
   * @param responseFields Set this parameter in order to choose which entity fields you want to retrieve
   */
  def subscriberList(start: Option[Int] = None, count: Option[Int] = None, subscribed: Option[Boolean] = None, storeId: Option[String] = None, email: Option[String] = None, params: Option[String] = None, exclude: Option[String] = None, createdFrom: Option[String] = None, createdTo: Option[String] = None, modifiedFrom: Option[String] = None, modifiedTo: Option[String] = None, pageCursor: Option[String] = None, responseFields: Option[String] = None)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[ModelResponseSubscriberList] =
    ApiRequest[ModelResponseSubscriberList](ApiMethods.GET, baseUrl, "/subscriber.list.json", "application/json")
      .withApiKey(apiKey, "x-store-key", HEADER)
      .withApiKey(apiKey, "x-api-key", HEADER)
      .withQueryParam("start", start)
      .withQueryParam("count", count)
      .withQueryParam("subscribed", subscribed)
      .withQueryParam("store_id", storeId)
      .withQueryParam("email", email)
      .withQueryParam("params", params)
      .withQueryParam("exclude", exclude)
      .withQueryParam("created_from", createdFrom)
      .withQueryParam("created_to", createdTo)
      .withQueryParam("modified_from", modifiedFrom)
      .withQueryParam("modified_to", modifiedTo)
      .withQueryParam("page_cursor", pageCursor)
      .withQueryParam("response_fields", responseFields)
      .withSuccessResponse[ModelResponseSubscriberList](200)
      



}


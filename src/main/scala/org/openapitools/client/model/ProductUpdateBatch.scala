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

case class ProductUpdateBatch (
  /*  Determines how updates to nested items should be handled.<hr><div style=\"font-style:normal\">  Values description:  <div style=\"margin-left: 2%; padding-top: 2%\">    <div style=\"font-size:85%\">      <b>  replace</b>: This option indicates that the nested items should be completely replaced with the new data provided. </br>      <b>  merge</b>: With this option, updates to nested items are merged with the existing data. </br>    </div>  </div></div> */
  nestedItemsUpdateBehaviour: Option[ProductUpdateBatchEnums.NestedItemsUpdateBehaviour] = None,
  clearCache: Option[Boolean] = None,
  reindex: Option[Boolean] = None,
  /* Contains an array of product objects. The list of properties may vary depending on the specific platform. */
  payload: Seq[ProductUpdateBatchPayloadInner]
) extends ApiModel

object ProductUpdateBatchEnums {

  type NestedItemsUpdateBehaviour = NestedItemsUpdateBehaviour.Value
  object NestedItemsUpdateBehaviour extends Enumeration {
    val Replace = Value("replace")
    val Merge = Value("merge")
  }

}

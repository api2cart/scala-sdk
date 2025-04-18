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

case class BatchJobResult (
  jobId: Option[Int] = None,
  jobName: Option[String] = None,
  itemsProcessed: Option[Int] = None,
  itemsSucceed: Option[Int] = None,
  items: Option[Seq[BatchJobResultItem]] = None,
  additionalFields: Option[Any] = None,
  customFields: Option[Any] = None
) extends ApiModel


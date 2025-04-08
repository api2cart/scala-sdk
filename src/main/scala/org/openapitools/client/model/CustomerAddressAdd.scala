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

case class CustomerAddressAdd (
  /* Defines customer id */
  customerId: String,
  /* Store Id */
  storeId: Option[String] = None,
  /* Defines customer's address first name */
  firstName: Option[String] = None,
  /* Defines customer's address last name */
  lastName: Option[String] = None,
  /* Defines customer's address company */
  company: Option[String] = None,
  /* Specifies customer's address address1 */
  address1: String,
  /* Specifies customer's address address2 */
  address2: Option[String] = None,
  /* Specifies customer's address city */
  city: String,
  /* Specifies customer's address ISO code or name of country */
  country: String,
  /* Specifies customer's address ISO code or name of state */
  state: Option[String] = None,
  /* Specifies customer's address postcode */
  postcode: String,
  /* Specifies the national ID card number of this person, or a unique tax identification number for customer's address */
  identificationNumber: Option[String] = None,
  /* Specifies customer's address types */
  types: Option[Seq[String]] = None,
  /* Specifies whether the customer's address is used by default */
  default: Option[Boolean] = None,
  /* Defines customer's address phone number */
  phone: Option[String] = None,
  /* Defines customer's address mobile phone number */
  phoneMobile: Option[String] = None,
  /* Defines customer's address fax */
  fax: Option[String] = None,
  /* Defines Link to customer's address website */
  website: Option[String] = None,
  /* Defines customer's address gender */
  gender: Option[String] = None,
  /* Add Tax Id */
  taxId: Option[String] = None,
  /* Specifies customer's alias in the address book */
  alias: Option[String] = None
) extends ApiModel


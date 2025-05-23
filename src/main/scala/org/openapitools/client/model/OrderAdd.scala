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

case class OrderAdd (
  /* Defines order's id */
  id: Option[String] = None,
  /* Defines the order id if it is supported by the cart */
  orderId: Option[String] = None,
  /* Defines store id where the order should be assigned */
  storeId: Option[String] = None,
  /* Channel ID */
  channelId: Option[String] = None,
  /* Defines order status. */
  orderStatus: String,
  /* Create order with fulfillment status */
  fulfillmentStatus: Option[String] = None,
  /* Create order with financial status */
  financialStatus: Option[String] = None,
  /* Defines the customer specified by email for whom order has to be created */
  customerEmail: String,
  /* Specifies customer's first name */
  customerFirstName: Option[String] = None,
  /* Specifies customer’s last name */
  customerLastName: Option[String] = None,
  /* Specifies customer’s phone */
  customerPhone: Option[String] = None,
  /* Specifies customer's address ISO code or name of country */
  customerCountry: Option[String] = None,
  /* Specifies customer’s birthday */
  customerBirthday: Option[String] = None,
  /* Specifies customer’s fax */
  customerFax: Option[String] = None,
  /* Defines order payment method.<br/>Setting order_payment_method on Shopify will also change financial_status field value to 'paid' */
  orderPaymentMethod: Option[String] = None,
  /* Payment transaction id */
  transactionId: Option[String] = None,
  /* Currency code of order */
  currency: Option[String] = None,
  /* Specifies an order creation date in format Y-m-d H:i:s */
  date: Option[String] = None,
  /* Specifies order's  modification date */
  dateModified: Option[String] = None,
  /* Specifies order's  finished date */
  dateFinished: Option[String] = None,
  /* Specifies billing first name */
  billFirstName: String,
  /* Specifies billing last name */
  billLastName: String,
  /* Specifies first billing address */
  billAddress1: String,
  /* Specifies second billing address */
  billAddress2: Option[String] = None,
  /* Specifies billing city */
  billCity: String,
  /* Specifies billing postcode */
  billPostcode: String,
  /* Specifies billing state code */
  billState: String,
  /* Specifies billing country code */
  billCountry: String,
  /* Specifies billing company */
  billCompany: Option[String] = None,
  /* Specifies billing phone */
  billPhone: Option[String] = None,
  /* Specifies billing fax */
  billFax: Option[String] = None,
  /* Specifies shipping first name */
  shippFirstName: Option[String] = None,
  /* Specifies shipping last name */
  shippLastName: Option[String] = None,
  /* Specifies first shipping address */
  shippAddress1: Option[String] = None,
  /* Specifies second address line of a shipping street address */
  shippAddress2: Option[String] = None,
  /* Specifies shipping city */
  shippCity: Option[String] = None,
  /* Specifies shipping postcode */
  shippPostcode: Option[String] = None,
  /* Specifies shipping state code */
  shippState: Option[String] = None,
  /* Specifies shipping country code */
  shippCountry: Option[String] = None,
  /* Specifies shipping company */
  shippCompany: Option[String] = None,
  /* Specifies shipping phone */
  shippPhone: Option[String] = None,
  /* Specifies shipping fax */
  shippFax: Option[String] = None,
  /* Total price of all ordered products multiplied by their number, excluding tax, shipping price and discounts */
  subtotalPrice: Option[BigDecimal] = None,
  /* The value of tax cost for order */
  taxPrice: Option[BigDecimal] = None,
  /* Defines order's total price */
  totalPrice: Option[BigDecimal] = None,
  /* Defines total paid amount for the order */
  totalPaid: Option[BigDecimal] = None,
  /* Defines the sum of all line item weights in grams for the order */
  totalWeight: Option[Int] = None,
  /* Indicates whether prices and subtotal includes tax. */
  pricesIncTax: Option[Boolean] = None,
  /* Specifies order's shipping price */
  shippingPrice: Option[BigDecimal] = None,
  /* Specifies order's shipping price tax */
  shippingTax: Option[BigDecimal] = None,
  /* Specifies order's discount */
  discount: Option[BigDecimal] = None,
  /* Specifies order's coupon discount */
  couponDiscount: Option[BigDecimal] = None,
  /* Discounts for order with gift certificates */
  giftCertificateDiscount: Option[BigDecimal] = None,
  /* Defines order shipping method */
  orderShippingMethod: Option[String] = None,
  /* Defines tracking carrier id */
  carrierId: Option[String] = None,
  /* This parameter is used for selecting a warehouse where you need to set/modify a product quantity. */
  warehouseId: Option[String] = None,
  /* Coupons that will be applied to order */
  coupons: Option[Seq[String]] = None,
  /* Order tags */
  tags: Option[String] = None,
  /* Specifies order comment */
  comment: Option[String] = None,
  /* Specifies admin's order comment */
  adminComment: Option[String] = None,
  /* Specifies private admin's order comment */
  adminPrivateComment: Option[String] = None,
  /* Send notifications to customer after order was created */
  sendNotifications: Option[Boolean] = None,
  /* Notify admin when new order was created. */
  sendAdminNotifications: Option[Boolean] = None,
  /* Identifying the system used to generate the order */
  externalSource: Option[String] = None,
  /* The behaviour to use when updating inventory.<hr><div style=\"font-style:normal\">Values description:<div style=\"margin-left: 2%; padding-top: 2%\"><div style=\"font-size:85%\"><b>bypass</b> = Do not claim inventory </br></br><b>decrement_ignoring_policy</b> = Ignore the product's </br> inventory policy and claim amounts</br></br><b>decrement_obeying_policy</b> =  Obey the product's </br> inventory policy.</br></br></div></div></div> */
  inventoryBehaviour: Option[String] = None,
  /* Defines whether the invoice is created automatically along with the order */
  createInvoice: Option[Boolean] = None,
  /* Defines note attributes */
  noteAttributes: Option[Seq[OrderAddNoteAttributesInner]] = None,
  /* Is cache clear required */
  clearCache: Option[Boolean] = None,
  /* The source of the order */
  origin: Option[String] = None,
  orderItem: Seq[OrderAddOrderItemInner]
) extends ApiModel


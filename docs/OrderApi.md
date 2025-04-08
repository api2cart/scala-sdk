# OrderApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderAbandonedList**](OrderApi.md#orderAbandonedList) | **GET** /order.abandoned.list.json | order.abandoned.list
[**orderAbandonedListWithHttpInfo**](OrderApi.md#orderAbandonedListWithHttpInfo) | **GET** /order.abandoned.list.json | order.abandoned.list
[**orderAdd**](OrderApi.md#orderAdd) | **POST** /order.add.json | order.add
[**orderAddWithHttpInfo**](OrderApi.md#orderAddWithHttpInfo) | **POST** /order.add.json | order.add
[**orderCount**](OrderApi.md#orderCount) | **GET** /order.count.json | order.count
[**orderCountWithHttpInfo**](OrderApi.md#orderCountWithHttpInfo) | **GET** /order.count.json | order.count
[**orderFinancialStatusList**](OrderApi.md#orderFinancialStatusList) | **GET** /order.financial_status.list.json | order.financial_status.list
[**orderFinancialStatusListWithHttpInfo**](OrderApi.md#orderFinancialStatusListWithHttpInfo) | **GET** /order.financial_status.list.json | order.financial_status.list
[**orderFind**](OrderApi.md#orderFind) | **GET** /order.find.json | order.find
[**orderFindWithHttpInfo**](OrderApi.md#orderFindWithHttpInfo) | **GET** /order.find.json | order.find
[**orderFulfillmentStatusList**](OrderApi.md#orderFulfillmentStatusList) | **GET** /order.fulfillment_status.list.json | order.fulfillment_status.list
[**orderFulfillmentStatusListWithHttpInfo**](OrderApi.md#orderFulfillmentStatusListWithHttpInfo) | **GET** /order.fulfillment_status.list.json | order.fulfillment_status.list
[**orderInfo**](OrderApi.md#orderInfo) | **GET** /order.info.json | order.info
[**orderInfoWithHttpInfo**](OrderApi.md#orderInfoWithHttpInfo) | **GET** /order.info.json | order.info
[**orderList**](OrderApi.md#orderList) | **GET** /order.list.json | order.list
[**orderListWithHttpInfo**](OrderApi.md#orderListWithHttpInfo) | **GET** /order.list.json | order.list
[**orderPreestimateShippingList**](OrderApi.md#orderPreestimateShippingList) | **POST** /order.preestimate_shipping.list.json | order.preestimate_shipping.list
[**orderPreestimateShippingListWithHttpInfo**](OrderApi.md#orderPreestimateShippingListWithHttpInfo) | **POST** /order.preestimate_shipping.list.json | order.preestimate_shipping.list
[**orderRefundAdd**](OrderApi.md#orderRefundAdd) | **POST** /order.refund.add.json | order.refund.add
[**orderRefundAddWithHttpInfo**](OrderApi.md#orderRefundAddWithHttpInfo) | **POST** /order.refund.add.json | order.refund.add
[**orderReturnAdd**](OrderApi.md#orderReturnAdd) | **POST** /order.return.add.json | order.return.add
[**orderReturnAddWithHttpInfo**](OrderApi.md#orderReturnAddWithHttpInfo) | **POST** /order.return.add.json | order.return.add
[**orderReturnDelete**](OrderApi.md#orderReturnDelete) | **DELETE** /order.return.delete.json | order.return.delete
[**orderReturnDeleteWithHttpInfo**](OrderApi.md#orderReturnDeleteWithHttpInfo) | **DELETE** /order.return.delete.json | order.return.delete
[**orderReturnUpdate**](OrderApi.md#orderReturnUpdate) | **PUT** /order.return.update.json | order.return.update
[**orderReturnUpdateWithHttpInfo**](OrderApi.md#orderReturnUpdateWithHttpInfo) | **PUT** /order.return.update.json | order.return.update
[**orderShipmentAdd**](OrderApi.md#orderShipmentAdd) | **POST** /order.shipment.add.json | order.shipment.add
[**orderShipmentAddWithHttpInfo**](OrderApi.md#orderShipmentAddWithHttpInfo) | **POST** /order.shipment.add.json | order.shipment.add
[**orderShipmentAddBatch**](OrderApi.md#orderShipmentAddBatch) | **POST** /order.shipment.add.batch.json | order.shipment.add.batch
[**orderShipmentAddBatchWithHttpInfo**](OrderApi.md#orderShipmentAddBatchWithHttpInfo) | **POST** /order.shipment.add.batch.json | order.shipment.add.batch
[**orderShipmentDelete**](OrderApi.md#orderShipmentDelete) | **DELETE** /order.shipment.delete.json | order.shipment.delete
[**orderShipmentDeleteWithHttpInfo**](OrderApi.md#orderShipmentDeleteWithHttpInfo) | **DELETE** /order.shipment.delete.json | order.shipment.delete
[**orderShipmentInfo**](OrderApi.md#orderShipmentInfo) | **GET** /order.shipment.info.json | order.shipment.info
[**orderShipmentInfoWithHttpInfo**](OrderApi.md#orderShipmentInfoWithHttpInfo) | **GET** /order.shipment.info.json | order.shipment.info
[**orderShipmentList**](OrderApi.md#orderShipmentList) | **GET** /order.shipment.list.json | order.shipment.list
[**orderShipmentListWithHttpInfo**](OrderApi.md#orderShipmentListWithHttpInfo) | **GET** /order.shipment.list.json | order.shipment.list
[**orderShipmentTrackingAdd**](OrderApi.md#orderShipmentTrackingAdd) | **POST** /order.shipment.tracking.add.json | order.shipment.tracking.add
[**orderShipmentTrackingAddWithHttpInfo**](OrderApi.md#orderShipmentTrackingAddWithHttpInfo) | **POST** /order.shipment.tracking.add.json | order.shipment.tracking.add
[**orderShipmentUpdate**](OrderApi.md#orderShipmentUpdate) | **PUT** /order.shipment.update.json | order.shipment.update
[**orderShipmentUpdateWithHttpInfo**](OrderApi.md#orderShipmentUpdateWithHttpInfo) | **PUT** /order.shipment.update.json | order.shipment.update
[**orderStatusList**](OrderApi.md#orderStatusList) | **GET** /order.status.list.json | order.status.list
[**orderStatusListWithHttpInfo**](OrderApi.md#orderStatusListWithHttpInfo) | **GET** /order.status.list.json | order.status.list
[**orderTransactionList**](OrderApi.md#orderTransactionList) | **GET** /order.transaction.list.json | order.transaction.list
[**orderTransactionListWithHttpInfo**](OrderApi.md#orderTransactionListWithHttpInfo) | **GET** /order.transaction.list.json | order.transaction.list
[**orderUpdate**](OrderApi.md#orderUpdate) | **PUT** /order.update.json | order.update
[**orderUpdateWithHttpInfo**](OrderApi.md#orderUpdateWithHttpInfo) | **PUT** /order.update.json | order.update



## orderAbandonedList

> orderAbandonedList(orderAbandonedListRequest): ApiRequest[ModelResponseOrderAbandonedList]

order.abandoned.list

Get list of orders that were left by customers before completing the order.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val customerId: String = 5 // String | Retrieves orders specified by customer id

    val customerEmail: String = jubari@hannsgroup.com // String | Retrieves orders specified by customer email

    val createdTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their creation date

    val createdFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their creation date

    val modifiedTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their modification date

    val modifiedFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their modification date

    val skipEmptyEmail: Boolean = true // Boolean | Filter empty emails

    val storeId: String = 1 // String | Store Id

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val params: String = force_all // String | Set this parameter in order to choose which entity fields you want to retrieve

    val responseFields: String = {return_code,pagination,result{order{id,customer{email},created_at,totals{total},order_products}}} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = customer // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
    
    val request = apiInstance.orderAbandonedList(customerId, customerEmail, createdTo, createdFrom, modifiedTo, modifiedFrom, skipEmptyEmail, storeId, pageCursor, count, start, params, responseFields, exclude)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderAbandonedList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderAbandonedList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Retrieves orders specified by customer id | [optional]
 **customerEmail** | **String**| Retrieves orders specified by customer email | [optional]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional]
 **skipEmptyEmail** | **Boolean**| Filter empty emails | [optional]
 **storeId** | **String**| Store Id | [optional]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]

### Return type

ApiRequest[[**ModelResponseOrderAbandonedList**](ModelResponseOrderAbandonedList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderAdd

> orderAdd(orderAddRequest): ApiRequest[OrderAdd200Response]

order.add

Add a new order to the cart.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val orderAdd: OrderAdd =  // OrderAdd | 
    
    val request = apiInstance.orderAdd(orderAdd)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderAdd** | [**OrderAdd**](OrderAdd.md)|  |

### Return type

ApiRequest[[**OrderAdd200Response**](OrderAdd200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderCount

> orderCount(orderCountRequest): ApiRequest[OrderCount200Response]

order.count

Count orders in store

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val customerId: String = 5 // String | Counts orders quantity specified by customer id

    val customerEmail: String = jubari@hannsgroup.com // String | Counts orders quantity specified by customer email

    val orderStatus: String = Completed // String | Counts orders quantity specified by order status

    val orderStatusIds: Seq[String] =  // Seq[String] | Retrieves orders specified by order statuses

    val createdTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their creation date

    val createdFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their creation date

    val modifiedTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their modification date

    val modifiedFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their modification date

    val storeId: String = 1 // String | Counts orders quantity specified by store id

    val ids: String = 24,25 // String | Counts orders specified by ids

    val orderIds: String = 24,25 // String | Counts orders specified by order ids

    val ebayOrderStatus: String = Active // String | Counts orders quantity specified by order status

    val financialStatus: String = paid // String | Counts orders quantity specified by financial status

    val financialStatusIds: Seq[String] =  // Seq[String] | Retrieves orders count specified by financial status ids

    val fulfillmentChannel: String = local // String | Retrieves order with a fulfillment channel

    val fulfillmentStatus: String = fulfilled // String | Create order with fulfillment status

    val shippingMethod: String = flatrate_flatrate // String | Retrieve entities according to shipping method

    val deliveryMethod: String = local // String | Retrieves order with delivery method

    val tags: String = tag1,tag2 // String | Order tags

    val shipNodeType: String = SellerFulfilled // String | Retrieves order with ship node type
    
    val request = apiInstance.orderCount(customerId, customerEmail, orderStatus, orderStatusIds, createdTo, createdFrom, modifiedTo, modifiedFrom, storeId, ids, orderIds, ebayOrderStatus, financialStatus, financialStatusIds, fulfillmentChannel, fulfillmentStatus, shippingMethod, deliveryMethod, tags, shipNodeType)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderCount")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderCount")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Counts orders quantity specified by customer id | [optional]
 **customerEmail** | **String**| Counts orders quantity specified by customer email | [optional]
 **orderStatus** | **String**| Counts orders quantity specified by order status | [optional]
 **orderStatusIds** | [**Seq[String]**](String.md)| Retrieves orders specified by order statuses | [optional]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional]
 **storeId** | **String**| Counts orders quantity specified by store id | [optional]
 **ids** | **String**| Counts orders specified by ids | [optional]
 **orderIds** | **String**| Counts orders specified by order ids | [optional]
 **ebayOrderStatus** | **String**| Counts orders quantity specified by order status | [optional]
 **financialStatus** | **String**| Counts orders quantity specified by financial status | [optional]
 **financialStatusIds** | [**Seq[String]**](String.md)| Retrieves orders count specified by financial status ids | [optional]
 **fulfillmentChannel** | **String**| Retrieves order with a fulfillment channel | [optional]
 **fulfillmentStatus** | **String**| Create order with fulfillment status | [optional]
 **shippingMethod** | **String**| Retrieve entities according to shipping method | [optional]
 **deliveryMethod** | **String**| Retrieves order with delivery method | [optional]
 **tags** | **String**| Order tags | [optional]
 **shipNodeType** | **String**| Retrieves order with ship node type | [optional]

### Return type

ApiRequest[[**OrderCount200Response**](OrderCount200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderFinancialStatusList

> orderFinancialStatusList(): ApiRequest[OrderFinancialStatusList200Response]

order.financial_status.list

Retrieve list of financial statuses

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")    
    val request = apiInstance.orderFinancialStatusList()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderFinancialStatusList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderFinancialStatusList")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**OrderFinancialStatusList200Response**](OrderFinancialStatusList200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderFind

> orderFind(orderFindRequest): ApiRequest[OrderFind200Response]

order.find

This method is deprecated and won&#39;t be supported in the future. Please use \&quot;order.list\&quot; instead.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val customerId: String = 5 // String | Retrieves orders specified by customer id

    val customerEmail: String = jubari@hannsgroup.com // String | Retrieves orders specified by customer email

    val orderStatus: String = Completed // String | Retrieves orders specified by order status

    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val params: String = order_id,totals,status // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = order_id,totals,status // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all

    val createdTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their creation date

    val createdFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their creation date

    val modifiedTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their modification date

    val modifiedFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their modification date

    val financialStatus: String = paid // String | Retrieves orders specified by financial status
    
    val request = apiInstance.orderFind(customerId, customerEmail, orderStatus, start, count, params, exclude, createdTo, createdFrom, modifiedTo, modifiedFrom, financialStatus)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderFind")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderFind")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Retrieves orders specified by customer id | [optional]
 **customerEmail** | **String**| Retrieves orders specified by customer email | [optional]
 **orderStatus** | **String**| Retrieves orders specified by order status | [optional]
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional]
 **financialStatus** | **String**| Retrieves orders specified by financial status | [optional]

### Return type

ApiRequest[[**OrderFind200Response**](OrderFind200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderFulfillmentStatusList

> orderFulfillmentStatusList(orderFulfillmentStatusListRequest): ApiRequest[OrderFulfillmentStatusList200Response]

order.fulfillment_status.list

Retrieve list of fulfillment statuses

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val action: String = add // String | Available statuses for the specified action.
    
    val request = apiInstance.orderFulfillmentStatusList(action)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderFulfillmentStatusList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderFulfillmentStatusList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**| Available statuses for the specified action. | [optional]

### Return type

ApiRequest[[**OrderFulfillmentStatusList200Response**](OrderFulfillmentStatusList200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderInfo

> orderInfo(orderInfoRequest): ApiRequest[OrderInfo200Response]

order.info

Info about a specific order by ID

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val orderId: String = 25 // String | Retrieves order’s info specified by order id

    val id: String = 10 // String | Retrieves order info specified by id

    val params: String = order_id,totals,status // String | Set this parameter in order to choose which entity fields you want to retrieve

    val responseFields: String = {result{order_id,customer,totals,address,items,bundles,status}} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = order_id,totals,status // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all

    val storeId: String = 1 // String | Defines store id where the order should be found

    val enableCache: Boolean = true // Boolean | If the value is 'true' and order exist in our cache, we will return order.info response from cache

    val useLatestApiVersion: Boolean = true // Boolean | Use the latest platform API version
    
    val request = apiInstance.orderInfo(orderId, id, params, responseFields, exclude, storeId, enableCache, useLatestApiVersion)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderInfo")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderInfo")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Retrieves order’s info specified by order id | [optional]
 **id** | **String**| Retrieves order info specified by id | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]
 **storeId** | **String**| Defines store id where the order should be found | [optional]
 **enableCache** | **Boolean**| If the value is &#39;true&#39; and order exist in our cache, we will return order.info response from cache | [optional]
 **useLatestApiVersion** | **Boolean**| Use the latest platform API version | [optional]

### Return type

ApiRequest[[**OrderInfo200Response**](OrderInfo200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderList

> orderList(orderListRequest): ApiRequest[ModelResponseOrderList]

order.list

Get list of orders from store.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val customerId: String = 5 // String | Retrieves orders specified by customer id

    val customerEmail: String = jubari@hannsgroup.com // String | Retrieves orders specified by customer email

    val phone: String = 56686868654 // String | Filter orders by customer's phone number

    val orderStatus: String = Completed // String | Retrieves orders specified by order status

    val orderStatusIds: Seq[String] =  // Seq[String] | Retrieves orders specified by order statuses

    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val pageCursor: String =  // String | Used to retrieve orders via cursor-based pagination (it can't be used with any other filtering parameter)

    val sortBy: String = modified_at // String | Set field to sort by

    val sortDirection: String = asc // String | Set sorting direction

    val params: String = order_id,totals,status // String | Set this parameter in order to choose which entity fields you want to retrieve

    val responseFields: String = {return_code,pagination,result{order{order_id,customer,totals,address,items,bundles,status}}} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = order_id,totals,status // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all

    val createdTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their creation date

    val createdFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their creation date

    val modifiedTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their modification date

    val modifiedFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their modification date

    val storeId: String = 1 // String | Store Id

    val ids: String = 24,25 // String | Retrieves orders specified by ids

    val orderIds: String = 24,25 // String | Retrieves orders specified by order ids

    val ebayOrderStatus: String = Active // String | Retrieves orders specified by order status

    val basketId: String = 1 // String | Retrieves order’s info specified by basket id.

    val financialStatus: String = paid // String | Retrieves orders specified by financial status

    val financialStatusIds: Seq[String] =  // Seq[String] | Retrieves orders specified by financial status ids

    val fulfillmentStatus: String = fulfilled // String | Create order with fulfillment status

    val fulfillmentChannel: String = local // String | Retrieves order with a fulfillment channel

    val shippingMethod: String = flatrate_flatrate // String | Retrieve entities according to shipping method

    val skipOrderIds: String = 24,25 // String | Skipped orders by ids

    val sinceId: String = 56 // String | Retrieve entities starting from the specified id.

    val isDeleted: Boolean = true // Boolean | Filter deleted orders

    val shippingCountryIso3: String = DEU // String | Retrieve entities according to shipping country

    val enableCache: Boolean = true // Boolean | If the value is 'true', we will cache orders for a 15 minutes in order to increase speed and reduce requests throttling for some methods and shoping platforms (for example order.shipment.add)

    val deliveryMethod: String = local // String | Retrieves order with delivery method

    val tags: String = tag1,tag2 // String | Order tags

    val shipNodeType: String = SellerFulfilled // String | Retrieves order with ship node type

    val currencyId: String = usd // String | Currency Id

    val returnStatus: String = RETURNED // String | Retrieves orders specified by return status

    val useLatestApiVersion: Boolean = true // Boolean | Use the latest platform API version
    
    val request = apiInstance.orderList(customerId, customerEmail, phone, orderStatus, orderStatusIds, start, count, pageCursor, sortBy, sortDirection, params, responseFields, exclude, createdTo, createdFrom, modifiedTo, modifiedFrom, storeId, ids, orderIds, ebayOrderStatus, basketId, financialStatus, financialStatusIds, fulfillmentStatus, fulfillmentChannel, shippingMethod, skipOrderIds, sinceId, isDeleted, shippingCountryIso3, enableCache, deliveryMethod, tags, shipNodeType, currencyId, returnStatus, useLatestApiVersion)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Retrieves orders specified by customer id | [optional]
 **customerEmail** | **String**| Retrieves orders specified by customer email | [optional]
 **phone** | **String**| Filter orders by customer&#39;s phone number | [optional]
 **orderStatus** | **String**| Retrieves orders specified by order status | [optional]
 **orderStatusIds** | [**Seq[String]**](String.md)| Retrieves orders specified by order statuses | [optional]
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **pageCursor** | **String**| Used to retrieve orders via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional]
 **sortBy** | **String**| Set field to sort by | [optional]
 **sortDirection** | **String**| Set sorting direction | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional]
 **storeId** | **String**| Store Id | [optional]
 **ids** | **String**| Retrieves orders specified by ids | [optional]
 **orderIds** | **String**| Retrieves orders specified by order ids | [optional]
 **ebayOrderStatus** | **String**| Retrieves orders specified by order status | [optional]
 **basketId** | **String**| Retrieves order’s info specified by basket id. | [optional]
 **financialStatus** | **String**| Retrieves orders specified by financial status | [optional]
 **financialStatusIds** | [**Seq[String]**](String.md)| Retrieves orders specified by financial status ids | [optional]
 **fulfillmentStatus** | **String**| Create order with fulfillment status | [optional]
 **fulfillmentChannel** | **String**| Retrieves order with a fulfillment channel | [optional]
 **shippingMethod** | **String**| Retrieve entities according to shipping method | [optional]
 **skipOrderIds** | **String**| Skipped orders by ids | [optional]
 **sinceId** | **String**| Retrieve entities starting from the specified id. | [optional]
 **isDeleted** | **Boolean**| Filter deleted orders | [optional]
 **shippingCountryIso3** | **String**| Retrieve entities according to shipping country | [optional]
 **enableCache** | **Boolean**| If the value is &#39;true&#39;, we will cache orders for a 15 minutes in order to increase speed and reduce requests throttling for some methods and shoping platforms (for example order.shipment.add) | [optional]
 **deliveryMethod** | **String**| Retrieves order with delivery method | [optional]
 **tags** | **String**| Order tags | [optional]
 **shipNodeType** | **String**| Retrieves order with ship node type | [optional]
 **currencyId** | **String**| Currency Id | [optional]
 **returnStatus** | **String**| Retrieves orders specified by return status | [optional]
 **useLatestApiVersion** | **Boolean**| Use the latest platform API version | [optional]

### Return type

ApiRequest[[**ModelResponseOrderList**](ModelResponseOrderList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderPreestimateShippingList

> orderPreestimateShippingList(orderPreestimateShippingListRequest): ApiRequest[ModelResponseOrderPreestimateShippingList]

order.preestimate_shipping.list

Retrieve list of order preestimated shipping methods

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val orderPreestimateShippingList: OrderPreestimateShippingList =  // OrderPreestimateShippingList | 
    
    val request = apiInstance.orderPreestimateShippingList(orderPreestimateShippingList)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderPreestimateShippingList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderPreestimateShippingList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderPreestimateShippingList** | [**OrderPreestimateShippingList**](OrderPreestimateShippingList.md)|  |

### Return type

ApiRequest[[**ModelResponseOrderPreestimateShippingList**](ModelResponseOrderPreestimateShippingList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderRefundAdd

> orderRefundAdd(orderRefundAddRequest): ApiRequest[OrderRefundAdd200Response]

order.refund.add

Add a refund to the order.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val orderRefundAdd: OrderRefundAdd =  // OrderRefundAdd | 
    
    val request = apiInstance.orderRefundAdd(orderRefundAdd)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderRefundAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderRefundAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRefundAdd** | [**OrderRefundAdd**](OrderRefundAdd.md)|  |

### Return type

ApiRequest[[**OrderRefundAdd200Response**](OrderRefundAdd200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderReturnAdd

> orderReturnAdd(orderReturnAddRequest): ApiRequest[OrderReturnAdd200Response]

order.return.add

Create new return request.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val orderReturnAdd: OrderReturnAdd =  // OrderReturnAdd | 
    
    val request = apiInstance.orderReturnAdd(orderReturnAdd)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderReturnAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderReturnAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderReturnAdd** | [**OrderReturnAdd**](OrderReturnAdd.md)|  |

### Return type

ApiRequest[[**OrderReturnAdd200Response**](OrderReturnAdd200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderReturnDelete

> orderReturnDelete(orderReturnDeleteRequest): ApiRequest[AttributeValueDelete200Response]

order.return.delete

Delete return.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val returnId: String = 200000002 // String | Return ID

    val orderId: String = 25 // String | Defines the order id

    val storeId: String = 1 // String | Store Id
    
    val request = apiInstance.orderReturnDelete(returnId, orderId, storeId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderReturnDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderReturnDelete")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnId** | **String**| Return ID |
 **orderId** | **String**| Defines the order id |
 **storeId** | **String**| Store Id | [optional]

### Return type

ApiRequest[[**AttributeValueDelete200Response**](AttributeValueDelete200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderReturnUpdate

> orderReturnUpdate(orderReturnUpdateRequest): ApiRequest[AccountConfigUpdate200Response]

order.return.update

Update order&#39;s shipment information.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val orderReturnUpdate: OrderReturnUpdate =  // OrderReturnUpdate | 
    
    val request = apiInstance.orderReturnUpdate(orderReturnUpdate)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderReturnUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderReturnUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderReturnUpdate** | [**OrderReturnUpdate**](OrderReturnUpdate.md)|  |

### Return type

ApiRequest[[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderShipmentAdd

> orderShipmentAdd(orderShipmentAddRequest): ApiRequest[OrderShipmentAdd200Response]

order.shipment.add

Add a shipment to the order.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val orderShipmentAdd: OrderShipmentAdd =  // OrderShipmentAdd | 
    
    val request = apiInstance.orderShipmentAdd(orderShipmentAdd)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderShipmentAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderShipmentAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderShipmentAdd** | [**OrderShipmentAdd**](OrderShipmentAdd.md)|  |

### Return type

ApiRequest[[**OrderShipmentAdd200Response**](OrderShipmentAdd200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderShipmentAddBatch

> orderShipmentAddBatch(orderShipmentAddBatchRequest): ApiRequest[CategoryAddBatch200Response]

order.shipment.add.batch

Add a shipments to the orders.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val orderShipmentAddBatch: OrderShipmentAddBatch =  // OrderShipmentAddBatch | 
    
    val request = apiInstance.orderShipmentAddBatch(orderShipmentAddBatch)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderShipmentAddBatch")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderShipmentAddBatch")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderShipmentAddBatch** | [**OrderShipmentAddBatch**](OrderShipmentAddBatch.md)|  |

### Return type

ApiRequest[[**CategoryAddBatch200Response**](CategoryAddBatch200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderShipmentDelete

> orderShipmentDelete(orderShipmentDeleteRequest): ApiRequest[OrderShipmentDelete200Response]

order.shipment.delete

Delete order&#39;s shipment.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val shipmentId: String = 200000002 // String | Shipment id indicates the number of delivery

    val orderId: String = 25 // String | Defines the order for which the shipment will be deleted

    val storeId: String = 1 // String | Store Id
    
    val request = apiInstance.orderShipmentDelete(shipmentId, orderId, storeId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderShipmentDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderShipmentDelete")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **String**| Shipment id indicates the number of delivery |
 **orderId** | **String**| Defines the order for which the shipment will be deleted |
 **storeId** | **String**| Store Id | [optional]

### Return type

ApiRequest[[**OrderShipmentDelete200Response**](OrderShipmentDelete200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderShipmentInfo

> orderShipmentInfo(orderShipmentInfoRequest): ApiRequest[OrderShipmentInfo200Response]

order.shipment.info

Get information of shipment.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val id: String = 10 // String | Entity id

    val orderId: String = 25 // String | Defines the order id

    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val params: String = id,model,price,images // String | Set this parameter in order to choose which entity fields you want to retrieve

    val responseFields: String = {result{id,order_id,shipment_provider,tracking_numbers{tracking_number},items{product_id,quantity}}} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = false // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all

    val storeId: String = 1 // String | Store Id
    
    val request = apiInstance.orderShipmentInfo(id, orderId, start, params, responseFields, exclude, storeId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderShipmentInfo")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderShipmentInfo")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id |
 **orderId** | **String**| Defines the order id |
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]
 **storeId** | **String**| Store Id | [optional]

### Return type

ApiRequest[[**OrderShipmentInfo200Response**](OrderShipmentInfo200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderShipmentList

> orderShipmentList(orderShipmentListRequest): ApiRequest[ModelResponseOrderShipmentList]

order.shipment.list

Get list of shipments by orders.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val orderId: String = 25 // String | Retrieves shipments specified by order id

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)

    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val params: String = id,model,price,images // String | Set this parameter in order to choose which entity fields you want to retrieve

    val responseFields: String = {status_code,pagination,result{shipment{id,order_id,shipment_provider,tracking_numbers{tracking_number},items{product_id,quantity}}}} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = false // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all

    val createdFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their creation date

    val createdTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their creation date

    val modifiedFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their modification date

    val modifiedTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their modification date

    val storeId: String = 1 // String | Store Id
    
    val request = apiInstance.orderShipmentList(orderId, pageCursor, start, count, params, responseFields, exclude, createdFrom, createdTo, modifiedFrom, modifiedTo, storeId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderShipmentList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderShipmentList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Retrieves shipments specified by order id |
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional]
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional]
 **storeId** | **String**| Store Id | [optional]

### Return type

ApiRequest[[**ModelResponseOrderShipmentList**](ModelResponseOrderShipmentList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderShipmentTrackingAdd

> orderShipmentTrackingAdd(orderShipmentTrackingAddRequest): ApiRequest[OrderShipmentTrackingAdd200Response]

order.shipment.tracking.add

Add order shipment&#39;s tracking info.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val orderShipmentTrackingAdd: OrderShipmentTrackingAdd =  // OrderShipmentTrackingAdd | 
    
    val request = apiInstance.orderShipmentTrackingAdd(orderShipmentTrackingAdd)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderShipmentTrackingAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderShipmentTrackingAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderShipmentTrackingAdd** | [**OrderShipmentTrackingAdd**](OrderShipmentTrackingAdd.md)|  |

### Return type

ApiRequest[[**OrderShipmentTrackingAdd200Response**](OrderShipmentTrackingAdd200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderShipmentUpdate

> orderShipmentUpdate(orderShipmentUpdateRequest): ApiRequest[AccountConfigUpdate200Response]

order.shipment.update

Update order&#39;s shipment information.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val orderShipmentUpdate: OrderShipmentUpdate =  // OrderShipmentUpdate | 
    
    val request = apiInstance.orderShipmentUpdate(orderShipmentUpdate)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderShipmentUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderShipmentUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderShipmentUpdate** | [**OrderShipmentUpdate**](OrderShipmentUpdate.md)|  |

### Return type

ApiRequest[[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderStatusList

> orderStatusList(orderStatusListRequest): ApiRequest[ModelResponseOrderStatusList]

order.status.list

Retrieve list of statuses

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val storeId: String = 1 // String | Store Id

    val action: String = add // String | Available statuses for the specified action.

    val responseFields: String = {return_code,return_message,result} // String | Set this parameter in order to choose which entity fields you want to retrieve
    
    val request = apiInstance.orderStatusList(storeId, action, responseFields)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderStatusList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderStatusList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Store Id | [optional]
 **action** | **String**| Available statuses for the specified action. | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]

### Return type

ApiRequest[[**ModelResponseOrderStatusList**](ModelResponseOrderStatusList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderTransactionList

> orderTransactionList(orderTransactionListRequest): ApiRequest[ModelResponseOrderTransactionList]

order.transaction.list

Retrieve list of order transaction

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val orderIds: String = 24,25 // String | Retrieves order transactions specified by order ids

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val storeId: String = 1 // String | Store Id

    val params: String = id,model,price,images // String | Set this parameter in order to choose which entity fields you want to retrieve

    val responseFields: String = {return_code,pagination,result{transactions_count,transactions{id,transaction_id,status,description,settlement_amount,gateway,card_brand,card_last_four}}} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = false // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
    
    val request = apiInstance.orderTransactionList(orderIds, count, storeId, params, responseFields, exclude, pageCursor)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderTransactionList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderTransactionList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderIds** | **String**| Retrieves order transactions specified by order ids |
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **storeId** | **String**| Store Id | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional]

### Return type

ApiRequest[[**ModelResponseOrderTransactionList**](ModelResponseOrderTransactionList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## orderUpdate

> orderUpdate(orderUpdateRequest): ApiRequest[AccountConfigUpdate200Response]

order.update

Update existing order.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: StoreKeyAuth
    implicit val StoreKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = OrderApi("https://api.api2cart.com/v1.1")
    val orderId: String = 25 // String | Defines the orders specified by order id

    val storeId: String = 1 // String | Defines store id where the order should be found

    val orderStatus: String = Completed // String | Defines new order's status

    val cancellationReason: String = ORDER_UNPAID // String | Defines the cancellation reason when the order will be canceled

    val comment: String = This coole order // String | Specifies order comment

    val adminComment: String = Test admin comment // String | Specifies admin's order comment

    val adminPrivateComment: String = Test admin private comment // String | Specifies private admin's order comment

    val dateModified: String = 2014-05-05 05:05:00 // String | Specifies order's  modification date

    val dateFinished: String = 2014-06-05 05:05:00 // String | Specifies order's  finished date

    val financialStatus: String = paid // String | Update order financial status to specified

    val fulfillmentStatus: String = fulfilled // String | Create order with fulfillment status

    val orderPaymentMethod: String = PayPal // String | Defines order payment method.<br/>Setting order_payment_method on Shopify will also change financial_status field value to 'paid'

    val sendNotifications: Boolean = true // Boolean | Send notifications to customer after order was created

    val origin: String = newsletter // String | The source of the order

    val createInvoice: Boolean = true // Boolean | Determines whether an invoice should be created if it has not already been created

    val invoiceAdminComment: String = Test admin comment // String | Specifies admin's order invoice comment
    
    val request = apiInstance.orderUpdate(orderId, storeId, orderStatus, cancellationReason, comment, adminComment, adminPrivateComment, dateModified, dateFinished, financialStatus, fulfillmentStatus, orderPaymentMethod, sendNotifications, origin, createInvoice, invoiceAdminComment)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OrderApi#orderUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OrderApi#orderUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Defines the orders specified by order id |
 **storeId** | **String**| Defines store id where the order should be found | [optional]
 **orderStatus** | **String**| Defines new order&#39;s status | [optional]
 **cancellationReason** | **String**| Defines the cancellation reason when the order will be canceled | [optional]
 **comment** | **String**| Specifies order comment | [optional]
 **adminComment** | **String**| Specifies admin&#39;s order comment | [optional]
 **adminPrivateComment** | **String**| Specifies private admin&#39;s order comment | [optional]
 **dateModified** | **String**| Specifies order&#39;s  modification date | [optional]
 **dateFinished** | **String**| Specifies order&#39;s  finished date | [optional]
 **financialStatus** | **String**| Update order financial status to specified | [optional]
 **fulfillmentStatus** | **String**| Create order with fulfillment status | [optional]
 **orderPaymentMethod** | **String**| Defines order payment method.&lt;br/&gt;Setting order_payment_method on Shopify will also change financial_status field value to &#39;paid&#39; | [optional]
 **sendNotifications** | **Boolean**| Send notifications to customer after order was created | [optional]
 **origin** | **String**| The source of the order | [optional]
 **createInvoice** | **Boolean**| Determines whether an invoice should be created if it has not already been created | [optional]
 **invoiceAdminComment** | **String**| Specifies admin&#39;s order invoice comment | [optional]

### Return type

ApiRequest[[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


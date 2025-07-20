# ReturnApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**returnActionList**](ReturnApi.md#returnActionList) | **GET** /return.action.list.json | return.action.list
[**returnActionListWithHttpInfo**](ReturnApi.md#returnActionListWithHttpInfo) | **GET** /return.action.list.json | return.action.list
[**returnCount**](ReturnApi.md#returnCount) | **GET** /return.count.json | return.count
[**returnCountWithHttpInfo**](ReturnApi.md#returnCountWithHttpInfo) | **GET** /return.count.json | return.count
[**returnInfo**](ReturnApi.md#returnInfo) | **GET** /return.info.json | return.info
[**returnInfoWithHttpInfo**](ReturnApi.md#returnInfoWithHttpInfo) | **GET** /return.info.json | return.info
[**returnList**](ReturnApi.md#returnList) | **GET** /return.list.json | return.list
[**returnListWithHttpInfo**](ReturnApi.md#returnListWithHttpInfo) | **GET** /return.list.json | return.list
[**returnReasonList**](ReturnApi.md#returnReasonList) | **GET** /return.reason.list.json | return.reason.list
[**returnReasonListWithHttpInfo**](ReturnApi.md#returnReasonListWithHttpInfo) | **GET** /return.reason.list.json | return.reason.list
[**returnStatusList**](ReturnApi.md#returnStatusList) | **GET** /return.status.list.json | return.status.list
[**returnStatusListWithHttpInfo**](ReturnApi.md#returnStatusListWithHttpInfo) | **GET** /return.status.list.json | return.status.list



## returnActionList

> returnActionList(): ApiRequest[ReturnActionList200Response]

return.action.list

Retrieve list of return actions

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
    val apiInstance = ReturnApi("https://api.api2cart.local.com/v1.1")    
    val request = apiInstance.returnActionList()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ReturnApi#returnActionList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ReturnApi#returnActionList")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**ReturnActionList200Response**](ReturnActionList200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## returnCount

> returnCount(returnCountRequest): ApiRequest[ReturnCount200Response]

return.count

Count returns in store

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
    val apiInstance = ReturnApi("https://api.api2cart.local.com/v1.1")
    val orderIds: String = 24,25 // String | Counts return requests specified by order ids

    val customerId: String = 5 // String | Counts return requests quantity specified by customer id

    val storeId: String = 1 // String | Store Id

    val status: String = disabled // String | Defines status

    val returnType: String = FBA // String | Retrieves returns specified by return type

    val createdFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their creation date

    val createdTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their creation date

    val modifiedFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their modification date

    val modifiedTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their modification date

    val reportRequestId: String = 105245017661 // String | Report request id

    val disableReportCache: Boolean = false // Boolean | Disable report cache for current request
    
    val request = apiInstance.returnCount(orderIds, customerId, storeId, status, returnType, createdFrom, createdTo, modifiedFrom, modifiedTo, reportRequestId, disableReportCache)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ReturnApi#returnCount")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ReturnApi#returnCount")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderIds** | **String**| Counts return requests specified by order ids | [optional]
 **customerId** | **String**| Counts return requests quantity specified by customer id | [optional]
 **storeId** | **String**| Store Id | [optional]
 **status** | **String**| Defines status | [optional]
 **returnType** | **String**| Retrieves returns specified by return type | [optional]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional]
 **reportRequestId** | **String**| Report request id | [optional]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional]

### Return type

ApiRequest[[**ReturnCount200Response**](ReturnCount200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## returnInfo

> returnInfo(returnInfoRequest): ApiRequest[ReturnInfo200Response]

return.info

Retrieve return information.

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
    val apiInstance = ReturnApi("https://api.api2cart.local.com/v1.1")
    val id: String = 10 // String | Entity id

    val orderId: String = 25 // String | Defines the order id

    val storeId: String = 1 // String | Store Id

    val responseFields: String = {return_code,return_message,result} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = id,order_products // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = id,order_id // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
    
    val request = apiInstance.returnInfo(id, orderId, storeId, responseFields, params, exclude)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ReturnApi#returnInfo")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ReturnApi#returnInfo")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id |
 **orderId** | **String**| Defines the order id | [optional]
 **storeId** | **String**| Store Id | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]

### Return type

ApiRequest[[**ReturnInfo200Response**](ReturnInfo200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## returnList

> returnList(returnListRequest): ApiRequest[ModelResponseReturnList]

return.list

Get list of return requests from store.

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
    val apiInstance = ReturnApi("https://api.api2cart.local.com/v1.1")
    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)

    val orderId: String = 25 // String | Defines the order id

    val orderIds: String = 24,25 // String | Retrieves return requests specified by order ids

    val customerId: String = 5 // String | Retrieves return requests specified by customer id

    val storeId: String = 1 // String | Store Id

    val status: String = disabled // String | Defines status

    val returnType: String = FBA // String | Retrieves returns specified by return type

    val createdFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their creation date

    val createdTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their creation date

    val modifiedFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their modification date

    val modifiedTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their modification date

    val responseFields: String = {return_code,return_message,pagination,result} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = id,order_products // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = id,order_id // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all

    val reportRequestId: String = 105245017661 // String | Report request id

    val disableReportCache: Boolean = false // Boolean | Disable report cache for current request
    
    val request = apiInstance.returnList(start, count, pageCursor, orderId, orderIds, customerId, storeId, status, returnType, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude, reportRequestId, disableReportCache)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ReturnApi#returnList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ReturnApi#returnList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional]
 **orderId** | **String**| Defines the order id | [optional]
 **orderIds** | **String**| Retrieves return requests specified by order ids | [optional]
 **customerId** | **String**| Retrieves return requests specified by customer id | [optional]
 **storeId** | **String**| Store Id | [optional]
 **status** | **String**| Defines status | [optional]
 **returnType** | **String**| Retrieves returns specified by return type | [optional]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]
 **reportRequestId** | **String**| Report request id | [optional]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional]

### Return type

ApiRequest[[**ModelResponseReturnList**](ModelResponseReturnList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## returnReasonList

> returnReasonList(returnReasonListRequest): ApiRequest[ReturnReasonList200Response]

return.reason.list

Retrieve list of return reasons

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
    val apiInstance = ReturnApi("https://api.api2cart.local.com/v1.1")
    val storeId: String = 1 // String | Store Id
    
    val request = apiInstance.returnReasonList(storeId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ReturnApi#returnReasonList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ReturnApi#returnReasonList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Store Id | [optional]

### Return type

ApiRequest[[**ReturnReasonList200Response**](ReturnReasonList200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## returnStatusList

> returnStatusList(): ApiRequest[ReturnStatusList200Response]

return.status.list

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
    val apiInstance = ReturnApi("https://api.api2cart.local.com/v1.1")    
    val request = apiInstance.returnStatusList()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ReturnApi#returnStatusList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ReturnApi#returnStatusList")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**ReturnStatusList200Response**](ReturnStatusList200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


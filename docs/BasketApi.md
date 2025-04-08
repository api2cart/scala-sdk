# BasketApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**basketInfo**](BasketApi.md#basketInfo) | **GET** /basket.info.json | basket.info
[**basketInfoWithHttpInfo**](BasketApi.md#basketInfoWithHttpInfo) | **GET** /basket.info.json | basket.info
[**basketItemAdd**](BasketApi.md#basketItemAdd) | **POST** /basket.item.add.json | basket.item.add
[**basketItemAddWithHttpInfo**](BasketApi.md#basketItemAddWithHttpInfo) | **POST** /basket.item.add.json | basket.item.add
[**basketLiveShippingServiceCreate**](BasketApi.md#basketLiveShippingServiceCreate) | **POST** /basket.live_shipping_service.create.json | basket.live_shipping_service.create
[**basketLiveShippingServiceCreateWithHttpInfo**](BasketApi.md#basketLiveShippingServiceCreateWithHttpInfo) | **POST** /basket.live_shipping_service.create.json | basket.live_shipping_service.create
[**basketLiveShippingServiceDelete**](BasketApi.md#basketLiveShippingServiceDelete) | **DELETE** /basket.live_shipping_service.delete.json | basket.live_shipping_service.delete
[**basketLiveShippingServiceDeleteWithHttpInfo**](BasketApi.md#basketLiveShippingServiceDeleteWithHttpInfo) | **DELETE** /basket.live_shipping_service.delete.json | basket.live_shipping_service.delete
[**basketLiveShippingServiceList**](BasketApi.md#basketLiveShippingServiceList) | **GET** /basket.live_shipping_service.list.json | basket.live_shipping_service.list
[**basketLiveShippingServiceListWithHttpInfo**](BasketApi.md#basketLiveShippingServiceListWithHttpInfo) | **GET** /basket.live_shipping_service.list.json | basket.live_shipping_service.list



## basketInfo

> basketInfo(basketInfoRequest): ApiRequest[BasketInfo200Response]

basket.info

Retrieve basket information.

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
    val apiInstance = BasketApi("https://api.api2cart.com/v1.1")
    val id: String = 10 // String | Entity id

    val storeId: String = 1 // String | Store Id

    val params: String = id,model,price,images // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = false // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all

    val responseFields: String = {result} // String | Set this parameter in order to choose which entity fields you want to retrieve
    
    val request = apiInstance.basketInfo(id, storeId, params, exclude, responseFields)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BasketApi#basketInfo")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BasketApi#basketInfo")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id |
 **storeId** | **String**| Store Id | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]

### Return type

ApiRequest[[**BasketInfo200Response**](BasketInfo200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## basketItemAdd

> basketItemAdd(basketItemAddRequest): ApiRequest[BasketItemAdd200Response]

basket.item.add

Add item to basket

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
    val apiInstance = BasketApi("https://api.api2cart.com/v1.1")
    val customerId: String = 5 // String | Retrieves orders specified by customer id

    val productId: String = 10 // String | Defines id of the product which should be added to the basket

    val variantId: String = 45 // String | Defines product's variants specified by variant id

    val quantity: BigDecimal = 6 // BigDecimal | Defines new items quantity

    val storeId: String = 1 // String | Store Id
    
    val request = apiInstance.basketItemAdd(customerId, productId, variantId, quantity, storeId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BasketApi#basketItemAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BasketApi#basketItemAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Retrieves orders specified by customer id |
 **productId** | **String**| Defines id of the product which should be added to the basket |
 **variantId** | **String**| Defines product&#39;s variants specified by variant id | [optional]
 **quantity** | **BigDecimal**| Defines new items quantity | [optional]
 **storeId** | **String**| Store Id | [optional]

### Return type

ApiRequest[[**BasketItemAdd200Response**](BasketItemAdd200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## basketLiveShippingServiceCreate

> basketLiveShippingServiceCreate(basketLiveShippingServiceCreateRequest): ApiRequest[BasketLiveShippingServiceCreate200Response]

basket.live_shipping_service.create

Create live shipping rate service.

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
    val apiInstance = BasketApi("https://api.api2cart.com/v1.1")
    val name: String = BestDelivery // String | Shipping Service Name

    val callback: String = https://example.com/callback // String | Callback url that returns shipping rates. It should be able to accept POST requests with json data.

    val storeId: String = 1 // String | Store Id
    
    val request = apiInstance.basketLiveShippingServiceCreate(name, callback, storeId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BasketApi#basketLiveShippingServiceCreate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BasketApi#basketLiveShippingServiceCreate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Shipping Service Name |
 **callback** | **String**| Callback url that returns shipping rates. It should be able to accept POST requests with json data. |
 **storeId** | **String**| Store Id | [optional]

### Return type

ApiRequest[[**BasketLiveShippingServiceCreate200Response**](BasketLiveShippingServiceCreate200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## basketLiveShippingServiceDelete

> basketLiveShippingServiceDelete(basketLiveShippingServiceDeleteRequest): ApiRequest[BasketLiveShippingServiceDelete200Response]

basket.live_shipping_service.delete

Delete live shipping rate service.

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
    val apiInstance = BasketApi("https://api.api2cart.com/v1.1")
    val id: Int = 5 // Int | Entity id
    
    val request = apiInstance.basketLiveShippingServiceDelete(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BasketApi#basketLiveShippingServiceDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BasketApi#basketLiveShippingServiceDelete")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Int**| Entity id |

### Return type

ApiRequest[[**BasketLiveShippingServiceDelete200Response**](BasketLiveShippingServiceDelete200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## basketLiveShippingServiceList

> basketLiveShippingServiceList(basketLiveShippingServiceListRequest): ApiRequest[BasketLiveShippingServiceList200Response]

basket.live_shipping_service.list

Retrieve a list of live shipping rate services.

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
    val apiInstance = BasketApi("https://api.api2cart.com/v1.1")
    val storeId: String = 1 // String | Store Id

    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
    
    val request = apiInstance.basketLiveShippingServiceList(storeId, start, count)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BasketApi#basketLiveShippingServiceList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BasketApi#basketLiveShippingServiceList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Store Id | [optional]
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]

### Return type

ApiRequest[[**BasketLiveShippingServiceList200Response**](BasketLiveShippingServiceList200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


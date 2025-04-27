# WebhookApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookCount**](WebhookApi.md#webhookCount) | **GET** /webhook.count.json | webhook.count
[**webhookCountWithHttpInfo**](WebhookApi.md#webhookCountWithHttpInfo) | **GET** /webhook.count.json | webhook.count
[**webhookCreate**](WebhookApi.md#webhookCreate) | **POST** /webhook.create.json | webhook.create
[**webhookCreateWithHttpInfo**](WebhookApi.md#webhookCreateWithHttpInfo) | **POST** /webhook.create.json | webhook.create
[**webhookDelete**](WebhookApi.md#webhookDelete) | **DELETE** /webhook.delete.json | webhook.delete
[**webhookDeleteWithHttpInfo**](WebhookApi.md#webhookDeleteWithHttpInfo) | **DELETE** /webhook.delete.json | webhook.delete
[**webhookEvents**](WebhookApi.md#webhookEvents) | **GET** /webhook.events.json | webhook.events
[**webhookEventsWithHttpInfo**](WebhookApi.md#webhookEventsWithHttpInfo) | **GET** /webhook.events.json | webhook.events
[**webhookList**](WebhookApi.md#webhookList) | **GET** /webhook.list.json | webhook.list
[**webhookListWithHttpInfo**](WebhookApi.md#webhookListWithHttpInfo) | **GET** /webhook.list.json | webhook.list
[**webhookUpdate**](WebhookApi.md#webhookUpdate) | **PUT** /webhook.update.json | webhook.update
[**webhookUpdateWithHttpInfo**](WebhookApi.md#webhookUpdateWithHttpInfo) | **PUT** /webhook.update.json | webhook.update



## webhookCount

> webhookCount(webhookCountRequest): ApiRequest[WebhookCount200Response]

webhook.count

Count registered webhooks on the store.

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
    val apiInstance = WebhookApi("https://api.api2cart.com/v1.1")
    val entity: String = product // String | The entity you want to filter webhooks by (e.g. order or product)

    val action: String = add // String | The action you want to filter webhooks by (e.g. order or product)

    val active: Boolean = true // Boolean | The webhook status you want to filter webhooks by
    
    val request = apiInstance.webhookCount(entity, action, active)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling WebhookApi#webhookCount")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling WebhookApi#webhookCount")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**| The entity you want to filter webhooks by (e.g. order or product) | [optional]
 **action** | **String**| The action you want to filter webhooks by (e.g. order or product) | [optional]
 **active** | **Boolean**| The webhook status you want to filter webhooks by | [optional]

### Return type

ApiRequest[[**WebhookCount200Response**](WebhookCount200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## webhookCreate

> webhookCreate(webhookCreateRequest): ApiRequest[BasketLiveShippingServiceCreate200Response]

webhook.create

Create webhook on the store and subscribe to it.

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
    val apiInstance = WebhookApi("https://api.api2cart.com/v1.1")
    val entity: String = product // String | Specify the entity that you want to enable webhooks for (e.g product, order, customer, category)

    val action: String = add // String | Specify what action (event) will trigger the webhook (e.g add, delete, or update)

    val callback: String = https://example.com/callback // String | Callback url that returns shipping rates. It should be able to accept POST requests with json data.

    val label: String = Super webhook // String | The name you give to the webhook

    val fields: String = id, name, description // String | Fields the webhook should send

    val active: Boolean = true // Boolean | Webhook status

    val storeId: String = 1 // String | Defines store id where the webhook should be assigned
    
    val request = apiInstance.webhookCreate(entity, action, callback, label, fields, active, storeId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling WebhookApi#webhookCreate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling WebhookApi#webhookCreate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**| Specify the entity that you want to enable webhooks for (e.g product, order, customer, category) |
 **action** | **String**| Specify what action (event) will trigger the webhook (e.g add, delete, or update) |
 **callback** | **String**| Callback url that returns shipping rates. It should be able to accept POST requests with json data. | [optional]
 **label** | **String**| The name you give to the webhook | [optional]
 **fields** | **String**| Fields the webhook should send | [optional]
 **active** | **Boolean**| Webhook status | [optional]
 **storeId** | **String**| Defines store id where the webhook should be assigned | [optional]

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


## webhookDelete

> webhookDelete(webhookDeleteRequest): ApiRequest[AttributeDelete200Response]

webhook.delete

Delete registered webhook on the store.

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
    val apiInstance = WebhookApi("https://api.api2cart.com/v1.1")
    val id: String = 25 // String | Webhook id
    
    val request = apiInstance.webhookDelete(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling WebhookApi#webhookDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling WebhookApi#webhookDelete")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Webhook id |

### Return type

ApiRequest[[**AttributeDelete200Response**](AttributeDelete200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## webhookEvents

> webhookEvents(): ApiRequest[WebhookEvents200Response]

webhook.events

List all Webhooks that are available on this store.

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
    val apiInstance = WebhookApi("https://api.api2cart.com/v1.1")    
    val request = apiInstance.webhookEvents()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling WebhookApi#webhookEvents")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling WebhookApi#webhookEvents")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**WebhookEvents200Response**](WebhookEvents200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## webhookList

> webhookList(webhookListRequest): ApiRequest[WebhookList200Response]

webhook.list

List registered webhook on the store.

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
    val apiInstance = WebhookApi("https://api.api2cart.com/v1.1")
    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val entity: String = product // String | The entity you want to filter webhooks by (e.g. order or product)

    val action: String = add // String | The action you want to filter webhooks by (e.g. add, update, or delete)

    val active: Boolean = true // Boolean | The webhook status you want to filter webhooks by

    val ids: String = 3,14,25 // String | List of сomma-separated webhook ids

    val params: String = id,entity,callback,fields // String | Set this parameter in order to choose which entity fields you want to retrieve
    
    val request = apiInstance.webhookList(start, count, entity, action, active, ids, params)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling WebhookApi#webhookList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling WebhookApi#webhookList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **entity** | **String**| The entity you want to filter webhooks by (e.g. order or product) | [optional]
 **action** | **String**| The action you want to filter webhooks by (e.g. add, update, or delete) | [optional]
 **active** | **Boolean**| The webhook status you want to filter webhooks by | [optional]
 **ids** | **String**| List of сomma-separated webhook ids | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]

### Return type

ApiRequest[[**WebhookList200Response**](WebhookList200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## webhookUpdate

> webhookUpdate(webhookUpdateRequest): ApiRequest[ProductImageUpdate200Response]

webhook.update

Update Webhooks parameters.

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
    val apiInstance = WebhookApi("https://api.api2cart.com/v1.1")
    val id: String = 25 // String | Webhook id

    val callback: String = https://example.com/callback // String | Callback url that returns shipping rates. It should be able to accept POST requests with json data.

    val label: String = Super webhook // String | The name you give to the webhook

    val fields: String = id, name, description // String | Fields the webhook should send

    val active: Boolean = true // Boolean | Webhook status
    
    val request = apiInstance.webhookUpdate(id, callback, label, fields, active)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling WebhookApi#webhookUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling WebhookApi#webhookUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Webhook id |
 **callback** | **String**| Callback url that returns shipping rates. It should be able to accept POST requests with json data. | [optional]
 **label** | **String**| The name you give to the webhook | [optional]
 **fields** | **String**| Fields the webhook should send | [optional]
 **active** | **Boolean**| Webhook status | [optional]

### Return type

ApiRequest[[**ProductImageUpdate200Response**](ProductImageUpdate200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


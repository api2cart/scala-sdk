# BridgeApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bridgeDelete**](BridgeApi.md#bridgeDelete) | **POST** /bridge.delete.json | bridge.delete
[**bridgeDeleteWithHttpInfo**](BridgeApi.md#bridgeDeleteWithHttpInfo) | **POST** /bridge.delete.json | bridge.delete
[**bridgeDownload**](BridgeApi.md#bridgeDownload) | **GET** /bridge.download.file | bridge.download
[**bridgeDownloadWithHttpInfo**](BridgeApi.md#bridgeDownloadWithHttpInfo) | **GET** /bridge.download.file | bridge.download
[**bridgeUpdate**](BridgeApi.md#bridgeUpdate) | **POST** /bridge.update.json | bridge.update
[**bridgeUpdateWithHttpInfo**](BridgeApi.md#bridgeUpdateWithHttpInfo) | **POST** /bridge.update.json | bridge.update



## bridgeDelete

> bridgeDelete(): ApiRequest[AttributeValueDelete200Response]

bridge.delete

Delete bridge from the store.

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
    val apiInstance = BridgeApi("https://api.api2cart.local.com/v1.1")    
    val request = apiInstance.bridgeDelete()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BridgeApi#bridgeDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BridgeApi#bridgeDelete")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

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


## bridgeDownload

> bridgeDownload(bridgeDownloadRequest): ApiRequest[File]

bridge.download

Download bridge for store.&lt;/br&gt;Please note that the method would not work if you call it from Swagger UI.

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
    val apiInstance = BridgeApi("https://api.api2cart.local.com/v1.1")
    val whitelabel: Boolean = true // Boolean | Identifies if there is a necessity to download whitelabel bridge.
    
    val request = apiInstance.bridgeDownload(whitelabel)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BridgeApi#bridgeDownload")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BridgeApi#bridgeDownload")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **whitelabel** | **Boolean**| Identifies if there is a necessity to download whitelabel bridge. | [optional]

### Return type

ApiRequest[[**File**](File.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/zip

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## bridgeUpdate

> bridgeUpdate(): ApiRequest[AttributeUpdate200Response]

bridge.update

Update bridge in the store.

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
    val apiInstance = BridgeApi("https://api.api2cart.local.com/v1.1")    
    val request = apiInstance.bridgeUpdate()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BridgeApi#bridgeUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BridgeApi#bridgeUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**AttributeUpdate200Response**](AttributeUpdate200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


# SubscriberApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriberList**](SubscriberApi.md#subscriberList) | **GET** /subscriber.list.json | subscriber.list
[**subscriberListWithHttpInfo**](SubscriberApi.md#subscriberListWithHttpInfo) | **GET** /subscriber.list.json | subscriber.list



## subscriberList

> subscriberList(subscriberListRequest): ApiRequest[ModelResponseSubscriberList]

subscriber.list

Get subscribers list

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
    val apiInstance = SubscriberApi("https://api.api2cart.local.com/v1.1")
    val ids: String = 24,25 // String | Retrieves subscribers specified by ids

    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)

    val subscribed: Boolean = false // Boolean | Filter by subscription status

    val storeId: String = 1 // String | Store Id

    val email: String = mail@example.com // String | Filter subscribers by email

    val createdFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their creation date

    val createdTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their creation date

    val modifiedFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their modification date

    val modifiedTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their modification date

    val responseFields: String = {return_code,return_message,pagination,result} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = id,model,price,images // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = false // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
    
    val request = apiInstance.subscriberList(ids, start, count, pageCursor, subscribed, storeId, email, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SubscriberApi#subscriberList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SubscriberApi#subscriberList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**| Retrieves subscribers specified by ids | [optional]
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional]
 **subscribed** | **Boolean**| Filter by subscription status | [optional]
 **storeId** | **String**| Store Id | [optional]
 **email** | **String**| Filter subscribers by email | [optional]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]

### Return type

ApiRequest[[**ModelResponseSubscriberList**](ModelResponseSubscriberList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


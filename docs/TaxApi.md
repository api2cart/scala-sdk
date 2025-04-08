# TaxApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taxClassInfo**](TaxApi.md#taxClassInfo) | **GET** /tax.class.info.json | tax.class.info
[**taxClassInfoWithHttpInfo**](TaxApi.md#taxClassInfoWithHttpInfo) | **GET** /tax.class.info.json | tax.class.info
[**taxClassList**](TaxApi.md#taxClassList) | **GET** /tax.class.list.json | tax.class.list
[**taxClassListWithHttpInfo**](TaxApi.md#taxClassListWithHttpInfo) | **GET** /tax.class.list.json | tax.class.list



## taxClassInfo

> taxClassInfo(taxClassInfoRequest): ApiRequest[ModelResponseTaxClassInfo]

tax.class.info

Use this method to get information about a tax class and its rates. It allows you to calculate the tax percentage for a specific customer&#39;s address. This information contains relatively static data that rarely changes, so API2Cart may cache certain data to reduce the load on the store and speed up request execution. We also recommend that you cache the response of this method on your side to save requests. If you need to clear the cache for a specific store, use the cart.validate method.

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
    val apiInstance = TaxApi("https://api.api2cart.com/v1.1")
    val taxClassId: String = 9 // String | Retrieves taxes specified by class id

    val storeId: String = 1 // String | Store Id

    val langId: String = 3 // String | Language id

    val params: String = tax_class_id,tax // String | Set this parameter in order to choose which entity fields you want to retrieve

    val responseFields: String = {result{id,name,tax,tax_rates{id,countries{id,name,states},cities,address,zip_codes{is_range,range,fields}}}} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = tax_class_id,tax // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
    
    val request = apiInstance.taxClassInfo(taxClassId, storeId, langId, params, responseFields, exclude)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling TaxApi#taxClassInfo")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling TaxApi#taxClassInfo")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxClassId** | **String**| Retrieves taxes specified by class id |
 **storeId** | **String**| Store Id | [optional]
 **langId** | **String**| Language id | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]

### Return type

ApiRequest[[**ModelResponseTaxClassInfo**](ModelResponseTaxClassInfo.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## taxClassList

> taxClassList(taxClassListRequest): ApiRequest[ModelResponseTaxClassList]

tax.class.list

Get list of tax classes from your store.

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
    val apiInstance = TaxApi("https://api.api2cart.com/v1.1")
    val createdTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their creation date

    val createdFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their creation date

    val modifiedTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their modification date

    val modifiedFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their modification date

    val findValue: String = tax // String | Entity search that is specified by some value

    val findWhere: String = name // String | Tax class search that is specified by field

    val storeId: String = 1 // String | Store Id

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)

    val responseFields: String = {result} // String | Set this parameter in order to choose which entity fields you want to retrieve
    
    val request = apiInstance.taxClassList(createdTo, createdFrom, modifiedTo, modifiedFrom, findValue, findWhere, storeId, count, pageCursor, responseFields)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling TaxApi#taxClassList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling TaxApi#taxClassList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdTo** | **String**| Retrieve entities to their creation date | [optional]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional]
 **findValue** | **String**| Entity search that is specified by some value | [optional]
 **findWhere** | **String**| Tax class search that is specified by field | [optional]
 **storeId** | **String**| Store Id | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]

### Return type

ApiRequest[[**ModelResponseTaxClassList**](ModelResponseTaxClassList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


# CategoryApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categoryAdd**](CategoryApi.md#categoryAdd) | **POST** /category.add.json | category.add
[**categoryAddWithHttpInfo**](CategoryApi.md#categoryAddWithHttpInfo) | **POST** /category.add.json | category.add
[**categoryAddBatch**](CategoryApi.md#categoryAddBatch) | **POST** /category.add.batch.json | category.add.batch
[**categoryAddBatchWithHttpInfo**](CategoryApi.md#categoryAddBatchWithHttpInfo) | **POST** /category.add.batch.json | category.add.batch
[**categoryAssign**](CategoryApi.md#categoryAssign) | **POST** /category.assign.json | category.assign
[**categoryAssignWithHttpInfo**](CategoryApi.md#categoryAssignWithHttpInfo) | **POST** /category.assign.json | category.assign
[**categoryCount**](CategoryApi.md#categoryCount) | **GET** /category.count.json | category.count
[**categoryCountWithHttpInfo**](CategoryApi.md#categoryCountWithHttpInfo) | **GET** /category.count.json | category.count
[**categoryDelete**](CategoryApi.md#categoryDelete) | **DELETE** /category.delete.json | category.delete
[**categoryDeleteWithHttpInfo**](CategoryApi.md#categoryDeleteWithHttpInfo) | **DELETE** /category.delete.json | category.delete
[**categoryDeleteBatch**](CategoryApi.md#categoryDeleteBatch) | **POST** /category.delete.batch.json | category.delete.batch
[**categoryDeleteBatchWithHttpInfo**](CategoryApi.md#categoryDeleteBatchWithHttpInfo) | **POST** /category.delete.batch.json | category.delete.batch
[**categoryFind**](CategoryApi.md#categoryFind) | **GET** /category.find.json | category.find
[**categoryFindWithHttpInfo**](CategoryApi.md#categoryFindWithHttpInfo) | **GET** /category.find.json | category.find
[**categoryImageAdd**](CategoryApi.md#categoryImageAdd) | **POST** /category.image.add.json | category.image.add
[**categoryImageAddWithHttpInfo**](CategoryApi.md#categoryImageAddWithHttpInfo) | **POST** /category.image.add.json | category.image.add
[**categoryImageDelete**](CategoryApi.md#categoryImageDelete) | **DELETE** /category.image.delete.json | category.image.delete
[**categoryImageDeleteWithHttpInfo**](CategoryApi.md#categoryImageDeleteWithHttpInfo) | **DELETE** /category.image.delete.json | category.image.delete
[**categoryInfo**](CategoryApi.md#categoryInfo) | **GET** /category.info.json | category.info
[**categoryInfoWithHttpInfo**](CategoryApi.md#categoryInfoWithHttpInfo) | **GET** /category.info.json | category.info
[**categoryList**](CategoryApi.md#categoryList) | **GET** /category.list.json | category.list
[**categoryListWithHttpInfo**](CategoryApi.md#categoryListWithHttpInfo) | **GET** /category.list.json | category.list
[**categoryUnassign**](CategoryApi.md#categoryUnassign) | **POST** /category.unassign.json | category.unassign
[**categoryUnassignWithHttpInfo**](CategoryApi.md#categoryUnassignWithHttpInfo) | **POST** /category.unassign.json | category.unassign
[**categoryUpdate**](CategoryApi.md#categoryUpdate) | **PUT** /category.update.json | category.update
[**categoryUpdateWithHttpInfo**](CategoryApi.md#categoryUpdateWithHttpInfo) | **PUT** /category.update.json | category.update



## categoryAdd

> categoryAdd(categoryAddRequest): ApiRequest[CategoryAdd200Response]

category.add

Add new category in store

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
    val apiInstance = CategoryApi("https://api.api2cart.local.com/v1.1")
    val name: String = Shoes // String | Defines category's name that has to be added

    val description: String = Test category // String | Defines category's description

    val shortDescription: String = Short description. This is very short description // String | Defines short description

    val parentId: String = 6 // String | Adds categories specified by parent id

    val avail: Boolean = false // Boolean | Defines category's visibility status

    val createdTime: String = 2014-01-30 15:58:41 // String | Entity's date creation

    val modifiedTime: String = 2014-07-30 15:58:41 // String | Entity's date modification

    val sortOrder: Int = 2 // Int | Sort number in the list

    val metaTitle: String = category,test // String | Defines unique meta title for each entity

    val metaDescription: String = category,test // String | Defines unique meta description of a entity

    val metaKeywords: String = category,test // String | Defines unique meta keywords for each entity

    val seoUrl: String = category,test // String | Defines unique category's URL for SEO

    val storeId: String = 1 // String | Store Id

    val storesIds: String = 1,2 // String | Create category in the stores that is specified by comma-separated stores' id

    val langId: String = 3 // String | Language id

    val idempotencyKey: String = 098f6bcd4621d373cade4e832627b4f6 // String | A unique identifier associated with a specific request. Repeated requests with the same <strong>idempotency_key</strong> return a cached response without re-executing the business logic. <strong>Please note that the cache lifetime is 15 minutes.</strong>
    
    val request = apiInstance.categoryAdd(name, description, shortDescription, parentId, avail, createdTime, modifiedTime, sortOrder, metaTitle, metaDescription, metaKeywords, seoUrl, storeId, storesIds, langId, idempotencyKey)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CategoryApi#categoryAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CategoryApi#categoryAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Defines category&#39;s name that has to be added |
 **description** | **String**| Defines category&#39;s description | [optional]
 **shortDescription** | **String**| Defines short description | [optional]
 **parentId** | **String**| Adds categories specified by parent id | [optional]
 **avail** | **Boolean**| Defines category&#39;s visibility status | [optional]
 **createdTime** | **String**| Entity&#39;s date creation | [optional]
 **modifiedTime** | **String**| Entity&#39;s date modification | [optional]
 **sortOrder** | **Int**| Sort number in the list | [optional]
 **metaTitle** | **String**| Defines unique meta title for each entity | [optional]
 **metaDescription** | **String**| Defines unique meta description of a entity | [optional]
 **metaKeywords** | **String**| Defines unique meta keywords for each entity | [optional]
 **seoUrl** | **String**| Defines unique category&#39;s URL for SEO | [optional]
 **storeId** | **String**| Store Id | [optional]
 **storesIds** | **String**| Create category in the stores that is specified by comma-separated stores&#39; id | [optional]
 **langId** | **String**| Language id | [optional]
 **idempotencyKey** | **String**| A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; | [optional]

### Return type

ApiRequest[[**CategoryAdd200Response**](CategoryAdd200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## categoryAddBatch

> categoryAddBatch(categoryAddBatchRequest): ApiRequest[CategoryAddBatch200Response]

category.add.batch

Add new categories to the store.

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
    val apiInstance = CategoryApi("https://api.api2cart.local.com/v1.1")
    val categoryAddBatch: CategoryAddBatch =  // CategoryAddBatch | 
    
    val request = apiInstance.categoryAddBatch(categoryAddBatch)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CategoryApi#categoryAddBatch")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CategoryApi#categoryAddBatch")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryAddBatch** | [**CategoryAddBatch**](CategoryAddBatch.md)|  |

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


## categoryAssign

> categoryAssign(categoryAssignRequest): ApiRequest[CategoryAssign200Response]

category.assign

Assign category to product

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
    val apiInstance = CategoryApi("https://api.api2cart.local.com/v1.1")
    val categoryId: String = 6 // String | Defines category assign, specified by category id

    val productId: String = 10 // String | Defines category assign to the product, specified by product id

    val storeId: String = 1 // String | Store Id

    val idempotencyKey: String = 098f6bcd4621d373cade4e832627b4f6 // String | A unique identifier associated with a specific request. Repeated requests with the same <strong>idempotency_key</strong> return a cached response without re-executing the business logic. <strong>Please note that the cache lifetime is 15 minutes.</strong>
    
    val request = apiInstance.categoryAssign(categoryId, productId, storeId, idempotencyKey)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CategoryApi#categoryAssign")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CategoryApi#categoryAssign")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| Defines category assign, specified by category id |
 **productId** | **String**| Defines category assign to the product, specified by product id |
 **storeId** | **String**| Store Id | [optional]
 **idempotencyKey** | **String**| A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; | [optional]

### Return type

ApiRequest[[**CategoryAssign200Response**](CategoryAssign200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## categoryCount

> categoryCount(categoryCountRequest): ApiRequest[CategoryCount200Response]

category.count

Count categories in store.

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
    val apiInstance = CategoryApi("https://api.api2cart.local.com/v1.1")
    val parentId: String = 6 // String | Counts categories specified by parent id

    val storeId: String = 1 // String | Counts category specified by store id

    val langId: String = 3 // String | Counts category specified by language id

    val avail: Boolean = false // Boolean | Defines category's visibility status

    val createdFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their creation date

    val createdTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their creation date

    val modifiedFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their modification date

    val modifiedTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their modification date

    val productType: String = BICYCLE // String | A categorization for the product

    val findValue: String = Demo category 1 // String | Entity search that is specified by some value

    val findWhere: String = email // String | Counts categories that are searched specified by field

    val reportRequestId: String = 105245017661 // String | Report request id

    val disableReportCache: Boolean = false // Boolean | Disable report cache for current request
    
    val request = apiInstance.categoryCount(parentId, storeId, langId, avail, createdFrom, createdTo, modifiedFrom, modifiedTo, productType, findValue, findWhere, reportRequestId, disableReportCache)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CategoryApi#categoryCount")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CategoryApi#categoryCount")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| Counts categories specified by parent id | [optional]
 **storeId** | **String**| Counts category specified by store id | [optional]
 **langId** | **String**| Counts category specified by language id | [optional]
 **avail** | **Boolean**| Defines category&#39;s visibility status | [optional]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional]
 **productType** | **String**| A categorization for the product | [optional]
 **findValue** | **String**| Entity search that is specified by some value | [optional]
 **findWhere** | **String**| Counts categories that are searched specified by field | [optional]
 **reportRequestId** | **String**| Report request id | [optional]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional]

### Return type

ApiRequest[[**CategoryCount200Response**](CategoryCount200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## categoryDelete

> categoryDelete(categoryDeleteRequest): ApiRequest[CategoryDelete200Response]

category.delete

Delete category in store

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
    val apiInstance = CategoryApi("https://api.api2cart.local.com/v1.1")
    val id: String = 10 // String | Defines category removal, specified by category id

    val storeId: String = 1 // String | Store Id
    
    val request = apiInstance.categoryDelete(id, storeId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CategoryApi#categoryDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CategoryApi#categoryDelete")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Defines category removal, specified by category id |
 **storeId** | **String**| Store Id | [optional]

### Return type

ApiRequest[[**CategoryDelete200Response**](CategoryDelete200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## categoryDeleteBatch

> categoryDeleteBatch(categoryDeleteBatchRequest): ApiRequest[CategoryAddBatch200Response]

category.delete.batch

Delete categories from the store.

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
    val apiInstance = CategoryApi("https://api.api2cart.local.com/v1.1")
    val categoryDeleteBatch: CategoryDeleteBatch =  // CategoryDeleteBatch | 
    
    val request = apiInstance.categoryDeleteBatch(categoryDeleteBatch)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CategoryApi#categoryDeleteBatch")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CategoryApi#categoryDeleteBatch")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryDeleteBatch** | [**CategoryDeleteBatch**](CategoryDeleteBatch.md)|  |

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


## categoryFind

> categoryFind(categoryFindRequest): ApiRequest[CategoryFind200Response]

category.find

Search category in store. \&quot;Laptop\&quot; is specified here by default.

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
    val apiInstance = CategoryApi("https://api.api2cart.local.com/v1.1")
    val findValue: String = Demo category 1 // String | Entity search that is specified by some value

    val findWhere: String = name // String | Entity search that is specified by the comma-separated unique fields

    val findParams: String = regex // String | Entity search that is specified by comma-separated parameters

    val storeId: String = 1 // String | Store Id

    val langId: String = 3 // String | Language id
    
    val request = apiInstance.categoryFind(findValue, findWhere, findParams, storeId, langId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CategoryApi#categoryFind")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CategoryApi#categoryFind")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **findValue** | **String**| Entity search that is specified by some value |
 **findWhere** | **String**| Entity search that is specified by the comma-separated unique fields | [optional]
 **findParams** | **String**| Entity search that is specified by comma-separated parameters | [optional]
 **storeId** | **String**| Store Id | [optional]
 **langId** | **String**| Language id | [optional]

### Return type

ApiRequest[[**CategoryFind200Response**](CategoryFind200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## categoryImageAdd

> categoryImageAdd(categoryImageAddRequest): ApiRequest[CategoryImageAdd200Response]

category.image.add

Add image to category

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
    val apiInstance = CategoryApi("https://api.api2cart.local.com/v1.1")
    val categoryId: String = 6 // String | Defines category id where the image should be added

    val imageName: String = bag-gray.png // String | Defines image's name

    val url: String = http://docs.api2cart.com/img/logo.png // String | Defines URL of the image that has to be added

    val `type`: String = base // String | Defines image's types that are specified by comma-separated list

    val storeId: String = 1 // String | Store Id

    val label: String = This cool image // String | Defines alternative text that has to be attached to the picture

    val mime: String = image/jpeg // String | Mime type of image http://en.wikipedia.org/wiki/Internet_media_type.

    val position: Int = 5 // Int | Defines image’s position in the list

    val idempotencyKey: String = 098f6bcd4621d373cade4e832627b4f6 // String | A unique identifier associated with a specific request. Repeated requests with the same <strong>idempotency_key</strong> return a cached response without re-executing the business logic. <strong>Please note that the cache lifetime is 15 minutes.</strong>
    
    val request = apiInstance.categoryImageAdd(categoryId, imageName, url, `type`, storeId, label, mime, position, idempotencyKey)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CategoryApi#categoryImageAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CategoryApi#categoryImageAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| Defines category id where the image should be added |
 **imageName** | **String**| Defines image&#39;s name |
 **url** | **String**| Defines URL of the image that has to be added |
 **`type`** | **String**| Defines image&#39;s types that are specified by comma-separated list | [enum: base, thumbnail]
 **storeId** | **String**| Store Id | [optional]
 **label** | **String**| Defines alternative text that has to be attached to the picture | [optional]
 **mime** | **String**| Mime type of image http://en.wikipedia.org/wiki/Internet_media_type. | [optional]
 **position** | **Int**| Defines image’s position in the list | [optional]
 **idempotencyKey** | **String**| A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; | [optional]

### Return type

ApiRequest[[**CategoryImageAdd200Response**](CategoryImageAdd200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## categoryImageDelete

> categoryImageDelete(categoryImageDeleteRequest): ApiRequest[AttributeDelete200Response]

category.image.delete

Delete image

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
    val apiInstance = CategoryApi("https://api.api2cart.local.com/v1.1")
    val categoryId: String = 6 // String | Defines category id where the image should be deleted

    val imageId: String = 82950b84f468edff480680f99cedbe0d // String | Define image id

    val storeId: String = 1 // String | Store Id
    
    val request = apiInstance.categoryImageDelete(categoryId, imageId, storeId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CategoryApi#categoryImageDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CategoryApi#categoryImageDelete")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| Defines category id where the image should be deleted |
 **imageId** | **String**| Define image id |
 **storeId** | **String**| Store Id | [optional]

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


## categoryInfo

> categoryInfo(categoryInfoRequest): ApiRequest[CategoryInfo200Response]

category.info

Get category info about category ID*** or specify other category ID.

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
    val apiInstance = CategoryApi("https://api.api2cart.local.com/v1.1")
    val id: String = 10 // String | Retrieves category's info specified by category id

    val storeId: String = 1 // String | Retrieves category info  specified by store id

    val langId: String = 3 // String | Retrieves category info  specified by language id

    val schemaType: String = LISTING // String | The name of the requirements set for the provided schema.

    val responseFields: String = {result{id,name,parent_id,modified_at{value},images}} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = id,parent_id,name // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = id,parent_id,name // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all

    val reportRequestId: String = 105245017661 // String | Report request id

    val disableReportCache: Boolean = false // Boolean | Disable report cache for current request
    
    val request = apiInstance.categoryInfo(id, storeId, langId, schemaType, responseFields, params, exclude, reportRequestId, disableReportCache)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CategoryApi#categoryInfo")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CategoryApi#categoryInfo")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Retrieves category&#39;s info specified by category id |
 **storeId** | **String**| Retrieves category info  specified by store id | [optional]
 **langId** | **String**| Retrieves category info  specified by language id | [optional]
 **schemaType** | **String**| The name of the requirements set for the provided schema. | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]
 **reportRequestId** | **String**| Report request id | [optional]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional]

### Return type

ApiRequest[[**CategoryInfo200Response**](CategoryInfo200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## categoryList

> categoryList(categoryListRequest): ApiRequest[ModelResponseCategoryList]

category.list

Get list of categories from store.

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
    val apiInstance = CategoryApi("https://api.api2cart.local.com/v1.1")
    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)

    val storeId: String = 1 // String | Retrieves categories specified by store id

    val langId: String = 3 // String | Retrieves categorys specified by language id

    val parentId: String = 6 // String | Retrieves categories specified by parent id

    val avail: Boolean = false // Boolean | Defines category's visibility status

    val productType: String = BICYCLE // String | A categorization for the product

    val createdFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their creation date

    val createdTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their creation date

    val modifiedFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their modification date

    val modifiedTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their modification date

    val findValue: String = Demo category 1 // String | Entity search that is specified by some value

    val findWhere: String = name // String | Category search that is specified by field

    val responseFields: String = {result{categories_count,category{id,parent_id,modified_at{value},images}}} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = id,parent_id,name // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = id,parent_id,name // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all

    val reportRequestId: String = 105245017661 // String | Report request id

    val disableReportCache: Boolean = false // Boolean | Disable report cache for current request

    val disableCache: Boolean = false // Boolean | Disable cache for current request
    
    val request = apiInstance.categoryList(start, count, pageCursor, storeId, langId, parentId, avail, productType, createdFrom, createdTo, modifiedFrom, modifiedTo, findValue, findWhere, responseFields, params, exclude, reportRequestId, disableReportCache, disableCache)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CategoryApi#categoryList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CategoryApi#categoryList")
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
 **storeId** | **String**| Retrieves categories specified by store id | [optional]
 **langId** | **String**| Retrieves categorys specified by language id | [optional]
 **parentId** | **String**| Retrieves categories specified by parent id | [optional]
 **avail** | **Boolean**| Defines category&#39;s visibility status | [optional]
 **productType** | **String**| A categorization for the product | [optional]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional]
 **findValue** | **String**| Entity search that is specified by some value | [optional]
 **findWhere** | **String**| Category search that is specified by field | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]
 **reportRequestId** | **String**| Report request id | [optional]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional]
 **disableCache** | **Boolean**| Disable cache for current request | [optional]

### Return type

ApiRequest[[**ModelResponseCategoryList**](ModelResponseCategoryList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## categoryUnassign

> categoryUnassign(categoryUnassignRequest): ApiRequest[CategoryAssign200Response]

category.unassign

Unassign category to product

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
    val apiInstance = CategoryApi("https://api.api2cart.local.com/v1.1")
    val categoryId: String = 6 // String | Defines category unassign, specified by category id

    val productId: String = 10 // String | Defines category unassign to the product, specified by product id

    val storeId: String = 1 // String | Store Id

    val idempotencyKey: String = 098f6bcd4621d373cade4e832627b4f6 // String | A unique identifier associated with a specific request. Repeated requests with the same <strong>idempotency_key</strong> return a cached response without re-executing the business logic. <strong>Please note that the cache lifetime is 15 minutes.</strong>
    
    val request = apiInstance.categoryUnassign(categoryId, productId, storeId, idempotencyKey)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CategoryApi#categoryUnassign")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CategoryApi#categoryUnassign")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| Defines category unassign, specified by category id |
 **productId** | **String**| Defines category unassign to the product, specified by product id |
 **storeId** | **String**| Store Id | [optional]
 **idempotencyKey** | **String**| A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; | [optional]

### Return type

ApiRequest[[**CategoryAssign200Response**](CategoryAssign200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## categoryUpdate

> categoryUpdate(categoryUpdateRequest): ApiRequest[AccountConfigUpdate200Response]

category.update

Update category in store

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
    val apiInstance = CategoryApi("https://api.api2cart.local.com/v1.1")
    val id: String = 10 // String | Defines category update specified by category id

    val name: String = NEW Shoes // String | Defines new category’s name

    val description: String = New test category // String | Defines new category's description

    val shortDescription: String = Short description. This is very short description // String | Defines short description

    val parentId: String = 6 // String | Defines new parent category id

    val avail: Boolean = false // Boolean | Defines category's visibility status

    val sortOrder: Int = 2 // Int | Sort number in the list

    val modifiedTime: String = 2014-07-30 15:58:41 // String | Entity's date modification

    val metaTitle: String = category,test // String | Defines unique meta title for each entity

    val metaDescription: String = category,test // String | Defines unique meta description of a entity

    val metaKeywords: String = category,test // String | Defines unique meta keywords for each entity

    val seoUrl: String = category,test // String | Defines unique category's URL for SEO

    val storeId: String = 1 // String | Store Id

    val storesIds: String = 1,2 // String | Update category in the stores that is specified by comma-separated stores' id

    val langId: String = 3 // String | Language id

    val idempotencyKey: String = 098f6bcd4621d373cade4e832627b4f6 // String | A unique identifier associated with a specific request. Repeated requests with the same <strong>idempotency_key</strong> return a cached response without re-executing the business logic. <strong>Please note that the cache lifetime is 15 minutes.</strong>
    
    val request = apiInstance.categoryUpdate(id, name, description, shortDescription, parentId, avail, sortOrder, modifiedTime, metaTitle, metaDescription, metaKeywords, seoUrl, storeId, storesIds, langId, idempotencyKey)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CategoryApi#categoryUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CategoryApi#categoryUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Defines category update specified by category id |
 **name** | **String**| Defines new category’s name | [optional]
 **description** | **String**| Defines new category&#39;s description | [optional]
 **shortDescription** | **String**| Defines short description | [optional]
 **parentId** | **String**| Defines new parent category id | [optional]
 **avail** | **Boolean**| Defines category&#39;s visibility status | [optional]
 **sortOrder** | **Int**| Sort number in the list | [optional]
 **modifiedTime** | **String**| Entity&#39;s date modification | [optional]
 **metaTitle** | **String**| Defines unique meta title for each entity | [optional]
 **metaDescription** | **String**| Defines unique meta description of a entity | [optional]
 **metaKeywords** | **String**| Defines unique meta keywords for each entity | [optional]
 **seoUrl** | **String**| Defines unique category&#39;s URL for SEO | [optional]
 **storeId** | **String**| Store Id | [optional]
 **storesIds** | **String**| Update category in the stores that is specified by comma-separated stores&#39; id | [optional]
 **langId** | **String**| Language id | [optional]
 **idempotencyKey** | **String**| A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; | [optional]

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


# CustomerApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerAdd**](CustomerApi.md#customerAdd) | **POST** /customer.add.json | customer.add
[**customerAddWithHttpInfo**](CustomerApi.md#customerAddWithHttpInfo) | **POST** /customer.add.json | customer.add
[**customerAddressAdd**](CustomerApi.md#customerAddressAdd) | **POST** /customer.address.add.json | customer.address.add
[**customerAddressAddWithHttpInfo**](CustomerApi.md#customerAddressAddWithHttpInfo) | **POST** /customer.address.add.json | customer.address.add
[**customerAttributeList**](CustomerApi.md#customerAttributeList) | **GET** /customer.attribute.list.json | customer.attribute.list
[**customerAttributeListWithHttpInfo**](CustomerApi.md#customerAttributeListWithHttpInfo) | **GET** /customer.attribute.list.json | customer.attribute.list
[**customerCount**](CustomerApi.md#customerCount) | **GET** /customer.count.json | customer.count
[**customerCountWithHttpInfo**](CustomerApi.md#customerCountWithHttpInfo) | **GET** /customer.count.json | customer.count
[**customerDelete**](CustomerApi.md#customerDelete) | **DELETE** /customer.delete.json | customer.delete
[**customerDeleteWithHttpInfo**](CustomerApi.md#customerDeleteWithHttpInfo) | **DELETE** /customer.delete.json | customer.delete
[**customerFind**](CustomerApi.md#customerFind) | **GET** /customer.find.json | customer.find
[**customerFindWithHttpInfo**](CustomerApi.md#customerFindWithHttpInfo) | **GET** /customer.find.json | customer.find
[**customerGroupAdd**](CustomerApi.md#customerGroupAdd) | **POST** /customer.group.add.json | customer.group.add
[**customerGroupAddWithHttpInfo**](CustomerApi.md#customerGroupAddWithHttpInfo) | **POST** /customer.group.add.json | customer.group.add
[**customerGroupList**](CustomerApi.md#customerGroupList) | **GET** /customer.group.list.json | customer.group.list
[**customerGroupListWithHttpInfo**](CustomerApi.md#customerGroupListWithHttpInfo) | **GET** /customer.group.list.json | customer.group.list
[**customerInfo**](CustomerApi.md#customerInfo) | **GET** /customer.info.json | customer.info
[**customerInfoWithHttpInfo**](CustomerApi.md#customerInfoWithHttpInfo) | **GET** /customer.info.json | customer.info
[**customerList**](CustomerApi.md#customerList) | **GET** /customer.list.json | customer.list
[**customerListWithHttpInfo**](CustomerApi.md#customerListWithHttpInfo) | **GET** /customer.list.json | customer.list
[**customerUpdate**](CustomerApi.md#customerUpdate) | **PUT** /customer.update.json | customer.update
[**customerUpdateWithHttpInfo**](CustomerApi.md#customerUpdateWithHttpInfo) | **PUT** /customer.update.json | customer.update
[**customerWishlistList**](CustomerApi.md#customerWishlistList) | **GET** /customer.wishlist.list.json | customer.wishlist.list
[**customerWishlistListWithHttpInfo**](CustomerApi.md#customerWishlistListWithHttpInfo) | **GET** /customer.wishlist.list.json | customer.wishlist.list



## customerAdd

> customerAdd(customerAddRequest): ApiRequest[CustomerAdd200Response]

customer.add

Add customer into store.

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
    val apiInstance = CustomerApi("https://api.api2cart.com/v1.1")
    val customerAdd: CustomerAdd =  // CustomerAdd | 
    
    val request = apiInstance.customerAdd(customerAdd)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerApi#customerAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerApi#customerAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerAdd** | [**CustomerAdd**](CustomerAdd.md)|  |

### Return type

ApiRequest[[**CustomerAdd200Response**](CustomerAdd200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## customerAddressAdd

> customerAddressAdd(customerAddressAddRequest): ApiRequest[AttributeAdd200Response]

customer.address.add

Add customer address.

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
    val apiInstance = CustomerApi("https://api.api2cart.com/v1.1")
    val customerAddressAdd: CustomerAddressAdd =  // CustomerAddressAdd | 
    
    val request = apiInstance.customerAddressAdd(customerAddressAdd)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerApi#customerAddressAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerApi#customerAddressAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerAddressAdd** | [**CustomerAddressAdd**](CustomerAddressAdd.md)|  |

### Return type

ApiRequest[[**AttributeAdd200Response**](AttributeAdd200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## customerAttributeList

> customerAttributeList(customerAttributeListRequest): ApiRequest[ModelResponseCustomerAttributeList]

customer.attribute.list

Get attributes for specific customer

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
    val apiInstance = CustomerApi("https://api.api2cart.com/v1.1")
    val customerId: String = 5 // String | Retrieves orders specified by customer id

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)

    val storeId: String = 1 // String | Store Id

    val langId: String = 3 // String | Language id

    val responseFields: String = {return_code,return_message,pagination,result} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = id,model,price,images // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = false // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
    
    val request = apiInstance.customerAttributeList(customerId, count, pageCursor, storeId, langId, responseFields, params, exclude)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerApi#customerAttributeList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerApi#customerAttributeList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Retrieves orders specified by customer id |
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional]
 **storeId** | **String**| Store Id | [optional]
 **langId** | **String**| Language id | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]

### Return type

ApiRequest[[**ModelResponseCustomerAttributeList**](ModelResponseCustomerAttributeList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## customerCount

> customerCount(customerCountRequest): ApiRequest[CustomerCount200Response]

customer.count

Get number of customers from store.

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
    val apiInstance = CustomerApi("https://api.api2cart.com/v1.1")
    val ids: String = 24,25 // String | Counts customers specified by ids

    val sinceId: String = 56 // String | Retrieve entities starting from the specified id.

    val customerListId: String = exampleListId // String | The numeric ID of the customer list in Demandware.

    val groupId: String = 3 // String | Customer group_id

    val storeId: String = 1 // String | Counts customer specified by store id

    val avail: Boolean = false // Boolean | Defines category's visibility status

    val findValue: String = mail@gmail.com // String | Entity search that is specified by some value

    val findWhere: String = email // String | Counts customers that are searched specified by field

    val createdFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their creation date

    val createdTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their creation date

    val modifiedFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their modification date

    val modifiedTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their modification date
    
    val request = apiInstance.customerCount(ids, sinceId, customerListId, groupId, storeId, avail, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerApi#customerCount")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerApi#customerCount")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**| Counts customers specified by ids | [optional]
 **sinceId** | **String**| Retrieve entities starting from the specified id. | [optional]
 **customerListId** | **String**| The numeric ID of the customer list in Demandware. | [optional]
 **groupId** | **String**| Customer group_id | [optional]
 **storeId** | **String**| Counts customer specified by store id | [optional]
 **avail** | **Boolean**| Defines category&#39;s visibility status | [optional]
 **findValue** | **String**| Entity search that is specified by some value | [optional]
 **findWhere** | **String**| Counts customers that are searched specified by field | [optional]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional]

### Return type

ApiRequest[[**CustomerCount200Response**](CustomerCount200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## customerDelete

> customerDelete(customerDeleteRequest): ApiRequest[CustomerDelete200Response]

customer.delete

Delete customer from store.

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
    val apiInstance = CustomerApi("https://api.api2cart.com/v1.1")
    val id: String = 10 // String | Identifies customer specified by the id
    
    val request = apiInstance.customerDelete(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerApi#customerDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerApi#customerDelete")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies customer specified by the id |

### Return type

ApiRequest[[**CustomerDelete200Response**](CustomerDelete200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## customerFind

> customerFind(customerFindRequest): ApiRequest[CustomerFind200Response]

customer.find

Find customers in store.

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
    val apiInstance = CustomerApi("https://api.api2cart.com/v1.1")
    val findValue: String = mail@gmail.com // String | Entity search that is specified by some value

    val findWhere: String = email // String | Entity search that is specified by the comma-separated unique fields

    val findParams: String = regex // String | Entity search that is specified by comma-separated parameters

    val storeId: String = 1 // String | Store Id
    
    val request = apiInstance.customerFind(findValue, findWhere, findParams, storeId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerApi#customerFind")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerApi#customerFind")
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

### Return type

ApiRequest[[**CustomerFind200Response**](CustomerFind200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## customerGroupAdd

> customerGroupAdd(customerGroupAddRequest): ApiRequest[CustomerGroupAdd200Response]

customer.group.add

Create customer group.

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
    val apiInstance = CustomerApi("https://api.api2cart.com/v1.1")
    val name: String = new_group // String | Customer group name

    val storeId: String = 1 // String | Store Id

    val storesIds: String = 1,2 // String | Assign customer group to the stores that is specified by comma-separated stores' id
    
    val request = apiInstance.customerGroupAdd(name, storeId, storesIds)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerApi#customerGroupAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerApi#customerGroupAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Customer group name |
 **storeId** | **String**| Store Id | [optional]
 **storesIds** | **String**| Assign customer group to the stores that is specified by comma-separated stores&#39; id | [optional]

### Return type

ApiRequest[[**CustomerGroupAdd200Response**](CustomerGroupAdd200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## customerGroupList

> customerGroupList(customerGroupListRequest): ApiRequest[ModelResponseCustomerGroupList]

customer.group.list

Get list of customers groups.

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
    val apiInstance = CustomerApi("https://api.api2cart.com/v1.1")
    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)

    val groupIds: String = 1,2,3 // String | Groups that will be assigned to a customer

    val storeId: String = 1 // String | Store Id

    val langId: String = 3 // String | Language id

    val responseFields: String = {return_code,return_message,pagination,result} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = id,model,price,images // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = false // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all

    val disableCache: Boolean = false // Boolean | Disable cache for current request
    
    val request = apiInstance.customerGroupList(start, count, pageCursor, groupIds, storeId, langId, responseFields, params, exclude, disableCache)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerApi#customerGroupList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerApi#customerGroupList")
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
 **groupIds** | **String**| Groups that will be assigned to a customer | [optional]
 **storeId** | **String**| Store Id | [optional]
 **langId** | **String**| Language id | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]
 **disableCache** | **Boolean**| Disable cache for current request | [optional]

### Return type

ApiRequest[[**ModelResponseCustomerGroupList**](ModelResponseCustomerGroupList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## customerInfo

> customerInfo(customerInfoRequest): ApiRequest[CustomerInfo200Response]

customer.info

Get customers&#39; details from store.

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
    val apiInstance = CustomerApi("https://api.api2cart.com/v1.1")
    val id: String = 10 // String | Retrieves customer's info specified by customer id

    val storeId: String = 1 // String | Retrieves customer info specified by store id

    val responseFields: String = {result{id,parent_id,sku,upc,images,combination}} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = id,email // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = id,email // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
    
    val request = apiInstance.customerInfo(id, storeId, responseFields, params, exclude)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerApi#customerInfo")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerApi#customerInfo")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Retrieves customer&#39;s info specified by customer id |
 **storeId** | **String**| Retrieves customer info specified by store id | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]

### Return type

ApiRequest[[**CustomerInfo200Response**](CustomerInfo200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## customerList

> customerList(customerListRequest): ApiRequest[ModelResponseCustomerList]

customer.list

Get list of customers from store.

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
    val apiInstance = CustomerApi("https://api.api2cart.com/v1.1")
    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)

    val ids: String = 24,25 // String | Retrieves customers specified by ids

    val sinceId: String = 56 // String | Retrieve entities starting from the specified id.

    val customerListId: String = exampleListId // String | The numeric ID of the customer list in Demandware.

    val groupId: String = 3 // String | Customer group_id

    val storeId: String = 1 // String | Retrieves customers specified by store id

    val avail: Boolean = false // Boolean | Defines category's visibility status

    val findValue: String = mail@gmail.com // String | Entity search that is specified by some value

    val findWhere: String = email // String | Customer search that is specified by field

    val createdFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their creation date

    val createdTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their creation date

    val modifiedFrom: String = 2010-07-29 13:45:52 // String | Retrieve entities from their modification date

    val modifiedTo: String = 2100-08-29 13:45:52 // String | Retrieve entities to their modification date

    val sortBy: String = value_id // String | Set field to sort by

    val sortDirection: String = asc // String | Set sorting direction

    val responseFields: String = {result{customer}} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = id,email // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = id,email // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
    
    val request = apiInstance.customerList(start, count, pageCursor, ids, sinceId, customerListId, groupId, storeId, avail, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo, sortBy, sortDirection, responseFields, params, exclude)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerApi#customerList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerApi#customerList")
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
 **ids** | **String**| Retrieves customers specified by ids | [optional]
 **sinceId** | **String**| Retrieve entities starting from the specified id. | [optional]
 **customerListId** | **String**| The numeric ID of the customer list in Demandware. | [optional]
 **groupId** | **String**| Customer group_id | [optional]
 **storeId** | **String**| Retrieves customers specified by store id | [optional]
 **avail** | **Boolean**| Defines category&#39;s visibility status | [optional]
 **findValue** | **String**| Entity search that is specified by some value | [optional]
 **findWhere** | **String**| Customer search that is specified by field | [optional]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional]
 **sortBy** | **String**| Set field to sort by | [optional]
 **sortDirection** | **String**| Set sorting direction | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]

### Return type

ApiRequest[[**ModelResponseCustomerList**](ModelResponseCustomerList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## customerUpdate

> customerUpdate(customerUpdateRequest): ApiRequest[AccountConfigUpdate200Response]

customer.update

Update information of customer in store.

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
    val apiInstance = CustomerApi("https://api.api2cart.com/v1.1")
    val customerUpdate: CustomerUpdate =  // CustomerUpdate | 
    
    val request = apiInstance.customerUpdate(customerUpdate)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerApi#customerUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerApi#customerUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerUpdate** | [**CustomerUpdate**](CustomerUpdate.md)|  |

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


## customerWishlistList

> customerWishlistList(customerWishlistListRequest): ApiRequest[ModelResponseCustomerWishlistList]

customer.wishlist.list

Get a Wish List of customer from the store.

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
    val apiInstance = CustomerApi("https://api.api2cart.com/v1.1")
    val customerId: String = 5 // String | Retrieves orders specified by customer id

    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)

    val id: String = 10 // String | Entity id

    val storeId: String = 1 // String | Store Id

    val responseFields: String = {return_code,return_message,pagination,result} // String | Set this parameter in order to choose which entity fields you want to retrieve
    
    val request = apiInstance.customerWishlistList(customerId, start, count, pageCursor, id, storeId, responseFields)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerApi#customerWishlistList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerApi#customerWishlistList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Retrieves orders specified by customer id |
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional]
 **id** | **String**| Entity id | [optional]
 **storeId** | **String**| Store Id | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]

### Return type

ApiRequest[[**ModelResponseCustomerWishlistList**](ModelResponseCustomerWishlistList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


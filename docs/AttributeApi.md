# AttributeApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attributeAdd**](AttributeApi.md#attributeAdd) | **POST** /attribute.add.json | attribute.add
[**attributeAddWithHttpInfo**](AttributeApi.md#attributeAddWithHttpInfo) | **POST** /attribute.add.json | attribute.add
[**attributeAssignGroup**](AttributeApi.md#attributeAssignGroup) | **POST** /attribute.assign.group.json | attribute.assign.group
[**attributeAssignGroupWithHttpInfo**](AttributeApi.md#attributeAssignGroupWithHttpInfo) | **POST** /attribute.assign.group.json | attribute.assign.group
[**attributeAssignSet**](AttributeApi.md#attributeAssignSet) | **POST** /attribute.assign.set.json | attribute.assign.set
[**attributeAssignSetWithHttpInfo**](AttributeApi.md#attributeAssignSetWithHttpInfo) | **POST** /attribute.assign.set.json | attribute.assign.set
[**attributeAttributesetList**](AttributeApi.md#attributeAttributesetList) | **GET** /attribute.attributeset.list.json | attribute.attributeset.list
[**attributeAttributesetListWithHttpInfo**](AttributeApi.md#attributeAttributesetListWithHttpInfo) | **GET** /attribute.attributeset.list.json | attribute.attributeset.list
[**attributeCount**](AttributeApi.md#attributeCount) | **GET** /attribute.count.json | attribute.count
[**attributeCountWithHttpInfo**](AttributeApi.md#attributeCountWithHttpInfo) | **GET** /attribute.count.json | attribute.count
[**attributeDelete**](AttributeApi.md#attributeDelete) | **DELETE** /attribute.delete.json | attribute.delete
[**attributeDeleteWithHttpInfo**](AttributeApi.md#attributeDeleteWithHttpInfo) | **DELETE** /attribute.delete.json | attribute.delete
[**attributeGroupList**](AttributeApi.md#attributeGroupList) | **GET** /attribute.group.list.json | attribute.group.list
[**attributeGroupListWithHttpInfo**](AttributeApi.md#attributeGroupListWithHttpInfo) | **GET** /attribute.group.list.json | attribute.group.list
[**attributeInfo**](AttributeApi.md#attributeInfo) | **GET** /attribute.info.json | attribute.info
[**attributeInfoWithHttpInfo**](AttributeApi.md#attributeInfoWithHttpInfo) | **GET** /attribute.info.json | attribute.info
[**attributeList**](AttributeApi.md#attributeList) | **GET** /attribute.list.json | attribute.list
[**attributeListWithHttpInfo**](AttributeApi.md#attributeListWithHttpInfo) | **GET** /attribute.list.json | attribute.list
[**attributeTypeList**](AttributeApi.md#attributeTypeList) | **GET** /attribute.type.list.json | attribute.type.list
[**attributeTypeListWithHttpInfo**](AttributeApi.md#attributeTypeListWithHttpInfo) | **GET** /attribute.type.list.json | attribute.type.list
[**attributeUnassignGroup**](AttributeApi.md#attributeUnassignGroup) | **POST** /attribute.unassign.group.json | attribute.unassign.group
[**attributeUnassignGroupWithHttpInfo**](AttributeApi.md#attributeUnassignGroupWithHttpInfo) | **POST** /attribute.unassign.group.json | attribute.unassign.group
[**attributeUnassignSet**](AttributeApi.md#attributeUnassignSet) | **POST** /attribute.unassign.set.json | attribute.unassign.set
[**attributeUnassignSetWithHttpInfo**](AttributeApi.md#attributeUnassignSetWithHttpInfo) | **POST** /attribute.unassign.set.json | attribute.unassign.set
[**attributeUpdate**](AttributeApi.md#attributeUpdate) | **PUT** /attribute.update.json | attribute.update
[**attributeUpdateWithHttpInfo**](AttributeApi.md#attributeUpdateWithHttpInfo) | **PUT** /attribute.update.json | attribute.update
[**attributeValueAdd**](AttributeApi.md#attributeValueAdd) | **POST** /attribute.value.add.json | attribute.value.add
[**attributeValueAddWithHttpInfo**](AttributeApi.md#attributeValueAddWithHttpInfo) | **POST** /attribute.value.add.json | attribute.value.add
[**attributeValueDelete**](AttributeApi.md#attributeValueDelete) | **DELETE** /attribute.value.delete.json | attribute.value.delete
[**attributeValueDeleteWithHttpInfo**](AttributeApi.md#attributeValueDeleteWithHttpInfo) | **DELETE** /attribute.value.delete.json | attribute.value.delete
[**attributeValueUpdate**](AttributeApi.md#attributeValueUpdate) | **PUT** /attribute.value.update.json | attribute.value.update
[**attributeValueUpdateWithHttpInfo**](AttributeApi.md#attributeValueUpdateWithHttpInfo) | **PUT** /attribute.value.update.json | attribute.value.update



## attributeAdd

> attributeAdd(attributeAddRequest): ApiRequest[AttributeAdd200Response]

attribute.add

Add new attribute

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val `type`: String = text // String | Defines attribute's type

    val name: String = Specification // String | Defines attributes's name

    val code: String = code // String | Entity code

    val storeId: String = 1 // String | Store Id

    val langId: String = 3 // String | Language id

    val visible: Boolean = true // Boolean | Set visibility status

    val required: Boolean = true // Boolean | Defines if the option is required

    val position: Int = 5 // Int | Attribute`s position

    val attributeGroupId: String = 202 // String | Filter by attribute_group_id

    val isGlobal: String = Global // String | Attribute saving scope

    val isSearchable: Boolean = false // Boolean | Use attribute in Quick Search

    val isFilterable: String = No // String | Use In Layered Navigation

    val isComparable: Boolean = true // Boolean | Comparable on Front-end

    val isHtmlAllowedOnFront: Boolean = true // Boolean | Allow HTML Tags on Frontend

    val isFilterableInSearch: Boolean = true // Boolean | Use In Search Results Layered Navigation

    val isConfigurable: Boolean = true // Boolean | Use To Create Configurable Product

    val isVisibleInAdvancedSearch: Boolean = true // Boolean | Use in Advanced Search

    val isUsedForPromoRules: Boolean = true // Boolean | Use for Promo Rule Conditions

    val usedInProductListing: Boolean = true // Boolean | Used in Product Listing

    val usedForSortBy: Boolean = true // Boolean | Used for Sorting in Product Listing

    val applyTo: String = Global // String | Types of products which can have this attribute
    
    val request = apiInstance.attributeAdd(`type`, name, code, storeId, langId, visible, required, position, attributeGroupId, isGlobal, isSearchable, isFilterable, isComparable, isHtmlAllowedOnFront, isFilterableInSearch, isConfigurable, isVisibleInAdvancedSearch, isUsedForPromoRules, usedInProductListing, usedForSortBy, applyTo)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`type`** | **String**| Defines attribute&#39;s type | [enum: text, select, textarea, date, price, multiselect, boolean]
 **name** | **String**| Defines attributes&#39;s name |
 **code** | **String**| Entity code | [optional]
 **storeId** | **String**| Store Id | [optional]
 **langId** | **String**| Language id | [optional]
 **visible** | **Boolean**| Set visibility status | [optional]
 **required** | **Boolean**| Defines if the option is required | [optional]
 **position** | **Int**| Attribute&#x60;s position | [optional]
 **attributeGroupId** | **String**| Filter by attribute_group_id | [optional]
 **isGlobal** | **String**| Attribute saving scope | [optional]
 **isSearchable** | **Boolean**| Use attribute in Quick Search | [optional]
 **isFilterable** | **String**| Use In Layered Navigation | [optional]
 **isComparable** | **Boolean**| Comparable on Front-end | [optional]
 **isHtmlAllowedOnFront** | **Boolean**| Allow HTML Tags on Frontend | [optional]
 **isFilterableInSearch** | **Boolean**| Use In Search Results Layered Navigation | [optional]
 **isConfigurable** | **Boolean**| Use To Create Configurable Product | [optional]
 **isVisibleInAdvancedSearch** | **Boolean**| Use in Advanced Search | [optional]
 **isUsedForPromoRules** | **Boolean**| Use for Promo Rule Conditions | [optional]
 **usedInProductListing** | **Boolean**| Used in Product Listing | [optional]
 **usedForSortBy** | **Boolean**| Used for Sorting in Product Listing | [optional]
 **applyTo** | **String**| Types of products which can have this attribute | [optional]

### Return type

ApiRequest[[**AttributeAdd200Response**](AttributeAdd200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## attributeAssignGroup

> attributeAssignGroup(attributeAssignGroupRequest): ApiRequest[AttributeAssignGroup200Response]

attribute.assign.group

Assign attribute to the group

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val id: String = 10 // String | Entity id

    val groupId: String = 3 // String | Attribute group_id

    val attributeSetId: String = 4 // String | Attribute set id
    
    val request = apiInstance.attributeAssignGroup(id, groupId, attributeSetId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeAssignGroup")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeAssignGroup")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id |
 **groupId** | **String**| Attribute group_id |
 **attributeSetId** | **String**| Attribute set id | [optional]

### Return type

ApiRequest[[**AttributeAssignGroup200Response**](AttributeAssignGroup200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## attributeAssignSet

> attributeAssignSet(attributeAssignSetRequest): ApiRequest[AttributeAssignGroup200Response]

attribute.assign.set

Assign attribute to the attribute set

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val id: String = 10 // String | Entity id

    val attributeSetId: String = 4 // String | Attribute set id

    val groupId: String = 3 // String | Attribute group_id
    
    val request = apiInstance.attributeAssignSet(id, attributeSetId, groupId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeAssignSet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeAssignSet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id |
 **attributeSetId** | **String**| Attribute set id |
 **groupId** | **String**| Attribute group_id | [optional]

### Return type

ApiRequest[[**AttributeAssignGroup200Response**](AttributeAssignGroup200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## attributeAttributesetList

> attributeAttributesetList(attributeAttributesetListRequest): ApiRequest[ModelResponseAttributeAttributesetList]

attribute.attributeset.list

Get attribute_set list

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val responseFields: String = {result} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = id,name // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = id,name // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
    
    val request = apiInstance.attributeAttributesetList(start, count, responseFields, params, exclude)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeAttributesetList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeAttributesetList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]

### Return type

ApiRequest[[**ModelResponseAttributeAttributesetList**](ModelResponseAttributeAttributesetList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## attributeCount

> attributeCount(attributeCountRequest): ApiRequest[AttributeCount200Response]

attribute.count

Get attributes count

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val `type`: String = text // String | Defines attribute's type

    val attributeSetId: String = 4 // String | Filter items by attribute set id

    val storeId: String = 1 // String | Store Id

    val langId: String = 3 // String | Language id

    val visible: Boolean = true // Boolean | Filter items by visibility status

    val required: Boolean = true // Boolean | Defines if the option is required

    val system: Boolean = false // Boolean | True if attribute is system
    
    val request = apiInstance.attributeCount(`type`, attributeSetId, storeId, langId, visible, required, system)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeCount")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeCount")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`type`** | **String**| Defines attribute&#39;s type | [optional]
 **attributeSetId** | **String**| Filter items by attribute set id | [optional]
 **storeId** | **String**| Store Id | [optional]
 **langId** | **String**| Language id | [optional]
 **visible** | **Boolean**| Filter items by visibility status | [optional]
 **required** | **Boolean**| Defines if the option is required | [optional]
 **system** | **Boolean**| True if attribute is system | [optional]

### Return type

ApiRequest[[**AttributeCount200Response**](AttributeCount200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## attributeDelete

> attributeDelete(attributeDeleteRequest): ApiRequest[AttributeDelete200Response]

attribute.delete

Delete attribute from store

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val id: String = 10 // String | Entity id

    val storeId: String = 1 // String | Store Id
    
    val request = apiInstance.attributeDelete(id, storeId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeDelete")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id |
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


## attributeGroupList

> attributeGroupList(attributeGroupListRequest): ApiRequest[ModelResponseAttributeGroupList]

attribute.group.list

Get attribute group list

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val attributeSetId: String = 4 // String | Attribute set id

    val langId: String = 3 // String | Language id

    val responseFields: String = {result} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = id,name // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = id,name // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
    
    val request = apiInstance.attributeGroupList(start, count, attributeSetId, langId, responseFields, params, exclude)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeGroupList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeGroupList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **attributeSetId** | **String**| Attribute set id | [optional]
 **langId** | **String**| Language id | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]

### Return type

ApiRequest[[**ModelResponseAttributeGroupList**](ModelResponseAttributeGroupList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## attributeInfo

> attributeInfo(attributeInfoRequest): ApiRequest[AttributeInfo200Response]

attribute.info

Get information about a specific global attribute by its ID.

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val id: String = 10 // String | Entity id

    val attributeSetId: String = 4 // String | Attribute set id

    val storeId: String = 1 // String | Store Id

    val langId: String = 3 // String | Language id

    val responseFields: String = {result} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = force_all // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = name // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
    
    val request = apiInstance.attributeInfo(id, attributeSetId, storeId, langId, responseFields, params, exclude)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeInfo")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeInfo")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id |
 **attributeSetId** | **String**| Attribute set id | [optional]
 **storeId** | **String**| Store Id | [optional]
 **langId** | **String**| Language id | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]

### Return type

ApiRequest[[**AttributeInfo200Response**](AttributeInfo200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## attributeList

> attributeList(attributeListRequest): ApiRequest[ModelResponseAttributeList]

attribute.list

Get a list of global attributes.

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val attributeIds: String = 1,2,3 // String | Filter attributes by ids

    val attributeSetId: String = 4 // String | Filter items by attribute set id

    val storeId: String = 1 // String | Store Id

    val langId: String = 3 // String | Retrieves attributes on specified language id

    val `type`: String = text // String | Defines attribute's type

    val visible: Boolean = true // Boolean | Filter items by visibility status

    val required: Boolean = true // Boolean | Defines if the option is required

    val system: Boolean = false // Boolean | True if attribute is system

    val responseFields: String = {return_code,return_message,pagination,result} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = id,name // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = id,name // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
    
    val request = apiInstance.attributeList(start, count, attributeIds, attributeSetId, storeId, langId, `type`, visible, required, system, responseFields, params, exclude)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **attributeIds** | **String**| Filter attributes by ids | [optional]
 **attributeSetId** | **String**| Filter items by attribute set id | [optional]
 **storeId** | **String**| Store Id | [optional]
 **langId** | **String**| Retrieves attributes on specified language id | [optional]
 **`type`** | **String**| Defines attribute&#39;s type | [optional]
 **visible** | **Boolean**| Filter items by visibility status | [optional]
 **required** | **Boolean**| Defines if the option is required | [optional]
 **system** | **Boolean**| True if attribute is system | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]

### Return type

ApiRequest[[**ModelResponseAttributeList**](ModelResponseAttributeList.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## attributeTypeList

> attributeTypeList(): ApiRequest[AttributeTypeList200Response]

attribute.type.list

Get list of supported attributes types

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")    
    val request = apiInstance.attributeTypeList()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeTypeList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeTypeList")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**AttributeTypeList200Response**](AttributeTypeList200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## attributeUnassignGroup

> attributeUnassignGroup(attributeUnassignGroupRequest): ApiRequest[AttributeUnassignGroup200Response]

attribute.unassign.group

Unassign attribute from group

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val id: String = 10 // String | Entity id

    val groupId: String = 3 // String | Customer group_id
    
    val request = apiInstance.attributeUnassignGroup(id, groupId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeUnassignGroup")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeUnassignGroup")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id |
 **groupId** | **String**| Customer group_id |

### Return type

ApiRequest[[**AttributeUnassignGroup200Response**](AttributeUnassignGroup200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## attributeUnassignSet

> attributeUnassignSet(attributeUnassignSetRequest): ApiRequest[AttributeUnassignGroup200Response]

attribute.unassign.set

Unassign attribute from attribute set

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val id: String = 10 // String | Entity id

    val attributeSetId: String = 4 // String | Attribute set id
    
    val request = apiInstance.attributeUnassignSet(id, attributeSetId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeUnassignSet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeUnassignSet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id |
 **attributeSetId** | **String**| Attribute set id |

### Return type

ApiRequest[[**AttributeUnassignGroup200Response**](AttributeUnassignGroup200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## attributeUpdate

> attributeUpdate(attributeUpdateRequest): ApiRequest[AttributeUpdate200Response]

attribute.update

Update attribute data

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val id: String = 10 // String | Entity id

    val name: String = Test name // String | Defines new attributes's name

    val storeId: String = 1 // String | Store Id

    val langId: String = 3 // String | Language id
    
    val request = apiInstance.attributeUpdate(id, name, storeId, langId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id |
 **name** | **String**| Defines new attributes&#39;s name |
 **storeId** | **String**| Store Id | [optional]
 **langId** | **String**| Language id | [optional]

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


## attributeValueAdd

> attributeValueAdd(attributeValueAddRequest): ApiRequest[AttributeAdd200Response]

attribute.value.add

Add new value to attribute.

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val attributeId: String = 156 // String | Attribute Id

    val name: String = Test name // String | Defines attribute value's name

    val code: String = code // String | Entity code

    val description: String = Test value // String | Defines attribute value's description

    val storeId: String = 1 // String | Store Id

    val langId: String = 3 // String | Language id
    
    val request = apiInstance.attributeValueAdd(attributeId, name, code, description, storeId, langId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeValueAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeValueAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeId** | **String**| Attribute Id |
 **name** | **String**| Defines attribute value&#39;s name |
 **code** | **String**| Entity code | [optional]
 **description** | **String**| Defines attribute value&#39;s description | [optional]
 **storeId** | **String**| Store Id | [optional]
 **langId** | **String**| Language id | [optional]

### Return type

ApiRequest[[**AttributeAdd200Response**](AttributeAdd200Response.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## attributeValueDelete

> attributeValueDelete(attributeValueDeleteRequest): ApiRequest[AttributeValueDelete200Response]

attribute.value.delete

Delete attribute value.

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val id: String = 10 // String | Entity id

    val attributeId: String = 156 // String | Attribute Id

    val storeId: String = 1 // String | Store Id
    
    val request = apiInstance.attributeValueDelete(id, attributeId, storeId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeValueDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeValueDelete")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id |
 **attributeId** | **String**| Attribute Id |
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


## attributeValueUpdate

> attributeValueUpdate(attributeValueUpdateRequest): ApiRequest[AttributeUpdate200Response]

attribute.value.update

Update attribute value.

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
    val apiInstance = AttributeApi("https://api.api2cart.com/v1.1")
    val id: String = 10 // String | Defines attribute value's id

    val attributeId: String = 156 // String | Attribute Id

    val name: String = Test name // String | Defines attribute value's name

    val description: String = Test value // String | Defines new attribute value's description

    val code: String = code // String | Entity code

    val storeId: String = 1 // String | Store Id

    val langId: String = 3 // String | Language id
    
    val request = apiInstance.attributeValueUpdate(id, attributeId, name, description, code, storeId, langId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AttributeApi#attributeValueUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AttributeApi#attributeValueUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Defines attribute value&#39;s id |
 **attributeId** | **String**| Attribute Id |
 **name** | **String**| Defines attribute value&#39;s name | [optional]
 **description** | **String**| Defines new attribute value&#39;s description | [optional]
 **code** | **String**| Entity code | [optional]
 **storeId** | **String**| Store Id | [optional]
 **langId** | **String**| Language id | [optional]

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


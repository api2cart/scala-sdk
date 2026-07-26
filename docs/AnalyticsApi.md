# AnalyticsApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyticsCustomerReport**](AnalyticsApi.md#analyticsCustomerReport) | **GET** /analytics.customer_report.json | analytics.customer_report
[**analyticsCustomerReportWithHttpInfo**](AnalyticsApi.md#analyticsCustomerReportWithHttpInfo) | **GET** /analytics.customer_report.json | analytics.customer_report
[**analyticsProductReport**](AnalyticsApi.md#analyticsProductReport) | **GET** /analytics.product_report.json | analytics.product_report
[**analyticsProductReportWithHttpInfo**](AnalyticsApi.md#analyticsProductReportWithHttpInfo) | **GET** /analytics.product_report.json | analytics.product_report
[**analyticsReport**](AnalyticsApi.md#analyticsReport) | **GET** /analytics.report.json | analytics.report
[**analyticsReportWithHttpInfo**](AnalyticsApi.md#analyticsReportWithHttpInfo) | **GET** /analytics.report.json | analytics.report



## analyticsCustomerReport

> analyticsCustomerReport(analyticsCustomerReportRequest): ApiRequest[ResponseAnalyticsCustomerReportResult]

analytics.customer_report

Get customer-level analytics for a store over a given period.

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
    val apiInstance = AnalyticsApi("https://api.api2cart.local.com/v1.1")
    val dateFrom: String = 2026-01-01 // String | Start date for the analytics period (Y-m-d or Y-m-d H:i:s)

    val dateTo: String = 2026-01-31 // String | End date for the analytics period (Y-m-d or Y-m-d H:i:s). Defaults to the current date.

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val currencyId: String = usd // String | Currency Id

    val storeId: String = 1 // String | Store Id

    val customerType: String = registered // String | Filter analytics customers by customer type

    val email: String = mail@example.com // String | Filter analytics customers by email

    val sortBy: String = total_spend // String | Set field to sort by

    val sortDirection: String = asc // String | Set sorting direction

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)

    val responseFields: String = {result} // String | Set this parameter to choose which entity fields to retrieve. Use comma-separated field names in curly braces, nested to match the response structure, e.g. {result{product{id,name}}}. The wildcard * returns every field at a level: {*} gives the whole response, {result{product{*}}} all product fields.
    
    val request = apiInstance.analyticsCustomerReport(dateFrom, dateTo, count, currencyId, storeId, customerType, email, sortBy, sortDirection, pageCursor, responseFields)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AnalyticsApi#analyticsCustomerReport")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AnalyticsApi#analyticsCustomerReport")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFrom** | **String**| Start date for the analytics period (Y-m-d or Y-m-d H:i:s) | [optional]
 **dateTo** | **String**| End date for the analytics period (Y-m-d or Y-m-d H:i:s). Defaults to the current date. | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **currencyId** | **String**| Currency Id | [optional]
 **storeId** | **String**| Store Id | [optional]
 **customerType** | **String**| Filter analytics customers by customer type | [optional]
 **email** | **String**| Filter analytics customers by email | [optional]
 **sortBy** | **String**| Set field to sort by | [optional]
 **sortDirection** | **String**| Set sorting direction | [optional]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional]
 **responseFields** | **String**| Set this parameter to choose which entity fields to retrieve. Use comma-separated field names in curly braces, nested to match the response structure, e.g. {result{product{id,name}}}. The wildcard * returns every field at a level: {*} gives the whole response, {result{product{*}}} all product fields. | [optional]

### Return type

ApiRequest[[**ResponseAnalyticsCustomerReportResult**](ResponseAnalyticsCustomerReportResult.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## analyticsProductReport

> analyticsProductReport(analyticsProductReportRequest): ApiRequest[ResponseAnalyticsProductReportResult]

analytics.product_report

Get product-level analytics for a store over a given period.

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
    val apiInstance = AnalyticsApi("https://api.api2cart.local.com/v1.1")
    val dateFrom: String = 2026-01-01 // String | Start date for the analytics period (Y-m-d or Y-m-d H:i:s)

    val dateTo: String = 2026-01-31 // String | End date for the analytics period (Y-m-d or Y-m-d H:i:s). Defaults to the current date.

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val productIds: String = 4,5 // String | Filter analytics by product ids

    val currencyId: String = usd // String | Currency Id

    val storeId: String = 1 // String | Store Id

    val categoriesIds: String = 23,56 // String | Defines product add that is specified by comma-separated categories id

    val sortBy: String = items_sold // String | Set field to sort by

    val sortDirection: String = asc // String | Set sorting direction

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)

    val responseFields: String = {result} // String | Set this parameter to choose which entity fields to retrieve. Use comma-separated field names in curly braces, nested to match the response structure, e.g. {result{product{id,name}}}. The wildcard * returns every field at a level: {*} gives the whole response, {result{product{*}}} all product fields.
    
    val request = apiInstance.analyticsProductReport(dateFrom, dateTo, count, productIds, currencyId, storeId, categoriesIds, sortBy, sortDirection, pageCursor, responseFields)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AnalyticsApi#analyticsProductReport")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AnalyticsApi#analyticsProductReport")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFrom** | **String**| Start date for the analytics period (Y-m-d or Y-m-d H:i:s) | [optional]
 **dateTo** | **String**| End date for the analytics period (Y-m-d or Y-m-d H:i:s). Defaults to the current date. | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **productIds** | **String**| Filter analytics by product ids | [optional]
 **currencyId** | **String**| Currency Id | [optional]
 **storeId** | **String**| Store Id | [optional]
 **categoriesIds** | **String**| Defines product add that is specified by comma-separated categories id | [optional]
 **sortBy** | **String**| Set field to sort by | [optional]
 **sortDirection** | **String**| Set sorting direction | [optional]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional]
 **responseFields** | **String**| Set this parameter to choose which entity fields to retrieve. Use comma-separated field names in curly braces, nested to match the response structure, e.g. {result{product{id,name}}}. The wildcard * returns every field at a level: {*} gives the whole response, {result{product{*}}} all product fields. | [optional]

### Return type

ApiRequest[[**ResponseAnalyticsProductReportResult**](ResponseAnalyticsProductReportResult.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## analyticsReport

> analyticsReport(analyticsReportRequest): ApiRequest[ResponseAnalyticsReportResult]

analytics.report

Get analytics report with totals and optional interval breakdown for a store over a given period.

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
    val apiInstance = AnalyticsApi("https://api.api2cart.local.com/v1.1")
    val dateFrom: String = 2026-01-01 // String | Start date for the analytics period (Y-m-d or Y-m-d H:i:s)

    val dateTo: String = 2026-01-31 // String | End date for the analytics period (Y-m-d or Y-m-d H:i:s). Defaults to the current date.

    val interval: String = day // String | Interval for analytics report breakdown

    val orderStatus: String = Completed // String | Retrieves orders specified by order status

    val financialStatus: String = paid // String | Retrieves orders specified by financial status

    val currencyId: String = usd // String | Currency Id

    val storeId: String = 1 // String | Store Id

    val sortBy: String = date // String | Set field to sort by

    val sortDirection: String = asc // String | Set sorting direction

    val responseFields: String = {result} // String | Set this parameter to choose which entity fields to retrieve. Use comma-separated field names in curly braces, nested to match the response structure, e.g. {result{product{id,name}}}. The wildcard * returns every field at a level: {*} gives the whole response, {result{product{*}}} all product fields.
    
    val request = apiInstance.analyticsReport(dateFrom, dateTo, interval, orderStatus, financialStatus, currencyId, storeId, sortBy, sortDirection, responseFields)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AnalyticsApi#analyticsReport")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AnalyticsApi#analyticsReport")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFrom** | **String**| Start date for the analytics period (Y-m-d or Y-m-d H:i:s) |
 **dateTo** | **String**| End date for the analytics period (Y-m-d or Y-m-d H:i:s). Defaults to the current date. | [optional]
 **interval** | **String**| Interval for analytics report breakdown | [optional]
 **orderStatus** | **String**| Retrieves orders specified by order status | [optional]
 **financialStatus** | **String**| Retrieves orders specified by financial status | [optional]
 **currencyId** | **String**| Currency Id | [optional]
 **storeId** | **String**| Store Id | [optional]
 **sortBy** | **String**| Set field to sort by | [optional]
 **sortDirection** | **String**| Set sorting direction | [optional]
 **responseFields** | **String**| Set this parameter to choose which entity fields to retrieve. Use comma-separated field names in curly braces, nested to match the response structure, e.g. {result{product{id,name}}}. The wildcard * returns every field at a level: {*} gives the whole response, {result{product{*}}} all product fields. | [optional]

### Return type

ApiRequest[[**ResponseAnalyticsReportResult**](ResponseAnalyticsReportResult.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


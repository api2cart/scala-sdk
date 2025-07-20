# MarketplaceApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**marketplaceProductFind**](MarketplaceApi.md#marketplaceProductFind) | **GET** /marketplace.product.find.json | marketplace.product.find
[**marketplaceProductFindWithHttpInfo**](MarketplaceApi.md#marketplaceProductFindWithHttpInfo) | **GET** /marketplace.product.find.json | marketplace.product.find



## marketplaceProductFind

> marketplaceProductFind(marketplaceProductFindRequest): ApiRequest[ModelResponseMarketplaceProductFind]

marketplace.product.find

Search product in global catalog.

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
    val apiInstance = MarketplaceApi("https://api.api2cart.local.com/v1.1")
    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val pageCursor: String =  // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)

    val keyword: String = T-shirt // String | Defines search keyword

    val categoriesIds: String = 23,56 // String | Defines product add that is specified by comma-separated categories id

    val storeId: String = 1 // String | Store Id

    val asin: String = 97703178470 // String | Amazon Standard Identification Number.

    val ean: String = 5901234123457 // String | European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products.

    val gtin: String = 12345678912345 // String | Global Trade Item Number. An GTIN is an identifier for trade items.

    val upc: String = 9770317847001 // String | Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products.

    val mpn: String = 9770317847001 // String | Manufacturer Part Number. A MPN is an identifier of a particular part design or material used.

    val isbn: String = 9783161484100 // String | International Standard Book Number. An ISBN is a unique identifier for books.

    val responseFields: String = {result} // String | Set this parameter in order to choose which entity fields you want to retrieve

    val params: String = id,model,price,images // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = false // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
    
    val request = apiInstance.marketplaceProductFind(count, pageCursor, keyword, categoriesIds, storeId, asin, ean, gtin, upc, mpn, isbn, responseFields, params, exclude)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MarketplaceApi#marketplaceProductFind")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MarketplaceApi#marketplaceProductFind")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional]
 **keyword** | **String**| Defines search keyword | [optional]
 **categoriesIds** | **String**| Defines product add that is specified by comma-separated categories id | [optional]
 **storeId** | **String**| Store Id | [optional]
 **asin** | **String**| Amazon Standard Identification Number. | [optional]
 **ean** | **String**| European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products. | [optional]
 **gtin** | **String**| Global Trade Item Number. An GTIN is an identifier for trade items. | [optional]
 **upc** | **String**| Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products. | [optional]
 **mpn** | **String**| Manufacturer Part Number. A MPN is an identifier of a particular part design or material used. | [optional]
 **isbn** | **String**| International Standard Book Number. An ISBN is a unique identifier for books. | [optional]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]

### Return type

ApiRequest[[**ModelResponseMarketplaceProductFind**](ModelResponseMarketplaceProductFind.md)]


### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


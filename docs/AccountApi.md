# AccountApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountCartAdd**](AccountApi.md#accountCartAdd) | **POST** /account.cart.add.json | account.cart.add
[**accountCartAddWithHttpInfo**](AccountApi.md#accountCartAddWithHttpInfo) | **POST** /account.cart.add.json | account.cart.add
[**accountCartList**](AccountApi.md#accountCartList) | **GET** /account.cart.list.json | account.cart.list
[**accountCartListWithHttpInfo**](AccountApi.md#accountCartListWithHttpInfo) | **GET** /account.cart.list.json | account.cart.list
[**accountConfigUpdate**](AccountApi.md#accountConfigUpdate) | **PUT** /account.config.update.json | account.config.update
[**accountConfigUpdateWithHttpInfo**](AccountApi.md#accountConfigUpdateWithHttpInfo) | **PUT** /account.config.update.json | account.config.update
[**accountFailedWebhooks**](AccountApi.md#accountFailedWebhooks) | **GET** /account.failed_webhooks.json | account.failed_webhooks
[**accountFailedWebhooksWithHttpInfo**](AccountApi.md#accountFailedWebhooksWithHttpInfo) | **GET** /account.failed_webhooks.json | account.failed_webhooks
[**accountSupportedPlatforms**](AccountApi.md#accountSupportedPlatforms) | **GET** /account.supported_platforms.json | account.supported_platforms
[**accountSupportedPlatformsWithHttpInfo**](AccountApi.md#accountSupportedPlatformsWithHttpInfo) | **GET** /account.supported_platforms.json | account.supported_platforms



## accountCartAdd

> accountCartAdd(accountCartAddRequest): ApiRequest[AccountCartAdd200Response]

account.cart.add

Use this method to automate the process of connecting stores to API2Cart. The list of parameters will vary depending on the platform. To get a list of parameters that are specific to a particular shopping platform, you need to execute the account.supported_platforms.json method.

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
    
    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = AccountApi("https://api.api2cart.local.com/v1.1")
    val accountCartAdd: AccountCartAdd =  // AccountCartAdd | 
    
    val request = apiInstance.accountCartAdd(accountCartAdd)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AccountApi#accountCartAdd")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AccountApi#accountCartAdd")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountCartAdd** | [**AccountCartAdd**](AccountCartAdd.md)|  |

### Return type

ApiRequest[[**AccountCartAdd200Response**](AccountCartAdd200Response.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## accountCartList

> accountCartList(accountCartListRequest): ApiRequest[AccountCartList200Response]

account.cart.list

This method lets you get a list of online stores connected to your API2Cart account. You can get the number of API requests to each store if you specify a period using parameters (request_from_date, request_to_date). The total_calls field is displayed only if there are parameters (request_from_date, request_to_date).

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
    
    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = AccountApi("https://api.api2cart.local.com/v1.1")
    val storeUrl: String = http://mystore.com // String | A web address of a store

    val storeKey: String = ab37fc230bc5df63a5be1b11220949be // String | Find store by store key

    val requestFromDate: String = 2010-07-29 // String | Retrieve entities from their creation date

    val requestToDate: String = 2100-08-29 // String | Retrieve entities to their creation date

    val params: String = url,store_key // String | Set this parameter in order to choose which entity fields you want to retrieve

    val exclude: String = url,store_key // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
    
    val request = apiInstance.accountCartList(storeUrl, storeKey, requestFromDate, requestToDate, params, exclude)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AccountApi#accountCartList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AccountApi#accountCartList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeUrl** | **String**| A web address of a store | [optional]
 **storeKey** | **String**| Find store by store key | [optional]
 **requestFromDate** | **String**| Retrieve entities from their creation date | [optional]
 **requestToDate** | **String**| Retrieve entities to their creation date | [optional]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional]

### Return type

ApiRequest[[**AccountCartList200Response**](AccountCartList200Response.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## accountConfigUpdate

> accountConfigUpdate(accountConfigUpdateRequest): ApiRequest[AccountConfigUpdate200Response]

account.config.update

Use this method to automate the change of credentials used to connect online stores. The list of supported parameters differs depending on the platform.

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
    val apiInstance = AccountApi("https://api.api2cart.local.com/v1.1")
    val replaceParameters: Boolean = true // Boolean | Identifies if there is a necessity to replace parameters

    val newStoreUrl: String = http://mystore.com // String | The web address of the store you want to update to connect to API2Cart

    val newStoreKey: String = b636495648de3086f6f57b1bd4be548f // String | Update store key

    val bridgeUrl: String = https://your-store.com/custom/bridge/path/bridge.php // String | This parameter allows to set up store with custom bridge url (also you must use store_root parameter if a bridge folder is not in the root folder of the store)

    val storeRoot: String = /home/www/stores/magento1922 // String | Absolute path to the store root directory (used with \"bridge_url\" parameter)

    val dbTablesPrefix: String = oc_ // String | DB tables prefix

    val userAgent: String = Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0 // String | This parameter allows you to set your custom user agent, which will be used in requests to the store. Please use it cautiously, as the store's firewall may block specific values.

    val `3dcartPrivateKey`: String = 7dba81f90bdbe25e7000e73214ca51b // String | 3DCart Private Key

    val `3dcartAccessToken`: String = 4Grr_ZCLNNoSUuhAjesKuchxo9SL // String | 3DCart Token

    val `3dcartapiApiKey`: String = 82cc921c6a5c67082cc921c6a5c6707e1d6e6862ba3201a // String | 3DCart API Key

    val amazonSpClientId: String = amzn1.application-oa2-client.11e000e1f47d4998aca3733716d3b5a4 // String | Amazon SP API app client id

    val amazonSpClientSecret: String = 2c987428209f235443221255bde064f4bdf8a65165a80f5d22760a83cb // String | Amazon SP API app client secret

    val amazonSpRefreshToken: String = Atzr|IwEBIPUI-bwRTdDgKNQ_g56C30wGqymtx30c9MdDC7Emwmojhs20k5BBG2hHtJiGZ_7OfG7khd1RuQr6KEst4qyWbo_eXi5S_T_VOxzJUuksG1cFOGFpFK-cnhReNzAeZIpZeJT7_ROy1csEFlQfC8FJS3bsbSkkbTz2ZcTN7_7ey0HVlhyfFizgROeSeOI24Wjs9l_KKzZW0jvi_oC2cxlIcyknnHLK6KMNz2rTXqQJWRtlK9xPJDdbcUa5STA8MQru91cxNBpSkZN_cq9OOELhbsIGKD75y7nZ3yJU4uHQC_9iBQQoFm0biKgi-kEQwOhwws8 // String | Amazon SP API OAuth refresh token

    val amazonSpAwsRegion: String = us-east-1 // String | Amazon AWS Region

    val amazonSpApiEnvironment: String = sandbox // String | Amazon SP API environment

    val amazonSellerId: String = 13P636B2M1N4WR // String | Amazon Seller ID (Merchant token)

    val aspdotnetstorefrontApiUser: String = admin // String | It's a AspDotNetStorefront account for which API is available

    val aspdotnetstorefrontApiPass: String = f6471ef78f72b41849a8b8b67791b0b5 // String | AspDotNetStorefront API Password

    val americommerceAppId: String = 1 // String | Americommerce App ID

    val americommerceAppSecret: String = 9fd3d282d65a007a2b9d541b5e0e410b2cecd6199632db53503b93637b8a6000 // String | Americommerce App Secret

    val americommerceAccessToken: String = 1e721f59b610e2666caea03094600765 // String | Americommerce Access Token

    val americommerceRefreshToken: String = 520c011444af41d916543cdda859a5114 // String | Americommerce Refresh Token

    val bigcommerceapiAdminAccount: String = admin // String | It's a BigCommerce account for which API is enabled

    val bigcommerceapiApiPath: String = http://mystore.bigcommerce.com/api/v1 // String | BigCommerce API URL

    val bigcommerceapiApiKey: String = 6b89704cd75738cb0f9f6468d5462aba // String | Bigcommerce API Key

    val bigcommerceapiClientId: String = p1r37bt131z86675nofv9xmhietoe4t // String | Client ID of the requesting app

    val bigcommerceapiAccessToken: String = igse8e4rdmzkxdi937qe69d59en1imw // String | Access token authorizing the app to access resources on behalf of a user

    val bigcommerceapiContext: String = stores/etplnf8o8v // String | API Path section unique to the store

    val bolApiKey: String = 51369628-feee-11ed-be56-0242ac120002 // String | Bol API Key

    val bolApiSecret: String = 8fGzEsbEP5z2MNZubmIil87m-sWzTkj?KDQKrmzmU!fA6aAUNMdKRp7LMWHwE!G37UMfnWByHBGSXJHkAG?QcuYTO2uklv4idIHwUMLHK!OO1yfRlWh! // String | Bol API Secret

    val bolRetailerId: Int = 145001 // Int | Bol Retailer ID

    val demandwareClientId: String = b849eb85-v8b9-1dw8-9fe2-97e1d6ffc7b0 // String | Demandware client id

    val demandwareApiPassword: String = testpassword // String | Demandware api password

    val demandwareUserName: String = admin // String | Demandware user name

    val demandwareUserPassword: String = 12345 // String | Demandware user password

    val ebayClientId: String = a9psel85v1wy5faeyjw03y0r // String | Application ID (AppID).

    val ebayClientSecret: String = gmz3iz45x2 // String | Shared Secret from eBay application

    val ebayRuname: String = gmz3iz45x2 // String | The RuName value that eBay assigns to your application.

    val ebayAccessToken: String = v^1.1#i ... AjRV4yNjA= // String | Used to authenticate API requests.

    val ebayRefreshToken: String = v^1.1#i ... rAewqVasdA= // String | Used to renew the access token.

    val ebayEnvironment: String = sandbox // String | eBay environment

    val ebaySiteId: Int = 101 // Int | eBay global ID

    val ecwidAcessToken: String = igse8e4rdmzkxdi937qe69d59en1imw // String | Access token authorizing the app to access resources on behalf of a user

    val ecwidStoreId: String = 1 // String | Store Id

    val lazadaAppId: String = 112577 // String | Lazada App ID

    val lazadaAppSecret: String = er33raICJ79Q5b0EsR9stmRnjE9XQ2WH // String | Lazada App Secret

    val lazadaRefreshToken: String = EAAPP06rM2n8BO4mZBuMPnu9zS0MaMbN7ue8aUkcxw4zewU337mVVb5br // String | Lazada Refresh Token

    val lazadaRegion: String = Malaysia // String | Lazada API endpoint Region

    val etsyKeystring: String = a9psel85v1wy5faeyjw03y0r // String | Etsy keystring

    val etsySharedSecret: String = gmz3iz45x2 // String | Etsy shared secret

    val etsyAccessToken: String = igse8e4rdmzkxdi937qe69d59en1imw // String | Access token authorizing the app to access resources on behalf of a user

    val etsyTokenSecret: String = igse8e4rdmzkxdi937qe69d59en1imw // String | Secret token authorizing the app to access resources on behalf of a user

    val etsyClientId: String = w0fi0igk2w29bjcd7ydr2s35 // String | Etsy Client Id

    val etsyRefreshToken: String = 223577551.L07_RE-y7unmKf2dox4djsHkVxwpUfs1ikG_uQmHhF-aASEReNn_Qns1Wqn3dDa0ZMxrt9CIael3dgudeDZb31ZUdS // String | Etsy Refresh token

    val facebookAppId: String = 6516912365277570 // String | Facebook App ID

    val facebookAppSecret: String = 737cf6bd2879cb6c7e5a8ff9cd63f3d46b0b5b7b // String | Facebook App Secret

    val facebookAccessToken: String = EAAPP06rM2n8BO4mZBuMPnu9zS0MaMbN7ue8aUAhqbS58clzJwyp1rYRMpP31QJGziqtYbKypdVx3Cs0RpuufoUeLsbfX195XIB8VTlkcxw4zewU337mVVb5br // String | Facebook Access Token

    val facebookBusinessId: String = 294042786906655 // String | Facebook Business ID

    val netoApiKey: String = bbca57d8ff3c3677128112c15556d9e3 // String | Neto API Key

    val netoApiUsername: String = mylogin // String | Neto User Name

    val shoplineAccessToken: String = igse8e4rdmzkxdi937qe69d59en1imw // String | Shopline APP Key

    val shoplineAppKey: String = 737cf6bd2879cb6c7e5a8ff9cd63f3d46b0b5b7b // String | Shopline APP Key

    val shoplineAppSecret: String = 1701d123bb5cc14cd2732dcaed90638316c0a09 // String | Shopline App Secret

    val shoplineSharedSecret: String = 1701d123bb5cc14cd2732dcaed90638316c0a09 // String | Shopline Shared Secret

    val shopifyAccessToken: String = igse8e4rdmzkxdi937qe69d59en1imw // String | Access token authorizing the app to access resources on behalf of a user

    val shopifyClientId: String = b5defe55db3f6836fb4e0e6624ff9577 // String | Shopify Client ID

    val shopifyApiKey: String = bbca57d8ff3c3677128112c15556d9e3 // String | Shopify API Key

    val shopifyApiPassword: String = 860f3a6fc87632301a42cd88e4b5ab3d // String | Shopify API Password

    val shopifySharedSecret: String = gmz3iz45x2 // String | Shared secret

    val shopeePartnerId: String = 1276777 // String | Shopee Partner ID

    val shopeePartnerKey: String = 6a46494b4d746576554646626775617a577542774850636375464d6a736d5598 // String | Shopee Partner Key

    val shopeeShopId: String = 137968 // String | Shopee SHOP ID

    val shopeeRefreshToken: String = EAAPP06rM2n8BO4mZBuMPnu9zS0MaMbN7ue8aUkcxw4zewU987mVVb5br // String | Shopee Refresh Token

    val shopeeRegion: String = CN // String | Shopee API endpoint Region. Use for Chinese Mainland or Brazil.

    val shopeeEnvironment: String = sandbox // String | Shopee Environment

    val shoplazzaAccessToken: String = igse8e4rdmzkxdi937qe69d59en1imw // String | Access token authorizing the app to access resources on behalf of a user

    val shoplazzaSharedSecret: String = gmz3iz45x2 // String | Shared secret

    val mivaAccessToken: String = 227cbe434a1e358d72db0de993x9d9fd // String | Miva access token

    val mivaSignature: String = 1hpkrebfdsObGTor/0Gk9XcNBUQohrxrw67Sg9AM9ps= // String | Miva signature

    val shopwareAccessKey: String = SWSCS3O1RJBSRNBYQLFIYJN2ZQ // String | Shopware access key

    val unasApiKey: String = c238908e29ceb6e6ad3df15f89a6234709d3f000 // String | UNAS API Key

    val shopwareApiKey: String = SWSCS3O1RJBSRNBYQLFIYJN2ZQ // String | Shopware api key

    val shopwareApiSecret: String = V3NYNWg2b1dZdHBUWDN1cmdKdGhnenp5enVJYlJ0WlJvOFF2bnQ // String | Shopware client secret access key

    val bigcartelUserName: String = subdomain // String | Subdomain of store

    val bigcartelPassword: String = 4GrrZCLNNoSUuhAjesKuchxo9SL // String | BigCartel account password

    val bricklinkConsumerKey: String = 26F6CDA087D9444EAA71AC09E7A1D39A // String | Bricklink Consumer Key

    val bricklinkConsumerSecret: String = a46abc3kxyinlbggy06i9g975xqo6gjq // String | Bricklink Consumer Secret

    val bricklinkToken: String = ktv4n9rgrj0evjuy2t6p2xlb1f8u5pmy // String | Bricklink Access Token

    val bricklinkTokenSecret: String = a46abc3kxyinlbggy06i9g975xqo6gjq // String | Bricklink Access Token Secret

    val volusionLogin: String = admin // String | It's a Volusion account for which API is enabled

    val volusionPassword: String = 7943CA5F3990E00D9A4CCF0BD998211F // String | Volusion API Password

    val walmartClientId: String = 423f6A24-123z-8654-989u-6fa96478289 // String | Walmart client ID. For the region 'ca' use Consumer ID

    val walmartClientSecret: String = 1gf85fea-8974-2648-w12w-rt54284tdf54 // String | Walmart client secret. For the region 'ca' use Private Key

    val walmartEnvironment: String = production // String | Walmart environment

    val walmartChannelType: String = 0f3e4dd4-0514-4346-b39d-af0e00ea066d // String | Walmart WM_CONSUMER.CHANNEL.TYPE header

    val walmartRegion: String = us // String | Walmart region

    val squareClientId: String = sq0idp-qwer_1pvuTYe9cAf1lmxyQ // String | Square (Weebly) Client ID

    val squareClientSecret: String = c8d7077fce7b2b111111111898170695a01473a2ad // String | Square (Weebly) Client Secret

    val squareRefreshToken: String = EQAAlquVXMr6xIcPu7qPkIEAZ0thqChhQuowrvZIqOlwhOwhtmyh4ZRfesdRc434 // String | Square (Weebly) Refresh Token

    val squarespaceApiKey: String = 8f7849d5-1411-47f2-9722-aa81c2a48d95 // String | Squarespace API Key

    val squarespaceClientId: String = 9UGbUtS2V96BxRGmfOjsGAhTdsr9Vxxx // String | Squarespace Connector Client ID

    val squarespaceClientSecret: String = GPZkUFkIKWg0KLE6rajsFMMYA9ma0udaaq2bYwBDXXX= // String | Squarespace Connector Client Secret

    val squarespaceAccessToken: String = SWSCS3O1RJBSRNBYQLFIYJN2ZQ // String | Squarespace access token

    val squarespaceRefreshToken: String = def50eyfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe657e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65de64a0c865d // String | Squarespace refresh token

    val hybrisClientId: String = api_client_1 // String | Omni Commerce Connector Client ID

    val hybrisClientSecret: String = secret_phrase_1 // String | Omni Commerce Connector Client Secret

    val hybrisUsername: String = admin // String | User Name

    val hybrisPassword: String = nimda // String | User password

    val hybrisWebsites: Seq[String] = hybris_websites[0][uid]=apparel-website&hybris_websites[0][url]=https://apparel.local/yacceleratorstorefront&hybris_websites[0][storeIds][0]=apparel-de&hybris_websites[0][storeIds][1]=apparel-uk // Seq[String] | Websites to stores mapping data

    val lightspeedApiKey: String = cf5444729c2abd6b6a5d983691767cb5 // String | LightSpeed api key

    val lightspeedApiSecret: String = 2620ee52a8bc942f9d5d3a575f4d363e // String | LightSpeed api secret

    val commercehqApiKey: String = sJrD-LM0eddhe63rfgfva0dDydXfre4 // String | CommerceHQ api key

    val commercehqApiPassword: String = 4Grr_ZCLNNoSUuhAjesKuchxo9SL // String | CommerceHQ api password

    val wcConsumerKey: String = ck_26d8e2ad604f3917e429df6961722282bdcf109d // String | Woocommerce consumer key

    val wcConsumerSecret: String = cs_931ced666118a15c5f7b4a33a15gf5589cbeba55 // String | Woocommerce consumer secret

    val magentoConsumerKey: String = ktv4n9rgrj0evjuy2t6p2xlb1f8u5pmy // String | Magento Consumer Key

    val magentoConsumerSecret: String = a46abc3kxyinlbggy06i9g975xqo6gjq // String | Magento Consumer Secret

    val magentoAccessToken: String = igse8e4rdmzkxdi937qe69d59en1imw // String | Magento Access Token

    val magentoTokenSecret: String = igse8e4rdmzkxdi937qe69d59en1imw // String | Magento Token Secret

    val prestashopWebserviceKey: String = CKJ1ZEWRJWRLTPVBQJ9FGGRORD4AGS96 // String | Prestashop webservice key

    val wixAppId: String = 6b0b5b7b-7d87-45b5-bf34-ac6b438e63da // String | Wix App ID

    val wixAppSecretKey: String = 316c0a09-f195-42be-74f6-a02cebb9cae6 // String | Wix App Secret Key

    val wixInstanceId: String = 58b893a4-6b16-5c2f-qt78-qa3r61t32rt8 // String | Wix Instance ID

    val wixRefreshToken: String = 
        OAUTH2.eyJraWQiOiJkZ0x3cjNRMCIsImFsZyI6IkhTMjU2In0.
        eyJkYXRhIjoie1wiaWRcIjpcImJlZjM3MmRmLTUyNGItNDI3NS05M2RkL
        Tg4NDBlOTU3ZWU2OFwifSIsImlhdCI6MTY0ODA0NTEyNiwiZXhwIjoxNzExMTE3MTI2fQ.
        VRR2lGSbcTVmaArtmyyhy6o4WRDwTn-nlDCQpZ97eYw
       // String | Wix refresh token

    val mercadoLibreAppId: String = 211188015100135 // String | Mercado Libre App ID

    val mercadoLibreAppSecretKey: String = e2qoG2zklLlfP7cEngEJ94YjhkejkjAm // String | Mercado Libre App Secret Key

    val mercadoLibreRefreshToken: String = TG-63h13529vb5464110188d2x9-703754376 // String | Mercado Libre Refresh Token

    val zidClientId: Int = 1234 // Int | Zid Client ID

    val zidClientSecret: String = nl5l1lE0vxgv6cV111fHsdlOOIfb0Ms5IR7l4Igs // String | Zid Client Secret

    val zidAccessToken: String = def50eyfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe657e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65de64a0c865d // String | Zid Access Token

    val zidAuthorization: String = def50eyfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe657e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65de64a0c865d // String | Zid Authorization

    val zidRefreshToken: String = def50eyfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe657e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65de64a0c865d // String | Zid refresh token

    val flipkartClientId: String = 19414773883a13a850b6a52350b7246499a24 // String | Flipkart Client ID

    val flipkartClientSecret: String = nl5l1lE0vxgv6cV111fHsdlOOIfb0Ms5IR7l4Igs // String | Flipkart Client Secret

    val allegroClientId: String = 2915e189ce3d23d23d2327d204ae6a0bd // String | Allegro Client ID

    val allegroClientSecret: String = DNHtqdL2WPIefeUhQWYgtXPS23fgbfgasdsGHHJGhg3RTFDQWFGZmVoFRT5IfkQj1E7eR5 // String | Allegro Client Secret

    val allegroAccessToken: String = eyJhbGciOiJSUzI1NiIsInR5cCI6IsfddfdfdeyJ1c2VyX25hbWUiOiI5NDUxMzE1MSIsInNjb3BlIjpbImFsbGVncm86YXBpOm9yZGVyczpyZWFkIiwiYWxsZWdybzphcGk6cHJvZmlsZTp3cml0ZSIsImFsbGVncm86YXBpOnNhbGU6b2ZmZXJzOndyaXRlIiwiYWxsZWdybzphcGk6YmlsbGluZzpyZWFkIiwiYWxsZWdybzphcGk6Y2FtcGFpZ25zIiwiYWxsZWdybzphcGk6ZGlzcHV0ZXMiLCJhbGxlZ3JvOmFwaTpzYWxlOm9mZmVyczpyZWFkIiwiYWxsZWdybzphcGk6YmlkcyIsImFsbGVncm86YXBpOm9yZGVyczp3cml0ZSIsImFsbGVncm86YXBpOnBheW1lbnRzOndyaXRlIiwiYWxsZWdybzphcGk6c2FsZTpzZXR0aW5nczp3cml0ZSIsImFsbGVncm86YXBpOnByb2ZpbGU6cmVhZCIsImFsbGVncm86YXBpOnJhdGluZ3MiLCJhbGxlZ3JvOmFwaTpzYWxlOnNldHRpbmdzOnJlYWQiLCJhbGxlZ3JvOmFwaTpwYXltZW50czpyZWFkIiwiYWxsZWdybzphcGk6bWVzc2FnaW5nIl0sI // String | Allegro Access Token

    val allegroRefreshToken: String = eyJhbGciOiJSUzI1NiIsInR5cCI6IsfddfdfdeyJ1c2VyX25hbWUiOiI5NDUxMzE1MSIsInNjb3BlIjpbImFsbGVncm86YXBpOm9yZGVyczpyZWFkIiwiYWxsZWdybzphcGk6cHJvZmlsZTp3cml0ZSIsImFsbGVncm86YXBpOnNhbGU6b2ZmZXJzOndyaXRlIiwiYWxsZWdybzphcGk6YmlsbGluZzpyZWFkIiwiYWxsZWdybzphcGk6Y2FtcGFpZ25zIiwiYWxsZWdybzphcGk6ZGlzcHV0ZXMiLCJhbGxlZ3JvOmFwaTpzYWxlOm9mZmVyczpyZWFkIiwiYWxsZWdybzphcGk6YmlkcyIsImFsbGVncm86YXBpOm9yZGVyczp3cml0ZSIsImFsbGVncm86YXBpOnBheW1lbnRzOndyaXRlIiwiYWxsZWdybzphcGk6c2FsZTpzZXR0aW5nczp3cml0ZSIsImFsbGVncm86YXBpOnByb2ZpbGU6cmVhZCIsImFsbGVncm86YXBpOnJhdGluZ3MiLCJhbGxlZ3JvOmFwaTpzYWxlOnNldHRpbmdzOnJlYWQiLCJhbGxlZ3JvOmFwaTpwYXltZW50czpyZWFkIiwiYWxsZWdybzphcGk6bWVzc2FnaW5nIl0sI // String | Allegro Refresh Token

    val allegroEnvironment: String = sandbox // String | Allegro Environment

    val zohoClientId: String = 1000.FLCHGI2LS1111111TOR4OGB697W4IX // String | Zoho Client ID

    val zohoClientSecret: String = c8d7077fce7b2b111111111898170695a01473a2ad // String | Zoho Client Secret

    val zohoRefreshToken: String = 1000.11111111111111111111111111111111.1b3ca6f054341a111118abf928beb33b // String | Zoho Refresh Token

    val zohoRegion: String = Europe // String | Zoho API endpoint Region

    val tiendanubeUserId: Int = 1234 // Int | Tiendanube User ID

    val tiendanubeAccessToken: String = 75bde7bb0b437475423e7e87c142c06052f80199 // String | Tiendanube Access Token

    val tiendanubeClientSecret: String = 5e3588f514a5ae0d0fa063d1b556531e25c83fa7e47472ed // String | Tiendanube Client Secret

    val ottoClientId: String = 911a3dbf-d261-4763-cc81-052876465b55 // String | Otto Client ID

    val ottoClientSecret: String = 9887a82a-2879-421e-a6wc-54e986b3458c // String | Otto Client Secret

    val ottoAppId: String = 6eaef6a3-822e-425b-8mc9-53750063e34d // String | Otto App ID

    val ottoRefreshToken: String = eyJhbGciOiJSUzI1NiIsInR5cCI6IsfddfdfdeyJ1c2VyX25hbWUiOiI5NDUxMzE1MSIsInNjb3BlIjpbImFsbGVncm86YXBpOm9yZGVyczpyZWFkIiwiYWxsZWdybzphcGk6cHJvZmlsZTp3cml0ZSIsImFsbGVncm86YXBpOnNhbGU6b2ZmZXJzOndyaXRlIiwiYWxsZWdybzphcGk6YmlsbGluZzpyZWFkIiwiYWxsZWdybzphcGk6Y2FtcGFpZ25zIiwiYWxsZWdybzphcGk6ZGlzcHV0ZXMiLCJhbGxlZ3JvOmFwaTpzYWxlOm9mZmVyczpyZWFkIiwiYWxsZWdybzphcGk6YmlkcyIsImFsbGVncm86YXBpOm9yZGVyczp3cml0ZSIsImFsbGVncm86YXBpOnBheW1lbnRzOndyaXRlIiwiYWxsZWdybzphcGk6c2FsZTpzZXR0aW5nczp3cml0ZSIsImFsbGVncm86YXBpOnByb2ZpbGU6cmVhZCIsImFsbGVncm86YXBpOnJhdGluZ3MiLCJhbGxlZ3JvOmFwaTpzYWxlOnNldHRpbmdzOnJlYWQiLCJhbGxlZ3JvOmFwaTpwYXltZW50czpyZWFkIiwiYWxsZWdybzphcGk6bWVzc2FnaW5nIl0sI // String | Otto Refresh Token

    val ottoEnvironment: String = sandbox // String | Otto Environment

    val ottoAccessToken: String = eyJhbGciOiJS34535f45f54f5656deyJ1c2VyX25hbWUiOiI5NDUxMzE1MSIsInNjb3BlIjpbImFsbGVncm86YXBpOm9yZGVyczpyZWFkIiwiYWxsZWdybzphcGk6cHJvZmlsZTp3cml0ZSIsImFsbGVncm86YXBpOnNhbGU6b2ZmZXJzOndyaXRlIiwiYWxsZWdybzphcGk6YmlsbGluZzpyZWFkIiwiYWxsZWdybzphcGk6Y2FtcGFpZ25zIiwiYWxsZWdybzphcGk6ZGlzcHV0ZXMiLCJhbGxlZ3JvOmFwaTpzYWxlOm9mZmVyczpyZWFkIiwiYWxsZWdybzphcGk6YmlkcyIsImFsbGVncm86YXBpOm9yZGVyczp3cml0ZSIsImFsbGVncm86YXBpOnBheW1lbnRzOndyaXRlIiwiYWxsZWdybzphcGk6c2FsZTpzZXR0aW5nczp3cml0ZSIsImFsbGVncm86YXBpOnByb2ZpbGU6cmVhZCIsImFsbGVncm86YXBpOnJhdGluZ3MiLCJhbGxlZ3JvOmFwaTpzYWxlOnNldHRpbmdzOnJlYWQiLCJhbGxlZ3JvOmFwaTpwYXltZW50czpyZWFkIiwiYWxsZWdybzphcGk6bWVzc2FnaW5nIl0sI // String | Otto Access Token

    val tiktokshopAppKey: String = 6arbhkzno8nbv // String | TikTok Shop App Key

    val tiktokshopAppSecret: String = d95820a05a0cd54fb394fcd26fgat63999b183bc // String | TikTok Shop App Secret

    val tiktokshopRefreshToken: String = TTP_NTUxZTNhYTQ2ZDk2YmRmZWNmYWY2YWY12345NGYwNjQ3YjkzYTllYjA0YmNlMw // String | TikTok Shop Refresh Token

    val tiktokshopAccessToken: String = TTP_Fw8r12345kW03FYd09DG-9INtpw361hWthei12345iPJ5AUv99fLSCYD9-Uu12345TgNRzKZxi5-tfFMtdWqglEt5_iCk // String | TikTok Shop Access Token

    val sallaClientId: String = 1bxxxcf9-5xx4-xxx-bxxf-929b8xxxxe11 // String | Salla Client ID

    val sallaClientSecret: String = 8x88axxxc25e1fxxxa1c06fxxx150xx5 // String | Salla Client Secret

    val sallaRefreshToken: String = oxy_rt_zxxxxiY2xxZWWxxxxlU-tROxxxxx2JzS2fwzxxxxxkU.p3xxxkCIyFexxxxP50WwZYfhw5_wg1xxxxV5F-8xxXc // String | Salla Refresh Token

    val sallaAccessToken: String = oxy_rt_zxxxxiY2xxZWWxxxxlU-tROxxxxx2JzS2fwzxxxxxkU.p3xxxkCIyFexxxxP50WwZYfhw5_wg1xxxxV5F-8xxXc // String | Salla Access Token

    val temuAppKey: String = 4ebbc9190ae410443d65b4c2faca9811 // String | Temu App Key

    val temuAppSecret: String = 4782d2d827276688bf4758bed55dbdd4bbe79a78 // String | Temu App Secret

    val temuAccessToken: String = uplv3hfyt5kcwoymrgnajnbl1ow5qxlz4sqhev6hl3xosz5dejrtyl2jre6 // String | Temu Access Token

    val temuRegion: String = US // String | Temu API endpoint Region.

    val scapiClientId: String = b941ec85-v6b2-1dw8-9fe2-98e1d6eec7b1 // String | Salesforce Commerce API Client ID

    val scapiClientSecret: String = testpassword // String | Salesforce Commerce API Client Secret

    val scapiOrganizationId: String = f_ecom_xxxx_001 // String | Salesforce Commerce Organization ID

    val scapiShortCode: String = zs5ksm25 // String | Salesforce Commerce Short Code

    val scapiScopes: String = sfcc.catalogs,sfcc.orders,sfcc.products // String | Salesforce Commerce API Scopes

    val idempotencyKey: String = 098f6bcd4621d373cade4e832627b4f6 // String | A unique identifier associated with a specific request. Repeated requests with the same <strong>idempotency_key</strong> return a cached response without re-executing the business logic. <strong>Please note that the cache lifetime is 15 minutes.</strong>
    
    val request = apiInstance.accountConfigUpdate(replaceParameters, newStoreUrl, newStoreKey, bridgeUrl, storeRoot, dbTablesPrefix, userAgent, `3dcartPrivateKey`, `3dcartAccessToken`, `3dcartapiApiKey`, amazonSpClientId, amazonSpClientSecret, amazonSpRefreshToken, amazonSpAwsRegion, amazonSpApiEnvironment, amazonSellerId, aspdotnetstorefrontApiUser, aspdotnetstorefrontApiPass, americommerceAppId, americommerceAppSecret, americommerceAccessToken, americommerceRefreshToken, bigcommerceapiAdminAccount, bigcommerceapiApiPath, bigcommerceapiApiKey, bigcommerceapiClientId, bigcommerceapiAccessToken, bigcommerceapiContext, bolApiKey, bolApiSecret, bolRetailerId, demandwareClientId, demandwareApiPassword, demandwareUserName, demandwareUserPassword, ebayClientId, ebayClientSecret, ebayRuname, ebayAccessToken, ebayRefreshToken, ebayEnvironment, ebaySiteId, ecwidAcessToken, ecwidStoreId, lazadaAppId, lazadaAppSecret, lazadaRefreshToken, lazadaRegion, etsyKeystring, etsySharedSecret, etsyAccessToken, etsyTokenSecret, etsyClientId, etsyRefreshToken, facebookAppId, facebookAppSecret, facebookAccessToken, facebookBusinessId, netoApiKey, netoApiUsername, shoplineAccessToken, shoplineAppKey, shoplineAppSecret, shoplineSharedSecret, shopifyAccessToken, shopifyClientId, shopifyApiKey, shopifyApiPassword, shopifySharedSecret, shopeePartnerId, shopeePartnerKey, shopeeShopId, shopeeRefreshToken, shopeeRegion, shopeeEnvironment, shoplazzaAccessToken, shoplazzaSharedSecret, mivaAccessToken, mivaSignature, shopwareAccessKey, unasApiKey, shopwareApiKey, shopwareApiSecret, bigcartelUserName, bigcartelPassword, bricklinkConsumerKey, bricklinkConsumerSecret, bricklinkToken, bricklinkTokenSecret, volusionLogin, volusionPassword, walmartClientId, walmartClientSecret, walmartEnvironment, walmartChannelType, walmartRegion, squareClientId, squareClientSecret, squareRefreshToken, squarespaceApiKey, squarespaceClientId, squarespaceClientSecret, squarespaceAccessToken, squarespaceRefreshToken, hybrisClientId, hybrisClientSecret, hybrisUsername, hybrisPassword, hybrisWebsites, lightspeedApiKey, lightspeedApiSecret, commercehqApiKey, commercehqApiPassword, wcConsumerKey, wcConsumerSecret, magentoConsumerKey, magentoConsumerSecret, magentoAccessToken, magentoTokenSecret, prestashopWebserviceKey, wixAppId, wixAppSecretKey, wixInstanceId, wixRefreshToken, mercadoLibreAppId, mercadoLibreAppSecretKey, mercadoLibreRefreshToken, zidClientId, zidClientSecret, zidAccessToken, zidAuthorization, zidRefreshToken, flipkartClientId, flipkartClientSecret, allegroClientId, allegroClientSecret, allegroAccessToken, allegroRefreshToken, allegroEnvironment, zohoClientId, zohoClientSecret, zohoRefreshToken, zohoRegion, tiendanubeUserId, tiendanubeAccessToken, tiendanubeClientSecret, ottoClientId, ottoClientSecret, ottoAppId, ottoRefreshToken, ottoEnvironment, ottoAccessToken, tiktokshopAppKey, tiktokshopAppSecret, tiktokshopRefreshToken, tiktokshopAccessToken, sallaClientId, sallaClientSecret, sallaRefreshToken, sallaAccessToken, temuAppKey, temuAppSecret, temuAccessToken, temuRegion, scapiClientId, scapiClientSecret, scapiOrganizationId, scapiShortCode, scapiScopes, idempotencyKey)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AccountApi#accountConfigUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AccountApi#accountConfigUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replaceParameters** | **Boolean**| Identifies if there is a necessity to replace parameters | [optional]
 **newStoreUrl** | **String**| The web address of the store you want to update to connect to API2Cart | [optional]
 **newStoreKey** | **String**| Update store key | [optional]
 **bridgeUrl** | **String**| This parameter allows to set up store with custom bridge url (also you must use store_root parameter if a bridge folder is not in the root folder of the store) | [optional]
 **storeRoot** | **String**| Absolute path to the store root directory (used with \&quot;bridge_url\&quot; parameter) | [optional]
 **dbTablesPrefix** | **String**| DB tables prefix | [optional]
 **userAgent** | **String**| This parameter allows you to set your custom user agent, which will be used in requests to the store. Please use it cautiously, as the store&#39;s firewall may block specific values. | [optional]
 **`3dcartPrivateKey`** | **String**| 3DCart Private Key | [optional]
 **`3dcartAccessToken`** | **String**| 3DCart Token | [optional]
 **`3dcartapiApiKey`** | **String**| 3DCart API Key | [optional]
 **amazonSpClientId** | **String**| Amazon SP API app client id | [optional]
 **amazonSpClientSecret** | **String**| Amazon SP API app client secret | [optional]
 **amazonSpRefreshToken** | **String**| Amazon SP API OAuth refresh token | [optional]
 **amazonSpAwsRegion** | **String**| Amazon AWS Region | [optional]
 **amazonSpApiEnvironment** | **String**| Amazon SP API environment | [optional]
 **amazonSellerId** | **String**| Amazon Seller ID (Merchant token) | [optional]
 **aspdotnetstorefrontApiUser** | **String**| It&#39;s a AspDotNetStorefront account for which API is available | [optional]
 **aspdotnetstorefrontApiPass** | **String**| AspDotNetStorefront API Password | [optional]
 **americommerceAppId** | **String**| Americommerce App ID | [optional]
 **americommerceAppSecret** | **String**| Americommerce App Secret | [optional]
 **americommerceAccessToken** | **String**| Americommerce Access Token | [optional]
 **americommerceRefreshToken** | **String**| Americommerce Refresh Token | [optional]
 **bigcommerceapiAdminAccount** | **String**| It&#39;s a BigCommerce account for which API is enabled | [optional]
 **bigcommerceapiApiPath** | **String**| BigCommerce API URL | [optional]
 **bigcommerceapiApiKey** | **String**| Bigcommerce API Key | [optional]
 **bigcommerceapiClientId** | **String**| Client ID of the requesting app | [optional]
 **bigcommerceapiAccessToken** | **String**| Access token authorizing the app to access resources on behalf of a user | [optional]
 **bigcommerceapiContext** | **String**| API Path section unique to the store | [optional]
 **bolApiKey** | **String**| Bol API Key | [optional]
 **bolApiSecret** | **String**| Bol API Secret | [optional]
 **bolRetailerId** | **Int**| Bol Retailer ID | [optional]
 **demandwareClientId** | **String**| Demandware client id | [optional]
 **demandwareApiPassword** | **String**| Demandware api password | [optional]
 **demandwareUserName** | **String**| Demandware user name | [optional]
 **demandwareUserPassword** | **String**| Demandware user password | [optional]
 **ebayClientId** | **String**| Application ID (AppID). | [optional]
 **ebayClientSecret** | **String**| Shared Secret from eBay application | [optional]
 **ebayRuname** | **String**| The RuName value that eBay assigns to your application. | [optional]
 **ebayAccessToken** | **String**| Used to authenticate API requests. | [optional]
 **ebayRefreshToken** | **String**| Used to renew the access token. | [optional]
 **ebayEnvironment** | **String**| eBay environment | [optional]
 **ebaySiteId** | **Int**| eBay global ID | [optional]
 **ecwidAcessToken** | **String**| Access token authorizing the app to access resources on behalf of a user | [optional]
 **ecwidStoreId** | **String**| Store Id | [optional]
 **lazadaAppId** | **String**| Lazada App ID | [optional]
 **lazadaAppSecret** | **String**| Lazada App Secret | [optional]
 **lazadaRefreshToken** | **String**| Lazada Refresh Token | [optional]
 **lazadaRegion** | **String**| Lazada API endpoint Region | [optional]
 **etsyKeystring** | **String**| Etsy keystring | [optional]
 **etsySharedSecret** | **String**| Etsy shared secret | [optional]
 **etsyAccessToken** | **String**| Access token authorizing the app to access resources on behalf of a user | [optional]
 **etsyTokenSecret** | **String**| Secret token authorizing the app to access resources on behalf of a user | [optional]
 **etsyClientId** | **String**| Etsy Client Id | [optional]
 **etsyRefreshToken** | **String**| Etsy Refresh token | [optional]
 **facebookAppId** | **String**| Facebook App ID | [optional]
 **facebookAppSecret** | **String**| Facebook App Secret | [optional]
 **facebookAccessToken** | **String**| Facebook Access Token | [optional]
 **facebookBusinessId** | **String**| Facebook Business ID | [optional]
 **netoApiKey** | **String**| Neto API Key | [optional]
 **netoApiUsername** | **String**| Neto User Name | [optional]
 **shoplineAccessToken** | **String**| Shopline APP Key | [optional]
 **shoplineAppKey** | **String**| Shopline APP Key | [optional]
 **shoplineAppSecret** | **String**| Shopline App Secret | [optional]
 **shoplineSharedSecret** | **String**| Shopline Shared Secret | [optional]
 **shopifyAccessToken** | **String**| Access token authorizing the app to access resources on behalf of a user | [optional]
 **shopifyClientId** | **String**| Shopify Client ID | [optional]
 **shopifyApiKey** | **String**| Shopify API Key | [optional]
 **shopifyApiPassword** | **String**| Shopify API Password | [optional]
 **shopifySharedSecret** | **String**| Shared secret | [optional]
 **shopeePartnerId** | **String**| Shopee Partner ID | [optional]
 **shopeePartnerKey** | **String**| Shopee Partner Key | [optional]
 **shopeeShopId** | **String**| Shopee SHOP ID | [optional]
 **shopeeRefreshToken** | **String**| Shopee Refresh Token | [optional]
 **shopeeRegion** | **String**| Shopee API endpoint Region. Use for Chinese Mainland or Brazil. | [optional]
 **shopeeEnvironment** | **String**| Shopee Environment | [optional]
 **shoplazzaAccessToken** | **String**| Access token authorizing the app to access resources on behalf of a user | [optional]
 **shoplazzaSharedSecret** | **String**| Shared secret | [optional]
 **mivaAccessToken** | **String**| Miva access token | [optional]
 **mivaSignature** | **String**| Miva signature | [optional]
 **shopwareAccessKey** | **String**| Shopware access key | [optional]
 **unasApiKey** | **String**| UNAS API Key | [optional]
 **shopwareApiKey** | **String**| Shopware api key | [optional]
 **shopwareApiSecret** | **String**| Shopware client secret access key | [optional]
 **bigcartelUserName** | **String**| Subdomain of store | [optional]
 **bigcartelPassword** | **String**| BigCartel account password | [optional]
 **bricklinkConsumerKey** | **String**| Bricklink Consumer Key | [optional]
 **bricklinkConsumerSecret** | **String**| Bricklink Consumer Secret | [optional]
 **bricklinkToken** | **String**| Bricklink Access Token | [optional]
 **bricklinkTokenSecret** | **String**| Bricklink Access Token Secret | [optional]
 **volusionLogin** | **String**| It&#39;s a Volusion account for which API is enabled | [optional]
 **volusionPassword** | **String**| Volusion API Password | [optional]
 **walmartClientId** | **String**| Walmart client ID. For the region &#39;ca&#39; use Consumer ID | [optional]
 **walmartClientSecret** | **String**| Walmart client secret. For the region &#39;ca&#39; use Private Key | [optional]
 **walmartEnvironment** | **String**| Walmart environment | [optional]
 **walmartChannelType** | **String**| Walmart WM_CONSUMER.CHANNEL.TYPE header | [optional]
 **walmartRegion** | **String**| Walmart region | [optional]
 **squareClientId** | **String**| Square (Weebly) Client ID | [optional]
 **squareClientSecret** | **String**| Square (Weebly) Client Secret | [optional]
 **squareRefreshToken** | **String**| Square (Weebly) Refresh Token | [optional]
 **squarespaceApiKey** | **String**| Squarespace API Key | [optional]
 **squarespaceClientId** | **String**| Squarespace Connector Client ID | [optional]
 **squarespaceClientSecret** | **String**| Squarespace Connector Client Secret | [optional]
 **squarespaceAccessToken** | **String**| Squarespace access token | [optional]
 **squarespaceRefreshToken** | **String**| Squarespace refresh token | [optional]
 **hybrisClientId** | **String**| Omni Commerce Connector Client ID | [optional]
 **hybrisClientSecret** | **String**| Omni Commerce Connector Client Secret | [optional]
 **hybrisUsername** | **String**| User Name | [optional]
 **hybrisPassword** | **String**| User password | [optional]
 **hybrisWebsites** | [**Seq[String]**](String.md)| Websites to stores mapping data | [optional]
 **lightspeedApiKey** | **String**| LightSpeed api key | [optional]
 **lightspeedApiSecret** | **String**| LightSpeed api secret | [optional]
 **commercehqApiKey** | **String**| CommerceHQ api key | [optional]
 **commercehqApiPassword** | **String**| CommerceHQ api password | [optional]
 **wcConsumerKey** | **String**| Woocommerce consumer key | [optional]
 **wcConsumerSecret** | **String**| Woocommerce consumer secret | [optional]
 **magentoConsumerKey** | **String**| Magento Consumer Key | [optional]
 **magentoConsumerSecret** | **String**| Magento Consumer Secret | [optional]
 **magentoAccessToken** | **String**| Magento Access Token | [optional]
 **magentoTokenSecret** | **String**| Magento Token Secret | [optional]
 **prestashopWebserviceKey** | **String**| Prestashop webservice key | [optional]
 **wixAppId** | **String**| Wix App ID | [optional]
 **wixAppSecretKey** | **String**| Wix App Secret Key | [optional]
 **wixInstanceId** | **String**| Wix Instance ID | [optional]
 **wixRefreshToken** | **String**| Wix refresh token | [optional]
 **mercadoLibreAppId** | **String**| Mercado Libre App ID | [optional]
 **mercadoLibreAppSecretKey** | **String**| Mercado Libre App Secret Key | [optional]
 **mercadoLibreRefreshToken** | **String**| Mercado Libre Refresh Token | [optional]
 **zidClientId** | **Int**| Zid Client ID | [optional]
 **zidClientSecret** | **String**| Zid Client Secret | [optional]
 **zidAccessToken** | **String**| Zid Access Token | [optional]
 **zidAuthorization** | **String**| Zid Authorization | [optional]
 **zidRefreshToken** | **String**| Zid refresh token | [optional]
 **flipkartClientId** | **String**| Flipkart Client ID | [optional]
 **flipkartClientSecret** | **String**| Flipkart Client Secret | [optional]
 **allegroClientId** | **String**| Allegro Client ID | [optional]
 **allegroClientSecret** | **String**| Allegro Client Secret | [optional]
 **allegroAccessToken** | **String**| Allegro Access Token | [optional]
 **allegroRefreshToken** | **String**| Allegro Refresh Token | [optional]
 **allegroEnvironment** | **String**| Allegro Environment | [optional]
 **zohoClientId** | **String**| Zoho Client ID | [optional]
 **zohoClientSecret** | **String**| Zoho Client Secret | [optional]
 **zohoRefreshToken** | **String**| Zoho Refresh Token | [optional]
 **zohoRegion** | **String**| Zoho API endpoint Region | [optional]
 **tiendanubeUserId** | **Int**| Tiendanube User ID | [optional]
 **tiendanubeAccessToken** | **String**| Tiendanube Access Token | [optional]
 **tiendanubeClientSecret** | **String**| Tiendanube Client Secret | [optional]
 **ottoClientId** | **String**| Otto Client ID | [optional]
 **ottoClientSecret** | **String**| Otto Client Secret | [optional]
 **ottoAppId** | **String**| Otto App ID | [optional]
 **ottoRefreshToken** | **String**| Otto Refresh Token | [optional]
 **ottoEnvironment** | **String**| Otto Environment | [optional]
 **ottoAccessToken** | **String**| Otto Access Token | [optional]
 **tiktokshopAppKey** | **String**| TikTok Shop App Key | [optional]
 **tiktokshopAppSecret** | **String**| TikTok Shop App Secret | [optional]
 **tiktokshopRefreshToken** | **String**| TikTok Shop Refresh Token | [optional]
 **tiktokshopAccessToken** | **String**| TikTok Shop Access Token | [optional]
 **sallaClientId** | **String**| Salla Client ID | [optional]
 **sallaClientSecret** | **String**| Salla Client Secret | [optional]
 **sallaRefreshToken** | **String**| Salla Refresh Token | [optional]
 **sallaAccessToken** | **String**| Salla Access Token | [optional]
 **temuAppKey** | **String**| Temu App Key | [optional]
 **temuAppSecret** | **String**| Temu App Secret | [optional]
 **temuAccessToken** | **String**| Temu Access Token | [optional]
 **temuRegion** | **String**| Temu API endpoint Region. | [optional]
 **scapiClientId** | **String**| Salesforce Commerce API Client ID | [optional]
 **scapiClientSecret** | **String**| Salesforce Commerce API Client Secret | [optional]
 **scapiOrganizationId** | **String**| Salesforce Commerce Organization ID | [optional]
 **scapiShortCode** | **String**| Salesforce Commerce Short Code | [optional]
 **scapiScopes** | **String**| Salesforce Commerce API Scopes | [optional]
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


## accountFailedWebhooks

> accountFailedWebhooks(accountFailedWebhooksRequest): ApiRequest[AccountFailedWebhooks200Response]

account.failed_webhooks

If the callback of your service for some reason could not accept webhooks from API2Cart, then with the help of this method you can get a list of missed webhooks to perform synchronization again using entity_id. Please note that we keep such records for 24 hours.

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
    
    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = AccountApi("https://api.api2cart.local.com/v1.1")
    val start: Int = 0 // Int | This parameter sets the number from which you want to get entities

    val count: Int = 20 // Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250

    val ids: String = 3,14,25 // String | List of сomma-separated webhook ids
    
    val request = apiInstance.accountFailedWebhooks(start, count, ids)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AccountApi#accountFailedWebhooks")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AccountApi#accountFailedWebhooks")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Int**| This parameter sets the number from which you want to get entities | [optional]
 **count** | **Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional]
 **ids** | **String**| List of сomma-separated webhook ids | [optional]

### Return type

ApiRequest[[**AccountFailedWebhooks200Response**](AccountFailedWebhooks200Response.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## accountSupportedPlatforms

> accountSupportedPlatforms(): ApiRequest[AccountSupportedPlatforms200Response]

account.supported_platforms

Use this method to retrieve a list of supported platforms and the sets of parameters required for connecting to each of them. Note: some platforms may have multiple connection methods so that the response will contain multiple sets of parameters.

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
    
    // Configure API key authorization: ApiKeyAuth
    implicit val ApiKeyAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = AccountApi("https://api.api2cart.local.com/v1.1")    
    val request = apiInstance.accountSupportedPlatforms()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AccountApi#accountSupportedPlatforms")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AccountApi#accountSupportedPlatforms")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**AccountSupportedPlatforms200Response**](AccountSupportedPlatforms200Response.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


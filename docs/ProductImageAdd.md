

# ProductImageAdd


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`type`** | [**`Type`**](#`Type`) | Defines image&#39;s types that are specified by comma-separated list | 
**imageName** | **String** | Defines image&#39;s name | 
**productId** | **String** | Defines product id where the image should be added |  [optional]
**productVariantId** | **String** | Defines product&#39;s variants specified by variant id |  [optional]
**variantIds** | **String** | Defines product&#39;s variants ids |  [optional]
**optionValueIds** | **String** | Defines product&#39;s option values ids |  [optional]
**storeId** | **String** | Store Id |  [optional]
**langId** | **String** | Add product image on specified language id |  [optional]
**url** | **String** | Defines URL of the image that has to be added |  [optional]
**content** | **String** | Content(body) encoded in base64 of image file |  [optional]
**label** | **String** | Defines alternative text that has to be attached to the picture |  [optional]
**mime** | **String** | Mime type of image http://en.wikipedia.org/wiki/Internet_media_type. |  [optional]
**position** | **Int** | Defines image’s position in the list |  [optional]
**useLatestApiVersion** | **Boolean** | Use the latest platform API version |  [optional]
**idempotencyKey** | **String** | A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; |  [optional]


## Enum: `Type`
Allowed values: [small, base, additional, thumbnail]





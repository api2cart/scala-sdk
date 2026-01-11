

# ProductVariantPriceUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Defines the variant where the price has to be updated |  [optional]
**productId** | **String** | Product id |  [optional]
**groupPrices** | [**Seq&lt;ProductPriceUpdateGroupPricesInner&gt;**](ProductPriceUpdateGroupPricesInner.md) | Defines variants&#39;s group prices | 
**idempotencyKey** | **String** | A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; |  [optional]




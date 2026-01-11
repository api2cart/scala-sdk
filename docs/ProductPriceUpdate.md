

# ProductPriceUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **String** | Defines the product where the price has to be updated |  [optional]
**groupPrices** | [**Seq&lt;ProductPriceUpdateGroupPricesInner&gt;**](ProductPriceUpdateGroupPricesInner.md) | Defines product&#39;s group prices |  [optional]
**idempotencyKey** | **String** | A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; |  [optional]






# ProductPriceAdd


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **String** | Defines the product to which the price has to be added |  [optional]
**groupPrices** | [**Seq&lt;ProductAddGroupPricesInner&gt;**](ProductAddGroupPricesInner.md) | Defines product&#39;s group prices |  [optional]
**storeId** | **String** | Store Id |  [optional]
**idempotencyKey** | **String** | A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; |  [optional]






# ProductTaxAdd


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **String** | Defines products specified by product id |  [optional]
**name** | **String** | Defines tax class name where tax has to be added | 
**taxRates** | [**Seq&lt;ProductTaxAddTaxRatesInner&gt;**](ProductTaxAddTaxRatesInner.md) | Defines tax rates of specified tax classes | 
**idempotencyKey** | **String** | A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; |  [optional]




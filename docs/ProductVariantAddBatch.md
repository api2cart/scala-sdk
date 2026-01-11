

# ProductVariantAddBatch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clearCache** | **Boolean** |  |  [optional]
**reindex** | **Boolean** |  |  [optional]
**payload** | [**Seq&lt;ProductVariantAddBatchPayloadInner&gt;**](ProductVariantAddBatchPayloadInner.md) | Contains an array of product variants objects. The list of properties may vary depending on the specific platform. | 
**idempotencyKey** | **String** | A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; |  [optional]




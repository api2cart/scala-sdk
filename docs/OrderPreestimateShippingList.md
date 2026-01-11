

# OrderPreestimateShippingList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warehouseId** | **String** | This parameter is used for selecting a warehouse where you need to set/modify a product quantity. |  [optional]
**customerId** | **String** | Retrieves orders specified by customer id |  [optional]
**customerEmail** | **String** | Retrieves orders specified by customer email |  [optional]
**storeId** | **String** | Store Id |  [optional]
**shippAddress1** | **String** | Specifies first shipping address |  [optional]
**shippCity** | **String** | Specifies shipping city |  [optional]
**shippPostcode** | **String** | Specifies shipping postcode |  [optional]
**shippState** | **String** | Specifies shipping state code |  [optional]
**shippCountry** | **String** | Specifies shipping country code | 
**params** | **String** | Set this parameter in order to choose which entity fields you want to retrieve |  [optional]
**exclude** | **String** | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all |  [optional]
**idempotencyKey** | **String** | A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; |  [optional]
**orderItem** | [**Seq&lt;OrderPreestimateShippingListOrderItemInner&gt;**](OrderPreestimateShippingListOrderItemInner.md) |  | 




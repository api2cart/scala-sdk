

# OrderReturnAdd


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Defines the order id |  [optional]
**storeId** | **String** | Store Id |  [optional]
**returnStatusId** | **String** | Defines return request status | 
**returnActionId** | **String** | Defines return request action | 
**returnReasonId** | **String** | Defines return request reason | 
**returnAction** | **String** | Defines return request action |  [optional]
**returnReason** | **String** | Defines return request reason |  [optional]
**itemRestock** | **Boolean** | Boolean, whether or not to add the line items back to the store inventory. |  [optional]
**staffNote** | **String** | Specifies staff note |  [optional]
**comment** | **String** | Specifies return comment |  [optional]
**message** | **String** | Customer-visible message attached to the return request. |  [optional]
**sendNotifications** | **Boolean** | Send notifications to customer after order was created |  [optional]
**rejectReason** | **String** | Defines return reject reason |  [optional]
**isOnline** | **Boolean** | Indicates whether refund type is online |  [optional]
**feePrice** | **BigDecimal** | Specifies refund&#39;s fee price |  [optional]
**shippingPrice** | **BigDecimal** | Specifies order&#39;s shipping price |  [optional]
**idempotencyKey** | **String** | A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; |  [optional]
**orderProducts** | [**Seq&lt;OrderReturnAddOrderProductsInner&gt;**](OrderReturnAddOrderProductsInner.md) |  | 






# OrderRefundAdd


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Defines the order for which the refund will be created. |  [optional]
**items** | [**Seq&lt;OrderRefundAddItemsInner&gt;**](OrderRefundAddItemsInner.md) | Defines items in the order that will be refunded |  [optional]
**totalPrice** | **BigDecimal** | Defines order refund amount. |  [optional]
**shippingPrice** | **BigDecimal** | Defines refund shipping amount. |  [optional]
**feePrice** | **BigDecimal** | Specifies refund&#39;s fee price |  [optional]
**message** | **String** | Refund reason, or some else message which assigned to refund. |  [optional]
**itemRestock** | **Boolean** | Boolean, whether or not to add the line items back to the store inventory. |  [optional]
**sendNotifications** | **Boolean** | Send notifications to customer after refund was created |  [optional]
**date** | **String** | Specifies an order creation date in format Y-m-d H:i:s |  [optional]
**isOnline** | **Boolean** | Indicates whether refund type is online |  [optional]
**idempotencyKey** | **String** | A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; |  [optional]




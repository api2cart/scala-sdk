

# OrderShipmentTrackingAdd


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Defines the order id |  [optional]
**shipmentId** | **String** | Shipment id indicates the number of delivery | 
**carrierId** | **String** | Defines tracking carrier id |  [optional]
**storeId** | **String** | Store Id |  [optional]
**trackingProvider** | **String** | Defines name of the company which provides shipment tracking |  [optional]
**trackingNumber** | **String** | Defines tracking number | 
**trackingLink** | **String** | Defines custom tracking link |  [optional]
**sendNotifications** | **Boolean** | Send notifications to customer after tracking was created |  [optional]
**idempotencyKey** | **String** | A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; |  [optional]




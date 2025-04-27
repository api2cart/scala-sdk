

# OrderShipmentAdd


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Defines the order for which the shipment will be created |  [optional]
**warehouseId** | **String** | This parameter is used for selecting a warehouse where you need to set/modify a product quantity. |  [optional]
**storeId** | **String** | Store Id |  [optional]
**shipmentProvider** | **String** | Defines company name that provide tracking of shipment |  [optional]
**shippingMethod** | **String** | Define shipping method |  [optional]
**items** | [**Seq&lt;OrderShipmentAddItemsInner&gt;**](OrderShipmentAddItemsInner.md) | Defines items in the order that will be shipped |  [optional]
**trackingNumbers** | [**Seq&lt;OrderShipmentAddTrackingNumbersInner&gt;**](OrderShipmentAddTrackingNumbersInner.md) | Defines shipment&#39;s tracking numbers that have to be added&lt;/br&gt; How set tracking numbers to appropriate carrier:&lt;ul&gt;&lt;li&gt;tracking_numbers[]&#x3D;a2c.demo1,a2c.demo2 - set default carrier&lt;/li&gt;&lt;li&gt;tracking_numbers[&lt;b&gt;carrier_id&lt;/b&gt;]&#x3D;a2c.demo - set appropriate carrier&lt;/li&gt;&lt;/ul&gt;To get the list of carriers IDs that are available in your store, use the &lt;a href &#x3D; \&quot;https://api2cart.com/docs/#/cart/CartInfo\&quot;&gt;cart.info&lt;/a &gt; method |  [optional]
**trackingLink** | **String** | Defines custom tracking link |  [optional]
**isShipped** | **Boolean** | Defines shipment&#39;s status |  [optional]
**sendNotifications** | **Boolean** | Send notifications to customer after shipment was created |  [optional]
**adjustStock** | **Boolean** | This parameter is used for adjust stock. |  [optional]
**enableCache** | **Boolean** | If the value is &#39;true&#39; and order exist in our cache, we will use order.info from cache to prepare shipment items. |  [optional]
**checkProcessStatus** | **Boolean** | Disable or enable check process status. Please note that the response will be slower due to additional requests to the store. |  [optional]
**useLatestApiVersion** | **Boolean** | Use the latest platform API version |  [optional]




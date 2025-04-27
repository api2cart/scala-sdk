

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
**orderItem** | [**Seq&lt;OrderPreestimateShippingListOrderItemInner&gt;**](OrderPreestimateShippingListOrderItemInner.md) |  | 




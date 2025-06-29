

# CartCouponAdd


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Coupon code | 
**actionType** | [**ActionType**](#ActionType) | Coupon discount type | 
**actionApplyTo** | [**ActionApplyTo**](#ActionApplyTo) | Defines where discount should be applied | 
**actionScope** | [**ActionScope**](#ActionScope) | Specify how discount should be applied. If scope&#x3D;matching_items, then discount will be applied to each of the items that match action conditions. Scope order means that discount will be applied once. | 
**actionAmount** | **BigDecimal** | Defines the discount amount value. | 
**codes** | **Seq&lt;String&gt;** | Entity codes |  [optional]
**name** | **String** | Coupon name |  [optional]
**dateStart** | **String** | Date start |  [optional]
**dateEnd** | **String** | Defines when discount code will be expired. |  [optional]
**usageLimit** | **Int** | Usage limit for coupon. |  [optional]
**usageLimitPerCustomer** | **Int** | Usage limit per customer. |  [optional]
**actionConditionEntity** | **String** | Defines entity for action condition. |  [optional]
**actionConditionKey** | **String** | Defines entity attribute code for action condition. |  [optional]
**actionConditionOperator** | **String** | Defines condition operator. |  [optional]
**actionConditionValue** | **String** | Defines condition attribute value/s. Can be comma separated string. |  [optional]
**includeTax** | **Boolean** | Indicates whether to apply a discount for taxes. |  [optional]
**storeId** | **String** | Store Id |  [optional]
**freeCashOnDelivery** | **Boolean** | Defines whether the coupon provides free cash on delivery |  [optional]


## Enum: ActionType
Allowed values: [percent, fixed]



## Enum: ActionApplyTo
Allowed values: [order_total, item_price, shipping]



## Enum: ActionScope
Allowed values: [order, matching_items]





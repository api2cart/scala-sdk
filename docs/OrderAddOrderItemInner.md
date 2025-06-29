

# OrderAddOrderItemInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderItemId** | **String** | Defines orders specified by order item id | 
**orderItemName** | **String** | Defines orders specified by order item name | 
**orderItemModel** | **String** | Defines orders specified by order item model |  [optional]
**orderItemPrice** | **BigDecimal** | Defines orders specified by order item price | 
**orderItemQuantity** | **Int** | Defines orders specified by order item quantity | 
**orderItemWeight** | **BigDecimal** | Defines orders specified by order item weight |  [optional]
**orderItemVariantId** | **String** | Ordered product variant. Where x is order item ID |  [optional]
**orderItemTax** | **BigDecimal** | Percentage of tax for product order |  [optional]
**orderItemTaxClass** | **String** | Id of the tax class of product. |  [optional]
**orderItemPriceIncludesTax** | **Boolean** | Defines if item price includes tax |  [optional]
**orderItemParent** | **Int** | Index of the parent grouped/bundle product |  [optional]
**orderItemParentOptionName** | **String** | Option name of the parent grouped/bundle product |  [optional]
**orderItemAllowRefundItemsSeparately** | **Boolean** | Indicates whether subitems of the grouped/bundle product can be refunded separately |  [optional]
**orderItemAllowShipItemsSeparately** | **Boolean** | Indicates whether subitems of the grouped/bundle product can be shipped separately |  [optional]
**orderItemOption** | [**Seq&lt;OrderAddOrderItemInnerOrderItemOptionInner&gt;**](OrderAddOrderItemInnerOrderItemOptionInner.md) |  |  [optional]
**orderItemProperty** | [**Seq&lt;OrderAddOrderItemInnerOrderItemPropertyInner&gt;**](OrderAddOrderItemInnerOrderItemPropertyInner.md) |  |  [optional]




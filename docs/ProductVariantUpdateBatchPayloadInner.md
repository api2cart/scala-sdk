

# ProductVariantUpdateBatchPayloadInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**productId** | **String** |  | 
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**shortDescription** | **String** |  |  [optional]
**sku** | **String** |  |  [optional]
**upc** | **String** |  |  [optional]
**mpn** | **String** |  |  [optional]
**gtin** | **String** |  |  [optional]
**isbn** | **String** |  |  [optional]
**status** | **String** |  |  [optional]
**price** | **BigDecimal** |  |  [optional]
**specialPrice** | **BigDecimal** |  |  [optional]
**costPrice** | **BigDecimal** |  |  [optional]
**retailPrice** | **BigDecimal** |  |  [optional]
**advancedPrices** | [**Seq&lt;ProductUpdateBatchPayloadInnerAdvancedPricesInner&gt;**](ProductUpdateBatchPayloadInnerAdvancedPricesInner.md) | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional]
**quantity** | **BigDecimal** |  |  [optional]
**reserveQuantity** | **BigDecimal** |  |  [optional]
**increaseQuantity** | **BigDecimal** |  |  [optional]
**reduceQuantity** | **BigDecimal** |  |  [optional]
**warehouseId** | **String** |  |  [optional]
**manufacturerId** | **String** |  |  [optional]
**weight** | **BigDecimal** |  |  [optional]
**height** | **BigDecimal** |  |  [optional]
**length** | **BigDecimal** |  |  [optional]
**width** | **BigDecimal** |  |  [optional]
**storeId** | **String** |  |  [optional]
**langId** | **String** |  |  [optional]
**taxClassId** | **String** |  |  [optional]
**backorderStatus** | **String** |  |  [optional]
**visible** | **String** |  |  [optional]
**isDefault** | **Boolean** |  |  [optional]
**inStock** | **Boolean** |  |  [optional]
**isVirtual** | **Boolean** |  |  [optional]
**downloadable** | **Boolean** |  |  [optional]
**manageStock** | **Boolean** |  |  [optional]
**isFreeShipping** | **Boolean** |  |  [optional]
**seoUrl** | **String** |  |  [optional]
**metaTitle** | **String** |  |  [optional]
**metaDescription** | **String** |  |  [optional]
**metaKeywords** | **Seq&lt;String&gt;** |  |  [optional]
**categoriesIds** | **Seq&lt;String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional]
**storesIds** | **Seq&lt;String&gt;** |  |  [optional]
**images** | [**Seq&lt;ProductAddBatchPayloadInnerImagesInner&gt;**](ProductAddBatchPayloadInnerImagesInner.md) | The passed items will completely replace the original items |  [optional]
**productImagesIds** | **Seq&lt;String&gt;** |  |  [optional]
**relatedProductsIds** | **Seq&lt;String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional]
**upSellProductsIds** | **Seq&lt;String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional]
**crossSellProductsIds** | **Seq&lt;String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional]




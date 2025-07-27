

# ProductVariantAdd


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **String** | Defines product&#39;s id where the variant has to be added |  [optional]
**attributes** | [**Seq&lt;ProductVariantAddAttributesInner&gt;**](ProductVariantAddAttributesInner.md) | Defines variant&#39;s attributes list |  [optional]
**name** | **String** | Defines variant&#39;s name that has to be added |  [optional]
**model** | **String** | Specifies variant&#39;s model that has to be added | 
**description** | **String** | Specifies variant&#39;s description |  [optional]
**shortDescription** | **String** | Defines short description |  [optional]
**availableForView** | **Boolean** | Specifies the set of visible/invisible product&#39;s variants for users |  [optional]
**availableForSale** | **Boolean** | Specifies the set of visible/invisible product&#39;s variants for sale |  [optional]
**isVirtual** | **Boolean** | Defines whether the product is virtual |  [optional]
**isDefault** | **Boolean** | Defines as a default variant |  [optional]
**storeId** | **String** | Add variants specified by store id |  [optional]
**storesIds** | **String** | Assign variant to the stores that is specified by comma-separated stores&#39; id |  [optional]
**langId** | **String** | Language id |  [optional]
**price** | **BigDecimal** | Defines new product&#39;s variant price |  [optional]
**oldPrice** | **BigDecimal** | Defines product&#39;s old price |  [optional]
**costPrice** | **BigDecimal** | Defines new product&#39;s cost price |  [optional]
**specialPrice** | **BigDecimal** | Specifies variant&#39;s model that has to be added |  [optional]
**spriceCreate** | **String** | Defines the date of special price creation |  [optional]
**spriceModified** | **String** | Defines the date of special price modification |  [optional]
**spriceExpire** | **String** | Defines the term of special price offer duration |  [optional]
**tierPrices** | [**Seq&lt;ProductAddTierPricesInner&gt;**](ProductAddTierPricesInner.md) | Defines product&#39;s tier prices |  [optional]
**quantity** | **BigDecimal** | Defines product variant&#39;s quantity that has to be added |  [optional]
**warehouseId** | **String** | This parameter is used for selecting a warehouse where you need to set/modify a product quantity. |  [optional]
**inStock** | **Boolean** | Set stock status |  [optional]
**backorderStatus** | **String** | Set backorder status |  [optional]
**manageStock** | **Boolean** | Defines inventory tracking for product variant |  [optional]
**lowStockThreshold** | **BigDecimal** | Specify the quantity threshold below which the product is considered low in stock |  [optional]
**weight** | **BigDecimal** | Weight |  [optional]
**width** | **BigDecimal** | Defines product&#39;s width |  [optional]
**height** | **BigDecimal** | Defines product&#39;s height |  [optional]
**length** | **BigDecimal** | Defines product&#39;s length |  [optional]
**weightUnit** | **String** | Weight Unit |  [optional]
**sku** | **String** | Defines variant&#39;s sku that has to be added |  [optional]
**barcode** | **String** | A barcode is a unique code composed of numbers used as a product identifier. |  [optional]
**gtin** | **String** | Global Trade Item Number. An GTIN is an identifier for trade items. |  [optional]
**upc** | **String** | Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products. |  [optional]
**ean** | **String** | European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products. |  [optional]
**mpn** | **String** | Manufacturer Part Number. A MPN is an identifier of a particular part design or material used. |  [optional]
**isbn** | **String** | International Standard Book Number. An ISBN is a unique identifier for books. |  [optional]
**manufacturer** | **String** | Specifies the product variant&#39;s manufacturer |  [optional]
**createdAt** | **String** | Defines the date of entity creation |  [optional]
**metaTitle** | **String** | Defines unique meta title for each entity |  [optional]
**metaKeywords** | **String** | Defines unique meta keywords for each entity |  [optional]
**metaDescription** | **String** | Defines unique meta description of a entity |  [optional]
**url** | **String** | Defines unique product variant&#39;s URL |  [optional]
**taxClassId** | **String** | Defines tax classes where entity has to be added |  [optional]
**taxable** | **Boolean** | Specifies whether a tax is charged |  [optional]
**fixedCostShippingPrice** | **BigDecimal** | Specifies fixed cost shipping price |  [optional]
**isFreeShipping** | **Boolean** | Specifies variant&#39;s free shipping flag that has to be added |  [optional]
**countryOfOrigin** | **String** | The country where the inventory item was made |  [optional]
**harmonizedSystemCode** | **String** | Harmonized System Code. An HSC is a 6-digit identifier that allows participating countries to classify traded goods on a common basis for customs purposes |  [optional]
**marketplaceItemProperties** | **String** | String containing the JSON representation of the supplied data |  [optional]
**clearCache** | **Boolean** | Is cache clear required |  [optional]




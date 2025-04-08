

# ProductOptionAdd


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Defines option&#39;s name | 
**`type`** | [**`Type`**](#`Type`) | Defines option&#39;s type that has to be added | 
**productId** | **String** | Defines product id where the option should be added |  [optional]
**defaultOptionValue** | **String** | Defines default option value that has to be added |  [optional]
**optionValues** | **String** | Defines option values that has to be added |  [optional]
**description** | **String** | Defines option&#39;s description |  [optional]
**avail** | **Boolean** | Defines whether the option is available |  [optional]
**sortOrder** | **Int** | Sort number in the list |  [optional]
**required** | **Boolean** | Defines if the option is required |  [optional]
**values** | [**Seq&lt;ProductOptionAddValuesInner&gt;**](ProductOptionAddValuesInner.md) | An array of option values.&lt;/b&gt; |  [optional]
**clearCache** | **Boolean** | Is cache clear required |  [optional]


## Enum: `Type`
Allowed values: [option_type_select, option_type_text, option_type_radio, option_type_checkbox, option_type_textarea, option_type_readonly, option_type_multiselect, option_type_multicheckbox, option_type_file, option_type_date, option_type_datetime, option_type_time]





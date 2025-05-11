

# ProductAddPersonalizationDetails

Defines personalization settings for the listing. To enable personalization, is_personalizable must be set to true. When enabled, additional fields may be used to configure the personalization experience, including whether it is required (personalization_is_required), the maximum character limit (personalization_char_count_max), and buyer instructions (personalization_instructions). All related fields are only applicable if personalization is enabled.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isPersonalizable** | **Boolean** |  | 
**personalizationIsRequired** | **Boolean** |  |  [optional]
**personalizationCharCountMax** | **Int** |  |  [optional]
**personalizationInstructions** | **String** |  |  [optional]




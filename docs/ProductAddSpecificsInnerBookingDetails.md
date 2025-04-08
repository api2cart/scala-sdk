

# ProductAddSpecificsInnerBookingDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location** | **String** |  | 
**`type`** | [**`Type`**](#`Type`) |  | 
**sessionDuration** | **Int** |  |  [optional]
**sessionGap** | **Int** |  |  [optional]
**sessionsCount** | **Int** |  | 
**timeStrictValue** | **BigDecimal** |  | 
**timeStrictType** | [**TimeStrictType**](#TimeStrictType) |  | 
**availabilities** | [**Seq&lt;ProductAddSpecificsInnerBookingDetailsAvailabilitiesInner&gt;**](ProductAddSpecificsInnerBookingDetailsAvailabilitiesInner.md) |  | 
**overrides** | [**Seq&lt;ProductAddSpecificsInnerBookingDetailsOverridesInner&gt;**](ProductAddSpecificsInnerBookingDetailsOverridesInner.md) |  |  [optional]


## Enum: `Type`
Allowed values: [date, date_time]



## Enum: TimeStrictType
Allowed values: [days, hours, minutes]





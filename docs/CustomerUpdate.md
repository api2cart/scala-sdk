

# CustomerUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Entity id |  [optional]
**groupId** | **String** | Customer group_id |  [optional]
**groupIds** | **String** | Groups that will be assigned to a customer |  [optional]
**group** | **String** | Defines the group where the customer |  [optional]
**email** | **String** | Defines customer&#39;s email |  [optional]
**phone** | **String** | Defines customer&#39;s phone number |  [optional]
**firstName** | **String** | Defines customer&#39;s first name |  [optional]
**lastName** | **String** | Defines customer&#39;s last name |  [optional]
**birthDay** | **String** | Defines customer&#39;s birthday |  [optional]
**newsLetterSubscription** | **Boolean** | Defines whether the newsletter subscription is available for the user |  [optional]
**consents** | [**Seq&lt;CustomerAddConsentsInner&gt;**](CustomerAddConsentsInner.md) | Defines consents to notifications |  [optional]
**tags** | **String** | Customer tags |  [optional]
**gender** | **String** | Defines customer&#39;s gender |  [optional]
**note** | **String** | The customer note. |  [optional]
**status** | **String** | Defines customer&#39;s status |  [optional]
**password** | **String** | Defines customer&#39;s unique password |  [optional]
**storeId** | **String** | Store Id |  [optional]
**idempotencyKey** | **String** | A unique identifier associated with a specific request. Repeated requests with the same &lt;strong&gt;idempotency_key&lt;/strong&gt; return a cached response without re-executing the business logic. &lt;strong&gt;Please note that the cache lifetime is 15 minutes.&lt;/strong&gt; |  [optional]
**address** | [**Seq&lt;CustomerUpdateAddressInner&gt;**](CustomerUpdateAddressInner.md) |  |  [optional]




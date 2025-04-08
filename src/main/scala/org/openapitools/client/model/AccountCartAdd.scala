/**
 * API2Cart OpenAPI
 * API2Cart
 *
 * The version of the OpenAPI document: 1.1
 * Contact: contact@api2cart.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class AccountCartAdd (
  /* Store’s identifier which you can get from cart_list method */
  cartId: AccountCartAddEnums.CartId,
  /* A web address of a store that you would like to connect to API2Cart */
  storeUrl: Option[String] = None,
  /* This parameter allows to set up store with custom bridge url (also you must use store_root parameter if a bridge folder is not in the root folder of the store) */
  bridgeUrl: Option[String] = None,
  /* Absolute path to the store root directory (used with \"bridge_url\" parameter) */
  storeRoot: Option[String] = None,
  /* Set this parameter if bridge is already uploaded to store */
  storeKey: Option[String] = None,
  /* Specify if api2cart should validate cart version */
  validateVersion: Option[Boolean] = None,
  /* Enables or disables cart's verification */
  verify: Option[Boolean] = None,
  /* DB tables prefix */
  dbTablesPrefix: Option[String] = None,
  /* This parameter allows you to set your custom user agent, which will be used in requests to the store. Please use it cautiously, as the store's firewall may block specific values. */
  userAgent: Option[String] = None,
  /* FTP connection host */
  ftpHost: Option[String] = None,
  /* FTP User */
  ftpUser: Option[String] = None,
  /* FTP Password */
  ftpPassword: Option[String] = None,
  /* FTP Port */
  ftpPort: Option[Int] = None,
  /* FTP Store dir */
  ftpStoreDir: Option[String] = None,
  /* 3DCart Private Key */
  `3dcartPrivateKey`: Option[String] = None,
  /* 3DCart Token */
  `3dcartAccessToken`: Option[String] = None,
  /* 3DCart API Key */
  `3dcartapiApiKey`: Option[String] = None,
  /* Amazon SP API app client id */
  amazonSpClientId: Option[String] = None,
  /* Amazon SP API app client secret */
  amazonSpClientSecret: Option[String] = None,
  /* Amazon SP API OAuth refresh token */
  amazonSpRefreshToken: Option[String] = None,
  /* Amazon AWS Region */
  amazonSpAwsRegion: Option[String] = None,
  /* Amazon SP API environment */
  amazonSpApiEnvironment: Option[String] = None,
  /* Amazon Seller ID (Merchant token) */
  amazonSellerId: Option[String] = None,
  /* It's a AspDotNetStorefront account for which API is available */
  aspdotnetstorefrontApiUser: Option[String] = None,
  /* AspDotNetStorefront API Password */
  aspdotnetstorefrontApiPass: Option[String] = None,
  /* It's a BigCommerce account for which API is enabled */
  bigcommerceapiAdminAccount: Option[String] = None,
  /* BigCommerce API URL */
  bigcommerceapiApiPath: Option[String] = None,
  /* Bigcommerce API Key */
  bigcommerceapiApiKey: Option[String] = None,
  /* Client ID of the requesting app */
  bigcommerceapiClientId: Option[String] = None,
  /* Access token authorizing the app to access resources on behalf of a user */
  bigcommerceapiAccessToken: Option[String] = None,
  /* API Path section unique to the store */
  bigcommerceapiContext: Option[String] = None,
  /* Bol API Key */
  bolApiKey: Option[String] = None,
  /* Bol API Secret */
  bolApiSecret: Option[String] = None,
  /* Bol Retailer ID */
  bolRetailerId: Option[Int] = None,
  /* Demandware client id */
  demandwareClientId: Option[String] = None,
  /* Demandware api password */
  demandwareApiPassword: Option[String] = None,
  /* Demandware user name */
  demandwareUserName: Option[String] = None,
  /* Demandware user password */
  demandwareUserPassword: Option[String] = None,
  /* Application ID (AppID). */
  ebayClientId: Option[String] = None,
  /* Shared Secret from eBay application */
  ebayClientSecret: Option[String] = None,
  /* The RuName value that eBay assigns to your application. */
  ebayRuname: Option[String] = None,
  /* Used to authenticate API requests. */
  ebayAccessToken: Option[String] = None,
  /* Used to renew the access token. */
  ebayRefreshToken: Option[String] = None,
  /* eBay environment */
  ebayEnvironment: Option[String] = None,
  /* eBay global ID */
  ebaySiteId: Option[Int] = None,
  /* Walmart client ID. For the region 'ca' use Consumer ID */
  walmartClientId: Option[String] = None,
  /* Walmart client secret. For the region 'ca' use Private Key */
  walmartClientSecret: Option[String] = None,
  /* Walmart environment */
  walmartEnvironment: Option[String] = None,
  /* Walmart WM_CONSUMER.CHANNEL.TYPE header */
  walmartChannelType: Option[String] = None,
  /* Walmart region */
  walmartRegion: Option[String] = None,
  /* Access token authorizing the app to access resources on behalf of a user */
  ecwidAcessToken: Option[String] = None,
  /* Store Id */
  ecwidStoreId: Option[String] = None,
  /* Lazada App ID */
  lazadaAppId: Option[String] = None,
  /* Lazada App Secret */
  lazadaAppSecret: Option[String] = None,
  /* Lazada Refresh Token */
  lazadaRefreshToken: Option[String] = None,
  /* Lazada API endpoint Region */
  lazadaRegion: Option[String] = None,
  /* LightSpeed api key */
  lightspeedApiKey: Option[String] = None,
  /* LightSpeed api secret */
  lightspeedApiSecret: Option[String] = None,
  /* Etsy keystring */
  etsyKeystring: Option[String] = None,
  /* Etsy shared secret */
  etsySharedSecret: Option[String] = None,
  /* Access token authorizing the app to access resources on behalf of a user */
  etsyAccessToken: Option[String] = None,
  /* Secret token authorizing the app to access resources on behalf of a user */
  etsyTokenSecret: Option[String] = None,
  /* Etsy Client Id */
  etsyClientId: Option[String] = None,
  /* Etsy Refresh token */
  etsyRefreshToken: Option[String] = None,
  /* Facebook App ID */
  facebookAppId: Option[String] = None,
  /* Facebook App Secret */
  facebookAppSecret: Option[String] = None,
  /* Facebook Access Token */
  facebookAccessToken: Option[String] = None,
  /* Facebook Business ID */
  facebookBusinessId: Option[String] = None,
  /* Neto API Key */
  netoApiKey: Option[String] = None,
  /* Neto User Name */
  netoApiUsername: Option[String] = None,
  /* Shopline APP Key */
  shoplineAccessToken: Option[String] = None,
  /* Shopline APP Key */
  shoplineAppKey: Option[String] = None,
  /* Shopline App Secret */
  shoplineAppSecret: Option[String] = None,
  /* Access token authorizing the app to access resources on behalf of a user */
  shopifyAccessToken: Option[String] = None,
  /* Shopify API Key */
  shopifyApiKey: Option[String] = None,
  /* Shopify API Password */
  shopifyApiPassword: Option[String] = None,
  /* Shared secret */
  shopifySharedSecret: Option[String] = None,
  /* Access token authorizing the app to access resources on behalf of a user */
  shoplazzaAccessToken: Option[String] = None,
  /* Shared secret */
  shoplazzaSharedSecret: Option[String] = None,
  /* Shopware access key */
  shopwareAccessKey: Option[String] = None,
  /* Shopware api key */
  shopwareApiKey: Option[String] = None,
  /* Shopware client secret access key */
  shopwareApiSecret: Option[String] = None,
  /* Miva access token */
  mivaAccessToken: Option[String] = None,
  /* Miva signature */
  mivaSignature: Option[String] = None,
  /* Tiendanube User ID */
  tiendanubeUserId: Option[Int] = None,
  /* Tiendanube Access Token */
  tiendanubeAccessToken: Option[String] = None,
  /* Tiendanube Client Secret */
  tiendanubeClientSecret: Option[String] = None,
  /* It's a Volusion account for which API is enabled */
  volusionLogin: Option[String] = None,
  /* Volusion API Password */
  volusionPassword: Option[String] = None,
  /* Omni Commerce Connector Client ID */
  hybrisClientId: Option[String] = None,
  /* Omni Commerce Connector Client Secret */
  hybrisClientSecret: Option[String] = None,
  /* User Name */
  hybrisUsername: Option[String] = None,
  /* User password */
  hybrisPassword: Option[String] = None,
  /* Websites to stores mapping data */
  hybrisWebsites: Option[Seq[AccountCartAddHybrisWebsitesInner]] = None,
  /* Square (Weebly) Client ID */
  squareClientId: Option[String] = None,
  /* Square (Weebly) Client Secret */
  squareClientSecret: Option[String] = None,
  /* Square (Weebly) Refresh Token */
  squareRefreshToken: Option[String] = None,
  /* Squarespace API Key */
  squarespaceApiKey: Option[String] = None,
  /* Squarespace Connector Client ID */
  squarespaceClientId: Option[String] = None,
  /* Squarespace Connector Client Secret */
  squarespaceClientSecret: Option[String] = None,
  /* Squarespace access token */
  squarespaceAccessToken: Option[String] = None,
  /* Squarespace refresh token */
  squarespaceRefreshToken: Option[String] = None,
  /* CommerceHQ api key */
  commercehqApiKey: Option[String] = None,
  /* CommerceHQ api password */
  commercehqApiPassword: Option[String] = None,
  /* Woocommerce consumer key */
  wcConsumerKey: Option[String] = None,
  /* Woocommerce consumer secret */
  wcConsumerSecret: Option[String] = None,
  /* Magento Consumer Key */
  magentoConsumerKey: Option[String] = None,
  /* Magento Consumer Secret */
  magentoConsumerSecret: Option[String] = None,
  /* Magento Access Token */
  magentoAccessToken: Option[String] = None,
  /* Magento Token Secret */
  magentoTokenSecret: Option[String] = None,
  /* Prestashop webservice key */
  prestashopWebserviceKey: Option[String] = None,
  /* Wix App ID */
  wixAppId: String,
  /* Wix App Secret Key */
  wixAppSecretKey: String,
  /* Wix Instance ID */
  wixInstanceId: Option[String] = None,
  /* Wix refresh token */
  wixRefreshToken: Option[String] = None,
  /* Mercado Libre App ID */
  mercadoLibreAppId: Option[String] = None,
  /* Mercado Libre App Secret Key */
  mercadoLibreAppSecretKey: Option[String] = None,
  /* Mercado Libre Refresh Token */
  mercadoLibreRefreshToken: Option[String] = None,
  /* Zid Client ID */
  zidClientId: Option[Int] = None,
  /* Zid Client Secret */
  zidClientSecret: Option[String] = None,
  /* Zid Access Token */
  zidAccessToken: Option[String] = None,
  /* Zid Authorization */
  zidAuthorization: Option[String] = None,
  /* Zid refresh token */
  zidRefreshToken: Option[String] = None,
  /* Flipkart Client ID */
  flipkartClientId: Option[String] = None,
  /* Flipkart Client Secret */
  flipkartClientSecret: Option[String] = None,
  /* Allegro Client ID */
  allegroClientId: Option[String] = None,
  /* Allegro Client Secret */
  allegroClientSecret: Option[String] = None,
  /* Allegro Access Token */
  allegroAccessToken: Option[String] = None,
  /* Allegro Refresh Token */
  allegroRefreshToken: Option[String] = None,
  /* Allegro Environment */
  allegroEnvironment: Option[String] = None,
  /* Zoho Client ID */
  zohoClientId: Option[String] = None,
  /* Zoho Client Secret */
  zohoClientSecret: Option[String] = None,
  /* Zoho Refresh Token */
  zohoRefreshToken: Option[String] = None,
  /* Zoho API endpoint Region */
  zohoRegion: Option[String] = None,
  /* Otto Client ID */
  ottoClientId: Option[String] = None,
  /* Otto Client Secret */
  ottoClientSecret: Option[String] = None,
  /* Otto App ID */
  ottoAppId: Option[String] = None,
  /* Otto Refresh Token */
  ottoRefreshToken: Option[String] = None,
  /* Otto Environment */
  ottoEnvironment: Option[String] = None,
  /* Otto Access Token */
  ottoAccessToken: Option[String] = None,
  /* TikTok Shop App Key */
  tiktokshopAppKey: Option[String] = None,
  /* TikTok Shop App Secret */
  tiktokshopAppSecret: Option[String] = None,
  /* TikTok Shop Refresh Token */
  tiktokshopRefreshToken: Option[String] = None,
  /* TikTok Shop Access Token */
  tiktokshopAccessToken: Option[String] = None,
  /* Salla Client ID */
  sallaClientId: Option[String] = None,
  /* Salla Client Secret */
  sallaClientSecret: Option[String] = None,
  /* Salla Refresh Token */
  sallaRefreshToken: Option[String] = None,
  /* Salla Access Token */
  sallaAccessToken: Option[String] = None
) extends ApiModel

object AccountCartAddEnums {

  type CartId = CartId.Value
  object CartId extends Enumeration {
    val `3dCart` = Value("3DCart")
    val `3dCartApi` = Value("3DCartApi")
    val AceShop = Value("AceShop")
    val AmazonSP = Value("AmazonSP")
    val AspDotNetStorefront = Value("AspDotNetStorefront")
    val BigcommerceApi = Value("BigcommerceApi")
    val Bol = Value("Bol")
    val CommerceHQ = Value("CommerceHQ")
    val Creloaded = Value("Creloaded")
    val Cscart = Value("Cscart")
    val Cubecart = Value("Cubecart")
    val Demandware = Value("Demandware")
    val EBay = Value("EBay")
    val Ecwid = Value("Ecwid")
    val EtsyAPIv3 = Value("EtsyAPIv3")
    val Flipkart = Value("Flipkart")
    val Gambio = Value("Gambio")
    val Hybris = Value("Hybris")
    val JooCart = Value("JooCart")
    val Lazada = Value("Lazada")
    val LightSpeed = Value("LightSpeed")
    val Magento1212 = Value("Magento1212")
    val Magento2Api = Value("Magento2Api")
    val MercadoLibre = Value("MercadoLibre")
    val MijoShop = Value("MijoShop")
    val Miva = Value("Miva")
    val Neto = Value("Neto")
    val Opencart14 = Value("Opencart14")
    val Oscmax2 = Value("Oscmax2")
    val Oscommerce22ms2 = Value("Oscommerce22ms2")
    val Otto = Value("Otto")
    val Oxid = Value("Oxid")
    val Pinnacle = Value("Pinnacle")
    val Prestashop = Value("Prestashop")
    val PrestashopApi = Value("PrestashopApi")
    val SSPremium = Value("SSPremium")
    val Salla = Value("Salla")
    val Shopify = Value("Shopify")
    val Shoplazza = Value("Shoplazza")
    val Shopline = Value("Shopline")
    val Shopware = Value("Shopware")
    val ShopwareApi = Value("ShopwareApi")
    val Square = Value("Square")
    val Squarespace = Value("Squarespace")
    val Tiendanube = Value("Tiendanube")
    val TikTokShop = Value("TikTokShop")
    val Tomatocart = Value("Tomatocart")
    val Ubercart = Value("Ubercart")
    val Virtuemart = Value("Virtuemart")
    val Volusion = Value("Volusion")
    val WPecommerce = Value("WPecommerce")
    val Walmart = Value("Walmart")
    val WebAsyst = Value("WebAsyst")
    val Wix = Value("Wix")
    val Woocommerce = Value("Woocommerce")
    val WoocommerceApi = Value("WoocommerceApi")
    val Xcart = Value("Xcart")
    val Xtcommerce = Value("Xtcommerce")
    val XtcommerceVeyton = Value("XtcommerceVeyton")
    val Zencart137 = Value("Zencart137")
    val Zid = Value("Zid")
    val Zoey = Value("Zoey")
    val Zoho = Value("Zoho")
  }

}

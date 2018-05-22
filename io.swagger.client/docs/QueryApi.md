# QueryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**querySelectAgentByIP**](QueryApi.md#querySelectAgentByIP) | **GET** /queries/selectAgentByIP | Select all agents by ip
[**querySelectBid**](QueryApi.md#querySelectBid) | **GET** /queries/selectBid | Select all Bid curves in the network
[**querySelectBidByBidNumber**](QueryApi.md#querySelectBidByBidNumber) | **GET** /queries/selectBidByBidNumber | Select all bid based on bidnumber
[**querySelectBidByIP**](QueryApi.md#querySelectBidByIP) | **GET** /queries/selectBidByIP | Select all bid based on device IP
[**querySelectConc**](QueryApi.md#querySelectConc) | **GET** /queries/selectConc | Select all Concentrator Agents
[**querySelectDevice**](QueryApi.md#querySelectDevice) | **GET** /queries/selectDevice | Select all Device agents
[**querySelectPrice**](QueryApi.md#querySelectPrice) | **GET** /queries/selectPrice | Select all Prices recorded
[**querySelectPriceByBidNumber**](QueryApi.md#querySelectPriceByBidNumber) | **GET** /queries/selectPriceByBidNumber | Select all Price based on ip
[**querySelectPriceByIP**](QueryApi.md#querySelectPriceByIP) | **GET** /queries/selectPriceByIP | Select all Price based on ip


<a name="querySelectAgentByIP"></a>
# **querySelectAgentByIP**
> List&lt;HLAgent&gt; querySelectAgentByIP(agentIP)

Select all agents by ip

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String agentIP = "agentIP_example"; // String | 
try {
    List<HLAgent> result = apiInstance.querySelectAgentByIP(agentIP);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#querySelectAgentByIP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentIP** | **String**|  |

### Return type

[**List&lt;HLAgent&gt;**](HLAgent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="querySelectBid"></a>
# **querySelectBid**
> List&lt;HLBid&gt; querySelectBid()

Select all Bid curves in the network

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
try {
    List<HLBid> result = apiInstance.querySelectBid();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#querySelectBid");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;HLBid&gt;**](HLBid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="querySelectBidByBidNumber"></a>
# **querySelectBidByBidNumber**
> List&lt;HLBid&gt; querySelectBidByBidNumber(hlBidNumber)

Select all bid based on bidnumber

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String hlBidNumber = "hlBidNumber_example"; // String | 
try {
    List<HLBid> result = apiInstance.querySelectBidByBidNumber(hlBidNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#querySelectBidByBidNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hlBidNumber** | **String**|  |

### Return type

[**List&lt;HLBid&gt;**](HLBid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="querySelectBidByIP"></a>
# **querySelectBidByIP**
> List&lt;HLBid&gt; querySelectBidByIP(bsourceIP)

Select all bid based on device IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String bsourceIP = "bsourceIP_example"; // String | 
try {
    List<HLBid> result = apiInstance.querySelectBidByIP(bsourceIP);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#querySelectBidByIP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bsourceIP** | **String**|  |

### Return type

[**List&lt;HLBid&gt;**](HLBid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="querySelectConc"></a>
# **querySelectConc**
> List&lt;HLConcentratorAgent&gt; querySelectConc()

Select all Concentrator Agents

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
try {
    List<HLConcentratorAgent> result = apiInstance.querySelectConc();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#querySelectConc");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;HLConcentratorAgent&gt;**](HLConcentratorAgent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="querySelectDevice"></a>
# **querySelectDevice**
> List&lt;HLDeviceAgent&gt; querySelectDevice()

Select all Device agents

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
try {
    List<HLDeviceAgent> result = apiInstance.querySelectDevice();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#querySelectDevice");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;HLDeviceAgent&gt;**](HLDeviceAgent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="querySelectPrice"></a>
# **querySelectPrice**
> List&lt;HLPrice&gt; querySelectPrice()

Select all Prices recorded

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
try {
    List<HLPrice> result = apiInstance.querySelectPrice();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#querySelectPrice");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;HLPrice&gt;**](HLPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="querySelectPriceByBidNumber"></a>
# **querySelectPriceByBidNumber**
> List&lt;HLPrice&gt; querySelectPriceByBidNumber(hlBidNumber)

Select all Price based on ip

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String hlBidNumber = "hlBidNumber_example"; // String | 
try {
    List<HLPrice> result = apiInstance.querySelectPriceByBidNumber(hlBidNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#querySelectPriceByBidNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hlBidNumber** | **String**|  |

### Return type

[**List&lt;HLPrice&gt;**](HLPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="querySelectPriceByIP"></a>
# **querySelectPriceByIP**
> List&lt;HLPrice&gt; querySelectPriceByIP(psourceIP)

Select all Price based on ip

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String psourceIP = "psourceIP_example"; // String | 
try {
    List<HLPrice> result = apiInstance.querySelectPriceByIP(psourceIP);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#querySelectPriceByIP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **psourceIP** | **String**|  |

### Return type

[**List&lt;HLPrice&gt;**](HLPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


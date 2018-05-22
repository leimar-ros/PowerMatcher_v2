# HlPriceApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hLPriceCreate**](HlPriceApi.md#hLPriceCreate) | **POST** /HLPrice | Create a new instance of the model and persist it into the data source.
[**hLPriceDeleteById**](HlPriceApi.md#hLPriceDeleteById) | **DELETE** /HLPrice/{id} | Delete a model instance by {{id}} from the data source.
[**hLPriceExists**](HlPriceApi.md#hLPriceExists) | **HEAD** /HLPrice/{id} | Check whether a model instance exists in the data source.
[**hLPriceFind**](HlPriceApi.md#hLPriceFind) | **GET** /HLPrice | Find all instances of the model matched by filter from the data source.
[**hLPriceFindById**](HlPriceApi.md#hLPriceFindById) | **GET** /HLPrice/{id} | Find a model instance by {{id}} from the data source.
[**hLPriceReplaceById**](HlPriceApi.md#hLPriceReplaceById) | **PUT** /HLPrice/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="hLPriceCreate"></a>
# **hLPriceCreate**
> HLPrice hLPriceCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlPriceApi;


HlPriceApi apiInstance = new HlPriceApi();
HLPrice data = new HLPrice(); // HLPrice | Model instance data
try {
    HLPrice result = apiInstance.hLPriceCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlPriceApi#hLPriceCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**HLPrice**](HLPrice.md)| Model instance data | [optional]

### Return type

[**HLPrice**](HLPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLPriceDeleteById"></a>
# **hLPriceDeleteById**
> Object hLPriceDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlPriceApi;


HlPriceApi apiInstance = new HlPriceApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.hLPriceDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlPriceApi#hLPriceDeleteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLPriceExists"></a>
# **hLPriceExists**
> InlineResponse200 hLPriceExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlPriceApi;


HlPriceApi apiInstance = new HlPriceApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.hLPriceExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlPriceApi#hLPriceExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLPriceFind"></a>
# **hLPriceFind**
> List&lt;HLPrice&gt; hLPriceFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlPriceApi;


HlPriceApi apiInstance = new HlPriceApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<HLPrice> result = apiInstance.hLPriceFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlPriceApi#hLPriceFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;HLPrice&gt;**](HLPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLPriceFindById"></a>
# **hLPriceFindById**
> HLPrice hLPriceFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlPriceApi;


HlPriceApi apiInstance = new HlPriceApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    HLPrice result = apiInstance.hLPriceFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlPriceApi#hLPriceFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**HLPrice**](HLPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLPriceReplaceById"></a>
# **hLPriceReplaceById**
> HLPrice hLPriceReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlPriceApi;


HlPriceApi apiInstance = new HlPriceApi();
String id = "id_example"; // String | Model id
HLPrice data = new HLPrice(); // HLPrice | Model instance data
try {
    HLPrice result = apiInstance.hLPriceReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlPriceApi#hLPriceReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**HLPrice**](HLPrice.md)| Model instance data | [optional]

### Return type

[**HLPrice**](HLPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


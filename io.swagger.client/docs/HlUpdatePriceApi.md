# HlUpdatePriceApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hLUpdatePriceCreate**](HlUpdatePriceApi.md#hLUpdatePriceCreate) | **POST** /HLUpdatePrice | Create a new instance of the model and persist it into the data source.
[**hLUpdatePriceFind**](HlUpdatePriceApi.md#hLUpdatePriceFind) | **GET** /HLUpdatePrice | Find all instances of the model matched by filter from the data source.
[**hLUpdatePriceFindById**](HlUpdatePriceApi.md#hLUpdatePriceFindById) | **GET** /HLUpdatePrice/{id} | Find a model instance by {{id}} from the data source.


<a name="hLUpdatePriceCreate"></a>
# **hLUpdatePriceCreate**
> HLUpdatePrice hLUpdatePriceCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlUpdatePriceApi;


HlUpdatePriceApi apiInstance = new HlUpdatePriceApi();
HLUpdatePrice data = new HLUpdatePrice(); // HLUpdatePrice | Model instance data
try {
    HLUpdatePrice result = apiInstance.hLUpdatePriceCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlUpdatePriceApi#hLUpdatePriceCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**HLUpdatePrice**](HLUpdatePrice.md)| Model instance data | [optional]

### Return type

[**HLUpdatePrice**](HLUpdatePrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLUpdatePriceFind"></a>
# **hLUpdatePriceFind**
> List&lt;HLUpdatePrice&gt; hLUpdatePriceFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlUpdatePriceApi;


HlUpdatePriceApi apiInstance = new HlUpdatePriceApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<HLUpdatePrice> result = apiInstance.hLUpdatePriceFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlUpdatePriceApi#hLUpdatePriceFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;HLUpdatePrice&gt;**](HLUpdatePrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLUpdatePriceFindById"></a>
# **hLUpdatePriceFindById**
> HLUpdatePrice hLUpdatePriceFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlUpdatePriceApi;


HlUpdatePriceApi apiInstance = new HlUpdatePriceApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    HLUpdatePrice result = apiInstance.hLUpdatePriceFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlUpdatePriceApi#hLUpdatePriceFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**HLUpdatePrice**](HLUpdatePrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


# HlUpdateBidApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hLUpdateBidCreate**](HlUpdateBidApi.md#hLUpdateBidCreate) | **POST** /HLUpdateBid | Create a new instance of the model and persist it into the data source.
[**hLUpdateBidFind**](HlUpdateBidApi.md#hLUpdateBidFind) | **GET** /HLUpdateBid | Find all instances of the model matched by filter from the data source.
[**hLUpdateBidFindById**](HlUpdateBidApi.md#hLUpdateBidFindById) | **GET** /HLUpdateBid/{id} | Find a model instance by {{id}} from the data source.


<a name="hLUpdateBidCreate"></a>
# **hLUpdateBidCreate**
> HLUpdateBid hLUpdateBidCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlUpdateBidApi;


HlUpdateBidApi apiInstance = new HlUpdateBidApi();
HLUpdateBid data = new HLUpdateBid(); // HLUpdateBid | Model instance data
try {
    HLUpdateBid result = apiInstance.hLUpdateBidCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlUpdateBidApi#hLUpdateBidCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**HLUpdateBid**](HLUpdateBid.md)| Model instance data | [optional]

### Return type

[**HLUpdateBid**](HLUpdateBid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLUpdateBidFind"></a>
# **hLUpdateBidFind**
> List&lt;HLUpdateBid&gt; hLUpdateBidFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlUpdateBidApi;


HlUpdateBidApi apiInstance = new HlUpdateBidApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<HLUpdateBid> result = apiInstance.hLUpdateBidFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlUpdateBidApi#hLUpdateBidFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;HLUpdateBid&gt;**](HLUpdateBid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLUpdateBidFindById"></a>
# **hLUpdateBidFindById**
> HLUpdateBid hLUpdateBidFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlUpdateBidApi;


HlUpdateBidApi apiInstance = new HlUpdateBidApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    HLUpdateBid result = apiInstance.hLUpdateBidFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlUpdateBidApi#hLUpdateBidFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**HLUpdateBid**](HLUpdateBid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


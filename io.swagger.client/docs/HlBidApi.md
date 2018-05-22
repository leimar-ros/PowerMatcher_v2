# HlBidApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hLBidCreate**](HlBidApi.md#hLBidCreate) | **POST** /HLBid | Create a new instance of the model and persist it into the data source.
[**hLBidDeleteById**](HlBidApi.md#hLBidDeleteById) | **DELETE** /HLBid/{id} | Delete a model instance by {{id}} from the data source.
[**hLBidExists**](HlBidApi.md#hLBidExists) | **HEAD** /HLBid/{id} | Check whether a model instance exists in the data source.
[**hLBidFind**](HlBidApi.md#hLBidFind) | **GET** /HLBid | Find all instances of the model matched by filter from the data source.
[**hLBidFindById**](HlBidApi.md#hLBidFindById) | **GET** /HLBid/{id} | Find a model instance by {{id}} from the data source.
[**hLBidReplaceById**](HlBidApi.md#hLBidReplaceById) | **PUT** /HLBid/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="hLBidCreate"></a>
# **hLBidCreate**
> HLBid hLBidCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlBidApi;


HlBidApi apiInstance = new HlBidApi();
HLBid data = new HLBid(); // HLBid | Model instance data
try {
    HLBid result = apiInstance.hLBidCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlBidApi#hLBidCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**HLBid**](HLBid.md)| Model instance data | [optional]

### Return type

[**HLBid**](HLBid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLBidDeleteById"></a>
# **hLBidDeleteById**
> Object hLBidDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlBidApi;


HlBidApi apiInstance = new HlBidApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.hLBidDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlBidApi#hLBidDeleteById");
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

<a name="hLBidExists"></a>
# **hLBidExists**
> InlineResponse200 hLBidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlBidApi;


HlBidApi apiInstance = new HlBidApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.hLBidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlBidApi#hLBidExists");
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

<a name="hLBidFind"></a>
# **hLBidFind**
> List&lt;HLBid&gt; hLBidFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlBidApi;


HlBidApi apiInstance = new HlBidApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<HLBid> result = apiInstance.hLBidFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlBidApi#hLBidFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;HLBid&gt;**](HLBid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLBidFindById"></a>
# **hLBidFindById**
> HLBid hLBidFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlBidApi;


HlBidApi apiInstance = new HlBidApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    HLBid result = apiInstance.hLBidFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlBidApi#hLBidFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**HLBid**](HLBid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLBidReplaceById"></a>
# **hLBidReplaceById**
> HLBid hLBidReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlBidApi;


HlBidApi apiInstance = new HlBidApi();
String id = "id_example"; // String | Model id
HLBid data = new HLBid(); // HLBid | Model instance data
try {
    HLBid result = apiInstance.hLBidReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlBidApi#hLBidReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**HLBid**](HLBid.md)| Model instance data | [optional]

### Return type

[**HLBid**](HLBid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


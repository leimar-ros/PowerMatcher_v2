# HlDeviceAgentApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hLDeviceAgentCreate**](HlDeviceAgentApi.md#hLDeviceAgentCreate) | **POST** /HLDeviceAgent | Create a new instance of the model and persist it into the data source.
[**hLDeviceAgentDeleteById**](HlDeviceAgentApi.md#hLDeviceAgentDeleteById) | **DELETE** /HLDeviceAgent/{id} | Delete a model instance by {{id}} from the data source.
[**hLDeviceAgentExists**](HlDeviceAgentApi.md#hLDeviceAgentExists) | **HEAD** /HLDeviceAgent/{id} | Check whether a model instance exists in the data source.
[**hLDeviceAgentFind**](HlDeviceAgentApi.md#hLDeviceAgentFind) | **GET** /HLDeviceAgent | Find all instances of the model matched by filter from the data source.
[**hLDeviceAgentFindById**](HlDeviceAgentApi.md#hLDeviceAgentFindById) | **GET** /HLDeviceAgent/{id} | Find a model instance by {{id}} from the data source.
[**hLDeviceAgentReplaceById**](HlDeviceAgentApi.md#hLDeviceAgentReplaceById) | **PUT** /HLDeviceAgent/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="hLDeviceAgentCreate"></a>
# **hLDeviceAgentCreate**
> HLDeviceAgent hLDeviceAgentCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlDeviceAgentApi;


HlDeviceAgentApi apiInstance = new HlDeviceAgentApi();
HLDeviceAgent data = new HLDeviceAgent(); // HLDeviceAgent | Model instance data
try {
    HLDeviceAgent result = apiInstance.hLDeviceAgentCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlDeviceAgentApi#hLDeviceAgentCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**HLDeviceAgent**](HLDeviceAgent.md)| Model instance data | [optional]

### Return type

[**HLDeviceAgent**](HLDeviceAgent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLDeviceAgentDeleteById"></a>
# **hLDeviceAgentDeleteById**
> Object hLDeviceAgentDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlDeviceAgentApi;


HlDeviceAgentApi apiInstance = new HlDeviceAgentApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.hLDeviceAgentDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlDeviceAgentApi#hLDeviceAgentDeleteById");
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

<a name="hLDeviceAgentExists"></a>
# **hLDeviceAgentExists**
> InlineResponse200 hLDeviceAgentExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlDeviceAgentApi;


HlDeviceAgentApi apiInstance = new HlDeviceAgentApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.hLDeviceAgentExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlDeviceAgentApi#hLDeviceAgentExists");
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

<a name="hLDeviceAgentFind"></a>
# **hLDeviceAgentFind**
> List&lt;HLDeviceAgent&gt; hLDeviceAgentFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlDeviceAgentApi;


HlDeviceAgentApi apiInstance = new HlDeviceAgentApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<HLDeviceAgent> result = apiInstance.hLDeviceAgentFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlDeviceAgentApi#hLDeviceAgentFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;HLDeviceAgent&gt;**](HLDeviceAgent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLDeviceAgentFindById"></a>
# **hLDeviceAgentFindById**
> HLDeviceAgent hLDeviceAgentFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlDeviceAgentApi;


HlDeviceAgentApi apiInstance = new HlDeviceAgentApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    HLDeviceAgent result = apiInstance.hLDeviceAgentFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlDeviceAgentApi#hLDeviceAgentFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**HLDeviceAgent**](HLDeviceAgent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLDeviceAgentReplaceById"></a>
# **hLDeviceAgentReplaceById**
> HLDeviceAgent hLDeviceAgentReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlDeviceAgentApi;


HlDeviceAgentApi apiInstance = new HlDeviceAgentApi();
String id = "id_example"; // String | Model id
HLDeviceAgent data = new HLDeviceAgent(); // HLDeviceAgent | Model instance data
try {
    HLDeviceAgent result = apiInstance.hLDeviceAgentReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlDeviceAgentApi#hLDeviceAgentReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**HLDeviceAgent**](HLDeviceAgent.md)| Model instance data | [optional]

### Return type

[**HLDeviceAgent**](HLDeviceAgent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


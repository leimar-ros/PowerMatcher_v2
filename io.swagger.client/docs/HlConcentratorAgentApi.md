# HlConcentratorAgentApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hLConcentratorAgentCreate**](HlConcentratorAgentApi.md#hLConcentratorAgentCreate) | **POST** /HLConcentratorAgent | Create a new instance of the model and persist it into the data source.
[**hLConcentratorAgentDeleteById**](HlConcentratorAgentApi.md#hLConcentratorAgentDeleteById) | **DELETE** /HLConcentratorAgent/{id} | Delete a model instance by {{id}} from the data source.
[**hLConcentratorAgentExists**](HlConcentratorAgentApi.md#hLConcentratorAgentExists) | **HEAD** /HLConcentratorAgent/{id} | Check whether a model instance exists in the data source.
[**hLConcentratorAgentFind**](HlConcentratorAgentApi.md#hLConcentratorAgentFind) | **GET** /HLConcentratorAgent | Find all instances of the model matched by filter from the data source.
[**hLConcentratorAgentFindById**](HlConcentratorAgentApi.md#hLConcentratorAgentFindById) | **GET** /HLConcentratorAgent/{id} | Find a model instance by {{id}} from the data source.
[**hLConcentratorAgentReplaceById**](HlConcentratorAgentApi.md#hLConcentratorAgentReplaceById) | **PUT** /HLConcentratorAgent/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="hLConcentratorAgentCreate"></a>
# **hLConcentratorAgentCreate**
> HLConcentratorAgent hLConcentratorAgentCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlConcentratorAgentApi;


HlConcentratorAgentApi apiInstance = new HlConcentratorAgentApi();
HLConcentratorAgent data = new HLConcentratorAgent(); // HLConcentratorAgent | Model instance data
try {
    HLConcentratorAgent result = apiInstance.hLConcentratorAgentCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlConcentratorAgentApi#hLConcentratorAgentCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**HLConcentratorAgent**](HLConcentratorAgent.md)| Model instance data | [optional]

### Return type

[**HLConcentratorAgent**](HLConcentratorAgent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLConcentratorAgentDeleteById"></a>
# **hLConcentratorAgentDeleteById**
> Object hLConcentratorAgentDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlConcentratorAgentApi;


HlConcentratorAgentApi apiInstance = new HlConcentratorAgentApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.hLConcentratorAgentDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlConcentratorAgentApi#hLConcentratorAgentDeleteById");
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

<a name="hLConcentratorAgentExists"></a>
# **hLConcentratorAgentExists**
> InlineResponse200 hLConcentratorAgentExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlConcentratorAgentApi;


HlConcentratorAgentApi apiInstance = new HlConcentratorAgentApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.hLConcentratorAgentExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlConcentratorAgentApi#hLConcentratorAgentExists");
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

<a name="hLConcentratorAgentFind"></a>
# **hLConcentratorAgentFind**
> List&lt;HLConcentratorAgent&gt; hLConcentratorAgentFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlConcentratorAgentApi;


HlConcentratorAgentApi apiInstance = new HlConcentratorAgentApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<HLConcentratorAgent> result = apiInstance.hLConcentratorAgentFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlConcentratorAgentApi#hLConcentratorAgentFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;HLConcentratorAgent&gt;**](HLConcentratorAgent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLConcentratorAgentFindById"></a>
# **hLConcentratorAgentFindById**
> HLConcentratorAgent hLConcentratorAgentFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlConcentratorAgentApi;


HlConcentratorAgentApi apiInstance = new HlConcentratorAgentApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    HLConcentratorAgent result = apiInstance.hLConcentratorAgentFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlConcentratorAgentApi#hLConcentratorAgentFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**HLConcentratorAgent**](HLConcentratorAgent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="hLConcentratorAgentReplaceById"></a>
# **hLConcentratorAgentReplaceById**
> HLConcentratorAgent hLConcentratorAgentReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlConcentratorAgentApi;


HlConcentratorAgentApi apiInstance = new HlConcentratorAgentApi();
String id = "id_example"; // String | Model id
HLConcentratorAgent data = new HLConcentratorAgent(); // HLConcentratorAgent | Model instance data
try {
    HLConcentratorAgent result = apiInstance.hLConcentratorAgentReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlConcentratorAgentApi#hLConcentratorAgentReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**HLConcentratorAgent**](HLConcentratorAgent.md)| Model instance data | [optional]

### Return type

[**HLConcentratorAgent**](HLConcentratorAgent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


# ObserverApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**observerCreate**](ObserverApi.md#observerCreate) | **POST** /Observer | Create a new instance of the model and persist it into the data source.
[**observerDeleteById**](ObserverApi.md#observerDeleteById) | **DELETE** /Observer/{id} | Delete a model instance by {{id}} from the data source.
[**observerExists**](ObserverApi.md#observerExists) | **HEAD** /Observer/{id} | Check whether a model instance exists in the data source.
[**observerFind**](ObserverApi.md#observerFind) | **GET** /Observer | Find all instances of the model matched by filter from the data source.
[**observerFindById**](ObserverApi.md#observerFindById) | **GET** /Observer/{id} | Find a model instance by {{id}} from the data source.
[**observerReplaceById**](ObserverApi.md#observerReplaceById) | **PUT** /Observer/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="observerCreate"></a>
# **observerCreate**
> Observer observerCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ObserverApi;


ObserverApi apiInstance = new ObserverApi();
Observer data = new Observer(); // Observer | Model instance data
try {
    Observer result = apiInstance.observerCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObserverApi#observerCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Observer**](Observer.md)| Model instance data | [optional]

### Return type

[**Observer**](Observer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="observerDeleteById"></a>
# **observerDeleteById**
> Object observerDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ObserverApi;


ObserverApi apiInstance = new ObserverApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.observerDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObserverApi#observerDeleteById");
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

<a name="observerExists"></a>
# **observerExists**
> InlineResponse200 observerExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ObserverApi;


ObserverApi apiInstance = new ObserverApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.observerExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObserverApi#observerExists");
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

<a name="observerFind"></a>
# **observerFind**
> List&lt;Observer&gt; observerFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ObserverApi;


ObserverApi apiInstance = new ObserverApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Observer> result = apiInstance.observerFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObserverApi#observerFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Observer&gt;**](Observer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="observerFindById"></a>
# **observerFindById**
> Observer observerFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ObserverApi;


ObserverApi apiInstance = new ObserverApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Observer result = apiInstance.observerFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObserverApi#observerFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Observer**](Observer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="observerReplaceById"></a>
# **observerReplaceById**
> Observer observerReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ObserverApi;


ObserverApi apiInstance = new ObserverApi();
String id = "id_example"; // String | Model id
Observer data = new Observer(); // Observer | Model instance data
try {
    Observer result = apiInstance.observerReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObserverApi#observerReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Observer**](Observer.md)| Model instance data | [optional]

### Return type

[**Observer**](Observer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


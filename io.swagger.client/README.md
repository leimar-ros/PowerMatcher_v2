# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.HlBidApi;

import java.io.File;
import java.util.*;

public class HlBidApiExample {

    public static void main(String[] args) {
        
        HlBidApi apiInstance = new HlBidApi();
        HLBid data = new HLBid(); // HLBid | Model instance data
        try {
            HLBid result = apiInstance.hLBidCreate(data);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HlBidApi#hLBidCreate");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*HlBidApi* | [**hLBidCreate**](docs/HlBidApi.md#hLBidCreate) | **POST** /HLBid | Create a new instance of the model and persist it into the data source.
*HlBidApi* | [**hLBidDeleteById**](docs/HlBidApi.md#hLBidDeleteById) | **DELETE** /HLBid/{id} | Delete a model instance by {{id}} from the data source.
*HlBidApi* | [**hLBidExists**](docs/HlBidApi.md#hLBidExists) | **HEAD** /HLBid/{id} | Check whether a model instance exists in the data source.
*HlBidApi* | [**hLBidFind**](docs/HlBidApi.md#hLBidFind) | **GET** /HLBid | Find all instances of the model matched by filter from the data source.
*HlBidApi* | [**hLBidFindById**](docs/HlBidApi.md#hLBidFindById) | **GET** /HLBid/{id} | Find a model instance by {{id}} from the data source.
*HlBidApi* | [**hLBidReplaceById**](docs/HlBidApi.md#hLBidReplaceById) | **PUT** /HLBid/{id} | Replace attributes for a model instance and persist it into the data source.
*HlConcentratorAgentApi* | [**hLConcentratorAgentCreate**](docs/HlConcentratorAgentApi.md#hLConcentratorAgentCreate) | **POST** /HLConcentratorAgent | Create a new instance of the model and persist it into the data source.
*HlConcentratorAgentApi* | [**hLConcentratorAgentDeleteById**](docs/HlConcentratorAgentApi.md#hLConcentratorAgentDeleteById) | **DELETE** /HLConcentratorAgent/{id} | Delete a model instance by {{id}} from the data source.
*HlConcentratorAgentApi* | [**hLConcentratorAgentExists**](docs/HlConcentratorAgentApi.md#hLConcentratorAgentExists) | **HEAD** /HLConcentratorAgent/{id} | Check whether a model instance exists in the data source.
*HlConcentratorAgentApi* | [**hLConcentratorAgentFind**](docs/HlConcentratorAgentApi.md#hLConcentratorAgentFind) | **GET** /HLConcentratorAgent | Find all instances of the model matched by filter from the data source.
*HlConcentratorAgentApi* | [**hLConcentratorAgentFindById**](docs/HlConcentratorAgentApi.md#hLConcentratorAgentFindById) | **GET** /HLConcentratorAgent/{id} | Find a model instance by {{id}} from the data source.
*HlConcentratorAgentApi* | [**hLConcentratorAgentReplaceById**](docs/HlConcentratorAgentApi.md#hLConcentratorAgentReplaceById) | **PUT** /HLConcentratorAgent/{id} | Replace attributes for a model instance and persist it into the data source.
*HlDeviceAgentApi* | [**hLDeviceAgentCreate**](docs/HlDeviceAgentApi.md#hLDeviceAgentCreate) | **POST** /HLDeviceAgent | Create a new instance of the model and persist it into the data source.
*HlDeviceAgentApi* | [**hLDeviceAgentDeleteById**](docs/HlDeviceAgentApi.md#hLDeviceAgentDeleteById) | **DELETE** /HLDeviceAgent/{id} | Delete a model instance by {{id}} from the data source.
*HlDeviceAgentApi* | [**hLDeviceAgentExists**](docs/HlDeviceAgentApi.md#hLDeviceAgentExists) | **HEAD** /HLDeviceAgent/{id} | Check whether a model instance exists in the data source.
*HlDeviceAgentApi* | [**hLDeviceAgentFind**](docs/HlDeviceAgentApi.md#hLDeviceAgentFind) | **GET** /HLDeviceAgent | Find all instances of the model matched by filter from the data source.
*HlDeviceAgentApi* | [**hLDeviceAgentFindById**](docs/HlDeviceAgentApi.md#hLDeviceAgentFindById) | **GET** /HLDeviceAgent/{id} | Find a model instance by {{id}} from the data source.
*HlDeviceAgentApi* | [**hLDeviceAgentReplaceById**](docs/HlDeviceAgentApi.md#hLDeviceAgentReplaceById) | **PUT** /HLDeviceAgent/{id} | Replace attributes for a model instance and persist it into the data source.
*HlPriceApi* | [**hLPriceCreate**](docs/HlPriceApi.md#hLPriceCreate) | **POST** /HLPrice | Create a new instance of the model and persist it into the data source.
*HlPriceApi* | [**hLPriceDeleteById**](docs/HlPriceApi.md#hLPriceDeleteById) | **DELETE** /HLPrice/{id} | Delete a model instance by {{id}} from the data source.
*HlPriceApi* | [**hLPriceExists**](docs/HlPriceApi.md#hLPriceExists) | **HEAD** /HLPrice/{id} | Check whether a model instance exists in the data source.
*HlPriceApi* | [**hLPriceFind**](docs/HlPriceApi.md#hLPriceFind) | **GET** /HLPrice | Find all instances of the model matched by filter from the data source.
*HlPriceApi* | [**hLPriceFindById**](docs/HlPriceApi.md#hLPriceFindById) | **GET** /HLPrice/{id} | Find a model instance by {{id}} from the data source.
*HlPriceApi* | [**hLPriceReplaceById**](docs/HlPriceApi.md#hLPriceReplaceById) | **PUT** /HLPrice/{id} | Replace attributes for a model instance and persist it into the data source.
*HlUpdateBidApi* | [**hLUpdateBidCreate**](docs/HlUpdateBidApi.md#hLUpdateBidCreate) | **POST** /HLUpdateBid | Create a new instance of the model and persist it into the data source.
*HlUpdateBidApi* | [**hLUpdateBidFind**](docs/HlUpdateBidApi.md#hLUpdateBidFind) | **GET** /HLUpdateBid | Find all instances of the model matched by filter from the data source.
*HlUpdateBidApi* | [**hLUpdateBidFindById**](docs/HlUpdateBidApi.md#hLUpdateBidFindById) | **GET** /HLUpdateBid/{id} | Find a model instance by {{id}} from the data source.
*HlUpdatePriceApi* | [**hLUpdatePriceCreate**](docs/HlUpdatePriceApi.md#hLUpdatePriceCreate) | **POST** /HLUpdatePrice | Create a new instance of the model and persist it into the data source.
*HlUpdatePriceApi* | [**hLUpdatePriceFind**](docs/HlUpdatePriceApi.md#hLUpdatePriceFind) | **GET** /HLUpdatePrice | Find all instances of the model matched by filter from the data source.
*HlUpdatePriceApi* | [**hLUpdatePriceFindById**](docs/HlUpdatePriceApi.md#hLUpdatePriceFindById) | **GET** /HLUpdatePrice/{id} | Find a model instance by {{id}} from the data source.
*ObserverApi* | [**observerCreate**](docs/ObserverApi.md#observerCreate) | **POST** /Observer | Create a new instance of the model and persist it into the data source.
*ObserverApi* | [**observerDeleteById**](docs/ObserverApi.md#observerDeleteById) | **DELETE** /Observer/{id} | Delete a model instance by {{id}} from the data source.
*ObserverApi* | [**observerExists**](docs/ObserverApi.md#observerExists) | **HEAD** /Observer/{id} | Check whether a model instance exists in the data source.
*ObserverApi* | [**observerFind**](docs/ObserverApi.md#observerFind) | **GET** /Observer | Find all instances of the model matched by filter from the data source.
*ObserverApi* | [**observerFindById**](docs/ObserverApi.md#observerFindById) | **GET** /Observer/{id} | Find a model instance by {{id}} from the data source.
*ObserverApi* | [**observerReplaceById**](docs/ObserverApi.md#observerReplaceById) | **PUT** /Observer/{id} | Replace attributes for a model instance and persist it into the data source.
*QueryApi* | [**querySelectAgentByIP**](docs/QueryApi.md#querySelectAgentByIP) | **GET** /queries/selectAgentByIP | Select all agents by ip
*QueryApi* | [**querySelectBid**](docs/QueryApi.md#querySelectBid) | **GET** /queries/selectBid | Select all Bid curves in the network
*QueryApi* | [**querySelectBidByBidNumber**](docs/QueryApi.md#querySelectBidByBidNumber) | **GET** /queries/selectBidByBidNumber | Select all bid based on bidnumber
*QueryApi* | [**querySelectBidByIP**](docs/QueryApi.md#querySelectBidByIP) | **GET** /queries/selectBidByIP | Select all bid based on device IP
*QueryApi* | [**querySelectConc**](docs/QueryApi.md#querySelectConc) | **GET** /queries/selectConc | Select all Concentrator Agents
*QueryApi* | [**querySelectDevice**](docs/QueryApi.md#querySelectDevice) | **GET** /queries/selectDevice | Select all Device agents
*QueryApi* | [**querySelectPrice**](docs/QueryApi.md#querySelectPrice) | **GET** /queries/selectPrice | Select all Prices recorded
*QueryApi* | [**querySelectPriceByBidNumber**](docs/QueryApi.md#querySelectPriceByBidNumber) | **GET** /queries/selectPriceByBidNumber | Select all Price based on ip
*QueryApi* | [**querySelectPriceByIP**](docs/QueryApi.md#querySelectPriceByIP) | **GET** /queries/selectPriceByIP | Select all Price based on ip
*SystemApi* | [**systemBindIdentity**](docs/SystemApi.md#systemBindIdentity) | **POST** /system/identities/bind | Bind an identity to the specified participant
*SystemApi* | [**systemGetAllHistorianRecords**](docs/SystemApi.md#systemGetAllHistorianRecords) | **GET** /system/historian | Get all Historian Records from the Historian
*SystemApi* | [**systemGetAllIdentities**](docs/SystemApi.md#systemGetAllIdentities) | **GET** /system/identities | Get all identities from the identity registry
*SystemApi* | [**systemGetHistorianRecordByID**](docs/SystemApi.md#systemGetHistorianRecordByID) | **GET** /system/historian/{id} | Get the specified Historian Record from the Historian
*SystemApi* | [**systemGetIdentityByID**](docs/SystemApi.md#systemGetIdentityByID) | **GET** /system/identities/{id} | Get the specified identity from the identity registry
*SystemApi* | [**systemIssueIdentity**](docs/SystemApi.md#systemIssueIdentity) | **POST** /system/identities/issue | Issue an identity to the specified participant
*SystemApi* | [**systemPing**](docs/SystemApi.md#systemPing) | **GET** /system/ping | Test the connection to the business network
*SystemApi* | [**systemRevokeIdentity**](docs/SystemApi.md#systemRevokeIdentity) | **POST** /system/identities/{id}/revoke | Revoke the specified identity


## Documentation for Models

 - [BindIdentityRequest](docs/BindIdentityRequest.md)
 - [HLAgent](docs/HLAgent.md)
 - [HLBid](docs/HLBid.md)
 - [HLConcentratorAgent](docs/HLConcentratorAgent.md)
 - [HLDeviceAgent](docs/HLDeviceAgent.md)
 - [HLPrice](docs/HLPrice.md)
 - [HLUpdateBid](docs/HLUpdateBid.md)
 - [HLUpdatePrice](docs/HLUpdatePrice.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [IssueIdentityRequest](docs/IssueIdentityRequest.md)
 - [Observer](docs/Observer.md)
 - [PingResponse](docs/PingResponse.md)
 - [XAny](docs/XAny.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




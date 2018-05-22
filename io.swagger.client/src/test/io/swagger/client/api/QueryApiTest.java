/*
 * LoopBack Application
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package test.io.swagger.client.api;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.api.QueryApi;
import io.swagger.client.model.HLAgent;
import io.swagger.client.model.HLBid;
import io.swagger.client.model.HLConcentratorAgent;
import io.swagger.client.model.HLDeviceAgent;
import io.swagger.client.model.HLPrice;

/**
 * API tests for QueryApi
 */
@Ignore
public class QueryApiTest {

    private final QueryApi api = new QueryApi();

    
    /**
     * Select all agents by ip
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void querySelectAgentByIPTest() throws ApiException {
        String agentIP = null;
        List<HLAgent> response = api.querySelectAgentByIP(agentIP);

        // TODO: test validations
    }
    
    /**
     * Select all Bid curves in the network
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void querySelectBidTest() throws ApiException {
        List<HLBid> response = api.querySelectBid();

        // TODO: test validations
    }
    
    /**
     * Select all bid based on bidnumber
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void querySelectBidByBidNumberTest() throws ApiException {
        String hlBidNumber = null;
        List<HLBid> response = api.querySelectBidByBidNumber(hlBidNumber);

        // TODO: test validations
    }
    
    /**
     * Select all bid based on device IP
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void querySelectBidByIPTest() throws ApiException {
        String bsourceIP = null;
        List<HLBid> response = api.querySelectBidByIP(bsourceIP);

        // TODO: test validations
    }
    
    /**
     * Select all Concentrator Agents
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void querySelectConcTest() throws ApiException {
        List<HLConcentratorAgent> response = api.querySelectConc();

        // TODO: test validations
    }
    
    /**
     * Select all Device agents
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void querySelectDeviceTest() throws ApiException {
        List<HLDeviceAgent> response = api.querySelectDevice();

        // TODO: test validations
    }
    
    /**
     * Select all Prices recorded
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void querySelectPriceTest() throws ApiException {
        List<HLPrice> response = api.querySelectPrice();

        // TODO: test validations
    }
    
    /**
     * Select all Price based on ip
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void querySelectPriceByBidNumberTest() throws ApiException {
        String hlBidNumber = null;
        List<HLPrice> response = api.querySelectPriceByBidNumber(hlBidNumber);

        // TODO: test validations
    }
    
    /**
     * Select all Price based on ip
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void querySelectPriceByIPTest() throws ApiException {
        String psourceIP = null;
        List<HLPrice> response = api.querySelectPriceByIP(psourceIP);

        // TODO: test validations
    }
    
}

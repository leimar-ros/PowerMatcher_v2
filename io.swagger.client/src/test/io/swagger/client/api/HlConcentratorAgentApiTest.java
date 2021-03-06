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
import io.swagger.client.api.HlConcentratorAgentApi;
import io.swagger.client.model.HLConcentratorAgent;
import io.swagger.client.model.InlineResponse200;

/**
 * API tests for HlConcentratorAgentApi
 */
@Ignore
public class HlConcentratorAgentApiTest {

    private final HlConcentratorAgentApi api = new HlConcentratorAgentApi();

    
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hLConcentratorAgentCreateTest() throws ApiException {
        HLConcentratorAgent data = null;
        HLConcentratorAgent response = api.hLConcentratorAgentCreate(data);

        // TODO: test validations
    }
    
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hLConcentratorAgentDeleteByIdTest() throws ApiException {
        String id = null;
        Object response = api.hLConcentratorAgentDeleteById(id);

        // TODO: test validations
    }
    
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hLConcentratorAgentExistsTest() throws ApiException {
        String id = null;
        InlineResponse200 response = api.hLConcentratorAgentExists(id);

        // TODO: test validations
    }
    
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hLConcentratorAgentFindTest() throws ApiException {
        String filter = null;
        List<HLConcentratorAgent> response = api.hLConcentratorAgentFind(filter);

        // TODO: test validations
    }
    
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hLConcentratorAgentFindByIdTest() throws ApiException {
        String id = null;
        String filter = null;
        HLConcentratorAgent response = api.hLConcentratorAgentFindById(id, filter);

        // TODO: test validations
    }
    
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hLConcentratorAgentReplaceByIdTest() throws ApiException {
        String id = null;
        HLConcentratorAgent data = null;
        HLConcentratorAgent response = api.hLConcentratorAgentReplaceById(id, data);

        // TODO: test validations
    }
    
}

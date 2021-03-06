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
import io.swagger.client.api.HlUpdateBidApi;
import io.swagger.client.model.HLUpdateBid;

/**
 * API tests for HlUpdateBidApi
 */
@Ignore
public class HlUpdateBidApiTest {

    private final HlUpdateBidApi api = new HlUpdateBidApi();

    
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hLUpdateBidCreateTest() throws ApiException {
        HLUpdateBid data = null;
        HLUpdateBid response = api.hLUpdateBidCreate(data);

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
    public void hLUpdateBidFindTest() throws ApiException {
        String filter = null;
        List<HLUpdateBid> response = api.hLUpdateBidFind(filter);

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
    public void hLUpdateBidFindByIdTest() throws ApiException {
        String id = null;
        String filter = null;
        HLUpdateBid response = api.hLUpdateBidFindById(id, filter);

        // TODO: test validations
    }
    
}

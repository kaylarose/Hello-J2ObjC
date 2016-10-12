/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.pets.core.petstore.data.store.store.api;

import com.pets.core.petstore.data.store.ApiClient;
import com.pets.core.petstore.data.store.ApiException;
import com.pets.core.petstore.data.store.ApiResponse;
import com.pets.core.petstore.data.store.Configuration;
import com.pets.core.petstore.data.store.Pair;

import com.pets.core.petstore.data.models.Order;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreApi {
    private ApiClient apiClient;

    public StoreApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StoreApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public Observable<Void> deleteOrder(Long orderId) {
        Object localVarPostBody = null;
        
        // verify the required parameter 'orderId' is set
        // TODO OnError instead of Throw
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId' when calling deleteOrder(Async)");
        }
        

        // create path and map variables
        String localVarPath = "store/order/{orderId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

        // Turn Query Params into Pairs
        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        // Add all generic header params
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        // Setup Form Params
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        // Add Accept Header(s) (if provided)
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        // Add Content-Type Header(s) (if provided)
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String endpointWithQuery = apiClient.buildUrl(localVarPath, localVarQueryParams);

        Type localVarReturnType = new TypeToken<Void>(){}.getType();

		ApiRequest apiRequest = new ApiRequest("DELETE", localVarHeaderParams, localVarPostBody, localVarFormParams, localVarQueryParams);
        apiRequest = apiClient.prepareRequestForCall(apiRequest);
		return apiClient.(endpointWithQuery, apiRequest)
		   .map( response -> apiClient.handleResponse(response, localVarReturnType) );

    }

    public Observable<Map<String, Integer>> getInventory() {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "store/inventory".replaceAll("\\{format\\}","json");

        // Turn Query Params into Pairs
        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        // Add all generic header params
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        // Setup Form Params
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        // Add Accept Header(s) (if provided)
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        // Add Content-Type Header(s) (if provided)
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String endpointWithQuery = apiClient.buildUrl(localVarPath, localVarQueryParams);

        Type localVarReturnType = new TypeToken<Map<String, Integer>>(){}.getType();

		ApiRequest apiRequest = new ApiRequest("GET", localVarHeaderParams, localVarPostBody, localVarFormParams, localVarQueryParams);
        apiRequest = apiClient.prepareRequestForCall(apiRequest);
		return apiClient.(endpointWithQuery, apiRequest)
		   .map( response -> apiClient.handleResponse(response, localVarReturnType) );

    }

    public Observable<Order> getOrderById(Long orderId) {
        Object localVarPostBody = null;
        
        // verify the required parameter 'orderId' is set
        // TODO OnError instead of Throw
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId' when calling getOrderById(Async)");
        }
        

        // create path and map variables
        String localVarPath = "store/order/{orderId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

        // Turn Query Params into Pairs
        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        // Add all generic header params
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        // Setup Form Params
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        // Add Accept Header(s) (if provided)
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        // Add Content-Type Header(s) (if provided)
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String endpointWithQuery = apiClient.buildUrl(localVarPath, localVarQueryParams);

        Type localVarReturnType = new TypeToken<Order>(){}.getType();

		ApiRequest apiRequest = new ApiRequest("GET", localVarHeaderParams, localVarPostBody, localVarFormParams, localVarQueryParams);
        apiRequest = apiClient.prepareRequestForCall(apiRequest);
		return apiClient.(endpointWithQuery, apiRequest)
		   .map( response -> apiClient.handleResponse(response, localVarReturnType) );

    }

    public Observable<Order> placeOrder(Order body) {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        // TODO OnError instead of Throw
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling placeOrder(Async)");
        }
        

        // create path and map variables
        String localVarPath = "store/order".replaceAll("\\{format\\}","json");

        // Turn Query Params into Pairs
        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        // Add all generic header params
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        // Setup Form Params
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        // Add Accept Header(s) (if provided)
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        // Add Content-Type Header(s) (if provided)
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String endpointWithQuery = apiClient.buildUrl(localVarPath, localVarQueryParams);

        Type localVarReturnType = new TypeToken<Order>(){}.getType();

		ApiRequest apiRequest = new ApiRequest("POST", localVarHeaderParams, localVarPostBody, localVarFormParams, localVarQueryParams);
        apiRequest = apiClient.prepareRequestForCall(apiRequest);
		return apiClient.(endpointWithQuery, apiRequest)
		   .map( response -> apiClient.handleResponse(response, localVarReturnType) );

    }

}
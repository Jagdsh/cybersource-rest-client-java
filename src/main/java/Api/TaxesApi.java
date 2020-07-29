/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;


import Model.PtsV2PaymentsPost502Response;
import Model.TaxRequest;
import Model.VasV2PaymentsPost201Response;
import Model.VasV2PaymentsPost400Response;
import Model.VasV2TaxVoid200Response;
import Model.VasV2TaxVoidsPost400Response;
import Model.VoidTaxRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaxesApi {
    private ApiClient apiClient;

    public TaxesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaxesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for calculateTax
     * @param taxRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call calculateTaxCall(TaxRequest taxRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = taxRequest;
        
        // create path and map variables
        String localVarPath = "/vas/v2/tax";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call calculateTaxValidateBeforeCall(TaxRequest taxRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'taxRequest' is set
        if (taxRequest == null) {
            throw new ApiException("Missing the required parameter 'taxRequest' when calling calculateTax(Async)");
        }
        
        
        okhttp3.Call call = calculateTaxCall(taxRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Calculate Taxes
     * Get tax details for a transaction. 
     * @param taxRequest  (required)
     * @return VasV2PaymentsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VasV2PaymentsPost201Response calculateTax(TaxRequest taxRequest) throws ApiException {
        ApiResponse<VasV2PaymentsPost201Response> resp = calculateTaxWithHttpInfo(taxRequest);
        return resp.getData();
    }

    /**
     * Calculate Taxes
     * Get tax details for a transaction. 
     * @param taxRequest  (required)
     * @return ApiResponse&lt;VasV2PaymentsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VasV2PaymentsPost201Response> calculateTaxWithHttpInfo(TaxRequest taxRequest) throws ApiException {
        okhttp3.Call call = calculateTaxValidateBeforeCall(taxRequest, null, null);
        Type localVarReturnType = new TypeToken<VasV2PaymentsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Calculate Taxes (asynchronously)
     * Get tax details for a transaction. 
     * @param taxRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call calculateTaxAsync(TaxRequest taxRequest, final ApiCallback<VasV2PaymentsPost201Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = calculateTaxValidateBeforeCall(taxRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VasV2PaymentsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for voidTax
     * @param voidTaxRequest  (required)
     * @param id The tax ID returned from a previous request. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call voidTaxCall(VoidTaxRequest voidTaxRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = voidTaxRequest;
        
        // create path and map variables
        String localVarPath = "/vas/v2/tax/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call voidTaxValidateBeforeCall(VoidTaxRequest voidTaxRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'voidTaxRequest' is set
        if (voidTaxRequest == null) {
            throw new ApiException("Missing the required parameter 'voidTaxRequest' when calling voidTax(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling voidTax(Async)");
        }
        
        
        okhttp3.Call call = voidTaxCall(voidTaxRequest, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Void Taxes
     * Pass the Tax Request ID in the PATCH request to void the committed tax calculation.
     * @param voidTaxRequest  (required)
     * @param id The tax ID returned from a previous request. (required)
     * @return VasV2TaxVoid200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VasV2TaxVoid200Response voidTax(VoidTaxRequest voidTaxRequest, String id) throws ApiException {
        ApiResponse<VasV2TaxVoid200Response> resp = voidTaxWithHttpInfo(voidTaxRequest, id);
        return resp.getData();
    }

    /**
     * Void Taxes
     * Pass the Tax Request ID in the PATCH request to void the committed tax calculation.
     * @param voidTaxRequest  (required)
     * @param id The tax ID returned from a previous request. (required)
     * @return ApiResponse&lt;VasV2TaxVoid200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VasV2TaxVoid200Response> voidTaxWithHttpInfo(VoidTaxRequest voidTaxRequest, String id) throws ApiException {
        okhttp3.Call call = voidTaxValidateBeforeCall(voidTaxRequest, id, null, null);
        Type localVarReturnType = new TypeToken<VasV2TaxVoid200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Void Taxes (asynchronously)
     * Pass the Tax Request ID in the PATCH request to void the committed tax calculation.
     * @param voidTaxRequest  (required)
     * @param id The tax ID returned from a previous request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call voidTaxAsync(VoidTaxRequest voidTaxRequest, String id, final ApiCallback<VasV2TaxVoid200Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = voidTaxValidateBeforeCall(voidTaxRequest, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VasV2TaxVoid200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

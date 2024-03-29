package com.airbyte.api;

import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.utils.HTTPRequest;
import com.airbyte.api.utils.JSON;
import com.airbyte.api.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Jobs {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Jobs(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
    
    /**
     * cancelJob - Cancel a running Job
    **/
    public com.airbyte.api.models.operations.CancelJobResponse cancelJob(com.airbyte.api.models.operations.CancelJobRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(com.airbyte.api.models.operations.CancelJobRequest.class, baseUrl, "/jobs/{jobId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.CancelJobResponse res = new com.airbyte.api.models.operations.CancelJobResponse() {{
            jobResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.JobResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.JobResponse.class);
                res.jobResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * createJob - Trigger a sync or reset job of a connection
    **/
    public com.airbyte.api.models.operations.CreateJobResponse createJob(com.airbyte.api.models.shared.JobCreate request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(baseUrl, "/jobs");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.airbyte.api.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.CreateJobResponse res = new com.airbyte.api.models.operations.CreateJobResponse() {{
            jobResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.JobResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.JobResponse.class);
                res.jobResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * getJob - Get Job status and details
    **/
    public com.airbyte.api.models.operations.GetJobResponse getJob(com.airbyte.api.models.operations.GetJobRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(com.airbyte.api.models.operations.GetJobRequest.class, baseUrl, "/jobs/{jobId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.GetJobResponse res = new com.airbyte.api.models.operations.GetJobResponse() {{
            jobResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.JobResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.JobResponse.class);
                res.jobResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * listJobs - List Jobs by sync type
    **/
    public com.airbyte.api.models.operations.ListJobsResponse listJobs(com.airbyte.api.models.operations.ListJobsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(baseUrl, "/jobs");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = com.airbyte.api.utils.Utils.getQueryParams(com.airbyte.api.models.operations.ListJobsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.ListJobsResponse res = new com.airbyte.api.models.operations.ListJobsResponse() {{
            jobsResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.JobsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.JobsResponse.class);
                res.jobsResponse = out;
            }
        }

        return res;
    }
}
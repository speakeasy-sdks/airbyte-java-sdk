package com.airbyte.api;

import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.utils.HTTPRequest;
import com.airbyte.api.utils.JSON;
import com.airbyte.api.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class Sources {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Sources(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
    
    /**
     * createSource - Create a source
     *
     * Creates a source given a name, workspace id, and a json blob containing the configuration for the source.
    **/
    public com.airbyte.api.models.operations.CreateSourceResponse createSource(com.airbyte.api.models.shared.SourceCreate request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(baseUrl, "/sources");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.airbyte.api.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.CreateSourceResponse res = new com.airbyte.api.models.operations.CreateSourceResponse() {{
            sourceId = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.SourceId out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.SourceId.class);
                res.sourceId = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
        }

        return res;
    }
}
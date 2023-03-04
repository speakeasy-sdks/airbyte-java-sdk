package com.airbyte.api;

import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.utils.SpeakeasyHTTPClient;


public class Airbyte {
	public static final String[] SERVERS = {
		"https://api.airbyte.com/v1/",
	};
  	
  	public Connections connections;
  	public Destinations destinations;
  	public Jobs jobs;
  	public Sources sources;	

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private com.airbyte.api.models.shared.Security _security;
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "0.1.0";
	private String _genVersion = "1.8.2";

	public static class Builder {
		private HTTPClient client;
		private com.airbyte.api.models.shared.Security security;
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		public Builder setSecurity(com.airbyte.api.models.shared.Security security) {
			this.security = security;
			return this;
		}
		
		public Builder setServerURL(String serverUrl) {
			this.serverUrl = serverUrl;
			return this;
		}
		
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.serverUrl = serverUrl;
			this.params = params;
			return this;
		}
		
		public Airbyte build() throws Exception {
			return new Airbyte(this.client, this.security, this.serverUrl, this.params);
		}
	}

	public static Builder builder() {
		return new Builder();
	}

	private Airbyte(HTTPClient client, com.airbyte.api.models.shared.Security security, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (security != null) {
			this._security = security;
			this._securityClient = com.airbyte.api.utils.Utils.configureSecurityClient(this._defaultClient, this._security);
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = com.airbyte.api.utils.Utils.templateUrl(serverUrl, params);
		}
		
		if (this._serverUrl == null) {
			this._serverUrl = SERVERS[0];
		}
		
		this.connections = new Connections(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.destinations = new Destinations(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.jobs = new Jobs(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.sources = new Sources(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
	}
}
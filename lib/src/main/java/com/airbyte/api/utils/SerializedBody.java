package com.airbyte.api.utils;

import java.net.http.HttpRequest.BodyPublisher;

public class SerializedBody {
    public String contentType;
    public BodyPublisher body;
}
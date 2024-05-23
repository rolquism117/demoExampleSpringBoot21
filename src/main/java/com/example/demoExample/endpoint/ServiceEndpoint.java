package com.example.demoExample.endpoint;

import com.example.demoExample.service.GetRequest;
import com.example.demoExample.service.GetResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ServiceEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/soap";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getRequest")
    @ResponsePayload
    public GetResponse handleGetRequest(@RequestPayload GetRequest request) {
        GetResponse response = new GetResponse();
        response.setMessage("Response: " + request.getName());
        return response;
    }
}

package com.example.demoExample.endpoint;

import com.example.soap_web_service.GetHelloRequest;
import com.example.soap_web_service.GetHelloResponse;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class HelloEndpoint {
    @PayloadRoot(namespace = "http://example.com/soap-web-service", localPart = "GetHelloRequest")
    @ResponsePayload
    public GetHelloResponse getHello(@RequestPayload GetHelloRequest request) {
        GetHelloResponse response = new GetHelloResponse();
        response.setGreeting("Hello, " + request.getName());
        return response;
    }
}

package com.example.demoExample.endpoint;

import com.example.soap_web_service.GetHelloRequest;
import com.example.soap_web_service.GetHelloResponse;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Component
public class HelloEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/soap-web-service";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetHelloRequest")
    @ResponsePayload
    public GetHelloResponse getHello(@RequestPayload GetHelloRequest request) {
        GetHelloResponse response = new GetHelloResponse();
        String name = request.getName();
        String greeting = "Hello, " + name + "!";
        response.setGreeting(greeting);
        return response;
    }
}

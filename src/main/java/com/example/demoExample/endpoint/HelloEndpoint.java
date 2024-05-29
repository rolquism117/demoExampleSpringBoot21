package com.example.demoExample.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.soap_web_service.GetHelloRequest;
import com.example.soap_web_service.GetHelloResponse;

@Endpoint
public class HelloEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/soap-web-service";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetHelloRequest")
    @ResponsePayload
    public JAXBElement<GetHelloResponse> getHello(@RequestPayload JAXBElement<GetHelloRequest> request) {
        GetHelloRequest getHelloRequest = request.getValue();
        GetHelloResponse response = new GetHelloResponse();
        response.setGreeting("Hello, " + getHelloRequest.getName() + "!");

        return new JAXBElement<>(new QName(NAMESPACE_URI, "GetHelloResponse"), GetHelloResponse.class, response);
    }
}


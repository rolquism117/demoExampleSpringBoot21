//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.05.29 a las 12:00:38 PM PET 
//


package com.example.soap_web_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.soap_web_service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetHelloRequest_QNAME = new QName("http://example.com/soap-web-service", "GetHelloRequest");
    private final static QName _GetHelloResponse_QNAME = new QName("http://example.com/soap-web-service", "GetHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.soap_web_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHelloRequest }
     * 
     */
    public GetHelloRequest createGetHelloRequest() {
        return new GetHelloRequest();
    }

    /**
     * Create an instance of {@link GetHelloResponse }
     * 
     */
    public GetHelloResponse createGetHelloResponse() {
        return new GetHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHelloRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soap-web-service", name = "GetHelloRequest")
    public JAXBElement<GetHelloRequest> createGetHelloRequest(GetHelloRequest value) {
        return new JAXBElement<GetHelloRequest>(_GetHelloRequest_QNAME, GetHelloRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soap-web-service", name = "GetHelloResponse")
    public JAXBElement<GetHelloResponse> createGetHelloResponse(GetHelloResponse value) {
        return new JAXBElement<GetHelloResponse>(_GetHelloResponse_QNAME, GetHelloResponse.class, null, value);
    }

}

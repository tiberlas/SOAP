//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.28 at 10:24:57 AM CEST 
//


package com.example.wsdl.consumewsdl.generate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.wsdl.consumewsdl.generate package. 
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

    private final static QName _GetCourseRequest_QNAME = new QName("http://uns.ac.rs/xml/team18", "getCourseRequest");
    private final static QName _GetCourseResponse_QNAME = new QName("http://uns.ac.rs/xml/team18", "getCourseResponse");
    private final static QName _GetProfileRequest_QNAME = new QName("http://uns.ac.rs/xml/team18", "getProfileRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.wsdl.consumewsdl.generate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCourseRequest }
     * 
     */
    public GetCourseRequest createGetCourseRequest() {
        return new GetCourseRequest();
    }

    /**
     * Create an instance of {@link GetCourseResponse }
     * 
     */
    public GetCourseResponse createGetCourseResponse() {
        return new GetCourseResponse();
    }

    /**
     * Create an instance of {@link GetProfileRequest }
     * 
     */
    public GetProfileRequest createGetProfileRequest() {
        return new GetProfileRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourseRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCourseRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://uns.ac.rs/xml/team18", name = "getCourseRequest")
    public JAXBElement<GetCourseRequest> createGetCourseRequest(GetCourseRequest value) {
        return new JAXBElement<GetCourseRequest>(_GetCourseRequest_QNAME, GetCourseRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCourseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://uns.ac.rs/xml/team18", name = "getCourseResponse")
    public JAXBElement<GetCourseResponse> createGetCourseResponse(GetCourseResponse value) {
        return new JAXBElement<GetCourseResponse>(_GetCourseResponse_QNAME, GetCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfileRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProfileRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://uns.ac.rs/xml/team18", name = "getProfileRequest")
    public JAXBElement<GetProfileRequest> createGetProfileRequest(GetProfileRequest value) {
        return new JAXBElement<GetProfileRequest>(_GetProfileRequest_QNAME, GetProfileRequest.class, null, value);
    }

}

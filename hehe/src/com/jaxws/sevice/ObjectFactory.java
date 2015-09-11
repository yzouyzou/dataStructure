
package com.jaxws.sevice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jaxws.sevice package. 
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

    private final static QName _GetServiceXml_QNAME = new QName("http://sevice.jaxws.com", "xml");
    private final static QName _GetServiceResponseReturn_QNAME = new QName("http://sevice.jaxws.com", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jaxws.sevice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetService }
     * 
     */
    public GetService createGetService() {
        return new GetService();
    }

    /**
     * Create an instance of {@link GetServiceResponse }
     * 
     */
    public GetServiceResponse createGetServiceResponse() {
        return new GetServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sevice.jaxws.com", name = "xml", scope = GetService.class)
    public JAXBElement<String> createGetServiceXml(String value) {
        return new JAXBElement<String>(_GetServiceXml_QNAME, String.class, GetService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sevice.jaxws.com", name = "return", scope = GetServiceResponse.class)
    public JAXBElement<String> createGetServiceResponseReturn(String value) {
        return new JAXBElement<String>(_GetServiceResponseReturn_QNAME, String.class, GetServiceResponse.class, value);
    }

}

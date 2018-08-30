/**
 * MathServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.learn.webservice;

public interface MathServiceService extends javax.xml.rpc.Service {
    public java.lang.String getMathServicePortAddress();

    public my.learn.webservice.MathService getMathServicePort() throws javax.xml.rpc.ServiceException;

    public my.learn.webservice.MathService getMathServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

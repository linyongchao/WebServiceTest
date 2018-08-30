/**
 * MathServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.learn.webservice;

public class MathServiceServiceLocator extends org.apache.axis.client.Service implements my.learn.webservice.MathServiceService {

    public MathServiceServiceLocator() {
    }


    public MathServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MathServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MathServicePort
    private java.lang.String MathServicePort_address = "http://localhost:8088/MathService";

    public java.lang.String getMathServicePortAddress() {
        return MathServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MathServicePortWSDDServiceName = "MathServicePort";

    public java.lang.String getMathServicePortWSDDServiceName() {
        return MathServicePortWSDDServiceName;
    }

    public void setMathServicePortWSDDServiceName(java.lang.String name) {
        MathServicePortWSDDServiceName = name;
    }

    public my.learn.webservice.MathService getMathServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MathServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMathServicePort(endpoint);
    }

    public my.learn.webservice.MathService getMathServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            my.learn.webservice.MathServicePortBindingStub _stub = new my.learn.webservice.MathServicePortBindingStub(portAddress, this);
            _stub.setPortName(getMathServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMathServicePortEndpointAddress(java.lang.String address) {
        MathServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (my.learn.webservice.MathService.class.isAssignableFrom(serviceEndpointInterface)) {
                my.learn.webservice.MathServicePortBindingStub _stub = new my.learn.webservice.MathServicePortBindingStub(new java.net.URL(MathServicePort_address), this);
                _stub.setPortName(getMathServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MathServicePort".equals(inputPortName)) {
            return getMathServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.learn.my/", "MathServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.learn.my/", "MathServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MathServicePort".equals(portName)) {
            setMathServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

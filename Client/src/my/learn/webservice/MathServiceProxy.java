package my.learn.webservice;

public class MathServiceProxy implements my.learn.webservice.MathService {
  private String _endpoint = null;
  private my.learn.webservice.MathService mathService = null;
  
  public MathServiceProxy() {
    _initMathServiceProxy();
  }
  
  public MathServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMathServiceProxy();
  }
  
  private void _initMathServiceProxy() {
    try {
      mathService = (new my.learn.webservice.MathServiceServiceLocator()).getMathServicePort();
      if (mathService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mathService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mathService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mathService != null)
      ((javax.xml.rpc.Stub)mathService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public my.learn.webservice.MathService getMathService() {
    if (mathService == null)
      _initMathServiceProxy();
    return mathService;
  }
  
  public int add(int arg0, int arg1) throws java.rmi.RemoteException{
    if (mathService == null)
      _initMathServiceProxy();
    return mathService.add(arg0, arg1);
  }
  
  public java.lang.String hello(java.lang.String arg0) throws java.rmi.RemoteException{
    if (mathService == null)
      _initMathServiceProxy();
    return mathService.hello(arg0);
  }
  
  
}

package my.learn.weather;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherWebServiceSoap", targetNamespace = "http://WebXml.com.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherWebServiceSoap {


    /**
     * 
     * @param byProvinceName
     * @return
     *     returns my.learn.weather.ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getSupportCity")
    @WebResult(name = "getSupportCityResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getSupportCity", targetNamespace = "http://WebXml.com.cn/", className = "my.learn.weather.GetSupportCity")
    @ResponseWrapper(localName = "getSupportCityResponse", targetNamespace = "http://WebXml.com.cn/", className = "my.learn.weather.GetSupportCityResponse")
    public ArrayOfString getSupportCity(
        @WebParam(name = "byProvinceName", targetNamespace = "http://WebXml.com.cn/")
        String byProvinceName);

    /**
     * 
     * @return
     *     returns my.learn.weather.ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getSupportProvince")
    @WebResult(name = "getSupportProvinceResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getSupportProvince", targetNamespace = "http://WebXml.com.cn/", className = "my.learn.weather.GetSupportProvince")
    @ResponseWrapper(localName = "getSupportProvinceResponse", targetNamespace = "http://WebXml.com.cn/", className = "my.learn.weather.GetSupportProvinceResponse")
    public ArrayOfString getSupportProvince();

    /**
     * 
     * @return
     *     returns my.learn.weather.GetSupportDataSetResponse.GetSupportDataSetResult
     */
    @WebMethod(action = "http://WebXml.com.cn/getSupportDataSet")
    @WebResult(name = "getSupportDataSetResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getSupportDataSet", targetNamespace = "http://WebXml.com.cn/", className = "my.learn.weather.GetSupportDataSet")
    @ResponseWrapper(localName = "getSupportDataSetResponse", targetNamespace = "http://WebXml.com.cn/", className = "my.learn.weather.GetSupportDataSetResponse")
    public my.learn.weather.GetSupportDataSetResponse.GetSupportDataSetResult getSupportDataSet();

    /**
     * 
     * @param theCityName
     * @return
     *     returns my.learn.weather.ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getWeatherbyCityName")
    @WebResult(name = "getWeatherbyCityNameResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getWeatherbyCityName", targetNamespace = "http://WebXml.com.cn/", className = "my.learn.weather.GetWeatherbyCityName")
    @ResponseWrapper(localName = "getWeatherbyCityNameResponse", targetNamespace = "http://WebXml.com.cn/", className = "my.learn.weather.GetWeatherbyCityNameResponse")
    public ArrayOfString getWeatherbyCityName(
        @WebParam(name = "theCityName", targetNamespace = "http://WebXml.com.cn/")
        String theCityName);

    /**
     * 
     * @param theCityName
     * @param theUserID
     * @return
     *     returns my.learn.weather.ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getWeatherbyCityNamePro")
    @WebResult(name = "getWeatherbyCityNameProResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getWeatherbyCityNamePro", targetNamespace = "http://WebXml.com.cn/", className = "my.learn.weather.GetWeatherbyCityNamePro")
    @ResponseWrapper(localName = "getWeatherbyCityNameProResponse", targetNamespace = "http://WebXml.com.cn/", className = "my.learn.weather.GetWeatherbyCityNameProResponse")
    public ArrayOfString getWeatherbyCityNamePro(
        @WebParam(name = "theCityName", targetNamespace = "http://WebXml.com.cn/")
        String theCityName,
        @WebParam(name = "theUserID", targetNamespace = "http://WebXml.com.cn/")
        String theUserID);

}

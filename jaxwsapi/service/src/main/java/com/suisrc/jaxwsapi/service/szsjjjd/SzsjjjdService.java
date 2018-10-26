package com.suisrc.jaxwsapi.service.szsjjjd;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.Endpoint;

@WebService(targetNamespace = "http://tempurl.org")
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class SzsjjjdService {

    @WebMethod
    @WebResult(name = "postesalescreateResult")
    public SzsjjjdResult postesalescreate (@WebParam(name = "astr_request") SzsjjjdRequest request) {
        if (request == null) {
            SzsjjjdResult res = new SzsjjjdResult();
            res.setResult("ERR");
            return res;
        }
        SzsjjjdResult res = new SzsjjjdResult();
        res.setResult("OK" + request.getLicensekey());
        return res;
    }

    /**
     * 测试
     * 
     * @param args
     */
    public static void main(String[] args) {
        SzsjjjdService service = new SzsjjjdService();
        Endpoint endPoint = Endpoint.publish("http://localhost:8080/api", service);
        System.out.println("over:" + endPoint.toString());
    }
}

package com.suisrc.jaxwsapi.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;

@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class HelloService {  
      
    @WebMethod
    public String sayHello(@WebParam(name = "msg") String message){
        return "Hello ," + message;
    }  
      
    public static void main(String[] args) {  
        //create and publish an endPoint  
        HelloService hello = new HelloService();  
        Endpoint endPoint = Endpoint.publish("http://localhost:8080/tt", hello);
        System.out.println("over:" + endPoint.toString());
    }  
}  
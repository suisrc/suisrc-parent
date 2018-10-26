package com.suisrc.jaxwsapi.service.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.suisrc.core.fasterxml.FasterFactory.Type;
import com.suisrc.core.fasterxml.FasterFactoryImpl;

@JacksonXmlRootElement(localName="xml", namespace="http://b.com")
public class SzsjjjdRequest {
    
    public String name = "1234";
    
    
    public static void main(String[] args) {
        SzsjjjdRequest r = new SzsjjjdRequest();
        String ss = new FasterFactoryImpl().bean2String(r, Type.XML);
        System.out.println(ss);
    }

}

package com.suisrc.jaxwsapi.service.szsjjjd;

import java.rmi.RemoteException;

import org.junit.Test;

import com.suisrc.jaxwsapi.service.szsjjjd.SzsjjjdServiceServiceStub.SzsjjjdRequest;
import com.suisrc.jaxwsapi.service.szsjjjd.SzsjjjdServiceServiceStub.SzsjjjdResult;

public class TClient {
  
    @Test
    public void test1() throws RemoteException {
        String url = "http://localhost:8080/api";
        SzsjjjdServiceServiceStub service = new SzsjjjdServiceServiceStub(url);
        SzsjjjdRequest request = new SzsjjjdRequest();
        request.setLicensekey("你好");
        SzsjjjdResult res = service.postesalescreate(request);
        System.out.println(res.getResult());
    }
  
    @Test
    public void test2() throws RemoteException {
        String url = "http://localhost:8771/api";
        SzsjjjdServiceServiceStub service = new SzsjjjdServiceServiceStub(url);
        SzsjjjdRequest request = new SzsjjjdRequest();
        request.setLicensekey("你好");
        SzsjjjdResult res = service.postesalescreate(request);
        System.out.println(res.getResult());
    }
    
} 
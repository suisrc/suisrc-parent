package com.suisrc.jaxwsapi.service.t1;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import org.junit.Test;

public class T1 {
  
  @Test
  public void test1() throws IOException, ClassNotFoundException {
    InputStream is = T1.class.getClassLoader().getResourceAsStream("test.location");
    ObjectInputStream ois = new ObjectInputStream(is);
    Object obj = ois.readUTF();
    System.out.println(obj);
  }

}

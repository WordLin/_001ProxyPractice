package com.example.util;

public class ServiceFactory {
    public static Object getService(Object service){
        return new MyInvocationHandler(service).getProxy();
    }
}

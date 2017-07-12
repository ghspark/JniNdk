package com.tigether.jnindk.jni;

/**
 * Created by gaohang on 17/7/12.
 */

public class HelloJni {
    static {
        System.loadLibrary("hello");
    }

    //定义一个jni的方法
    public native String sayHello();
}

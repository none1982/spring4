package com.spring4.pojo.impl;

import com.spring4.pojo.HelloWorld;

public class HelloWorldImpl implements HelloWorld{

    public void sayHello(String name) {
	System.out.println("Hello , " + name);
    }

}

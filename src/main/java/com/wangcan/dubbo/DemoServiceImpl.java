package com.wangcan.dubbo;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/7/2018
 * Time:8:52 AM
 */
public class DemoServiceImpl implements DemoService{
    public String sayHello(String name) {
        return "Hello " + name;
    }
}

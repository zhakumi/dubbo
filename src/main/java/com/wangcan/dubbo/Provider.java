package com.wangcan.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/7/2018
 * Time:8:59 AM
 */
public class Provider {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"applicationProvider.xml"});
        context.start();
        System.in.read();
    }
}

package com.wangcan.dubbo.Custome;

import com.wangcan.dubbo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/7/2018
 * Time:9:14 AM
 */
public class Consumer {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationConsumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = (DemoService)context.getBean("demoService");
        System.out.println("consumer");
        System.out.println(demoService.sayHello("wangcan"));
    }
}

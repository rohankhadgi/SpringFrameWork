package com.MultiCarrier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext users = new ClassPathXmlApplicationContext("beans.xml");
        var user1 = users.getBean("attUser", User1.class);
        user1.serviceInfo();
        var user2 = users.getBean("tMobileUser", User2.class);
        user2.serviceInfo();
        var user3 = users.getBean("verizonUser", User3.class);
        user3.serviceInfo();
    }
}
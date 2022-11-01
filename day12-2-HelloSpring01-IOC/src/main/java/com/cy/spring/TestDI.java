package com.cy.spring;

import com.cy.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
    private static ClassPathXmlApplicationContext classPathXmlApplicationContext = null;
    static {
        classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void testUser(){
        User user = new User();
        user.setName("黄河");
        user.setAge(19);
        User user1 = new User("长江",20);
    }

    @Test
    public void testUser02(){
        User user = (User) classPathXmlApplicationContext.getBean("user");
        System.out.println(user);
    }
}

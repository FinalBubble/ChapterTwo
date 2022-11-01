package com.cy.spring;

import com.cy.dao.EmpDao;
import com.cy.service.EmpService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestIOC {
    private static ClassPathXmlApplicationContext classPathXmlApplicationContext = null;
    static {
        classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void testIOC(){

        EmpDao empDao = (EmpDao) classPathXmlApplicationContext.getBean("empDao");

        EmpService empService = (EmpService) classPathXmlApplicationContext.getBean("empService");
        System.out.println(empDao);
        System.out.println(empService);
    }
    /*
    * Bean的单例和多例
    * 单例：表示创建的对象具有全局唯一性
    *   优点：节约空间
    *   缺点：容易发生线程安全问题
    * 多例：表示创建的对象都是全新的对象
    *   优点：不会发生线程的安全问题
    *   缺点：浪费空间
    * */
    @Test
    public void testSingleton(){
        EmpDao empDao1 = (EmpDao) classPathXmlApplicationContext.getBean("empDao");
        EmpDao empDao2 = (EmpDao) classPathXmlApplicationContext.getBean("empDao");
        if (empDao1 == empDao2){
            System.out.println("当前类是单例的");
        }else {
            System.out.println("当前类是多例的");
        }
    }
}

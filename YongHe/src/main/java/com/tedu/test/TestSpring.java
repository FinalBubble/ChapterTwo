package com.tedu.test;

import com.tedu.pojo.Door;
import com.tedu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /** 测试类：测试spring开发环境的类 */
    @Test
    public void testSpring(){
        //1.加载Spring的核心配置文件
        ClassPathXmlApplicationContext ac =
                new ClassPathXmlApplicationContext(
                        "spring/applicationContext.xml");
        //2.获取bean实例
        Door door = (Door) ac.getBean("door");
        System.out.println(door);
        System.out.println("Spring容器可以使用");
    }
}



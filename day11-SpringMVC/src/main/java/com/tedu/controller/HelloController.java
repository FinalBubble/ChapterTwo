package com.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
*SpringMVC控制层
* */
@Controller //表示当前类是控制层
public class HelloController {

    /*
    * 请求http://localhost/day11-SpringMVC/hello
    * 可以在控制台输出一句hello SpringMVC
    * 并且跳转页面，访问WEB-INF/pages/home.jsp
    * */

    @RequestMapping("/hello")
    public String testHello(){
        System.out.println("hello SpringMVC");
        return "home";
    }
}

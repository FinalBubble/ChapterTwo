package com.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* 测试请求转发和重定向
* */
@Controller
public class JumpController {
    //1.浏览器访问url:http://localhost:8080/day11-SpringMVC/testForward
    @RequestMapping("/testForward")
    public String testForward(){
        System.out.println("开始测试请求转发");
        return "forward:/hello";
    }
    @RequestMapping("/testRedirect")
    public String testRedirect(){
        System.out.println("开始测试重定向");
        return "redirect:/hello";
    }
}

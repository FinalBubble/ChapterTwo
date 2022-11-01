package com.tedu;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


//url:http://localhost:8080/day08-1-HelloServlet/HelloRequest
public class HelloRequest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //HttpServletRequest 此对象包括所有对象的信息
        //一、获取请求头信息
        System.out.println("=============================获取请求头信息==============================");
        //1.获取请求的方式
        String method = request.getMethod();
        System.out.println("1、此次请求的请求方式为："+method);
        //2.获取请求的资源路径
        String uri = request.getRequestURI();
        System.out.println("2、此次请求的请求URI为："+uri);
        //获取请求的协议版本
        String protocol = request.getProtocol();
        System.out.println("3、此次请求的协议协议版本为："+protocol);
        //获取请求头是Host的值
        System.out.println("请求头是Host的值是："+request.getHeader("Host"));
        System.out.println("请求头是sec-ch-ua的值是："+request.getHeader("sec-ch-ua"));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

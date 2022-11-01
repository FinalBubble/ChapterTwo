package com.tedu;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


/*
* Servlet接口 -- 通过Servlet接口，提供了Servlet所应该具备的所有功能
*           |--GenericServlet --实现了Servelet接口，并实现其中的大部分方法，但是Service方法没有实现
*                   |-HttpServlet -- 继承了GenericServlet类，并实现了Service方法，根据不同的请求方式，调用不同的doXXX方法
* */

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行了doGet()");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行了doPost()");
    }
}

package com.tedu;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HelloRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("开始测试重定向");
        //测试1：从HelloRedirect重定向到jieqian.html
        /*response.sendRedirect("jieqian.html");*/
        //测试2：重定向到另一个服务器页面
        response.sendRedirect("https://www.baidu.com");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

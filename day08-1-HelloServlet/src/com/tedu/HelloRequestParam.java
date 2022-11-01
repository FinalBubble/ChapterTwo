package com.tedu;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Arrays;

public class HelloRequestParam extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取GET的提交方式的请求参数
        String user = request.getParameter("user");
        System.out.println("user的值是 ："+user);
        //多个值
        String[] like = request.getParameterValues("like");
        System.out.println("like的值是："+Arrays.toString(like));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String user = request.getParameter("user");
        System.out.println("user的值是 ："+user);
        //多个值
        String[] like = request.getParameterValues("like");
        System.out.println("like的值是："+Arrays.toString(like));
    }
}

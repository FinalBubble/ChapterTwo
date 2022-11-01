package com.tedu;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloResponse extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        //0.通过response对象向网页输出内容

        //1.设置状态行内容
        //字节流
        //ServletOutputStream servletOutputStream = response.getOutputStream();
        //字符流
        /*
        * tomcat使用iso-8859-1编码
        * 我们日常使用utf-8
        * 所以需要指定编码
        * */
        PrintWriter printWriter = response.getWriter();
        printWriter.write("哈喽");
        response.setStatus(404);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

package com.tedu;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
* url:http://localhost:8080/day08-1-HelloServlet/DoorListServlet
* 模拟查询门店信息的功能到页面
* 将门店信息展示到页面上
* */
public class DoorListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        //简化查询数据库的操作，将数据存储在数据库中
        ArrayList<String> list = new ArrayList<>();
        list.add("01,老大,010-111");
        list.add("02,老二,010-222");
        list.add("03,老三,010-333");
        list.add("04,老四,010-444");
        list.add("05,老五,010-555");
        list.add("06,老六,010-666");
        list.add("07,老七,010-777");
        //将list中的页面展示在页面上
        /*
        * 输出纯文本
        * */
        /**
        printWriter.write(list.get(0));
        printWriter.write(list.get(1));
        printWriter.write(list.get(2));
        printWriter.write(list.get(3));
        printWriter.write(list.get(4));
        printWriter.write(list.get(5));
        printWriter.write(list.get(6));
        */
        //向浏览器输出网页
        /**
        //printWriter.write("<!DOCTYPE html>");
        printWriter.write("<html lang=\"en\">");
        printWriter.write("<head>");
        printWriter.write("<meta charset=\"UTF-8\">");
        printWriter.write("<title>提交用户信息存储到数据库</title>");
        printWriter.write("</head>");
        printWriter.write("<p>"+list.get(0)+"</p>");
        printWriter.write("<p>"+list.get(1)+"</p>");
        printWriter.write("<p>"+list.get(2)+"</p>");
        printWriter.write("<p>"+list.get(3)+"</p>");
        printWriter.write("<p>"+list.get(4)+"</p>");
        printWriter.write("<p>"+list.get(5)+"</p>");
        printWriter.write("<p>"+list.get(6)+"</p>");
        printWriter.write("</body>");
        printWriter.write("</html>");
         */
        /*
        * 可以利用域对象，将数据存储进去，通过请求转发，转发到对应的jsp中
        * */
        request.setAttribute("doorList",list);
        request.getRequestDispatcher("doorList.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

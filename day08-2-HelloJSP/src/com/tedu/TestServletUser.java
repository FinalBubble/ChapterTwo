package com.tedu;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

public class TestServletUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.write("发布成功");
        System.out.println("doGet()执行了");
        //1.获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println("username="+username+",password="+password+"，hobbies="+Arrays.toString(hobbies));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8";
            Connection connection = DriverManager.getConnection(url,"yang","123456");
            System.out.println("mysql连接成功");
            String sql = "INSERT INTO servlet_user VALUES (1 ,? ,? ,? )";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            preparedStatement.setString(3, Arrays.toString(hobbies));
            System.out.println(sql);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        }catch (Exception e){

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.write("发布成功");
        System.out.println("doPost()执行了");
    }
}

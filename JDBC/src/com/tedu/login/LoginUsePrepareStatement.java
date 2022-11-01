package com.tedu.login;

import com.tedu.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author yangq
 * @date 2022-10-02
 * @Project ChapterTwo
 * @Package com.tedu.login
 * @Description 使用PrepareStatement传输器模拟用户登录的案例
 */
public class LoginUsePrepareStatement {
    public static void main(String[] args) {
        //1.提示用户登录
        System.out.println("请登录!");
        //2.提示用户输入用户名，并接收输入
        System.out.println("请输入用户名");
        String name = new Scanner(System.in).nextLine();
        //3.提示用户输入密码，并接收输入
        System.out.println("请输入密码");
        String password = new Scanner(System.in).nextLine();
        System.out.println("用户名："+name+"，密码："+password);
        //调用登录系统，验证输入的用户名和密码是否正确
        login(name,password);
    }

    private static void login(String name, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            //获取传输器，必须先定义sql，要求不能拼接字符串，如果有动态传入的参数，需要使用？占位符替代
            String sql = "SELECT * FROM user WHERE username =? and password =?";
            preparedStatement = connection.prepareStatement(sql);
            //为sql骨架中的占位符传值
            //给第一个问号传入name
            preparedStatement.setString(1,name);
            //给第二个问号传入password
            preparedStatement.setString(2,password);
            System.out.println("sql:"+sql);
            //由于上方将sql传递进去，此处不需要传值
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                System.out.println("恭喜你登录成功！");
            }else {
                System.out.println("用户名或密码错误");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(connection,preparedStatement,resultSet);
        }
    }
}

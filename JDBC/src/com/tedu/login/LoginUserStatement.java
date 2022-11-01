package com.tedu.login;

import com.tedu.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author yangq
 * @date 2022-10-02
 * @Project ChapterTwo
 * @Package com.tedu.login
 * @Description 使用Statement传输器模拟用户登录的案例，主要是排查Statement有什么安全问题
 */
public class LoginUserStatement {
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
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "SELECT * FROM user WHERE username ='" + name + "' and password ='" + password + "'";
            System.out.println("sql:"+sql);
            resultSet = statement.executeQuery(sql);
            if (resultSet.next()){
                System.out.println("恭喜你登录成功！");
            }else {
                System.out.println("用户名或密码错误");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(connection,statement,resultSet);
        }
    }
}

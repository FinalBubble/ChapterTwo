package com.tedu.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
* 书写JDBC入门案例
* 查询account表中的所有记录
* */
public class TestJDBC {
    public static void main(String[] args) throws Exception {
        //1.注册数据库驱动
        //com.mysql.jdbc.Driver 是驱动资源类
        //Class.forName 获取字节码对象文件
        //只是为了加载Driver类，Driver内 有一个静态代码块，内调用注册驱动的api；静态代码块随着类的加载而加载
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取数据库连接
        //java要连接数据库mysql -uroot -proot
        //也需要考虑连接数据库的ip，端口号，用户名，密码
        String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8";
        String username = "yang";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url,username,password);
        //3.获取传输器
        Statement statement = connection.createStatement();
        //将sql发送给数据库的服务器
        //4.发送sql到服务器并执行sql，返回结果
        //将数据库服务器执行完sql的结果，发送给Java
        String sql = "select * from account";
        //executeQuery 执行查询方法，会返回一个ResultSet结果集对象
        ResultSet resultSet = statement.executeQuery(sql);
        //5.处理结果
        //结果集中包含了查询的表中的所有的记录
        /*
        * resultSet.next() 初始会创建一个位于头部的指针，可以理解为第一行记录上的上一行的位置，
        * 然后每执行一次next方法，都会判断指针是否有下一条数据，如果有，则返回true
        * 并且指针回向下移动一个位置
        * */
        //每循环一次，可以获取一行记录
        while (resultSet.next()){
            //获取遍历的当前行数据的id列的值，类型是int
            int id = resultSet.getInt("id");
            //获取遍历的当前行数据的name列的值，类型是String
            String name = resultSet.getString("name");
            //获取遍历的当前行数据的money列的值，类型是double
            double money = resultSet.getDouble("money");
            System.out.println("id="+id+";"+"name="+name+";"+"money="+money);
        }

        //6.释放资源
        //释放注意的顺序：越晚获取的对象，越先释放
        //原因：resultSet需要调用statement，statement需要调用connection
        resultSet.close();
        statement.close();
        connection.close();
    }
}

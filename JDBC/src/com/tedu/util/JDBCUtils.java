package com.tedu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author yangq
 * @date 2022-10-02
 * @Project ChapterTwo
 * @Package com.tedu.util
 * @Description 封装重复的代码
 */
public class JDBCUtils {


    /**
     * @description: 封装JDBC注册和获取连接Connection
     * @author: yangq
     * @date: 2022-10-02 16:31  
     * @return: java.sql.Connection
     */
    public static Connection getConnection() throws Exception{
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
        return DriverManager.getConnection(url,username,password);
    }


    /**
     * @description: 封装释放资源的代码
     * @author: yangq
     * @date: 2022-10-02 16:24
     * @param: connection
     * @param: statement
     * @param: resultSet
     */
    public static void close(Connection connection, Statement statement, ResultSet resultSet){
        if (resultSet != null){
            try {
                resultSet.close();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                resultSet = null;
            }
        }
        if (statement != null){
            try {
                statement.close();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                statement = null;
            }
        }
        if (connection != null){
            try {
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                connection = null;
            }
        }
    }
}

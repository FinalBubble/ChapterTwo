package com.tedu.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.tedu.util.JDBCUtils;
import org.junit.Test;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author yangq
 * @date 2022-10-02
 * @Project ChapterTwo
 * @Package com.tedu.c3p0
 * @Description TODO
 */
public class TestC3P0 {
    @Test
    public void testFindById(){
        Connection connection =null;
        Statement statement = null;
        ResultSet resultSet = null;
        //创建连接池，提前准备一批和数据库的连接
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        try {
//            connection = JDBCUtils.getConnection();
            //为数据库设置基本信息，否则不能连接
            comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
            comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?characterEncoding=utf-8");
            comboPooledDataSource.setUser("yang");
            comboPooledDataSource.setPassword("123456");
            //从池中取出一个连接
            connection = comboPooledDataSource.getConnection();
            statement = connection.createStatement();
            String sql = "SELECT * FROM account";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double money = resultSet.getDouble("money");
                System.out.println("id="+id+",name="+name+",money="+money);
            }
        }catch (Exception e){

        }finally {
            JDBCUtils.close(connection, statement,resultSet);
        }
    }
}

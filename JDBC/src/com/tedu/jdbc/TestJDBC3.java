package com.tedu.jdbc;

import com.tedu.util.JDBCUtils;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.stream.Stream;

/**
 * @author yangq
 * @date 2022-10-02
 * @Project ChapterTwo
 * @Package com.tedu.jdbc
 * @Description TODO
 */
public class TestJDBC3 {

    @Test
    public void test(){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "INSERT INTO account values(null,'徐坤',10000)";
            int row = statement.executeUpdate(sql);
            System.out.println("修改了"+row+"条数据");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(connection,statement,resultSet);
        }
    }
}

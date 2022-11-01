package com.tedu.mybatisdemo;

/*
* 这个类是MyBatis的入门案例
* 查询emp表中的所有员工的信息
* */

import com.tedu.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis01 {
    @Test
    public void findAll(){


        try {
            //1.读取mybatis的核心配置文件（mybatis-config.xml）
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //2.获取SqlSessionFaction工厂对象，工厂对象根据核心配置文件工作
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //3.通过工厂对象获取SqlSession对象
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            //4.通过namespace+id的值定位到具体的sql，并执行sql语句
            List<Emp> list = sqlSession.selectList("EmpMapper.findAll");
            //5.输出结果
            for (Emp emp:
                 list) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

package com.tedu.mybatisdemo;

/*
* 这个类是MyBatis的增删改查
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

public class TestMyBatis02 {

    private static SqlSession sqlSession = null;

    static { //随着类的加载而加载
        try {
            //1.读取mybatis的核心配置文件（mybatis-config.xml）
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //2.获取SqlSessionFaction工厂对象，工厂对象根据核心配置文件工作
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //3.通过工厂对象获取SqlSession对象
            sqlSession = sqlSessionFactory.openSession(true);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Test
    public void findAll() throws Exception{
        /*
        * 新增
        * 卢元胜 super star 1000000000
        * */
        int rows = sqlSession.update("EmpMapper.insert");
        System.out.println("新增了"+rows+"条");
    }

    @Test
    public void update(){
        int rows = sqlSession.update("EmpMapper.update0");
        System.out.println("修改了"+rows+"条");
    }
}

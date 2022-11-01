package com.tedu.test;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

public class TestMyBatis {
    @Test
    public void testMyBatis(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            DoorMapper mapper = sqlSession.getMapper(DoorMapper.class);
            List<Door> list = mapper.findAll();
            for (Door door:
                    list) {
                System.out.println(door);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

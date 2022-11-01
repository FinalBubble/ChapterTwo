package com.tedu.dao;


import com.tedu.pojo.Door;

import java.util.List;

/*
* 专门写门店管理的接口方法
* */
public interface DoorMapper {
    /*
    * 1.接口的方法名 = DoorMapper.xml中的sql的id
    * 2.接口的方法参数 = DoorMapper.xml中的sql的参数
    * 3.接口的方法返回值 = DoorMapper.xml的sql的ResultType的类型
    * */

    public  List<Door> findAll();
}

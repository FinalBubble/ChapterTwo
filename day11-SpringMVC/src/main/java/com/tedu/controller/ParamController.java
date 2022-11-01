package com.tedu.controller;

import com.tedu.pojo.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@Controller
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String name, Integer age, String addr){
        System.out.println("开始测试基本参数获取");
        System.out.println("url上的name参数:"+name);
        System.out.println("url上的age参数:"+age);
        System.out.println("url上的addr参数:"+addr);
        return "home";
    }

    @RequestMapping("/testParam01")
    public String testParam01(User user){
        System.out.println("开始测试包装类型参数获取");
        System.out.println("url上的参数:"+user);
        return "home";
    }

    //日期类型参数绑定
    //date=2022-3-13 10:06:54
    @RequestMapping("/testParam02")
    public String testParam02(Date date){
        System.out.println("开始测试日期类型参数获取");
        System.out.println("url上的参数:"+date.toLocaleString());
        return "home";
    }
    //自定义日期转换格式
    public void InitBinder(ServletRequestDataBinder servletRequestDataBinder){
        servletRequestDataBinder.registerCustomEditor(java.util.Date.class,
                new CustomDateEditor(
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"),true
                )
        );
    }

    //多值参数绑定
    @RequestMapping("/testParam03")
    public String testParam03(String[] like){
        System.out.println("开始测试日期类型参数获取");
        System.out.println("url上的参数:"+ Arrays.toString(like));
        return "home";
    }

    //接收form.html提交的数据，检验是否乱码
    @RequestMapping("/testLuanMaParam")
    public String testLuanMaParam(String user, String[] like){
        System.out.println("开始测试是否请求乱码");
        System.out.println(user);
        System.out.println(Arrays.toString(like));
        return "home";
    }
}

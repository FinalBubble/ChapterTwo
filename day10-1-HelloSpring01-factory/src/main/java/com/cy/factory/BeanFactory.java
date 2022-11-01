package com.cy.factory;

import com.cy.dao.EmpDao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 老安
 * @data 2022/3/10 20:46
 * 工厂类
 * -----------------------------------
 * Bean在计算机中,其实就是可重用组件
 * JavaBean 在java语言中,可重用的组件 dao service
 *  业务bean 用于处理业务逻辑的类,service dao
 *  实体bean 用于封装数据的实体类,pojo User
 * -----------------------------------
 * 1.提供对外界的方法,用户可以通过调用该方法来操作工厂创建对象
 * 2.用户需要给方法传递参数(EmpDao,EmpService)
 * 3.工厂根据用户传递的参数,查询config.properties配置文件,
 * 找到对应的value值
 * 4.利用value值,使用反射创建对应的对象,返回给方法的调用者
 */
public class BeanFactory {
    static Properties prop = null;
    static{
        try{
            //获取config.properties文件
            //使用类加载器获取文件
            //getClassLoader 获取类加载器
            ClassLoader loader =
                    BeanFactory.class.getClassLoader();
            InputStream in = loader.getResourceAsStream(
                    "config.properties");
            //专门读取.properties配置文件的工具类
            prop = new Properties();
            //将配置文件转载到了prop工具类对象中
            prop.load(in);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /*
        用户通过该方法创建指定的对象
        方法名 见名知意 getBean
        方法参数 接收用户指定的key值
        返回值 不知道返回什么对象,所以用超类Object表示
     */
    public static Object getBean(String key){
        Object obj = null;
        try {
            //通过key获取对应的value
            String value = prop.getProperty(key);
            //利用value这个全路径值,获取对应的实例对象
            Class<?> aClass = Class.forName(value);
            //利用字节码文件对象,创建实例对象
            obj = aClass.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }
}

package org.finalbubble.anonymous;

/*
    匿名对象：没有名字的对象，叫做匿名对象
    一般一个对象使用一次，那么我们可以使用匿名对象

    使用方法：
        1、直接调用方法
        2、作为方法的参数传递
        3、作为方法的返回值
    注意：
        1、方法的参数是一个类，那么调用此方法需要传入此类的对象
        2、方法的返回值类型是一个类，那么此方法需要返回一个此类的对象
 */
public class Test1 {
    public static void main(String[] args) {
        new Student().show();
        useStudent(new Student());
    }
    public static void useStudent(Student s){}


}

//定义学生类
class Student{
    public void show(){
        System.out.println("Student类中的show()方法执行了...");
    }
}

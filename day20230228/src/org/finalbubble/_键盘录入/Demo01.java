package org.finalbubble._键盘录入;

/*
*
*       1、导包
*           import java.util.Scanner;
*       2、创建对象
*           Scanner scanner = new Scanner(System.in);
*       3、接收数据 int
*           int num = scanner.nextInt();
*
*
* */


//导包
import java.util.Scanner;
public class Demo01 {
    public static void main(String[] args) {
        //创建对象
        Scanner scanner = new Scanner(System.in);
        //接收数据
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        System.out.println("键盘录入的数据是："+num);
    }
}

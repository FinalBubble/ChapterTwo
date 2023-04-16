package org.finalbubble._键盘录入;


import java.util.Scanner;

/*
*
*       键盘录入一个四位数，求各个为上数字
*       分析：
*           1、键盘录入
*                   导包
*                   创建对象
*                   接收数据
*           2、求各个位上数字
*               1234%10 = 4               num/1%10
*               1234/10 = 123 123%10 = 3  num/10%10
*               1234/100 = 12  12%10 = 2  num/100%10
*               1234/1000 = 1   1%10 = 1  num/1000%10
*
* */
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个四位整数：");
        int a = scanner.nextInt();
        int ge = a%10;
        int shi = a/10%10;
        int bai = a/100%10;
        int qian = a/1000%10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
        System.out.println(qian);
    }
}

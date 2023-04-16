package org.finalbubble._键盘录入;


import java.util.Scanner;

/*
 *
 *   键盘录入一个数字，判断这个数字是否是水仙花数 153 370 371 407
 *  水仙花数：
 *          首先是个三位数
 *          其次各个位上的立方和等于数字本身 153 = 1*1*1 + 5*5*5 + 3*3*3
 *   12321  56765
 *   分析
 *       1、键盘录入
 *           导包
 *           创建对象
 *           接收数据
 *       2、求各个位上的数字
 *       3、求各个位上数字的立方和
 *       4、判断
 * */
public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位整数：");
        int a = scanner.nextInt();
        int ge = a%10;
        int shi = a/10%10;
        int bai = a/100%10;
        int lifanghe = ge*ge*ge + shi*shi*shi + bai*bai*bai;

        boolean b = lifanghe == a ? true : false;
        System.out.println(b);
    }
}

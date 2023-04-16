package org.finalbubble._键盘录入;


import java.util.Scanner;

/*
*
*   键盘录入五位数，判断这个数字是否是回文数
*   12321  56765
*   分析
*       1、键盘录入
*           导包
*           创建对象
*           接收数据
*       2、求各个位上的数字
* */
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个五位整数：");
        int a = scanner.nextInt();
        int ge = a%10;
        int shi = a/10%10;
        int bai = a/100%10;
        int qian = a/1000%10;
        int wan = a/10000%10;

        boolean b = ge==wan && shi == qian ? true : false;
        System.out.println(b);
    }
}

package org.finalbubble._键盘录入;
import java.util.Scanner;

/*
    键盘录入三个数字，求最大值
    分析：
        1.键盘录入
            导包
            创建对象
            接收数据
        2.求最大值
            2.1 先求两个数临时最大值
            2.2 在使用临时最大值和第三个数字比较 获取最大值
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("键盘输入第一个数字");
        int num = sc.nextInt();
        System.out.println("键盘输入第二个数字");
        int num1 = sc.nextInt();
        System.out.println("键盘输入第三个数字");
        int num2 = sc.nextInt();

        int temMax = num > num1 ? num : num1;
        int max = temMax > num2 ? temMax : num2;
        System.out.println(max);
    }
}

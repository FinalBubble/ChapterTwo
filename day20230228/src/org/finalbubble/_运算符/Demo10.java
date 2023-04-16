package org.finalbubble._运算符;


/*
*
*       使用三元运算符，求三个整数的最大值：
*               160  210  175
*
*       1、先求前两个数的最大值，临时最大值
*       2、使用临时最大值和第三个数字比较获取最大值
* */
public class Demo10 {
    public static void main(String[] args) {
        int a = 160;
        int b = 210;
        int c = 175;
        //临时最大值
        int tempMax = a > b ? a : b;
        //求最大值
        int max = tempMax > c ? tempMax : c;
        System.out.println(max);
    }
}

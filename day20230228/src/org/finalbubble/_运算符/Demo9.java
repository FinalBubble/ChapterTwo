package org.finalbubble._运算符;



/*
*       三元运算符：
*               格式：关系表达式 ? 表达式1 : 表达式2
*       运算规则：
*           1、先判断关系表达式的值
*           2、如果关系表达式的值为true，取表达式1的值
*           2、如果关系表达式的值为false，取表达式2的值
*
* */
public class Demo9 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //取两个数的最大值
        int max = a>b?a:b;
        System.out.println(max);
        int min = a>b?b:a;
        System.out.println(min);
    }
}

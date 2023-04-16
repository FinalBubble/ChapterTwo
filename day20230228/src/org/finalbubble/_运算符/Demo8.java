package org.finalbubble._运算符;


/*
*       短路逻辑运算符
*           运算规则和单个&或单个|是一样的，多了短路的效果
*
*       &&:见false则false，如果左边的表达式结果为true。右边继续运算
*                         如果左边的表达式结果为false，右边就不运算
*       ||:见true则true，如果左边的表达式结果为true。右边就不运算
 *                         如果左边的表达式结果为false，右边继续运算
*
* */
public class Demo8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a++ > 30 && b++ > 30);
        System.out.println(a);
        System.out.println(b);
        System.out.println(++a > 10 || b++ > 30);
        System.out.println(a);
        System.out.println(b);
    }
}

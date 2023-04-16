package org.finalbubble._运算符;

/*
*
*   关系运算符：
*       >
*       >=
*       <
*       <=
*       ==
*       !=
*
*   关系运算符的结果是：布尔类型的值，true或false
*
* */
public class Demo6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a>b);
        System.out.println(a<b);
        a=20;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        a=30;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);
    }
}

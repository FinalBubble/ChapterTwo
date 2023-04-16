package org.finalbubble._运算符;


/*
*
*       逻辑运算符：两边只能发关系表达式，值应该是true或false
*       &：见false则false
*       |：见true则true
*       ^：相同为false，不同为true
*       !：取反
* */
public class Demo7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        System.out.println(a > c & b > c); // false & false ===> false
        System.out.println(a < c & b > c); // true  & false ===> false
        System.out.println(a > c & b < c); // false &  true ===> false
        System.out.println(a < c & b < c); // true  & false ===> true
        System.out.println("==========================");
        System.out.println(a > c | b > c); // false & false ===> false
        System.out.println(a < c | b > c); // true  & false ===> true
        System.out.println(a > c | b < c); // false &  true ===> true
        System.out.println(a < c | b < c); // true  & false ===> true
        System.out.println("==========================");
        System.out.println(a > c ^ b > c); // false ^ false ===> false
        System.out.println(a < c ^ b > c); // true  ^ false ===> true
        System.out.println(a > c ^ b < c); // false ^  true ===> true
        System.out.println(a < c ^ b < c); // true  ^ false ===> false
        System.out.println("==========================");
        System.out.println( a > c);       //false
        System.out.println( !( a > c));   //true
        System.out.println( !!( a > c));  //false
        System.out.println( !!!( a > c)); //true






    }
}

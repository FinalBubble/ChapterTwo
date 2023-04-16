package org.finalbubble._运算符;


/*
*
*       自增运算符：++
*       对变量自增一
*       单独使用：++在变量的前面或后面。都是对变量自增一
*       参与运算：
*               ++在变量后，先参与运算，后自增一
*               ++在变量前，先自增一，后参与运输
*
*
*       自减运算符：--
*       对变量自减一
*       单独使用：--在变量的前面或后面。都是对变量自减一
*       参与运算：
*               --在变量后，先参与运算，后自减一
*               --在变量前，先自减一，后参与运输
*
*
* */
public class Demo3 {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        int c = a++;
        System.out.println(b);
        System.out.println(c);

        int d = --a;
        int e = a--;
        System.out.println(d);
        System.out.println(e);
    }
}

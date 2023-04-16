package org.finalbubble._运算符;

/*
 *
 *       赋值运算符：
 *           =： 把右边的值或者变量赋值给左边的变量
 *           +=：把左边的变量和右边的变量或值相加再赋值给左边的变量
 *           *=：把左边的变量和右边的变量或值相减再赋值给左边的变量
 *           -=：把左边的变量和右边的变量或值相乘再赋值给左边的变量
 *           /=：把左边的变量和右边的变量或值相除的商再赋值给左边的变量
 *           %=：把左边的变量和右边的变量或值相加除的余数再赋值给左边的变量
 *
 *
 * */
public class Demo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println(b);
        int c = 20;
        c += 10;
        System.out.println(c);
        c -= 15;
        System.out.println(c);
        c *= 2;
        System.out.println(c);
        c /= 5;
        System.out.println(c);
        c %= 4;
        System.out.println(c);

        short s = 4;
        //复合赋值运算符，隐含了一个强制类型转换
        s += 5;
        System.out.println(5);
        s = (short) (s+5);
        System.out.println(s);

    }
}

package org.finalbubble._类型转换;

//自动类型转换
public class Demo1 {
    public static void main(String[] args) {
        byte a = 10;
        int b = a;
        System.out.println(a);
        System.out.println(b);
        // byte 和 short 不能直接转成 char 类型
        //char c = a;

        double d = a;
        System.out.println(d);
    }
}

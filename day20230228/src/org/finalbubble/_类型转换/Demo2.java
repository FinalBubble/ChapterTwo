package org.finalbubble._类型转换;

/*
* 强制类型转换
* 定义：大的数据类型向小的数据类型转换，可能会造成数据精度丢失
*      如果大的数据类型数值在小的数据类型的取值范围内，就不会造成数据精度的丢失；反之会丢失
*
*
* 格式：
*   目标数据类型 变量名 = (目标数据类型)变量名或值
* */
public class Demo2 {
    public static void main(String[] args) {
        int a = 10;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);

        int c = 130;
        byte d = (byte) c;
        System.out.println(c);
        System.out.println(d);
    }
}

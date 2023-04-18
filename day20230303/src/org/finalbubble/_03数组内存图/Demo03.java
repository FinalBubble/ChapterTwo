package org.finalbubble._03数组内存图;

/*
多个数组指向各自的堆内存，无论如何修改自己的堆内存中数据，再去取值的时候，取得是修改后的最新值
 */
public class Demo03 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        int[] brr = new int[2];
        System.out.println(brr);
        System.out.println(brr[0]);
        System.out.println(brr[1]);
        brr[0] = 11;
        brr[1] = 22;
        System.out.println(brr);
        System.out.println(brr[0]);
        System.out.println(brr[1]);

    }
}

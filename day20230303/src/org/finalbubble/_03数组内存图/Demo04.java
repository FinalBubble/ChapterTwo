package org.finalbubble._03数组内存图;

/*
    多个数组指向同一个对内存，无论谁修改堆内存中的数据，后来取值的时候取得是修改后的最新值
 */
public class Demo04 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        int[] brr = arr;
        System.out.println(brr);
        System.out.println(brr[0]);
        System.out.println(brr[1]);
        brr[0] = 11;
        brr[1] = 22;
        System.out.println(brr);
        System.out.println(brr[0]);
        System.out.println(brr[1]);
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

    }
}

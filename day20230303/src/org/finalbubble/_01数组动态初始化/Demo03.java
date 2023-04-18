package org.finalbubble._01数组动态初始化;


/*
    动态初始化数组的遍历:
        1.索引是连续的，每次递增一
        2.使用循环遍历获取数组的索引
        3.根据索引获取值
 */

public class Demo03 {
    public static void main(String[] args) {
        //定义长度为5的数组
        int [] arr = new int[5];
        System.out.println(arr);
        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/
        for (int i = 0; i < 5; i++) {
            //打印索引
            //System.out.println(i);
            System.out.println(arr[i]);
        }

    }
}

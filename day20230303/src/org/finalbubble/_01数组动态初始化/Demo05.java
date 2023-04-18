package org.finalbubble._01数组动态初始化;


/*
    数组静态初始化格式:
        格式1：
            数据类型 [] 数组名 = new 数据类型[]{... ...}
            int [] arr = new int[]{1,2,3,4,5,6,7,8,9};
        格式2：
            数据类型 [] 数组名 = {... ...}
            int [] arr = {1,2,3,4,5,6,7,8,9};
    静态初始化数组用来存放已知值

    求数组的长度:
        格式：数组名.length

    遍历数组的通用格式：
        for (int i = 0; i < 数组名.length; i++) {
            System.out.println(数组名[i]);
        }

 */
public class Demo05 {
    public static void main(String[] args) {
        //数据类型 [] 数组名 = new 数据类型[]{... ...}
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //数据类型 [] 数组名 = {... ...}
        int[] brr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //遍历数组
        for (int i = 0; i < 9; i++) {
            System.out.println(brr[i]);
        }
        System.out.println("----------------------------");
        int[] crr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //求数组的长度：格式：数组名.length
        //int length = crr.length;
        //System.out.println(length);

        for (int i = 0; i < crr.length; i++) {
            System.out.println(crr[i]);
        }

    }
}

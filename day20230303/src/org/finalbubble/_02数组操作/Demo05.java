package org.finalbubble._02数组操作;

/*
    1.相邻的两个数据 两两比较如果前面大于后面的就交换位置
    2.第一轮交换完成后，确定最大值
    3.数组有多长，我们就是交换多少轮
 */

import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};

        for (int j = 0;j < arr.length; j++) {
            for (int i = 0; i < arr.length-1 -j; i++) {
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            System.out.println("第"+(j+1)+"轮交换结果："+Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));


    }
}

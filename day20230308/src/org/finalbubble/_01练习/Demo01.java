package org.finalbubble._01练习;

/*
    利用随机数生成范围在2--10(包含2和10)之间的随机数存入到数组中(随机数可以重复)
    分别求出数组中的最大值，最小值和总和 打印到控制台
 */

import java.util.Arrays;
import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] arr = new int[10];
        int max = 0, min = 10, sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(2,10);
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);

    }
}

package org.finalbubble._02数组操作;

/*
`   数组元素求最小值:
        1.定义一个最小值，最小值从数组中取，默认是第一个元素
        2.遍历数组，获取中的每一个元素
        3.和最小值比较，如果比最小值还要小，就更新最小值
        4.求出最小值并输出
 */
public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 98, 78, 2, 5};
        //1.定义一个最小值，最小值从数组中取，默认是第一个元素
        int min = arr[0];
        //2.遍历数组，获取中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //3.和最小值比较，如果比最小值还要小，就更新最小值
            if (arr[i]<min){
                min = arr[i];
            }
        }
        //4.求出最小值并输出
        System.out.println("数组中元素的最小值："+min);
    }
}

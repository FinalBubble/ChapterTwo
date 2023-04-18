package org.finalbubble._02数组操作;


/*
    数组元素求最大值:
    int[] faceScores = {15, 9000, 10000, 20000, 9500, -5};
    分析：
        1.先定义最大值 ，最大值从数组取，默认取第一个
        2.遍历数组获取数组中的每一个元素
        3.和最大值比较，如果比最大值还要大，跟新最大值
        4.求出最大值并输出
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] faceScores = {15, 9000, 10000, 20000, 9500, -5};
        //1.先定义最大值 ，最大值从数组取，默认取第一个
        int max = faceScores[0];
        //2.遍历数组获取数组中的每一个元素
        for (int i = 0; i < faceScores.length; i++) {
            //3.和最大值比较，如果比最大值还要大，跟新最大值
            if (faceScores[i]>max){
                max = faceScores[i];
            }

        }
        //4.求出最大值并输出
        System.out.println("颜值最高的美女是："+max);


    }
}

package org.finalbubble._01练习;


/*
    判断101 -- 200之间有多少个素数，并输出

    分析：
        1.求素数
            素数：如果除了1和它本身以外，不能被其他正整数整除，就叫素数。 2 3 5 7 11 13 17 19 23 29 31
        2.统计
        3.输出素数 和个数
 */
public class Demo03 {
    public static void main(String[] args) {
        int count = 0;
        boolean flag = true;
        for (int i = 105; i <= 200; i++) {
            if(i % 2 != 0){
                for (int j = 3; j < i; j = j + 2) {
                    if(i % j == 0){

                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(i);
                    count++;
                    flag = false;
                }else {
                    flag = true;
                }

            }
        }
        System.out.println("素数的个数为："+count);
    }
}

package org.finalbubble._02数组操作;


/*
    某公司开发部5名开发人员，要进行项目进展汇报演讲，现在采取随机排名后进行汇报。
请先依次录入5名员工的工号，然后展示出一组随机的排名顺序。

    22 33 35 13 88
   分析：
    1.先使用数组 存储 员工号
    int [] arr = {22,33,35,13,88}
    2.定义新的数组
    int [] brr = new int[arr.length];
    3.生成随机数 取值范围 0 -- 4
    4.使用随机数当做索引 从arr数组取出元素存放到brr 数组中【提示判断工号是否已经被存储】
 */

import java.util.Arrays;
import java.util.Random;

public class Demo04 {
    public static void main(String[] args) {
        //1.先使用数组 存储 员工号
        int[] arr = {22, 33, 35, 13, 88};
        //2.定义新的数组
        int[] brr = new int[arr.length];
        //3.生成随机数 取值范围 0 -- 4
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            //获取随机数 取出随机数对应的数组中元素
            int id = arr[random.nextInt(5)];
            //引入第三方变量 判断数字是否被使用 默认是没有被使用
            boolean falg = true;
            //判断id 是否在brr中
            for (int j = 0; j < brr.length; j++) {
                int x = brr[j];
                if (x == id) {
                    falg = false;
                    i--;
                    break;
                }
            }
            if (falg) {
                brr[i] = id;
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}

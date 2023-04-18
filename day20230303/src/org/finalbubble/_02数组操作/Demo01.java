package org.finalbubble._02数组操作;


/*
    需求：某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总销售额。
    分析：
        1.定义变量用来存储最终和
        2.遍历数组获取数组中的每一个元素
        3.累加求和
        4.输出最终和
 */
public class Demo01 {
    public static void main(String[] args) {
        int [] arr = {16,26,36,6,100};
        //1.定义变量用来存储最终和
        int sum = 0;
        //2.遍历数组获取数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //3.累加求和
            sum+= arr[i];
        }
        //4.输出最终和
        System.out.println("总销售额："+sum+"万元");

    }
}

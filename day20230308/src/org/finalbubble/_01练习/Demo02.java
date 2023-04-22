package org.finalbubble._01练习;

/*
    机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
分析：
    1.变量 淡季 旺季 头等舱和经济舱
    2.判断  淡季 旺季
    3.根据  淡季 旺季 和 头等舱和经济舱 进行打折
 */

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double prince = scanner.nextDouble();
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("请输入头等舱或经济舱：");
        String type = scanner.next();
        System.out.println("机票的最终价格为："+ finalPrice(prince,month,type));
    }

    public static double finalPrice(double price, int month, String type){
        double finalPrice = 0;
        if(type.equals("头等舱")){
            if(month >=5 && month <= 10){
                finalPrice = 0.9 * price;
            }else {
                finalPrice = 0.7 * price;
            }
        } else if (type.equals("经济舱")) {
            if(month >=5 && month <= 10){
                finalPrice = 0.85 * price;
            }else {
                finalPrice = 0.65 * price;
            }
        }
        return finalPrice;
    }
}

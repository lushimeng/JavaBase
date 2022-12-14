/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_6;

import java.util.Scanner;

/**
 * 需求:
 * 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
 * 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
 * 分析：
 * 定义一个方法可以进行键盘录入机票原价、月份和机舱类型。
 */
public class Test7 {
    public static void main(String[] args){
        // 键盘输入类
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入机票价格：");
        int airTicket = sc.nextInt();
        System.out.print("请输入月份：");
        int month = sc.nextInt();
        System.out.print("请输入机舱类型（1代表头等舱，2代表经济舱）:");
        int type = sc.nextInt();
        
        double price = discountPrice(airTicket, month, type);
        System.out.println("折扣后价格为：" + price);
    }
    public static double discountPrice(int airTicket, int month, int type){
        double afterPrice = 0.0;
        switch(month){
            case 1:
            case 2:
            case 3:
            case 4:
            case 11:
            case 12:
                if(type == 1){
                    afterPrice = airTicket * 0.7;
                }else {
                    afterPrice = airTicket * 0.65;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                if(type == 1){
                    afterPrice = airTicket * 0.9;
                }else {
                    afterPrice = airTicket * 0.85;
                }
                break;
            default:
                System.out.println("输入月份有问题");
        }
        
        return afterPrice;
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

import java.util.Scanner;

/**
 * 某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
 * 	存期		年利率（%）
 * 	一年		2.25
 * 	两年		2.7
 * 	三年		3.25
 * 	五年		3.6
 * 请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
 * 提示：
 * 	存入金额和存入年限均由键盘录入
 * 本息计算方式：本金+本金×年利率×年限
 */
public class Demo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入本金(1000起)：");
        int principal = sc.nextInt();
        if (principal < 1000){
            System.out.println("本金小于1000,请重新存储本金：");
            principal = sc.nextInt();
        }
        System.out.println("请输入存储年限(1, 2, 3, 5): ");
        int years = sc.nextInt();
        double interest = 0;
        switch (years){
            case 1:
                interest = 2.25 * 0.01;
                break;
            case 2:
                interest = 2.7 * 0.01;
                break;
            case 3:
                interest = 3.25 * 0.01;
                break;
            case 5:
                interest = 3.6 * 0.01;
                break;
            default:
                System.out.println("输入年份有问题！！");
        }
        double sum = principal + principal * interest * years; // 本金和利息之和；
        System.out.println(principal + "本金存储" + years + "的本息之和为：" + sum);

    }
}

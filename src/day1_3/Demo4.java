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
 * 某商场购物可以打折，具体规则如下：
 * 普通顾客购不满100元不打折，满100元打9折；
 * 会员购物不满200元打8折，满200元打7.5折；
 * 不同打折规则不累加计算。
 *  请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）
 */
public class Demo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顾客类型0表示普通顾客，1表示会员");
        int customerType = sc.nextInt();
        System.out.println("请输入顾客购买金额：");
        int spendMoney = sc.nextInt();
        double payMoney = 0; // 初始总的付费金额
        switch (customerType){
            case 0:
                if(spendMoney > 0 && spendMoney < 100){
                    payMoney = spendMoney;
                }else if (spendMoney >= 100){
                    payMoney = spendMoney * 0.9;
                }else {
                    System.out.println("输入金额有误！！");
                }
                break;
            case 1:
                if(spendMoney >= 0 && spendMoney < 200){
                    payMoney = spendMoney * 0.8;
                }else if(spendMoney > 200){
                    payMoney = spendMoney * 0.75;
                }else {
                    System.out.println("输入金额有误！！！");
                }
                break;
            default:
                System.out.println("输入顾客类型有误！！！");
        }
        System.out.println("此顾客应付金额为：" + payMoney);
    }
}

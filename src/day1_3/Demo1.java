/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

/**
 * 李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，
 * 而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，
 * 新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？
 * 请在控制台输出。
 */
public class Demo1 {
    public static void main(String[] args){
        int originalPrice = 7988;
        int oldPhonePrice = 1500;
        double discountedPrice = originalPrice - originalPrice * 0.8;
        System.out.println("折扣价格为：" + discountedPrice);
        if(discountedPrice > oldPhonePrice){
            System.out.println("折扣价格大于旧手机价格，可以以旧换新");
        }else {
            System.out.println("折扣价格小于旧手机价格，不推荐以旧换新");

        }
    }
}

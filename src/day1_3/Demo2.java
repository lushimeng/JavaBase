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
 * 让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数");
        int min = Integer.MIN_VALUE;  // min为最小值，开始赋值为最小值
//        System.out.println(min);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        min = number1 > number2 ? number2 : number1;  // 三元运算符操作  c = a > b ? x : y;
        if(min < number3){
            System.out.println("最小值为：" + min);
        }else {
            System.out.println("最小值为：" + number3);
        }
    }
}

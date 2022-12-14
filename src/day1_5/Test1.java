/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;

import java.util.Scanner;

// 定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
public class Test1 {
    public static void main(String[] args) {
        // 键盘输入类
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要比较两个数的大小：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = minValue(a, b);
        System.out.println("较小的数是：" + min);

    }
    public static int minValue(int a, int b){
        return a > b ? b : a;  // 三元运算符
    }
}

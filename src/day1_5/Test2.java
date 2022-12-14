/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;

import java.util.Scanner;

//定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要比较的三个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("这三个数中的最大值为：" + getMaxValue(a, b, c));
    }
    public static int getMaxValue(int a, int b, int c){
        int max = a > b ? a : b;  // 得到a,b中的最大值
        return max > c ? max : c;  // 返回max，c的最大值

    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;

import java.util.Scanner;

//请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。
// 四舍五入之后的结果是一个int整数类型并返回。最后对方法进行测试。
public class Test7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数：");
        double n = sc.nextDouble();
        //调用方法接收
        int round = rounding(n);
        System.out.println("四舍五入之后的结果: " + round);

    }

    // 把小数强转为整形，然后计算差值，最后差值与0.5进行比较
    public static int rounding(double n){
        int temp = (int)n; //把double类型的n强转为整数n
        double difference = n - temp; //计算差值
        System.out.println(difference);
        if(difference < 0.5){
            return (int)n;
        }else {
            return (int)n+1;
        }
    }
}

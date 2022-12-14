/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

import java.util.Scanner;
import java.util.Random;

/**
 * 模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。
 * 要求：
 * 	键盘录入三个整数,其中前两个整数代表参加运算的数据，
 * 	第三个整数为要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:
 * 	请输入第一个整数: 30
 * 	请输入第二个整数: 40
 * 	请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1
 * 	控制台输出:30+40=70
 */
public class Demo6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int num1 = sc.nextInt();  // 自动换行功能
        System.out.print("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.print("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法):");
        int operationType = sc.nextInt();
        switch(operationType){
            case 1:
                int addition = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + addition);
                break;
            case 2:
                int subtraction = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + subtraction);
                break;
            case 3:
                int multiplication = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + multiplication);
                break;
            case 4:
                double division = num1 * 1.0 / num2;  // 这里 * 0.1的原因是转化为double类型
                System.out.println(num1 + " / " + num2 + " = " + division);
                break;
            default:
                System.out.println("类型错误");
        }
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;

import java.util.Scanner;

/**
 * 在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：
 * ```
 * 请输入第一个整数：10
 * 请输入第二个整数：30
 * 请输入第三个整数：20
 * 从大到小的顺序是： 30 20 10
 * ```
 */
public class Test5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.print("请输入第三个整数：");
        int c = sc.nextInt();
        // 调用方法
        sort(a, b, c);
//        a = -1;
//        b = -2;
//        c = a * b;
//        System.out.println(c);
    }
    public static void sort(int a, int b, int c){
//        System.out.print("从大到小的顺序是：");
//        if(a > b && a > c){
//            if(b > c){
//                System.out.print(a + " " +  b + " " + c);
//            }else {
//                System.out.print(a + " " +  c + " " + b);
//            }
//        }else if(b > a && b > c){
//            if( a > c){
//                System.out.print(b + " " +  a + " " + c);
//            }else {
//                System.out.print(b + " " +  c + " " + a);
//            }
//        }else {
//            if(a > b){
//                System.out.print(c + " " +  a + " " + b);
//            }else {
//                System.out.print(c + " " +  b + " " + a);
//            }
//        }
        int tempMax = a > b ? a : b;
        int max = tempMax > c ? tempMax : c;  // 利用三元运算符找到最大值
        int tempMin = a > b ? b : a;
        int min = tempMin > c ? c : tempMin;  // 利用三元运算符找到最小值
        int mid = a + b + c - max - min;   // 利用差值找到中间值
        System.out.println("从大到小的顺序是：" + max + " " + mid + " " + min);

    }
}

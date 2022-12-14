/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;
import java.util.Scanner;
import java.util.Random;
//需求：拿一个整数，然后调用方法，把整数交给方法，在方法中输出该数为奇数还是偶数
public class MethodOdd_Even {
    public static void main(String[] args){
        //创建键盘输入类
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        oddOrEven(n);
    }
    public static void oddOrEven(int n){
        if(n % 2 == 0){
            System.out.println(n + "是偶数！");
        }else {
            System.out.println(n + "是奇数！");
        }
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;

import java.util.Scanner;

public class MethodSum {
    public static void main(String[] args){
        System.out.println("请输入你要输入的n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("和为：" + sumN(n));
    }
    public static int sumN(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}

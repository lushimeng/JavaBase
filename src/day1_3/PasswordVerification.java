/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

import java.util.Scanner;

public class PasswordVerification {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的密码：");
        int passWord = sc.nextInt();
        while (true){
            if(passWord == 520){
                System.out.println("密码正确，欢迎进入系统");
                break;
            }else{
                System.out.println("密码错误，请重新输入：");
                passWord = sc.nextInt();
            }
        }
    }
}

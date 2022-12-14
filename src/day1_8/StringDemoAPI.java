/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

import java.util.Scanner;

public class StringDemoAPI {
    public static void main(String[] args){
        String account = "account";
        String password = "password";
        String verificationCode = "23hH3G";

        Scanner sc = new Scanner(System.in);
        // 要求：验证码不区分大小写
        System.out.print("请输入账户名: ");
        String inputAccount = sc.next();
        System.out.print("请输入密码: ");
        String inputPassword = sc.next();
        System.out.print("请输入验证码: ");
        String inputVerificationCode = sc.next();

        // 判断, 字符串判断是否相等要用equals，equalsIgnoreCase判断字符串是不区分大小写的、
        if(account.equals(inputAccount) && password.equals(password) && verificationCode.equalsIgnoreCase(inputVerificationCode)){
            System.out.println("登录成功！！");
        }else {
            System.out.println("登录失败！！");
        }

    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String account = "admin"; // 账户
        String password = "password"; // 密码
        int i = 1;
        while (i <= 3){
            System.out.print("请输入你的账号：");
            String inputAccount = sc.next();
            System.out.print("请输入密码：");
            String inputPassword = sc.next();
            if(account.equals(inputAccount) && password.equals(inputPassword)){
                System.out.println("登录成功！！");
                break;
            }else{
                System.out.println("账户或者密码有误！！");
            }
            i++;
        }
        if(i == 4){
            System.out.println("你已经三次不成功了，将锁屏60s");
        }

    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

import java.util.Scanner;

public class IfPasswordDetection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的密码：");
        String str = sc.next();
        if("123456".equals(str)){
            System.out.println("密码正确");
        }else{
            System.out.println("密码错误");
        }

    }
}

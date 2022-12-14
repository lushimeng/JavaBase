/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

import java.util.Scanner;

// 以字符串的形式从键盘接受一个手机号将中间四位号码屏蔽最终效果为：158****7839
public class Demo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个手机号: ");
        String phoneNumber = sc.next();
        String splitNumber = phoneNumber.substring(3, 7);  // 求子串，包前不包后
        String replaceNumber = phoneNumber.replace(splitNumber, "****");  // 前oldString --> 后newString
        System.out.println("替换好的手机号为：" + replaceNumber);
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

import java.util.Random;

// 随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。
public class Demo2 {
    public static void main(String[] args) {
        Random random = new Random();
        String str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        String code = ""; // 接收随机产生的5位验证码
        for(int i = 1; i <= 5; i++){
            int index = random.nextInt(str.length());
            code += str.charAt(index);
        }

        System.out.println("随机产生的5位验证码为：" + code);

    }
}

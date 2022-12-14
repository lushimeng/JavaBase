/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

import java.util.Random;

public class Code {
    public static void main(String[] args) {
        // 通过有参构造器创建对象
        StringBuilder stringBuilder = new StringBuilder("1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM");
        System.out.println("随机产生的验证码为：" + generateCode(stringBuilder, 4));
    }
    public static StringBuilder generateCode(StringBuilder stringBuilder, int n){
        // 通过无参构造器创建对象，从创建String对象中类比过来
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for(int i = 1; i <= n; i++){
            int temp = random.nextInt(stringBuilder.length());
            str.append(stringBuilder.charAt(temp));  // 添加字符到字符串中
        }

        return str;
    }
}

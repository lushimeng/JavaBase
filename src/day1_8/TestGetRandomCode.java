/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

import java.util.Random;

public class TestGetRandomCode {
    public static void main(String[] args){
        String code = getRandomCode();
        System.out.println("验证码：" + code);

    }
    public static String getRandomCode(){
        StringBuilder sb = new StringBuilder();  // 如何创建StringBuilder对象和对象的用法可以结合具体的API进行验证

        // 下面三个for循环的目的对sb赋值：0123456789abc....ABC....
        for(char ch = '0'; ch <= '9'; ch++){
            sb.append(ch);  // 往sb后面添加字符ch
        }
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }
        for(char ch = 'A'; ch <= 'Z'; ch++){
            sb.append(ch);
        }

        // 创建四位验证码
        Random random = new Random();
        String code = "";
        for(int i = 0; i < 4; i++){
            int temp = random.nextInt(sb.length());
            code += sb.charAt(temp);
        }

        return code;
    }
}

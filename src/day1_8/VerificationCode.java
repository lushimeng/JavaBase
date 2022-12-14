/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

import java.util.Random;
import java.util.Scanner;

public class VerificationCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            String genCode = generateCode(4);
            System.out.println("生成的验证码为：" + genCode);
            System.out.println("请输入验证码：");
            String code = sc.nextLine();
            if(genCode.equalsIgnoreCase(code)){
                System.out.println("输入正确");
                break;
            }else{
                System.out.println("输入错误，请重新输入......");
            }
        }
    }
    /**
     * 随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母
     * @param n
     * @return
     */
    public static String generateCode(int n){
        String code = "";
        Random random = new Random();
        for (int i = 1; i <= n; i++) {
            int type = random.nextInt(3) + 1; // 随机产生三种类型 1：0 ~ 9;  2: A ~ Z;  3: a ~ z
            switch (type){
                case 1:  // 0 ~ 9
                    int randomNumber = random.nextInt(10);  // 0 ~ 9
                    code += randomNumber;  // 字符串连接
                    break;
                case 2: // A ~ Z: 65 ~
                    char CH = (char) (random.nextInt(26) + 65);
                    code += CH;
                    break;
                case 3:  // a ~ z: 97 ~
                    char ch = (char) (random.nextInt(26) + 97);
                    code += ch;
                    break;
            }
        }
        return code;
    }
}

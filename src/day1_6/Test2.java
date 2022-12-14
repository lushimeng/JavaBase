/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_6;

import java.util.Random;
import java.util.Scanner;

//定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。
public class Test2 {
    public static void main(String[] args){
        // 键盘输入类
        Scanner sc = new Scanner(System.in);
        System.out.print("输入你想要产生验证码个数：");
        int n = sc.nextInt();
        String strCode = randomGenCode(n);
        System.out.println("随机产生的验证码为：" + strCode);
    }

    /**
     * 随机产生n个验证码,最主要的还是两个随机random是否能够看出来，第一个为数字，大写字母，小写字母； 第二个是进入里面好具体的随机；
     * @param n: 验证码个数
     * @return： 返回验证码
     */
    public static String randomGenCode(int n){
        String code = "";
        Random random = new Random();
        for(int i = 1; i <= n; i++){
            int type = random.nextInt(3) + 1; //随机产生1 --数字，2 --大写字母，3 --小写字母；
            System.out.print(type + " ");
            switch (type){
                case 1:
                    int temp = random.nextInt(10);  // 随机产生0 ~ 9
                    code += temp; // 字符串连接
                    break;
                case 2:  // 65 -90： A ~ Z
                    char CH = (char) (random.nextInt(26) + 65);  // 强制类型转换，随机产生A ~ Z大写字母
                    code += CH;
                    break;
                case 3:  //97 - 122：a ~ z
                    char ch = (char)(random.nextInt(25) + 97);  // 强制类型转换，随机产生a ~ z小写字母；
                    code += ch;
                    break;
            }
        }
        return code;
    }
}

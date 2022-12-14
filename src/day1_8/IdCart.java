/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

import java.util.Scanner;

// 我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
// 请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
// 规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
public class IdCart {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个身份证: ");
        String idCast = sc.nextLine();
        System.out.println("身份证号是否合理？" + check(idCast));
    }

    /**
     * 判断身份证是否合法
     * @param str
     */
    public static boolean check(String str){
        if(str.length() != 18){  // 号码不是18位返回false
            return false;
        }

//        if(str.startsWith("0")){  // 字符串要是以0开头，则返回true
//            return false;
//        }
        if(str.charAt(0) == '0'){  // 以数字0开头返回false
            return false;
        }
        char ch = str.charAt(str.length() - 1);  // 获取身份证最后一位字符

        if((ch >= '0' && ch <= '9')|| ch == 'X'){

        }else {  // 身份证最后一位不是数字或者X
            return false;
        }

        // 判断前17位数
        for(int i = 0; i < str.length() -1; i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
}

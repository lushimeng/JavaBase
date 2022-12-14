/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;
// 请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
// 例如："abcba"、"上海自来水来自海上"均为对称字符串。
public class SymmetricString {
    public static void main(String[] args){
        System.out.println(judgeString("2332"));
        System.out.println(isSymI("1231"));
    }
    public static boolean judgeString(String str){
        // 为了程序的健壮，如果传递的是空值，返回false
        if(str.equals(null)){
            return false;
        }

        // 回文：具体逻辑可以在纸上写出来分析
        int left = 0, right = str.length() - 1;
        for(int i = 0; i <= (left + right) / 2; i++){
            if(str.charAt(i) != str.charAt(right - i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isSymI(String str){
        // 为了程序的健壮，如果传递的是空值，返回false
        if(str == null){
            return false;
        }

        // 转换为StringBuilder
        StringBuilder sb = new StringBuilder(str);
        // 反转，再转换为String
        String reStr = sb.reverse().toString();
        // 比较两个字符是否相等
        return str.equals(reStr);
    }
}

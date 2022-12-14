/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

public class Demo1 {
    public static void main(String[] args){
        String s1 = "abc";  // ""引出来的放在堆内存中的字符串常量池中
        String s2 = new String("abc"); // new出来的在堆内存中
        System.out.println(s1 == s2);  // false

        String s3 = "ab";  // 放在堆内存中的常量池中国
        String s4 = s3 + "c";  // 计算结果放在堆内存中
        System.out.println(s1 == s3);  // false

        // Java存在编译优化机制，程序在编译时候："a" + "b" + "c";会直接转化为"avc"
        String s5 = "a" + "b" + "c";
        System.out.println(s1 == s5); // true
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

/**
 * 以""方式给出的字符串对象，在  字符串常量池  中存储，而且相同内容会在其中存储一份
 * 通过构造器new对象，每new一次都会产生一个新对象，放在堆内存中。
 */
public class StrTest {
    public static void main(String[] args) {
        // 创建字符串的第一种方式(推荐)
        String s1 = "abc";  //
        String s2 = "abc";
        System.out.println(s1 == s2);  // true

        // 创建字符串的第二种方式
        char[] ch = {'a', 'b', 'c'};
        String s3 = new String(ch);
        System.out.println("s3:" + s3);

        // 创建字符串的第三种方式
        byte[] by = {97, 97, 99};
        String s4 = new String(by);
        System.out.println("s4:" + s4);
        System.out.println(s3 == s4);  // false
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;
//数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
// 请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
public class Test6 {
    public static void main(String[] args){
        System.out.println(absoluteValue(-23.34));
    }
    public static double absoluteValue(double n){
        if(n > 0)  return n;
        return n * (-1);
    }
}

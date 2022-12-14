/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;
/*
修饰符  返回值类型  方法名( 形参列表 )
{
    方法体代码(需要执行的功能代码)
 }
 */
public class Method {
    public static void main(String[] args){
        int he = sum(10,20);
        System.out.println("和为：" + he);

    }
    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }
}

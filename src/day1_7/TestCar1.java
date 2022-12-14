/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;
//⚫ this关键字可以出现在成员方法、构造器中，代表当前对象的地址。
//⚫ 作用：访问当前对象的成员变量、成员方法。
public class TestCar1 {
    public static void main(String[] args) {
        Car1 c1 = new Car1("奔驰", 45);
        System.out.println(c1.name);
        System.out.println(c1.price);

        System.out.println("--------------");
        c1.goWith("宝马");
    }
}

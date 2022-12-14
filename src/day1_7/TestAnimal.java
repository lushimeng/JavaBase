/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

/**
 * 封装是什么，一般封装怎么体现出来？
 * ⚫ 面向对象的三大特征之一，合理隐藏，合理暴露。
 * ⚫ 一般会把成员变量使用private隐藏起来。
 * ⚫ 通过getter和setter方法暴露其访问。
 * 2.封装有什么好处？
 * ⚫ 加强了程序代码的安全性。
 * ⚫ 适当的封装可以提升开发效率，同时可以让程序更容易理解与维护
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(236);
        System.out.println(animal.getAge());





    }
}

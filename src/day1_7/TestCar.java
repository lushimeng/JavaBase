/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;
// 对象是通过构造器初始化出来的

/**
 * 无参数构造器（默认存在的）：初始化的对象时，成员变量的数据均采用 -- 默认值。
 * 有参数构造器：在初始化对象的时候，同时可以为对象进行赋值。
 *
 * 任何类定义出来，默认就自带了无参数构造器，写不写都有。
 * 但定义了有参数构造器，无参数构造器就没有了，此时就需要自己写一个无参数构造
 *
 * 1.构造器的作用: 初始化类的对象，并返回对象的地址
 */
public class TestCar {
    public static void main(String[] args){
        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.price);

        // 调用有参构造器
        Car c2 = new Car("宝马X6", 90);
        System.out.println(c2.name);
        System.out.println(c2.price);
    }
}

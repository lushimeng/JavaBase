/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;
/**
 * 无参数构造器（默认存在的）：初始化的对象时，成员变量的数据均采用 -- 默认值。
 * 有参数构造器：在初始化对象的时候，同时可以为对象进行赋值。
 *
 * 任何类定义出来，默认就自带了无参数构造器，写不写都有。
 * 但定义了有参数构造器，无参数构造器就没有了，此时就需要自己写一个无参数构造
 *
 */
public class Car {
    String name;
    double price;

    // 无参构造器
    public Car(){
        System.out.println("无参构造器被触发了~~~~");
    }


    // 有参构造器
    public Car(String aName, double aPrice){
        System.out.println("有参构造器被触发了~~~~");
        this.name = aName;
        this.price = aPrice;
    }
}

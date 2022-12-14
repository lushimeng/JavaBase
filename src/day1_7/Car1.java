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
public class Car1 {
    String name;
    double price;

    // 无参构造器
    public Car1(){

    }

    // 有参构造器
    public Car1(String name, double price){
        this.name = name;
        this.price = price;
    }

//    // 有参构造器  -- 构造器中参数变量命名，可以在前面添加一个小写字母a
//    public Car1(String aName, double aPrice){
//        name = aName;
//        price = aPrice;
//    }

    public void goWith(String name){
        System.out.println(this.name + "正在和" + name + "比赛！");
    }
}

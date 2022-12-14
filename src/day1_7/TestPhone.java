/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

public class TestPhone {
    public static void main(String[] args){
        // 1. 调用无参构造创建手机对象
        Phone phone = new Phone();
        phone.setPrice(3998);
        phone.setBrand("小米");
        phone.setColor("黑色");
        // 1. 调用方法
        phone.call();
        phone.sendMessage();

        // 2. 调用有参构造器创建手机对象
        Phone phone1 = new Phone("vivos", 1500, "粉色");
        // 2. 调用方法
        phone1.call();
        phone1.sendMessage();


    }
}

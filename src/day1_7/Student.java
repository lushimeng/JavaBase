/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

/**
 * 个Java文件中可以定义多个class类，且只能一个类是public修饰，而且public修饰的类名必须成为代码文件名。
 * 实际开发中建议还是一个文件定义一个class类。
 */
class Stu1{
    String name;
    double height;

    // 方法
    public void study(){

    }

    public void run(){

    }
}

public class Student {
    public static void main(String[] args){
        Stu1 stu1 = new Stu1();
        stu1.study();
        stu1.run();
    }
}

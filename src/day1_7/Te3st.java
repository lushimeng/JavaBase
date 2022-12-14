/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

public class Te3st {
    public static void main(String[] args){
        Stu s1 = new Stu();
        s1.name = "卢世猛";
        s1.sex = '男';
        s1.hobby = "游戏，睡觉，听课";
        s1.study();

        // 把学生类型的s1变量赋值给学生类型s2变量
        Stu s2 = s1;  // 引用类型，传过去的为地址
        s2.hobby = "爱提问";
        System.out.println(s2.name);
        System.out.println(s2.sex);
        System.out.println(s2.hobby);
        s2.study();

    }
}

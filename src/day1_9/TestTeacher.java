/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_9;

import java.util.ArrayList;

/**
 *请定义教师（Teacher）类，属性包含姓名和专业名称。
 * 将若干教师对象存入ArrayList集合中，并遍历集合打印教师信息，格式如下：
 *
 * 姓名：赵老师, 专业：javaSe
 * 姓名：钱老师, 专业：javaEe
 * 姓名：孙老师, 专业：php
 * 姓名：李老师, 专业：python
 *
 * ArrayList<E>：其实就是一个泛型类，可以在编译阶段约束集合对象只能操作某种数据类型。
 * 其中E确定后就只能存储具体的数据类型了
 */
public class TestTeacher {
    public static void main(String[] args){
        // 构建Teacher类型的ArrayList集合，该集合只能存储Teacher类型的数据
        ArrayList<Teacher> teacherArrayList = new ArrayList<>();

        // 添加数据
        teacherArrayList.add(new Teacher("赵老师", "javaSe"));
        teacherArrayList.add(new Teacher("钱老师", "javaEe"));
        teacherArrayList.add(new Teacher("孙老师", "php"));
        teacherArrayList.add(new Teacher("李老师", "python"));

        // 打印数据
        for(int i = 0; i < teacherArrayList.size(); i++){
            System.out.println("姓名：" + teacherArrayList.get(i).getName() +
                    ", 专业：" + teacherArrayList.get(i).getMajor());
        }


    }
}

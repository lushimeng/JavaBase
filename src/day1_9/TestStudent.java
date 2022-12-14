/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_9;

import day1_7.Stu;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args){
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("20180302", "叶孤城", 23, "护理一班"));
        listStudent.add(new Student("20180303", "东方不败", 23, "推拿二班"));
        listStudent.add(new Student("20180304", "西门吹雪", 26, "中药学二班"));
        listStudent.add(new Student("20180305", "梅超风", 26, "神经科2班"));
        for(int i = 0; i < listStudent.size(); i++){
            System.out.println("学号：" + listStudent.get(i).getId() +
                    ",  姓名：" + listStudent.get(i).getName() +
                    ",  年龄：" + listStudent.get(i).getAge() +
                    ",  班级：" + listStudent.get(i).getClassName());
        }
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入学号：");
            String id = sc.nextLine();
            Student stu = searchId(listStudent, id);  // 接收返回的对象地址
            if(stu != null){
                System.out.println("学号：" + stu.getId() +
                        ",  姓名：" + stu.getName() +
                        ",  年龄：" + stu.getAge() +
                        ",  班级：" + stu.getClassName());
            }else {
                System.out.println("查无此人！！！");
            }
        }
    }

    /**
     * 查找在ArrayList集合中是否有id
     * @param list
     * @param id
     */
    public static Student searchId(ArrayList<Student> list, String id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals(id)){
                return list.get(i);  // 如果存在，返回该对象地址
            }
        }
        return null;  // 如果不存在返回null;
    }
}

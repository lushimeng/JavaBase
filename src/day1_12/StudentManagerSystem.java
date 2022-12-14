/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 添加学生：通过键盘录入学生信息，添加到集合中
 * 删除学生：通过键盘录入要删除学生的学号，将该学生对象从集合中删除
 * 修改学生：通过键盘录入要修改学生的学号，将该学生对象其他信息进行修改
 * 查看学生：将集合中的学生对象信息进行展示
 * 退出系统：结束程序
 */
public class StudentManagerSystem {
    public static void main(String[] args){
        // 创建一个student对象
        ArrayList<Student> students = new ArrayList<>();
        // 创建一个输入类
        Scanner sc = new Scanner(System.in);
        OUT:
        while (true){
            menu();
            System.out.print("Input your choose:");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    addStudent(students, sc);
                    break;
                case 2:
                    deleteStudentById(students, sc);
                    break;
                case 3:
                    updateStudentById(students, sc);
                    break;
                case 4:
                    findAllStudent(students);
                    break;
                case 5:
                    System.out.println("退出成功~~~");
                    break OUT;  // break xxx跳出循环，在循环外面加上xxx
                default:
                    System.out.println("Input choose error!!!");
            }
        }

    }

    /**
     * 展示students集合中所有学生的信息
     * @param students
     */
    private static void findAllStudent(ArrayList<Student> students) {
        Student student = null;
        System.out.println("=============================学生信息===============================");
        for(int i = 0; i < students.size(); i++){
            student = students.get(i);  // 从学生集合汇总依次得到每个学生的信息
            System.out.println("学生id：" + student.getId() + "   " +
                    "学生name: " + student.getName()+ "   " +
                    "学生age: " + student.getAge()+ "   " +
                    "学生address: " + student.getAddress());
        }
    }

    /**
     * 根据输入id更改学生信息
     * @param students
     * @param sc
     */
    private static void updateStudentById(ArrayList<Student> students, Scanner sc) {
        System.out.print("请输入要修改学生的ID: ");
        String id = sc.next();
        Student student = existId(students, id);
        if(student != null){
            System.out.print("姓名是否需要修改(y: 是,  N: 不)：");
            String changeName = sc.next();
            if("y".equalsIgnoreCase(changeName)){
                System.out.print("请输入一个新的名字：");
                String name = sc.next();
                student.setName(name);
            }

            System.out.print("年龄是否需要修改(1: 是,  0: 不)：");
            int changeAge = sc.nextInt();
            if(changeAge == 1){
                System.out.print("请输入一个新的年龄：");
                int age = sc.nextInt();
                student.setAge(age);
            }

            System.out.print("地址是否需要修改(y: 是,  N: 不)：");
            String changeAddress = sc.next();
            if("y".equalsIgnoreCase(changeAddress)){
                System.out.print("请输入一个新的地址：");
                String address = sc.next();
                student.setAddress(address);
            }

            System.out.println("修改成功~~~");

        }else {
            System.out.println("学号输入失败~~~");
        }
    }

    /**
     * 根据输入的id删除学生信息
      * @param students: 学生集合
     * @param sc：输入实例化对象
     */
    private static void deleteStudentById(ArrayList<Student> students, Scanner sc) {
        System.out.print("请输入要删除的学生Id: ");
        String id = sc.next();
        Student student = existId(students, id);
        if(student != null){
            students.remove(student);  // 删除学生集合中的对应学生对象
            System.out.println("删除成功~~~");
        }else {
            System.out.println("删除失败，学生集合中没有此学生ID~~~");
        }
    }

    /**
     * 向student集合中添加学生的信息
     * @param students
     */
    private static void addStudent(ArrayList<Student> students, Scanner sc) {
        System.out.print("请输入学生的id:");
        String id = sc.next();
        System.out.print("请输入学生的name:");
        String name = sc.next();
        System.out.print("请输入学生的age:");
        int age = sc.nextInt();
        System.out.print("请输入学生的address:");
        String address = sc.next();

        // 封装一个Student对象
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        // 加入到students集合中
        students.add(student);
        System.out.println("添加成功~~~");
    }

    /**
     * 菜单选项
     */
    public static void menu(){
        System.out.println("=========学生管理系统===========");
        System.out.println("|1----------------------添加学生|");
        System.out.println("|2----------------------删除学生|");
        System.out.println("|3----------------------修改学生|");
        System.out.println("|4----------------------查看学生|");
        System.out.println("|5----------------------退出系统|");
        System.out.println("===============================");
    }

    /**
     * 查找该学生集合中是否存在学生学号为id的学生，如果存在返回该学生对象，否则返回null
     * @param students
     * @param id
     * @return
     */
    private static Student existId(ArrayList<Student> students, String id){
        Student student = null;
        for(int i = 0; i < students.size(); i++){
            student = students.get(i);
            if(student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }
}

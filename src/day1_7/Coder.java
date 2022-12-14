/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

public class Coder {
    // 定义私有成员变量
    private String name;  // 姓名
    private int id; // 工号
    private double salary;  // 基本工资

    // 无参构造
    public Coder(){

    }

    // 有参构造
    public Coder(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary =salary;
    }

    // 定义工作方法
    public void work(){
        System.out.println("工号为" + this.id + "基本工资为" + this.salary + "的程序员" + this.name + "正在写着代码.....");
    }

    // setXXX/getXXX方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

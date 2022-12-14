/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

public class User {
    // 1. 私有成员变量
    private String name;
    private double height;
    private double salary;

    // 2. 构造器
    public User(){}

    public User(String name, double height, double salary){
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    // getXXX,setXXX方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

public class Manager {
    // 定义私有成员变量
    private String name;  // 姓名
    private int id; // 工号
    private double salary;  // 基本工资
    private double bonus;  //奖金

    // 无参构造
    public Manager(){

    }

    // 有参构造
    public Manager(String name, int id, double salary, double bonus){
        this.name = name;
        this.id = id;
        this.salary =salary;
        this.bonus = bonus;
    }

    // 定义工作方法
    public void work(){
        System.out.println("工号为" + this.id + "基本工资为" + this.salary + "奖金为" + this.bonus + "的项目经理" + this.name + "正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

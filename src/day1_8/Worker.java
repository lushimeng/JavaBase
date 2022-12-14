/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

public class Worker {
    // 定义私有变量
    private String name;
    private int year;

    // 提供空参构造
    public Worker(){

    }

    // 提供有参构造
    public Worker(String name, int year){
        this.name = name;
        this.year = year;
    }

    // getXXX/setXXX

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

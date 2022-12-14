/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_9;

public class Teacher {
    // 定义私有类
    private String name;
    private String major;

    // 提供无参构造
    public Teacher(){

    }

    // 提供有参构造
    public Teacher(String name, String major){
        this.name = name;
        this.major = major;
    }

    // getXXX / setXXX方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

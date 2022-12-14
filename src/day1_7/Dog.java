/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

public class Dog {
    // 定义私有成员变量
    private String color;  // 毛的颜色
    private String breed;  // 品种

    // 无参构造器
    public Dog(){

    }

    // 有参构造器
    public Dog(String color, String breed){
        this.breed = breed;
        this.color = color;
    }

    // 吃饭方法
    public void eat(){
        System.out.println(this.color + "的" + this.breed + "啃骨头.....");
    }

    //抓老鼠方法
    public void lookHome(){
        System.out.println(this.color + "的" + this.breed + "正在看家.....");
    }

    // getXXX/setXXX方法


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

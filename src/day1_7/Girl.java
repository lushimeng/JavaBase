/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

public class Girl {
    // 定义私有成员变量
    private String name;
    private double height;
    private double weight;

    // 提供无参构造器
    public Girl(){

    }

    // 提供有参构造器
    public Girl(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // 定义洗衣服方法
    public void wash(){
        System.out.println("女朋友帮我洗衣服");
    }

    // 定义做饭方法
    public void cook(){
        System.out.println("女朋友给我做饭");
    }

    // 展示女朋友信息方法
    public void show(){
        System.out.println("我女朋友叫" + this.name + ",身高" + this.height + ",体重" + this.weight + "斤。");
    }

    // gerXXX/setXXX方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

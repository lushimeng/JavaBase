/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

public class Phone {
    // 1: 定义私有变量
    private String brand; // 手机品牌
    private double price; // 手机价格
    private String color; // 手机颜色

    // 2: 构造器
    public Phone(){  // 提供无参构造

    }

    public Phone(String brand, double price, String color){  // 提供有参构造
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    // 3: 方法
    // 定义打电话方法
    public void call(){
        System.out.println("正在使用价格为" + this.price + "元" + this.color + "的" + this.brand + "手机打电话....");
    }
    // 定义发送消息方法
    public void sendMessage(){
        System.out.println("正在使用价格为" + this.price + "元" + this.color + "的" + this.brand + "手机发短信....");
    }

    // 定义setXXX/getXXX方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

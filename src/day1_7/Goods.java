/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

public class Goods {
    // 私有变量
    private int id; // 编号
    private String name;  // 名称
    private double price; // 价格、
    private int buyNumber; // 购买数量

    // 构造器
    public Goods(){}

    public Goods(int id, String name, double price, int buyNumber){
        this.id = id;
        this.name = name;
        this.price = price;
        this.buyNumber = buyNumber;
    }

    // getXX,setXX方法


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args){
        // 定义购物车对象：使用一个数组对象表示
        Goods[] shopCar = new Goods[100]; // [null, null, ....]
        // 搭建操作架构
        OUT:
        while (true) {
            System.out.println("请您选择如下命令进行操作");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询购物车中的商品：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算购买商品的金额：pay");
            System.out.println("退出系统：exit");
            Scanner sc = new Scanner(System.in);
            System.out.print("请你输入命令：");
            String command= sc.next();
            switch(command){
                case "add":
                    //添加商品到购物车
                    addGoods(shopCar, sc);  // 把扫描器也传入方法中
                    break;
                case "query":
                    //查询购物车商品展示
                    queryGoods(shopCar);
                    break;
                case "update":
                    // 修改商品的购买数量
                    updateGoods(shopCar, sc);
                    break;
                case "pay":
                    // 结算金额
                    payGoods(shopCar);
                    break;
                case "exit":
                    // 退出系统
                    break OUT;
                default:
                    System.out.println("输入需求类型有误！");
            }
        }

    }

    /**
     * 结算商品的价格
     * @param shopCar
     */
    public static void payGoods(Goods[] shopCar) {
        double sum = 0.0;
        for(int i = 0; i < shopCar.length; i++){
            Goods g = shopCar[i];
            if(g != null){
                sum += g.getPrice() * g.getBuyNumber();
            }else {
                break; // g为null退出循环, 因为g之后的部分都为null,不再还有商品
            }
        }
        System.out.println("商品总价格为：" + sum);
    }

    /**
     * 修改商品数量
     * @param shopCar
     */
    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        // 让用户输入要修改商品id, 根据id查询出修改的商品对象
        while (true) {
            System.out.println("请您输入要修改的商品：");
            int id = sc.nextInt();
            Goods g = getGoodsById(shopCar, id);
            if(g == null){
                // 没有该商品
                System.out.println("对不起，没有购买该商品");
            }else{
                // 说明存在该商品对象，可以修改它了；
                System.out.println("请你输入：" + g.getName() + "商品最新购买数量：");
                int buyNumber = sc.nextInt();
                g.setBuyNumber(buyNumber);
                System.out.println("修改完成");
                queryGoods(shopCar);
                break;  // 跳出while, for循环；return: 结束方法
            }
        }
    }

    public static Goods getGoodsById(Goods[] shopCar, int id){
        // shopCar = {g1, g2, null, null.....};
        for(int i = 0; i < shopCar.length; i++){
            Goods g = shopCar[i];
            if(g != null){
                // 判断这个商品id是否是我们要找的
                if(g.getId() == id){
                    return g;
                }
            }else {
                return null;  // 找到了前面存在的商品都没有找到
            }
        }

        return null; // 代表找完了100个商品，都没有id是一样的
    }

    /**
     * 查询购物车中的商品对象信息，并展示出来
     * @param shopCar
     */
    public static void queryGoods(Goods[] shopCar) {
        System.out.println("=============查询购物车信息如下=================");
        System.out.println("编号\t\t名称\t\t价格\t\t购买数量");
        for(int i = 0; i < shopCar.length; i++){
            Goods g = shopCar[i];  // 接收对象，shopCar[i]可能为null
            if(g != null){
                // 展示这个商品对象
                System.out.println(g.getId() + "\t\t\t" + g.getName() + "\t\t\t" + g.getPrice() + "\t\t\t" + g.getBuyNumber());
            }else {
                // 遍历结束
                break;
            }
        }
    }

    /**
     * 完成商品添加到购物车的功能
     * @param shopCar
     */
    public static void addGoods(Goods[] shopCar, Scanner sc) {
        // 录入用户输入的购买商品的信息
        System.out.println("请您输入购买商品的编号(不重复)：");
        int id = sc.nextInt();
        System.out.println("请你输入购买商品的名称：");
        String name = sc.next();
        System.out.println("请你输入购买商品的数量：");
        int buyNumber = sc.nextInt();
        System.out.println("请你输入购买商品的价格：");
        double price = sc.nextDouble();

        // 把这个购买商品的信息封装成一个商品对象--- 原因是shopCar[i]可能为null,所以必须把商品的信息封装成一个商品对象；
        Goods g = new Goods();
        g.setId(id);
        g.setName(name);
        g.setBuyNumber(buyNumber);
        g.setPrice(price);

        // 把商品添加到购物车数组汇总
        for(int i = 0; i < shopCar.length; i++){
            if(shopCar[i] == null){
                // 说明此位置没有元素存入，把我们新买的商品添加到此处即可
                shopCar[i] = g;
                /**
                 * 这里特别要注意使用shopCar[i].id = id; shopCar[i].name = name;是错误的，
                 * 因为shopCar[i]为引用类型，初始时都为null,只能通过创建一个商品对象进行赋值操作；
                 */
                break;
            }
        }
        System.out.println("你的商品" + name + "添加成功！");
    }
}














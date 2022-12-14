/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

import java.util.Scanner;

/**
 * 请录入工人姓名：
 * 张三
 * 请录入工人工龄：
 * 5
 * 该工人对象的属性信息如下：
 * 姓名：张三
 * 工龄：5
 */
public class TestWorker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入工人姓名：");
        String name = sc.nextLine();
        System.out.println("录入工人工龄：");
        int year = sc.nextInt();

        Worker w = new Worker(name, year);
        System.out.println("该工人对象的属性信息如下：");
        System.out.println("姓名：" + w.getName());
        System.out.println("工龄：" + w.getYear());
    }
}

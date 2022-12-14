/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

import java.util.Scanner;

public class IfCase {
    public static void main(String[] args){
        System.out.println("请输入你的成绩：");
        Scanner sc = new Scanner(System.in);
        int yourScore =  sc.nextInt();
        Boolean bool = true;
        while (bool){
            if(yourScore >= 95 && yourScore <= 100){
                System.out.println("奖励一辆自行车");
            }else if(yourScore >= 90 && yourScore <= 94){
                System.out.println("奖励去游乐园");
            }else if(yourScore >= 80 && yourScore <= 89){
                System.out.println("奖励一辆变形金刚");
            }else if(yourScore >= 0 && yourScore <= 80){
                System.out.println("挨揍");
            }else{
                System.out.println("输入有问题");
            }
            System.out.println("是否还要继续测试，如果需要请输入true,否则输入false");
            bool = sc.nextBoolean();
            if(bool){
                System.out.println("请输入你的成绩");
                yourScore = sc.nextInt();
            }
        }
        System.out.println("测试结束");
    }
}

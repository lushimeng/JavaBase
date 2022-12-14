/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

import java.util.Scanner;

public class SwitchPenetration {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            System.out.println("请输入年份和月份：例如 2000 1");
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            int month = sc.nextInt();
            //switch的穿透性应用
            switch(month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("这个月有31天");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("这个月有30天");
                    break;
                case 2:
                    if(year % 4 == 0 && year % 100 != 0){
                        System.out.println("此月有29天");
                    }else{
                        System.out.println("此月仅有28天");
                    }
                    break;
                default:
                    System.out.println("输入错误！@");
            }
        }
    }
}

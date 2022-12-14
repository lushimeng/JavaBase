/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            System.out.println("请输入星期几：");
            Scanner sc = new Scanner(System.in);
            String weekDay = sc.next();
            switch(weekDay){
                case "周1":
                    System.out.println(1);
                    break;
                case "周2":
                    System.out.println(2);
                    break;
                case "周3":
                    System.out.println(3);
                    break;
                case "周4":
                    System.out.println(4);
                    break;
                case "周5":
                    System.out.println(5);
                    break;
                case "周6":
                    System.out.println(6);
                    break;
                case "周7":
                    System.out.println(7);
                    break;
                default:
                    System.out.println("default");
            }
        }

    }
}

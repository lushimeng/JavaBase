/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;

import java.util.Random;
import java.util.Scanner;

/**
 * 开发一个幸运小游戏，游戏规则如下：
 * 游戏后台随机生成1-20之间的5个数（无所谓是否重复），然后让大家来猜数字：
 * 未猜中提示：“未命中”，并继续猜测
 * 猜中提示：“运气不错，猜中了”，并输出该数据第一次出现的位置，且输出全部5个数据， 最终结束本游戏
 */
public class GuessGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        // 存储随机数组
        int[] arrayRandom = new int[5];
        //赋初值
        for(int i = 0; i < arrayRandom.length; i++){
            arrayRandom[i] = random.nextInt(20) + 1;
        }

//        boolean flag = false; // 跳出while死循环标志,当flag为true时跳出死循环
//        while(true){
//            System.out.print("请输入你要猜的数字：");
//            int guessNumber = sc.nextInt();
//            for(int i = 0; i < arrayRandom.length; i++){
//                if (guessNumber == arrayRandom[i]){
//                    System.out.println("恭喜你，猜对了，在数组中第一次出现的数组下标为：" + i);
//                    flag = true;
//                    break;  // break只能跳出一次循环，即只能跳出包含的for循环，不可以跳出while循环
//                }
//            }
//
//            if(flag) break;  //已经猜中，flag为true, 跳出死循环
//
//            System.out.println("猜错了，继续加油！！");
//        }
        a:
        while(true){
            System.out.print("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();
            for(int i = 0; i < arrayRandom.length; i++){
                if (guessNumber == arrayRandom[i]){
                    System.out.println("恭喜你，猜对了，在数组中第一次出现的数组下标为：" + i);
                    break a;  // break只能跳出一次循环，即只能跳出包含的for循环，不可以跳出while循环
                }
            }
            System.out.println("猜错了，继续加油！！");
        }

        for(int i = 0; i < arrayRandom.length; i++){
            System.out.print(arrayRandom[i] + "  ");
        }

    }
}

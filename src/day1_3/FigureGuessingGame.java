/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中结束游戏
 */
public class FigureGuessingGame {
    public static void main(String[] args){
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // 产生1  ~ 100 之间的随机数
        System.out.println(randomNumber);
        Scanner sc = new Scanner(System.in);
        while (true){  // 死循环
            System.out.println("请输入你要猜测的数字：");
            int guessNumber = sc.nextInt();
            if(guessNumber == randomNumber){
                System.out.println("恭喜你猜对了！！！");
                break;  // break,continue只能用于循环和switch当中，不可以用在if语句中， 结束死循环break;
            }else if(guessNumber > randomNumber){
                System.out.println("对不起，你猜的太大了！！！");
            }else {
                System.out.println("对不起，你猜的太小了！！！");
            }

        }
    }
}

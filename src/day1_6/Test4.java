/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_6;
//在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
// 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入评委个数：");
        int n = sc.nextInt();
        double average = averageScore(n);
        System.out.println("选手的平均成绩为：" + average);

    }

    /**
     * 去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
     * @param n: 评委个数
     * @return
     */
    public static double averageScore(int n){
        // 创建键盘输入类
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;  // 保存最大值
        int min = Integer.MAX_VALUE;  // 保存最小值
        int sum = 0;  //评委总分和
        for(int i = 1; i <= n; i++){
            System.out.print("第" + i + "个评委打分：");
            int score = sc.nextInt();
            sum += score;  //评委打分和
            if(score > max){  // 找到最大值
                max = score;
            }
            if(score < min){  // 找到最小值
                min = score;
            }
        }

        double average = (sum - max -min) * 1.0 / (n -2);
        return average;

    }
}

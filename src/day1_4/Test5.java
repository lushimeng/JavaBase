/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;
//定义一个数组来存储11个学生的成绩，例如：{100，72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。
public class Test5 {
    public static void main(String[] args){
        int[] score = {100,72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        double sum = 0;
        for(int i = 0; i < score.length; i++){
            sum += score[i];
        }

        double averageScore = sum / score.length;   // 这里用score.length可以提高健壮性，不用随着数组数量变化而改变
        System.out.println("学生平均成绩为：" + averageScore);

    }
}

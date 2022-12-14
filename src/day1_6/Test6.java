/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_6;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int[] luckNumbers = createLuckyNumber();
        int[] userNumbers = userInputNumber();
        judge(luckNumbers, userNumbers);
    }

    /**
     * 随机一组中奖号码返回(五个红色球1-33，一个蓝色球1-16)返回
     * @return
     */
    public static int[] createLuckyNumber(){
        Random random = new Random();
        boolean[] redIsOccupy = new boolean[34];  // 红色球不能重复，初始为false，如果占据则修改为true
        int[] create = new int[7];  // 存储随机产生的中奖号码
        create[6] = random.nextInt(16) + 1;  // 1 ~ 16：数组中第七个元素为蓝色球
        for(int i = 0; i < create.length - 1; i++){ // 数组前6位存储红色球
            int temp = random.nextInt(33) + 1; // 0 ~ 33
            if(!redIsOccupy[temp]){
                create[i] = temp;
            }
        }
        System.out.print("随机产生的六位数为：");
        for(int i = 0; i < create.length; i++){
            System.out.print(create[i] + " ");
        }
        System.out.println();
        return create;
    }

    /**
     * 用户输入一组双色球号码
     * @return
     */
    public static int[] userInputNumber(){
        int[] arrayInput = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入六位双色球号码：");
        for(int i = 0; i < arrayInput.length; i++){
            arrayInput[i] = sc.nextInt();
        }
        return arrayInput;
    }

    /**
     * 两个数组进行比较，判断用户是否中奖
     * @param luckNumbers
     * @param userInputNumber
     */
    public static void judge(int[] luckNumbers, int[] userInputNumber){
        for(int i = 0; i < luckNumbers.length; i++){
            if(luckNumbers[i] != userInputNumber[i]){
                System.out.println("该用户未中奖！！！");
                return;  // 结束方法；
            }
        }
        System.out.println("恭喜该用户中奖了。");
    }
}

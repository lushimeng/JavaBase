/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;

public class ArrayTraversal {
    public static void main(String[] args){
        int[] money = {16, 26, 36, 6, 100};
        int[] money1 = new int[]{16, 26, 6, 36, 100};
        int sum = 0;
        int sum1 = 0;
        for(int a: money){
            sum += a;
        }
        System.out.println("总钱数为：" + sum);


        for(int i = 0; i < money1.length; i++){
            sum1 += money1[i];
        }
        System.out.println("总钱数为：" + sum1);
    }
}

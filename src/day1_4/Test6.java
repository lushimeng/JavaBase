/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;

import java.util.Scanner;

/**
 * 有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
 * 再通过键盘录入一个整数数字。要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
 * ```
 * 请输入一个整数数字：
 * 50
 * 生成的新数组是：12 14 23 45 50 66 68 70 77 90
 * ```
 */
public class Test6 {
    public static void main(String[] args){
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数数字：");
        int number = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(number < arr[i]){  // 有序的判断依据
                for(int j = arr.length-1; j > i; j--){
                    arr[j] = arr[j-1];  // 递推往后移动
                }
                arr[i] = number;  // 第i个位置插入number
                break;
            }
        }

        // 打印数组
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

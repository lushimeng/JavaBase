/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args){
        int[] arr = {12, 23, 34, 45, 56, 67, 76, 90};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的数：");
        int n = sc.nextInt();
        System.out.println(index(arr, n));

    }
    public static int index(int[] array, int n){
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                return i;
            }
        }
        return -1;
    }

}

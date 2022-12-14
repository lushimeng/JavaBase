/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;

import java.util.Random;

//创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
public class Test3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100); // 随机赋值： 0 ~ 99
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n数组和为：" + sum);
    }
}

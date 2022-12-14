/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;

import java.util.Random;

/**
 * 请创建一个长度为6的整数数组，并为数组中的元素赋值。遍历数组，打印所有元素，元素之间用空格隔开。比如：
 * ```
 * 数组为：{1,2,3,4,5}
 * 打印结果：1 2 3 4 5
 * ```
 */
public class Test1 {
    public static void main(String[] args) {
        Random random = new Random();
        // 创建一个数组
        int[] array = new int[6];

        //对数组进行赋值操作
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100) + 1; // 随机赋值:1 ~ 100
        }

        // 打印数组
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "  ");
        }
    }
}

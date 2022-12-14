/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;

import java.util.Random;
import java.util.zip.ZipInputStream;

/**
 * 现有一个整数数组，数组中的每个元素都是[0-8]之间的数字，从数组的最大索引位置开始到最小索引位置，
 * 依次表示整数的个位、十位、百位。。。依次类推。请编写程序计算，这个数组所表示的整数值。例如：
 * 现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，从数组的最大索引位置开始到最小索引位置，依次表示整数的个位、十位、百位。。。依次类推。请编写程序计算，这个数组所表示的整数值。例如：
 *
 *         ```java
 *         数组：{2, 1, 3, 5, 4}
 *         表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。
 *         ```
 */
public class Test4 {
    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
//      System.out.println(Long.MAX_VALUE);
        Random random = new Random();
        int[] arr = new int[9];

        // 随机对数组赋值0 ~ 9
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(10);
        }

        int sum = 0;  // 整数值
        int count = 1;  // 每一次乘10
        for(int i = arr.length-1; i >= 0; i--){
            sum += arr[i] * count;
            count *= 10;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n整数为：" + sum);

    }
}

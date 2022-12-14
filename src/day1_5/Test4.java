/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;

import java.util.Scanner;

/**
 * 我们知道数学中有九九乘法表。请定义一个方法，方法的功能是打印nn乘法表。在主方法中键盘录入取值范围为[1-9]的变量n，测试方法。执行效果如下：
 * ```
 * 请输入一个1-9之间的整数：
 * 4
 * 乘法表：
 * 1×1=1
 * 1×2=2	2×2=4
 * 1×3=3	2×3=6	3×3=9
 * 1×4=4	2×4=8	3×4=12	4×4=16
 */
public class Test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-9之间的整数");
        int n = sc.nextInt();
        multiplicationTable(n);  // 调用方法

    }
    public static void multiplicationTable(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();//换行
        }
    }

}

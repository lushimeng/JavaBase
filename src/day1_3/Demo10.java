/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

/**
 * 使用for循环打印出九九乘法表。打印效果如下：
 * 1×1=1
 * 1×2=2	2×2=4
 * ...
 *
 * 1×8=8	2×8=16	3×8=24	4×8=32	5×8=40	6×8=48	7×8=56	8×8=64
 * 1×9=9	2×9=18	3×9=27	4×9=36	5×9=45	6×9=54	7×9=63	8×9=72	9*9=81
 */
public class Demo10 {
    public static void main(String[] args){
        for(int i = 1; i <= 9; i++){   // 行数
            for(int j = 1; j <= i; j++){  //列数
                int multiplication = i * j;
                System.out.print(j + "x" + i + "=" + multiplication + "\t");  // 注意j 和 i的顺序
            }
            System.out.println();
        }
    }
}

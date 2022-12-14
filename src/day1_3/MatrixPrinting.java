/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

public class MatrixPrinting {
    public static void main(String[] args){
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print("*");  // 每一行打印五个" * “
            }
            System.out.println(); // 换行
        }
    }
}

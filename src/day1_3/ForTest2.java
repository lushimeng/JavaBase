/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

public class ForTest2 {
    public static void main(String[] args){
        int sumOdd = 0, sumEven = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sumEven += i;
            }else {
                sumOdd += i;
            }
        }
        System.out.println("偶数和为：" + sumEven);
        System.out.println("奇数和为：" + sumOdd);
    }
}

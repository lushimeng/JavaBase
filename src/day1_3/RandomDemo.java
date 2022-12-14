/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args){
        Random random = new Random();
//        for(int i = 1; i <= 10; i++){
//            System.out.println(random.nextInt(10)); // 产生 0 ~ 9之间10位随机数
//        }
//        for(int i = 0; i < 100; i++){
//            System.out.println(random.nextInt(50) + 50);
//        }
        for(int i = 0; i < 100; i++){
            int temp = random.nextInt(27) + 65 ;
            if (temp == 65)
                System.out.println(temp);
            if (temp == 91)
                System.out.println(temp);
            System.out.print(temp + " ");  // 65 - 91
        }
    }
}

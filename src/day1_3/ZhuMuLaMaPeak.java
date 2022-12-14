/**
 * @Time: 2022/01/04
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: ZhuMuLaMaPeak.java
 * @Software: IDEA
 */
package day1_3;

public class ZhuMuLaMaPeak {
    public static void main(String[] args){
        double height = 0.1;
        int count = 0;
        while(height <= 8848860){
            count ++;
            height *= 2;  // 每次高度 * 2
        }
        System.out.println(count);
        int i = 0;
        while(i < 3){
            System.out.println("Hello world");
            i++;
        }
        System.out.println(i);
    }

}

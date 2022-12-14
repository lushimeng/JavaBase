/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;

public class FaceScores {
    public static void main(String[] args){
        int[] face = new int[]{15, 9000, 10000, 20000, 9500, -5};
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for(int i = 0; i < face.length; i++){
            if(face[i] > max){  // 比较获得最大值
                max = face[i];
            }
            if(face[i] < min){  // 比较获得最小值
                min = face[i];
            }
        }
        System.out.println("最大值为：" + max + ", 最小值为：" + min);
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;
//int[] faceScores = {15, 9000, 10000, 20000, 9500, -5};
public class MethodArrayMax {
    public static void main(String[] args){
        int[] faceScores = {15, 90000, 10000, 20000, 9500, -5};
        int maxNumber = arrayMax(faceScores); // 基本类型的参数传递 VS 引用类型的参数传递
        System.out.println("数组最大值为：" + maxNumber);
    }
    public static int arrayMax(int[] arr){
        if(arr.length == 0){
            return -1; // 数组为空
        }
        int max = arr[0];  // 初始规定arr[0]为最大值
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;  //返回最大值
    }
}

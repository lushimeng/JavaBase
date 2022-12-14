/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;

public class SameArray {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 6, 4};
        System.out.println("两个数组是否相等？:" + compare(arr1, arr2) );

    }
    public static boolean compare(int[] array1, int[] array2){
        if(array1.length != array2.length){  // 两个数组的长度要是不相等，则直接返回false
            return false;
        }else {
            for(int i = 0; i < array1.length; i++){
                if(array1[i] != array2[i]){   // 两个数组长度相等则判断数据位序是否相等
                    return false;
                }
            }
        }
        return true;
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;

public class BubbleSort {
    public static void main(String[] args){
        int[] array = {23,34,62,84,2,45,89,12,56};
//        for(int i = array.length-1; i >= 0; i--){
//            for(int j = i-1; j >= 0; j--){
//                if(array[i] < array[j]){
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                } // of if
//            } // of for
//        }  // of for
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } // of if
            } // of for
        }  // of for

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "  ");
        }
    }
}

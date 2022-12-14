/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;
//定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
public class Test8 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};  //奇数放在数组的左边，偶数放在数组的右边
        int low = 0, high = arr.length-1;

        int[] arrCopy = new int[arr.length]; // 新建一个数组
        int left = 0, right = arr.length - 1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){  // 偶数放在右边
                arrCopy[right] = arr[i];
                right--;
            }else {  // 奇数放在左边
                arrCopy[left] = arr[i];
                left++;
            }
        }

        for(int i = 0; i < arrCopy.length; i++){
            System.out.print(arrCopy[i] + " ");
        }

    }
}

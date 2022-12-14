/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_6;

public class Test5 {
    public static void main(String[] args){
        int[] array = new int[4];
        // 调用加密函数
        passwordEncryption(array, 1983);
        // 调用解密函数
        passwordDecryption(array);

    }

    /**
     * 对n进行加密;
     * @param array: 存储n的每一个数字
     * @param n: 要加密的数字
     */
    public static void passwordEncryption(int array[], int n){
        for(int i = 0; i < array.length; i++){  // array分别存储其个位，十位，百位，千位
            int temp = n % 10;
            array[i] = (temp + 5) % 10;
            n /= 10;
        }
        // 加密后结果
        System.out.print("加密结果为：");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }

    /**
     * 对array中的数据进行解密
     * @param array
     */
    public static void passwordDecryption(int array[]){
        for(int i = 0; i < array.length; i++){
            if(array[i] >= 5){
                array[i] = array[i] - 5;
            }else {
                array[i] = array[i] + 5;
            }
        }
        // 解密后结果
        System.out.print("解密结果为：");
        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i]);
        }
        System.out.println();
    }


}

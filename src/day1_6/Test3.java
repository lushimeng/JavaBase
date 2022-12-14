/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_6;
//数组的拷贝是什么意思？
//需要创建新数组，把原来数组的元素赋值过来。并不是把数组1的地址直接给数组2
public class Test3 {
    public static void main(String[] args){
        int[] array1 = {12, 23, 34, 45, 56, 67, 78};
        int[] array2 = new int[array1.length];
        copyArray(array1, array2);

        //打印数组1的地址和内容
        System.out.println(array1);
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }

        //打印数组2的地址和内容
        System.out.println("\n" + array2);
        for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }
    }

    /**
     * 将数组array1中的值赋值到array中。
     * @param array1
     * @param array2
     */
    public static void copyArray(int[] array1, int[] array2){
        for(int i = 0; i < array1.length; i++){
            array2[i] = array1[i];
        }

    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;

public class ArrayMemory {
    public static void main(String[] args){
        int[] array = { 12,23,34,45};
//        System.out.println(array[5]);  // 数组下标越界：ArrayIndexOutOfBoundsException
        int[] array1 = array;
        System.out.println(array);  // [I@16b98e56  二者指向同一块堆内存(new出来的都在堆中，方法和变量在栈中)
        System.out.println(array1); // [I@16b98e56

        array = null;   // array指向堆空间的指针断裂：NullPointerException
//        System.out.println(array[1]);
//        System.out.println(array);
        System.out.println(array1);  // [I@16b98e56
    }
}

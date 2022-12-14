/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;
//设计一个方法用于输出任意整型数组的内容，要求输出成如下格式：
//      “该数组内容为：[11, 22, 33, 44, 55]”
public class PrintArray {
    public static void main(String[] args){
        int[] array = new int[]{23, 34, 45, 8, 89, 90};
        // 调用打印方法
        print(array);

    }
    public static void print(int[] array){
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
//            if(i == 0){
//                System.out.print("\"该数组内容为: [" + array[i] + ", ");
//            }else if(i == (array.length - 1)){
//                System.out.print(array[i] + "]\"");
//            }else {
//                System.out.print(array[i] + ", ");
            System.out.print(i == array.length - 1 ? array[i] : array[i] + ", ");  // 高手写的代码
            }
        System.out.println("]");
        }
}

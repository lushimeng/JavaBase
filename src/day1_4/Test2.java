/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;
//现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。
public class Test2 {
    public static void main(String[] args) {
        double[] numbers = {0.9, 53.54, 75.0, 99.1, 3.14};  // 默认为double，要是float要在后面加上f
        double min = numbers[0]; // 初始默

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.printf("最小值为：" + min);
    }
}

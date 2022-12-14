/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;

import java.util.Random;

/**
 * 某公司开发部5名开发人员，要进行项目进展汇报演讲，现在采取随机排名后进行汇报。
 * 请先依次录入5名员工的工号，然后展示出一组随机的排名顺序。
 */
public class EmployeeRandom {
    public static void main(String[] args){
        // 创建键盘输入类
        Random random = new Random();
        int[] employeeNumber = new int[]{22, 33, 35, 88, 13};
        for(int i = 0; i < employeeNumber.length; i++){
            int index = random.nextInt(5);  // 随机产生 0 ~ 4索引
            int temp = employeeNumber[i];
            employeeNumber[i] = employeeNumber[index];
            employeeNumber[index] = temp;
        }

        System.out.print("员工汇报顺序：");
        for(int i = 0; i < employeeNumber.length; i++){
            System.out.print(employeeNumber[i] + "  ");
        }
    }
}

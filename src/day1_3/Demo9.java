/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

/**
 *已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。
 */
public class Demo9 {
    public static void main(String[] args){
        for(int i = 2019; i >= 1949; i -= 12){  // i -= 12：每隔12年为猪年
            if(i == 2019)
                continue;
            else
                System.out.println(i);
        }
        System.out.println("===================");
        //1.循环开始是1949 结束是2019
        for (int i = 1949; i < 2019; i++) {
            //2.如果年份和2019年的差值是12的倍数 则说明是猪年
            if( (2019 - i) % 12 == 0 ){
                //3.打印符合条件的年份
                System.out.println(i);
            }
        }
    }
}

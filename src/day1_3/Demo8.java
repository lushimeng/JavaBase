/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;
/**
 *有一个容量为10L的空水桶。
 * 水桶的上面开始往里灌水，同时下面开始往出流水。
 * 第一分钟灌水的速度是1L/min，第二分钟灌水的速度是2L/min，第三分钟灌水的速度是3L/min，
 * 以此类推。而流水的速度固定是3L/min。那么几分钟之后，水桶里能保持灌满水的状态？
 */
public class Demo8 {
    public static void main(String[] args){
        //1.定义桶中已有的水量开始是0L;
        int water = 0;
        //2.定义变量代表分钟数
        int minute = 0;
        //3.循环判断
        while(water < 10){
            //3.1每次循环给分钟数加1
            minute++;
            //3.2每分钟计算桶里的水量
            water = water + minute - 3;
            //3.3桶里的水不可能是负数
            if(water < 0){
                water = 0;
            }
        }
        //4.打印所用分钟数
        System.out.println("桶里的灌满水需要"+ minute + "分钟");
    }
}

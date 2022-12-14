/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;

/**
 * 小李用自己的钱买了十只股票，年末他看了各只股票的收益分别是
 * 10.4%,-3%,-6.2%,1.2%,-6.1%,-19%,-3.8%,0.9%,-4.5%,5.5%。请使用数组相关知识编程，帮他统计赚钱的股票和赔钱的股票分别有多少只？
 * 打印效果如下：
 * ```
 * 赚钱的股票一共有：4只
 * 赔钱的股票一共有：6只
 * ```
 */
public class Test7 {
    public static void main(String[] args){
        double[] array = new double[]{10.4, -3, -6.2, 1.2, -6.1,-19, -3.8, 0.9, -4.5, 5.5};
        int makeMoneyCount = 0, loseMoneyCount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                makeMoneyCount++;
            }else if(array[i] < 0){
                loseMoneyCount++;
            }
        }

        System.out.println("赚钱的股票一共有：" + makeMoneyCount + "只");
        System.out.println("赔钱的股票一共有：" + loseMoneyCount + "只");
    }
}

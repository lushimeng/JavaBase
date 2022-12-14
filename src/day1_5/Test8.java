/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;

import java.util.Random;

/**
 * 一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
 * 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果：（随机顺序，不一定是下面的顺序）
 * ```
 * 888元的奖金被抽出
 * 588元的奖金被抽出
 * 10000元的奖金被抽出
 * 1000元的奖金被抽出
 * 2元的奖金被抽出
 * ```
 */
public class Test8 {
    public static void main(String[] args){
        int[] money = {2, 588, 888, 1000, 10000};
        randomPrint(money);
    }
    public static void randomPrint(int[] money){
        Random random = new Random();
        boolean[] bool = new boolean[money.length];  //默认都为false，都还没有被抽出，被抽出后转化为false
        int count = 0; //记录红包被抽走了几个
        while (count != money.length){  // 直到所有红包都被抽走
            int temp = random.nextInt(5);  // 随机产生0 ~ 4
            if(!bool[temp]){  // 还没有被抽中
                count++;  // 被抽走的个数加一
                bool[temp] = true;  // 标志改为true
                System.out.println(money[temp] + "元的奖金被抽出");
            }
        }

    }

}

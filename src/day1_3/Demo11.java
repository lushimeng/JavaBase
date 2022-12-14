/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;
/**
 * 小明手中有一张10元纸币。需要到商店兑换零钱。商店只有1元纸币和5角硬币。那么请列举出所有的兑换方式。打印效果如下：
 * 换1元纸币1张，5角硬币18个
 * 换1元纸币2张，5角硬币16个
 * 换1元纸币3张，5角硬币14个
 * ...   ...
 * 换1元纸币9张，5角硬币2个
 */
public class Demo11 {
    public static void main(String[] args){
        double money = 10;
        for(int i = 0; i <= 10; i++){  // 最多10个一元
            for(int j = 0; j <= 20; j++){  // 最多20个五角
                double sum = i * 1 + j * 0.5;
                if(sum == money){  // 两个嵌套循环，相当于两个未知数一样，只不过让计算机替你去便利求解。
                    System.out.println("1元纸币" + i + "张，5角硬币" + j + "个");
                }
            }
        }
    }
}

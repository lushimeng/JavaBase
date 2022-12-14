/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

public class ForTest3 {
    public static void main(String[] args){
        int bit = 0, ten = 0, hundredth = 0;
        int count = 0;
        for(int i = 100; i <= 999; i++){
            bit = i % 10; // 获取个位数
            int temp = i / 10;
            ten = temp % 10;
            hundredth = temp / 10;
            int sum = bit * bit * bit + ten * ten * ten + hundredth * hundredth * hundredth;
            if(sum == i){
                count++;
                System.out.println(i + "是水仙花数");
                System.out.println("百位：" + hundredth + "十位：" + ten + "个位："  + bit);
            }
        }
        System.out.println("水仙花个数为：" + count);
    }
}

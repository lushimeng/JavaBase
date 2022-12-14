/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

import java.util.Scanner;

// 请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。
// 比如：Hello12345World中字母：10个，数字：5个。
public class TraversalString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str = sc.nextLine();
        System.out.println("原来的字符串：" + str);
        str = str.toLowerCase();
        System.out.println("全部转化为小写：" + str);
        str = str.toUpperCase();
        System.out.println("全部转化为大写：" + str);
        // 调用统计方法
        countEngAndNum(str);

    }

    /**
     * 统计str中拥有多少个字母和数字
     * @param str
     */
    public static void countEngAndNum(String str){
        int englishCount = 0, numberCount = 0, otherCount = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);  // 每次拿到字符串中的一个字符
            if(ch >= '0' && ch <= '9'){
                numberCount++;
            }else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                englishCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("字母个数：" + englishCount);
        System.out.println("数字个数：" + numberCount);
        System.out.println("其它个数：" + otherCount);

    }
}

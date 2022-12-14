/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_5;
/**
 * 通过键盘录入两个整数n和m。n代表行数，m代表列数。定义一个方法，方法的功能是打印n行m列的@符号。执行效果如下：
 * ```
 * 请输入行数：
 * 4
 * 请输入列数：
 * 5
 * @@@@@
 * @@@@@
 * @@@@@
 * @@@@@
 * ```
 */
public class Test3 {
    public static void main(String[] args){
        print(7, 20);
    }
    public static void print(int n, int m){
        if(n < 1 || m < 1){
            System.out.println("输入数据有误！");
            return;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

/**
 * 有一个输出语句System.out.print("@")。使用这个语句，
 * 在控制台打印出一个五行的三角形，效果如下：
 * 	@
 * 	@@
 * 	@@@
 * 	@@@@
 * 	@@@@@
 */
public class Demo7 {
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++){  // 两个嵌套循环直接解决
            for(int j = 1; j <= i; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}

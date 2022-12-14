/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

public class JavaCount1 {
    public static void main(String[] args) {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        String tar = "Java";
        // 调用方法并输出
        System.out.println(search(str, tar));
    }

    /**
     * @param str： 在哪一个字符串中进行查找
     * @param tar: 要查找的目标子串
     * @retur: 表示次数
     */
    public static int search(String str, String tar){
        // 定义统计变量表示次数
        int count = 0;
        // 定义索引变量，表示每次找到字串出现的索引
        int index = -1;

        // 定义循环，判断条件为在字符长中找到了目标字串
        while((index = str.indexOf(tar)) != -1){   // 将找到的索引赋值给变量并判断
            count++;
            // 把查找过的部分剪切掉，从找到的索引+子串长度的位置开始截取。
            str = str.substring(index + tar.length());
        }

        return count;

    }
}

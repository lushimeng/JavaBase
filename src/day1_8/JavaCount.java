/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

/**
 * 现有如下文本："Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"。
 * 请编写程序，统计该文本中"Java"一词出现的次数。
 *
 * // 查找参数字符串str在调用方法的字符串中第一次出现的索引，如果不存在，返回-1
 * public int indexOf(String str)
 * // 截取字符串，从索引beginIndex（包含）开始到字符串的结尾
 * public String substring(int beginIndex)
 */
public class JavaCount {
    public static void main(String[] args) {
        int countJava = 0;
        String str = "是高Java性能的，Java语言是跨平台的JavaJavaJava";
        String tar = "Java";  // 统计在str中tar的个数；
        while (true){  // 对于边角去可以通过调试的方式就行求解
            int index = str.indexOf(tar);
            if(index != -1){
                countJava++;
            }else {
                break;
            }
            str = str.substring(index + tar.length());  // Java长度是4，截取一个java下来就要加上4
        }
        System.out.println("字符串中Java出现的次数为：" +  countJava);
    }
}

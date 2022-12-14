/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

/**
 * public int length() 返回此字符串的长度
 * public char charAt(int index) 获取某个索引位置处的字符
 * public char[] toCharArray()： 将当前字符串转换成字符数组返回
 * public String substring(int beginIndex, int endIndex) 根据开始和结束索引进行截取，得到新的字符串（包前不包后）
 * public String substring(int beginIndex) 从传入的索引处截取，截取到末尾，得到新的字符串
 * public String replace(CharSequence target,CharSequence replacement)使用新值，将字符串中的旧值替换，得到新的字符串
 * public String[] split(String regex) 根据传入的规则切割字符串，得到字符串数组返回
 */
public class API {
    public static void main(String[] args) {
        String str = "str123abc";
      //public int length() 返回此字符串的长度
        System.out.println("数组的长度：" + str.length());  // 数组的长度：9

      //public char charAt(int index) 获取某个索引位置处的字符
        System.out.println("获取某个索引位置出的字符：" + str.charAt(0));  // 获取某个索引位置出的字符：s

      //public char[] toCharArray()： 将当前字符串转换成字符数组返回
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            System.out.print(ch[i] + " ");  // s t r 1 2 3 a b c
        }
        System.out.println();

      //public String substring(int beginIndex, int endIndex) 根据开始和结束索引进行截取，得到新的字符串（包前不包后）
        String subStr1 = str.substring(1, 5);  // index从0开始的
        System.out.println("截取的字符串strStr1: " + subStr1);  // 截取的字符串strStr1: tr12

      //public String substring(int beginIndex) 从传入的索引处截取，截取到末尾，得到新的字符串
        String subStr2 = str.substring(1);
        System.out.println("截取的字符串strSub2: " + subStr2);  // 截取的字符串strSub2: tr123abc

      //public String replace(CharSequence target,CharSequence replacement)使用新值，将字符串中的旧值替换，得到新的字符串
        String strReplace = str.replace("123", "***");
        System.out.println("替换好的字符串strReplace: " + strReplace);  // 替换好的字符串strReplace: str***abc

      //public String[] split(String regex) 根据传入的规则切割字符串，得到字符串数组返回
        String[] strArray = str.split("1");
        for(int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i]);  // {str,23abc}
        }

    }
}

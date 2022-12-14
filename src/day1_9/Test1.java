/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_9;

import java.util.ArrayList;

/**
 * 现有如下字符串元素：["aaa", "bbb", "aaa", "aaa", "ccc", "ccc"]，
 * 请将所有的元素按顺序存入ArrayList集合中，并遍历集合查看存储结果。
 */
public class Test1 {
    public static void main(String[] args){
        // ArrayList集合只能存储String类型的数据
        ArrayList<String> str = new ArrayList<String>();
        str.add("aaa");
        str.add("bbb");
        str.add("aaa");
        str.add("aaa");
        str.add("ccc");
        str.add("ccc");

        // 遍历
        for(int i = 0; i < str.size(); i++){
            System.out.println(str.get(i));
        }
    }
}

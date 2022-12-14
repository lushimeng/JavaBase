/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 使用无参构造创建ArrayList集合的对象
        ArrayList list = new ArrayList();

        // 添加数据, 这里由于ArrayList没有指定泛型，所以默认是Object类型，什么都可以进行存储。
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("Python");
        list.add(12);
        list.add(false);
        list.add('a');
        System.out.println(list);  // [Java, Python, C, C++, Java, Python]

        // 在指定位置进行添加
        list.add(0, "luShiMen");
        System.out.println(list);  // [luShiMen, Java, Python, C, C++, Java, Python]

    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

import java.util.ArrayList;

/**
 * public E get(int index) 返回指定索引处的元素
 * public int size() 返回集合中的元素的个数
 * public E remove(int index) 删除指定索引处的元素，返回被删除的元素
 * public boolean remove(Object o) 删除指定的元素，返回删除是否成功
 * public E set(int index,E element) 修改指定索引处的元素，返回被修改的元素
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("PHP");
        list.add("Go");
        list.add("C");
        list.add(0,"First");
        list.add(false);
        list.add(12);
        list.add(3.14);
        list.add('c');
        // public E get(int index) 返回指定索引处的元素
        Object e1 = list.get(1);
        System.out.println(e1);  // Java

        // public int size() 返回集合中的元素的个数
        System.out.println(list.size());  // 11

        // public E remove(int index) 删除指定索引处的元素，返回被删除的元素
        System.out.println(list);  // [First, Java, Python, C++, PHP, Go, C, false, 12, 3.14, c]
        Object e2 = list.remove(0);
        System.out.println(list);  // [Java, Python, C++, PHP, Go, C, false, 12, 3.14, c]

        // public boolean remove(Object o) 删除指定的元素，返回删除是否成功
        System.out.println(list);  // [Java, Python, C++, PHP, Go, C, false, 12, 3.14, c]
        list.remove("Java");
        System.out.println(list);  // [Python, C++, PHP, Go, C, false, 12, 3.14, c]

        // public E set(int index,E element) 修改指定索引处的元素，返回被修改的元素
        System.out.println(list);  // [Python, C++, PHP, Go, C, false, 12, 3.14, c]
        Object e3 = list.set(0, "Python_Python");
        System.out.println(e3);  // Python
        System.out.println(list);  // [Python_Python, C++, PHP, Go, C, false, 12, 3.14, c]
    }
}

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
 * 泛型概述
 * ⚫ ArrayList<E>：其实就是一个泛型类，可以在编译阶段约束集合对象只能操作某种数据类型。
 * 举例：
 * ⚫ ArrayList<String> ：此集合只能操作字符串类型的元素。 ⚫ ArrayList<Integer>：此集合只能操作整数类型的元素。
 * 注意：集合中只能存储引用类型，不支持基本数据类型。
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        // 泛型类，后面带有<E>都是泛型类，通过对E进行指定可以限制str所要存储的内容
        // <E>：其中E只能是引用类型，比如String，类，Integer, Float........,而不能是基本数据类型
        ArrayList<String> str1 = new ArrayList<>(); // E --> String: 那么str集合中稚嫩存储String类型的数据
        str1.add("Java");
        str1.add("Python");
        str1.add("C++");
        str1.add("Go");
        str1.add(0, "XXX");
//        str.add(12); // 12是Integer类型，不是
//        str.add(false);
        System.out.println(str1);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(24);
        integers.add(0, 100);
//        integers.add("java");  // 报错
        System.out.println(integers);




    }
}

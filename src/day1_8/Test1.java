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
 * 需求：
 * ⚫ 某个班级的考试在系统上进行，成绩大致为：98, 77, 66, 89, 79, 50, 100
 * ⚫ 现在需要先把成绩低于80分以下的数据去掉
 */
public class Test1 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(98);
        list.add(77);
        list.add(66);
        list.add(89);
        list.add(79);
        list.add(50);
        list.add(100);
        System.out.println(list);  // 打印ArrayList集合

        // 方法1： 从集合前面开始进行删除，要特别注意i的变化
//        for(int i = 0; i < list.size(); i++){
//            if(list.get(i) < 80){
//                list.remove(i); // list.remove(list.get(i));
//                i--;  // 删除后后面的元素会往前去，i值要保持不变
//            }
//        }

        // 方法2：从集合后面开始删除(推荐***)，这样不会漏掉元素
        for(int i = list.size() - 1; i >= 0; i--){
            if(list.get(i) < 80){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}

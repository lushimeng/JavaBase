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
 * ⚫ 某影院系统需要在后台存储上述三部电影，然后依次展示出来。
 * 分析
 * 三部电影是3个对象，定义一个电影类，定义一个集合存储电影对象。
 * 创建3个电影对象，封装相关数据，把3个对象存入到集合中去。
 * 遍历集合中的3个对象，输出相关信息。
 */
public class TestMovie {
    public static void main(String[]  args){
        ArrayList<Movie> listMovie = new ArrayList<>();
        listMovie.add(new Movie("肖申克的救赎", 9.4, "陆文轩"));
        listMovie.add(new Movie("钢铁侠", 8.7, "埃尔尔尼森"));
        listMovie.add(new Movie("绿皮车", 9.8, "乔布斯"));

        System.out.println(listMovie); //里面村的是地址[day1_8.Movie@7ef20235, day1_8.Movie@27d6c5e0, day1_8.Movie@4f3f5b24]

        for(int i = listMovie.size() - 1; i >= 0; i--){
            System.out.println("电影名称：" + listMovie.get(i).getName() +  // listMovie.get(i)只是地址，还用通过get/set方法进行获取内容
                    ", 评分：" + listMovie.get(i).getScore() +
                    ", 演员：" + listMovie.get(i).getActor());
        }
    }

}

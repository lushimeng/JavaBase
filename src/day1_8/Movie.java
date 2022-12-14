/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;

public class Movie {
    // 定义私有变量
    private String name;
    private double score;
    private String actor;

    // 提供无参构造
    public Movie(){

    }

    // 提供有参构造
    public Movie(String name, double score, String actor){
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    // setXXX/getXXX

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}

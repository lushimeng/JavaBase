/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

public class TestUser {
    public static void main(String[] args){
        // 调用无参构造器创建对象
        User user = new User();
        user.setName("卢世猛");
        user.setHeight(188);
        user.setSalary(20000);
        System.out.println(user.getName());
        System.out.println(user.getHeight());
        System.out.println(user.getSalary());

        // 调用有参构造器创建对象
        User user1 = new User("杨新宇", 165, 15000);
        System.out.println(user1.getName());
        System.out.println(user1.getHeight());
        System.out.println(user1.getSalary());


    }
}

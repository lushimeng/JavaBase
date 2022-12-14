/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

public class TestManagerAndCoder {
    public static void main(String[] args){
        // 通过调用有参构造创建Manager对象
        Manager manager = new Manager("杨新宇", 123, 15000, 6000);
        manager.work();
        // 通过调用无参构造创建Coder
        Coder coder = new Coder();
        coder.setId(125);
        coder.setName("卢世猛");
        coder.setSalary(20000);
        coder.work();

    }
}

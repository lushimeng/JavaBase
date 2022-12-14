/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

public class TestGirl {
    public static void main(String[] args){
        // 调用有参构造创建对象
        Girl girl = new Girl("杨新宇", 167.4, 96.2);
        girl.show();
        girl.cook();
        girl.wash();

        // 调用无参搞糟创建对象
        Girl girl1 = new Girl();
        girl1.setName("杨新宇");
        girl1.setHeight(167.9);
        girl1.setWeight(96);
        girl1.show();
        girl1.cook();
        girl1.wash();
    }
}

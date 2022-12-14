/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_7;

public class TestCatAndDog {
    public static void main(String[] args) {
        // 调用无参构造声明Cat对象
        Cat cat = new Cat();
        cat.setColor("花色");
        cat.setBreed("波斯猫");
        // 调用猫吃饭方法和抓老鼠方法
        cat.eat();
        cat.catchMouse();

        // 调用有参构造声明Dog对象
        Dog dog = new Dog("黑色", "藏獒");
        // 调用狗吃饭方法和看家方法
        dog.eat();
        dog.lookHome();
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_10;

public class Account {
    // 私有变量
    private String cardId;
    private String name;
    private String password;
    private double money;
    private double limitMoney;

    // 无参构造
    public Account(){

    }
    // 有参构造

    public Account(String cardId, String name, double money, double limitMoney, String password) {
        this.cardId = cardId;
        this.name = name;
        this.money = money;
        this.limitMoney = limitMoney;
        this.password = password;
    }

    //getXxx / setXxx


    public String getCard() {
        return cardId;
    }

    public void setCard(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimitMoney() {
        return limitMoney;
    }

    public void setLimitMoney(double limitMoney) {
        this.limitMoney = limitMoney;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "card='" + cardId + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", limitMoney=" + limitMoney +
                ", password=" + password +
                '}';
    }
}

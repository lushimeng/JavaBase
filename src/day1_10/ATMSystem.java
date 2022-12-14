/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        userOperateMenu();


    }

    /**
     * 登录系统，返回Account对象
     * @param list
     * @param sc
     * @return
     */
    public static void signInATMSystem(ArrayList<Account> list, Scanner sc){
        WelcomeATMSystemMenu();
        System.out.println("==================黑马银行ATM系统登录界面==================");
        // 在集合中查找是否有此cardId
        Account accountPassword = null;  // 暂存该cardId的Account对象
        while (true) {
            System.out.print("请输入您的卡号：");
            String cardId = sc.next();
            int flag = 0;  // flag = 0表示集合中存在该卡号
            for(int i = 0; i < list.size(); i++){
                Account account = list.get(i);
                if(account.getCard().equals(cardId)){
                    accountPassword = account;
                    flag = 1;  // flag = 1表示集合中存在该卡号
                }
            }
            if(flag == 1){
                break; // 集合中存在该cardId, 退出while循环
            }else {
                System.out.println("不存在该卡号");
            }
        }
        // 在集合中查找此cardId中的密码是否正确
        while (true){
            int flag = 0; // 密码不正确flag标志为0
            System.out.println("请输入您的密码：");
            String password = sc.next();
            if(accountPassword.getCard().equals(password)){
                // 密码正确
                flag = 1;
            }
            if(flag == 1){
                break; // 密码正确，跳出循环
            }else {
                System.out.println("您的密码有误，请确认！");
            }
        }
        while (true){
            userOperateMenu();
            System.out.println("你可以进行选择功能进行操作了：");
            int type = sc.nextInt();
            operateType(list, accountPassword, type, sc);
        }
    }

    public static void operateType(ArrayList<Account> list , Account account, int type, Scanner sc){
        switch (type){
            case 1:  // 查询account账户信息
                searchAccount(account);
                break;
            case 2: // 对account账户进行存款
                addMoneyToAccount(account, sc);
                break;
            case 3:   // 对account账户进行取款
                getMoneyFromAccount(account, sc);
                break;
            case 4:  // 对account账户进行转账
                break;
            case 5:  // 对account账户进行修改密码
                changePassword(account, sc);
                break;
            case 6:// 退出账户

                break;
            case 7:  // 注销账户
                deleteAccount(list, account, sc);
                break;
        }
    }

    /**
     * 删除Account账户
     * @param list
     * @param account
     */
    private static void deleteAccount(ArrayList<Account> list, Account account, Scanner sc) {
        System.out.println("===============欢迎您进入黑马银行用户注销界面===============");
        System.out.println("请您输入账户密码：");
        String password = sc.next();
        if(password.equals(account.getPassword())){
            list.remove(account); // 删除元素
            System.out.println("注销成功！");
        }else {
            System.out.println("注销失败！");
        }

    }

    /**
     * 修改账户密码
     * @param account
     * @param sc
     */
    private static void changePassword(Account account, Scanner sc) {
        System.out.println("===============欢迎您进入黑马银行用户密码修改界面===============");
        System.out.println("请您输入当前账户密码：");
        String password = sc.next();
        if(password.equals(account.getPassword())){
            while (true) {
                System.out.println("请您输入新的密码：");
                String newPassword = sc.next();
                System.out.println("请您确认下新密码：");
                String identifyNewPassword = sc.next();
                if (newPassword.equals(identifyNewPassword)){
                    account.setName(newPassword);  // 设置新的密码
                    System.out.println("密码修改成功，请重新登录");
                    break;
                }else {
                    System.out.println("两次密码不一致！");
                }
            }
        }else {
            System.out.println("当前密码不正确！");
        }
        WelcomeATMSystemMenu();
    }

    /**
     * 对account账户进行取款
     * @param account
     */
    private static void getMoneyFromAccount(Account account, Scanner sc) {
        System.out.println("===============欢迎您进入黑马银行用户取款界面===============");
        if(account.getMoney() < 100){
            System.out.println("账户余额不足100元，先去存钱吧");
            return; // 结束方法
        }
        while (true){
            System.out.println("请您输入取款的金额");
            double money = sc.nextDouble();
            if(money > account.getMoney()){
                System.out.println("您的账户余额不足！");
            }else {
                if(money > account.getLimitMoney()){
                    System.out.println("您当前取款超过了当次限额！");
                }else {
                    account.setMoney(account.getMoney() - money);  // 设置新的金额
                    System.out.println("您已经取款成功！");
                    break;  // 结束方法
                }
            }
        }
    }

    /**
     * 对account账户存款
     * @param account
     */
    private static void addMoneyToAccount(Account account, Scanner sc) {
        System.out.println("===============欢迎您进入黑马银行用户存款界面===============");
        System.out.println("请您输入存款的金额");
        double money = sc.nextDouble();
        double beforeMoney = account.getMoney();
        double afterMoney = beforeMoney + money;
        account.setMoney(afterMoney);  // 设置新的钱数
        System.out.println("您已经存款成功！");
    }

    /**
     * 查找account信息
     * @param account
     */
    private static void searchAccount(Account account) {
        System.out.println("===============欢迎您进入黑马银行用户详情界面===============");
        System.out.println("您的账户信息如下：");
        System.out.println("卡号：" + account.getCard());
        System.out.println("姓名：" + account.getName());
        System.out.println("余额：" + account.getMoney());
        System.out.println("当次取现余额：" + account.getLimitMoney());

    }



    /**
     * 黑马银行用户操作界面
     */
    public static void userOperateMenu(){
        System.out.println("===============欢迎您进入黑马银行用户操作界面===============");
        System.out.println("1.查询：");
        System.out.println("2.存款：");
        System.out.println("3.取款：");
        System.out.println("4.转账：");
        System.out.println("5.修改密码：");
        System.out.println("6.退出：");
        System.out.println("7.注销当前用户；");
    }

    /**
     * 进入黑马银行ATM系统
     */
    public static void WelcomeATMSystemMenu(){
        System.out.println("1.登录账户");
        System.out.println("2.注册开户");
    }

    /**
     * 开户功能方法
     * @param list
     */
    public static void register(ArrayList<Account> list, Scanner sc){
        System.out.println("===============欢迎您进入黑马银行用户办卡界面===============");
        // 输入姓名
        System.out.println("请输入你的姓名：");
        String name = sc.next();
        // 输入密码
        String password = null;
        String identifyPassword = null;
        while (true){
            System.out.println("请输入你的密码：");
            password = sc.next();
            System.out.println("请您再次确认密码：");
            identifyPassword = sc.next();
            if(!password.equals(identifyPassword)){
                System.out.println("两次输入的密码不一致，请重新输入！");
            }else{
                System.out.println("密码设置成功！");
                break;
            }
        }
        // 输入取现额度
        System.out.println("请设置当前取现额度：");
        double limitMoney = sc.nextDouble();

        // 随机产生卡号
        String cardId = null;
        while (true){
            int flag = 0;  // cardId如果没有重复，flag标记就一直为0
            cardId = createCardiD();
            for(int i = 0; i < list.size(); i++){
                Account account = list.get(i);
                if(account.getCard().equals(cardId)){  // 集合中已经存在该Id，则把flag标记为1
                    flag = 1;
                }
            }
            if(flag == 0){  // 集合中不存在相同的cardId则此Id可以使用，直接跳出循环
                break;
            }
        }

        // 利用空参构造声明Account对象,把用户的信息封装成Account对象
        Account account = new Account();
        account.setCard(cardId);
        account.setName(name);
        account.setLimitMoney(limitMoney);
        account.setPassword(password);

        // 把该account对象加入到集合中
        list.add(account);

        System.out.println(name + "贵宾，你已经开卡成功，您的卡号是：" + cardId);

    }

    /**
     * 开户的卡号是系统自动生成的8位数字
     * @return
     */
    public static String createCardiD(){
        Random random = new Random();
        String cardId = "";
        for(int i = 0; i < 8; i++){
            cardId += random.nextInt(10);  // 随机产生8位：0~9
        }

        return cardId;
    }


}

















































































































































































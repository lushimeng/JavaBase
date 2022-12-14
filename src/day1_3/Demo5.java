/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_3;

import java.util.Scanner;
/**
 * 也就是说税前工资扣除三险一金（三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。
 * 如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：
 * 	0 ~ 3000元的部分，交税3%
 * 	3000 ~ 12000元的部分，交税10%
 * 	12000 ~ 25000的部分 ， 交税20%
 * 	25000 ~ 35000的部分，交税25%
 * 	35000 ~ 55000的部分，交税30%
 *	55000 ~ 80000的部分，交税35%
 * 	超过80000的部分，交税45%
 * 比如：黑马某学员入职一家企业后，税前工资是15000，则他每月该交个税的部分是15000-1500-5000=8500元，个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。
 * 请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少
 */
public class Demo5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的税前工资：");
        //2.键盘录入税前工资
        int money = sc.nextInt();
        //3.计算应纳税部分的工资
        double before = money - (money*0.1) - 5000;
        //4.定义个税变量
        double shui = 0;
        //5.按照梯度范围计算个税数值
        if(before > 0 && before <=3000){
            shui = before * 0.03;
        }else if(before > 3000 && before <=12000){
            shui = 3000*0.03 + (before-3000) * 0.1;
        }else if(before > 12000 && before <=25000){
            shui = 3000*0.03 + 9000*0.1 +  (before-12000)*0.2;
        }else if(before > 25000 && before <=35000){
            shui = 3000*0.03 + 9000*0.1 + 13000*0.2 + (before-25000)*0.25;
        }else if(before > 35000 && before <=55000){
            shui = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + (before-35000)*0.3;
        }else if(before > 55000 && before <=80000){
            shui = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + (before-55000)*0.35;
        }else if(before > 80000){
            shui = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + 25000*0.35 + (before-80000)*0.45;
        }
        //6.计算税后工资
        double after = money - (money*0.1) - shui;
        //7.打印个税和税后工资
        System.out.println("个人所得税" + shui + "元");
        System.out.println("税后工资" + after + "元");
    }

}

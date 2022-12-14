/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_6;
// 判读101 ~ 200之间有多少素数，并输出所有素数
public class Test1 {
    public static void main(String[] args){
        findSuShu();
    }

    public static void findSuShu(){
        for(int i = 101; i <= 200; i++ ){
            int flag = 0;  // 初始flag标志为：0
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    flag = 1; // 不是素数时把flag标志写为：1
                    break;
                }
            }
            if(flag == 0){  // 如果标志flag仍为0说明i % j != 0
                System.out.println(i + "为素数。");
            }
        }
    }


}

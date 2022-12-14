/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_9;
import java.util.ArrayList;
/**
 * 姓名：张三，工资：3000
 * 姓名：李四，工资：3500
 * 姓名：王五，工资：4000
 * 姓名：赵六，工资：4500
 * 姓名：田七，工资：5000
 *
 * 先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作：
 * 1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
 * 2、判断是否有姓名为“赵六”的员工，如果有，将其删除
 * 3、给姓名为“田七”的员工，涨500工资
 */
public class TestStaff {
    public static void main(String[] args) {
        // 声明集合对象
        ArrayList<Staff> list = new ArrayList<>();
        // 添加数据
        list.add(new Staff("张三", 3000));
        list.add(new Staff("李四", 3500));
        list.add(new Staff("王五", 4000));
        list.add(new Staff("赵六", 4500));
        list.add(new Staff("田七", 5000));
        for(int i = 0; i < list.size(); i++){
            System.out.println("姓名：" + list.get(i).getName() +
                    ", 工资：" + list.get(i).getSalary());
        }
        System.out.println("====================================================");
        // 判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
        String oldName = "王五";
        String newName = "王小五";
        Staff staff = changeName(list, oldName, newName);
        if(staff != null){
            System.out.println("姓名修改成功：" + oldName + " 修改为 " + newName);
            System.out.println("姓名：" + staff.getName() +
                    ", 工资：" + staff.getSalary());
        }else {
            System.out.println("查无此人！");
        }

        System.out.println("====================================================");
        // 判断是否有姓名为“赵六”的员工，如果有，将其删除
        String name2 = "赵六";
        boolean bool = deleteStaff(list, name2);
        if(bool){
            System.out.println(name2 + "员工信息删除成功！");
            System.out.println("删除后员工表信息：");
            printArrayList(list);
        }else {
            System.out.println("查无此人！");
        }
        System.out.println("====================================================");
        // 给姓名为“田七”的员工，涨500工资
        String name3 = "田七";
        int money = 500;
        Staff staff1 = increaseSalary(list, name3, money);
        if(staff1 != null){
            System.out.println(name3 + "员工涨工资成功，涨工资后信息如下：");
            System.out.println("姓名：" + staff1.getName() +
                    ", 工资：" + staff1.getSalary());
        }else {
            System.out.println("查无此人！");
        }
    }

    /**
     * 给集合中名字为name的员工增加工资money
     * @param list
     * @param name
     * @param money
     * @return
     */
    public static Staff increaseSalary(ArrayList<Staff> list, String name, int money){
        for(int i = 0; i < list.size(); i++){
            Staff staff = list.get(i);
            if(staff.getName().equals(name)){
                int beforeMoney = staff.getSalary();
                int afterMoney = beforeMoney + 500;
                staff.setSalary(afterMoney);  // 利用set方法设置新的钱数
                return staff;
            }
        }
        return null;
    }
    public static void printArrayList(ArrayList<Staff> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println("姓名：" + list.get(i).getName() +
                    ", 工资：" + list.get(i).getSalary());
        }
    }

    /**
     * 在集合中查找是否有oldName,如果有返回把其修改为newName并返回该对象,无返回null
     * @param list
     * @param oldName
     * @param newName
     * @return
     */
    public static Staff changeName(ArrayList<Staff> list, String oldName, String newName){
        for(int i = 0; i < list.size(); i++){
            Staff staff = list.get(i);
            if(staff.getName() == oldName){
                staff.setName(newName);  // 利用set方法设置新的名字
                return staff;
            }
        }
        return null; // 查无此人！
    }

    /**
     * 删除集合中名字为name的成员信息；产出成功返回true,反之返回false
     * @param list
     * @param name
     * @return
     */
    public static boolean deleteStaff(ArrayList<Staff> list, String name){
        for(int i = list.size() - 1; i >= 0; i--){
            Staff staff = list.get(i);
            if(staff.getName().equals(name)){
                list.remove(i);
                return true;
            }
        }
        return false;
    }
}

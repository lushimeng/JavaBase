/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_9;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 利用面向对象的思想设计一个图书管理系统。图书的属性有：编号，书名，作者，价格。要求提供如下功能：
 * 1、提供操作菜单，可以选择要进行的操作。
 * 2、可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。 -- addBookContent
 * 3、可以查询图书，显示所有图书信息，然后返回到菜单。  -- showAllBookInformation
 * 4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。 -- searchByBookName
 * 5、可以删除图书，通过编号删除，删除成功后，返回到菜单。 -- deleteBookByID
 * 6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。 -- changeBookContent
 * 7、可以退出系统，结束程序运行。-- exit
 */
public class BookManagerSystem {

    public static void main(String[] args){
        // 创建键盘输入类
        Scanner sc = new Scanner(System.in);
        // 声明Book集合
        ArrayList<Book> listBook = new ArrayList<>();

        OUT:   // exit指令推出
        while (true) {
            menu();  // 打印菜单信息
            System.out.print("请输入操作指令：");
            String inputType = sc.next();
            switch(inputType){
                case "add":  // 添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。-- addBookContent
                    addBookContent(listBook, sc);
                    break;
                case "show":  // 显示所有图书信息，然后返回到菜单。  -- showAllBookInformation
                    showAllBookInformation(listBook);
                    break;
                case "search":  // 根据书名，查询单本图书信息，显示信息后，返回到菜单。 -- searchByBookName
                    searchByBookName(listBook, sc);
                    break;
                case "delete":  // 删除图书，通过编号删除，删除成功后，返回到菜单。 -- deleteBookByID
                    deleteBookByID(listBook, sc);
                    break;
                case "change":  // 修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。 -- changeBookContent
                    changeBookContentByID(listBook, sc);
                    break;
                case "exit":
                    break OUT;  // 跳出双层循环
                default:
                    System.out.println("输入操作类型有误！");
            }
        }

    }

    private static void changeBookContentByID(ArrayList<Book> listBook, Scanner sc) {
        System.out.print("请你输入要修改图书内容的id:");
        int id = sc.nextInt();
        for(int i = 0; i < listBook.size(); i++){
            Book book = listBook.get(i);
            if(book.getId() == id){
                System.out.print("是否要修改书名？");
                boolean bookNameChange = sc.nextBoolean();
                if (bookNameChange){
                    System.out.println("请输入新的书名：");
                    String newBookName = sc.next();
                    book.setBookName(newBookName);
                }

                System.out.print("是否要修改作者名？");
                boolean authorNameChange = sc.nextBoolean();
                if (authorNameChange){
                    System.out.print("请输入新的作者名：");
                    String newAuthorName = sc.next();
                    book.setAuthor(newAuthorName);
                }

                System.out.print("是否要修改书本价格？");
                boolean bookPriceChange = sc.nextBoolean();
                if (bookPriceChange){
                    System.out.print("请输入新的书本价格：");
                    double newBookPrice = sc.nextDouble();
                    book.setPrice(newBookPrice);
                }
                System.out.println("修改成功，修改后信息如下：");
                System.out.println("书本编号：" + book.getId() +
                        ", 书名：" + book.getBookName() +
                        ", 作者：" + book.getAuthor() +
                        " 价格：" + book.getPrice() + "已经被成功修改！");

                return;  // 结束方法
            }
        }
        System.out.println("图书编号中不存在该编号！");
    }

    /**
     * 根据ID输出图书
     * @param listBook
     */
    private static void deleteBookByID(ArrayList<Book> listBook, Scanner sc) {
        System.out.print("请你输入想要删除的图书编号：");
        int id = sc.nextInt();
        for(int i = listBook.size() - 1; i >= 0; i--){
            Book book = listBook.get(i);
            if(book.getId() == id){
                System.out.println("书本编号：" + book.getId() +
                        ", 书名：" + book.getBookName() +
                        ", 作者：" + book.getAuthor() +
                        " 价格：" + book.getPrice() + "已经被成功删除！");
                listBook.remove(i);  // 移除该元素
                return; // 结束方法
            }
        }
        System.out.println("不存在书本编号" + id +", 删除失败");
    }

    /**
     * 根据书名查找图书
     * @param listBook
     */
    private static void searchByBookName(ArrayList<Book> listBook, Scanner sc) {
        System.out.print("请输入书要查找的书名：");
        String bookName = sc.next();
        for(int i = 0; i < listBook.size(); i++){
            Book book = listBook.get(i);  // 依次获取书集合中的对象
            if(book.getBookName().equals(bookName)){
                System.out.println("查找成功，书本信息如下：");
                System.out.println("书本编号：" + book.getId() +
                        ", 书名：" + book.getBookName() +
                        ", 作者：" + book.getAuthor() +
                        " 价格：" + book.getPrice());
                return; // 结束方法
            }
        }
        System.out.println("查无此书！");

    }

    /**
     * 展示Book集合中所有书本信息；
     * @param listBook
     */
    private static void showAllBookInformation(ArrayList<Book> listBook) {
        if (listBook == null || listBook.size() == 0) {
            System.out.println("尚无图书信息");
            return;
        }
        for(int i = 0; i < listBook.size(); i++){
            Book book = listBook.get(i);  // 获取的是Book对象，是一个地址
            System.out.println("书本编号：" + book.getId() +
                    ", 书名：" + book.getBookName() +
                    ", 作者：" + book.getAuthor() +
                    " 价格：" + book.getPrice());
        }
        System.out.println("书本信息展示成功！");

    }

    /**
     * 在Book集合中添加图书以及图书的信息；
     * @param listBook
     * @param sc
     */
    private static void addBookContent(ArrayList<Book> listBook, Scanner sc) {
        System.out.print("请输入图书的编号：");
        int id = sc.nextInt();
        // 保证id唯一
        for(int i = 0; i < listBook.size(); i++){
            if(id == listBook.get(i).getId()){
                System.out.println("书本编号id输入错误: 书本ID在管理系统中已经存在!");
                return; // 结束方法
            }
        }
        System.out.print("请输入书的名字：");
        String bookName = sc.next();
        System.out.print("请输入作者名称：");
        String author = sc.next();
        System.out.print("请输入图书的价格：");
        double price = sc.nextDouble();

        // 创建通过有参构造创建book对象
        Book book = new Book(id, bookName, author, price);

        // 把创建的book对象加入到book集合中
        listBook.add(book);
        System.out.println("添加成功！");
    }

    /**
     * 菜单信息
     */
    public static void menu(){
        System.out.println("=======================欢迎来到图书管理系统=======================");
        System.out.println("|输入add：添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。   |");
        System.out.println("|输入show：可以查询图书，显示所有图书信息，然后返回到菜单。           |");
        System.out.println("|输入search：根据书名，查询单本图书信息，显示信息后，返回到菜单。     |");
        System.out.println("|输入delete：删除图书，通过编号删除，删除成功后，返回到菜单。         |");
        System.out.println("|输入change：修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。|");
        System.out.println("|输入exit：退出系统，结束程序运行。                                |");
        System.out.println("=================================================================");

    }
}

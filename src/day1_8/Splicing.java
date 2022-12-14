/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_8;
/**
 * 定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
 * 要求：
 * 1、如果传递的参数为空，返回null
 * 	2、如果传递的数组元素个数为0，返回[]
 * 	3、如果数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
 */
public class Splicing {
    public static void main(String[] args){
        int[] array1 = null;
        System.out.println(arrayToString(array1));
        System.out.println(arrayToString1(array1));
        int[] array2 = new int[]{};  // 元素个数为0
        System.out.println(arrayToString(array2));
        System.out.println(arrayToString1(array2));
        int[] array3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(arrayToString(array3));
        System.out.println(arrayToString1(array3));

    }
    public static String arrayToString(int[] array){
        // 传递的参数为空
        if(array == null){
            return null;
        }

        // 传递的数组元素个数为0
        if(array.length == 0){
            return "[]";
        }

        String splitString = "";
        splitString += "[";
        for(int i = 0; i < array.length; i++){
            if(i == array.length -1){
                splitString += array[i] + "]";  // 字符长拼接
            }else {
                splitString += array[i] + ", ";
            }
        }
        return splitString;
    }

    public static String arrayToString1(int[] arr){
        // 健壮性判断
        if(arr == null){
            return null;
        }
        // 在方法中用StringBuilder按照要求进行拼接，并把结果转化成String返回
        StringBuilder sb = new StringBuilder();  // 引用空构造函数创建对象
        sb.append('['); // 调用StringBuilder类中的append方法
        for(int i = 0; i < arr.length; i++){
            // 拼接元素
            sb.append(arr[i]);
            // 如果不是最后一个元素，再拼接逗号和空格
            if(i != arr.length -1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

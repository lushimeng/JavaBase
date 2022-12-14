/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package day1_4;

/**
 * 静态数组
 * 数据类型[]  数组名 = { 元素1，元素2 ，元素3，… };  int[] ages = {12, 24, 36, 48, 60};
 * double[] scores = {89.9, 99.5, 59.5};
 * 完整格式： 数据类型[]  数组名 = new 数据类型[]{ 元素1，元素2 ，元素3… }; int[] ages = new int[]{12, 24, 36, 48, 60};
 *
 * 动态数组：
 * 定义数组的时候只确定元素的类型和数组的长度，之后再存入具体数据。
 * 数据类型[]  数组名 = new 数据类型[长度];  int[] arr = new int[3];
 *
 * 二者区别：
 * 当前已经知道存入的元素值，用静态初始化。
 * 当前还不清楚要存入哪些数据，用动态初始化。
 */
public class Array {
    public static void main(String[] args){
        //静态数组---已经进行初始化赋值操作，数据长度固定，内容可以后面修改
        int[] array1 = new int[]{1,2,3,4};
        System.out.println(array1[1]);
        System.out.println(array1.length);
        System.out.println("=================");
        // 动态数组---之规定数组的长度，数组内容还未填充进去
        Character[] character = new Character[10];
        String[] str = new String[10];
        Boolean[] booleans = new Boolean[10];
        Byte[] bytes = new Byte[10];
        Short[] shorts = new Short[10];
        Integer[] ints = new Integer[10];
        Long[] longs = new Long[10];
        Float[] floats = new Float[10];
        Double[] doubles = new Double[10];
        System.out.println("==================");
        boolean[] booleans1 = new boolean[10];
        char[] chars = new char[10];
        byte[] bytes1 = new byte[10];
        short[] shorts1 = new short[10];
        int[] ints1 = new int[10];
        long[] longs1 = new long[10];
        float[] floats1 = new float[10];
        double[] doubles1 = new double[10];


    }
}

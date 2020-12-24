package arrayDemo;

import java.util.Arrays;

/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作

public static String toString(数组)：将参数数组变成字符串（按照默认格式:[元素1，元素2，元素3...]）
public static void sort (数组)：按照默认升序对数组的元素进行排序

备注：如果是数值，sort默认按照升序从小到大
     如果是字符串，sort漠然按照字母升序
     如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。
 */
public class ArraysDemo {

    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String intstr = Arrays.toString(intArray);
        System.out.println(intstr);

        int[] array1 = {2,1,5,19,44,2,3};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"aaa","ccc","sss","bbb"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}

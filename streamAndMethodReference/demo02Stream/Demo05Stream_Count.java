package demo02Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    count：用于统计Stream流中元素的个数
    Long count();
    count方法是一个终结方法，返回值是一个Long类型的整数
    所以不能再继续调用Stream流中的其他方法
 */
public class Demo05Stream_Count {
    public static void main(String[] args) {
        //获取了一个Stream流
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }
}

package iteratorDemo;
/*
    增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
    Collection<E>extends Iterable<E>:所有的单列集合都可以使用增强for

    增强for循环：用来遍历集合和数组

    格式：
        for（集合/数组的数据类型  变量名：集合名/数组名）{
         sout(变量名);
        }
 */

import java.util.ArrayList;

public class Demo02Foreach {

    public static void main(String[] args) {
        demo01();

        demo02();

    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        for(String b : list){
            System.out.println(b);
        }
    }

    //使用增北京尚学堂java300集全套链接：https://pan.baidu.com/s/12i2JDF1lyPe5AaSJyM7YWg
    //提取码：u6wu强for循环遍历数组
    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for (int a: arr){
            System.out.println(a);
        }
    }
}

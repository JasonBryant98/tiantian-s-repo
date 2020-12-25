package company.arrayListDemo;

import java.util.ArrayList;

/*
常用方法

public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致

public E get (int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。

public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值是删除的元素

public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数。

 */
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        System.out.println(list);

        //向集合中添加元素：add
        list.add("Jason");
        list.add("Alice");
        System.out.println(list);

        String name = list.get(1);
        System.out.println(name);

        String whoRemoved = list.remove(1);
        System.out.println("被删除的人："+whoRemoved);
        System.out.println(list);
        int length = list.size();
        System.out.println(length);



    }

}

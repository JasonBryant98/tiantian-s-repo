package listDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
     java.util.List接口 extends Collection接口
     List接口的特点：
           1.有序的集合，存储元素和取出元素的顺序是一致的（存储123  取出123）
           2.有索引，包含了一些带索引的方法
           3.允许存储重复的元素

     List接口中带索引的方法（特有）
     public void add(int index, E element) 将指定的元素插入此列表中的指定位置（可选操作）。
     public  E get(int index) 返回此列表中指定位置的元素。
     public  E remove(int index) 删除该列表中指定位置的元素（可选操作）。
     public  E set(int index, E element) 用指定的元素（可选操作）替换此列表中指定位置的元素。
     注意：
          操作索引的时候，一定要放置索引越界异常
 */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合对象，多态
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list);

        //在c和d之间添加一个it
        list.add(3,"it");
        System.out.println(list);

        //移除c元素
        String remove = list.remove(2);
        System.out.println(remove);
        System.out.println(list);

        //用指定的元素（可选操作）替换此列表中指定位置的元素。
        list.set(4,"A");
        System.out.println(list);

        //List集合遍历的三种方式
        //使用普通的for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------------");

        //使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);

        }

        System.out.println("---------------------");
        //增强for循环
        for (String s : list) {
            System.out.println(s);
        }

    }
}

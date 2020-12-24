package linkedListDemo;

import java.util.LinkedList;

/*
     java.util.LinkedList集合  implements List接口
     LinkedList集合的特点：
           1.底层是一个链表结构：查询慢，增删快
           2，里面包含了大量操作首尾元素的方法
           注意：使用LinkedList集合特有的方法，不能使用多态
 */
public class Demo01LinkedList {

    public static void main(String[] args) {
        show01();

        System.out.println("--------------------");

        show02();

        System.out.println("--------------------");
        
        show03();
    }

    private static void show03() {
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法在集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");

//        System.out.println(linked.removeFirst());
        System.out.println(linked.pop());
        System.out.println(linked);

        System.out.println(linked.removeLast());
        System.out.println(linked);
    }

    private static void show02() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法在集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        String first = linked.getFirst();
        System.out.println(first);
        String last = linked.getLast();
        System.out.println(last);


    }

    private static void show01() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法在集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println(linked);

        //插入开头
        linked.addFirst("www");
        linked.push("www"); //两个方法结果相同
        System.out.println(linked);

        //addLast
        linked.addLast("com");
        System.out.println(linked);
    }
}

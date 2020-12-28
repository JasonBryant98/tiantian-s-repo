package collectionDemo2;

import java.util.Collection;
import java.util.HashSet;

/*
   java.util.Collection接口
       所有单列集合的最顶层的接口，里边定义了所有单列集合共性的方法
       任意的单列集合都可以使用Collecion接口中的方法
 */
public class Demo01Collection2 {

    public static void main(String[] args) {
        //创建集合对象，可以使用多态
//        Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<>();
        System.out.println(coll);//没有输出地址，重写了toString方法
        /*
             public boolean add(E e):
             把指定对象添加到当前集合中，返回值是一个boolean值
             一般都返回ture，可以不用接收
         */
        coll.add("abc");
        coll.add("小甜甜");
        coll.add("张三");
        coll.add("李四");
        System.out.println(coll);

        /*
           public boolean remobe(E e):
           把给定的对象在当前集合当中删除，返回值是一个boolean值
           集合中存在元素，删除元素，返回ture，集合中不存在元素，删除失败，返回false
         */
        coll.remove("张三");
        System.out.println(coll);

        /*
           public boolean contains(E e):判断当前集合中是否包含给定的对象
           包含返回ture
           不包含返回false
         */
        boolean b4 = coll.contains("abc");
        System.out.println(b4);
        boolean b5 = coll.contains("abcde");
        System.out.println(b5);

        /*
           public boolean isEmpty():判断当前集合是否为空
         */
        boolean b6 = coll.isEmpty();
        System.out.println("b6:"+b6);


        /*
            public int size():返回集合中元素的个数。
         */
        int b7 = coll.size();
        System.out.println("集合的长度："+b7);

        /*
           public  Object[] toArray():把集合中的元素，存储到数组中。
         */
        Object[] arr = coll.toArray();
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*
           public void clear():清空集合所有的元素，但是不删除集合，集合还存在
         */
        coll.clear();
        System.out.println(coll);





    }




}

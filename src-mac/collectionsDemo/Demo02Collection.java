package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

/*
    注意：
        sort(List<T> list)使用前提
        被排序的集合里边存储的元素，必须实现Comparable接口，重写接口中的方法compareTo定义排序的规则
        Comparable接口的排序规则：
            自己（this）-参数：升序
 */

public class Demo02Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01,1,2,3,8,10,9,4,4,5,6);
        System.out.println(list01);

        Collections.sort(list01);//默认升序
        System.out.println(list01);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张三",19));
        list03.add(new Person("李四",20));
        list03.add(new Person("王五",30));
        list03.add(new Person("赵六",25));
        System.out.println(list03);
        Collections.sort(list03);
        System.out.println(list03);







    }

}

package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加多个元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);

        Collections.addAll(list,"a","b","c","d","e");

        Collections.shuffle(list);

        System.out.println(list);

    }
}

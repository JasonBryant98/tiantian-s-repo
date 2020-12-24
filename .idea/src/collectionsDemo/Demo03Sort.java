package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
   Comparator:相当于找一个第三方的裁判，比较两个
 */
public class Demo03Sort {

    public static void main(String[] args) {

        ArrayList<Integer> list01 =  new ArrayList<>();
        list01.add(1);
        list01.add(4);
        list01.add(3);
        list01.add(2);
//        System.out.println(list01);

        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2; //升序排序
            }
        });

        System.out.println(list01);


    }
}

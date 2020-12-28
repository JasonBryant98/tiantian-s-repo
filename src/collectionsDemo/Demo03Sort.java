package collectionsDemo;

import java.lang.reflect.Array;
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
        System.out.println(list01);

        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2; //升序排序
            }
        });

        System.out.println(list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("a迪丽热巴",26));
        list02.add(new Student("b古力娜扎",26));
        list02.add(new Student("马尔扎哈",22));
        list02.add(new Student("杨幂",30));

        System.out.println(list02);


//        Collections.sort(list02, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //按年龄升序排序
//                return o1.getAge() - o2.getAge();
//            }
//        });

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按年龄升序排序
                int result =  o1.getAge() - o2.getAge();
                //如果两个人年龄相同，在使用姓名的首字比较
                if(result == 0){
                    result = o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }

        });

        System.out.println(list02);


    }
}

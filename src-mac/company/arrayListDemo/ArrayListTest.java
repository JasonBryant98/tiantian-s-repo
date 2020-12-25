package company.arrayListDemo;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后筛选器中的偶数元素，放到小集合中/
要求使用自定义的方法来实现筛选。
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list1.add(r.nextInt(100));
        }
        System.out.println("大集合的内容:" + list1);

        selectDouble(list1);
    }

    public static void selectDouble(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list2.add(list.get(i));
            }
        }
        System.out.println("小集合的个数：" + list2.size());
        System.out.println("小集合的内容：" + list2);
    }


}
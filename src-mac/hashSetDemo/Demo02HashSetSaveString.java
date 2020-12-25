package hashSetDemo;

import java.util.HashSet;

/*
    Set集合不允许存储重复元素的原理
 */
public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("bcd");

        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
        //哈希表：数组+链表/红黑树
        //Set集合在调用add方法的时候，add方法会调用元素的hashCode方法和equals方法，判断元素是否重复


    }
}

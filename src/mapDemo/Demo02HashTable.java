package mapDemo;

import java.util.HashMap;
import java.util.Hashtable;

/*
    java.util.Hashtable<K,V>集合  implements Map<K,V>接口

    Hashtable：底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
    HashMap：底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快

    HashMap集合：可以存储null值，null键
    Hashtable集合：不可以存储null值，null键

    Hashtable和Vector集合一样，资jdk1.2之后被更先进的集合（HashMap，ArrayList）取代了
    Hashtable的子类Properties依然活跃在历史的舞台
    Properties集合是一个唯一和IO流相结合的集合
 */
public class Demo02HashTable {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put(null,null);
        map.put("a",null);
        System.out.println(map);

        System.out.println("----------------");

        Hashtable<String,String> table = new Hashtable<>();
//        table.put(null,"a"); //不能存null键和值

    }
}

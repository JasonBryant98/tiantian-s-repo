package mapDemo;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<K,V>集合
    Map集合的特点：
           1.Map集合是一个双列集合，一个元素包含两个值。（一个key，一个value）
           2.Map集合中的元素，key和value的数据类型可以相同，也可以不同
           3.Map集合中的元素，key是不允许重复的，value可以重复
           4.Map集合中的元素，key和value是一一对应的
           Map是一个双列集合

     java.util.HashMap<K,V>集合 implements Map<K,V>接口
     HashMap集合的特点：
            1.HashMap集合底层是哈希表：查询的速度特别快
               JDK1.8之前：数组+单向链表
               JDK1.8之后：数组+单向链表/红黑树（链表的长度超过8）：提高查询的速度
            2.HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致
      java.util.LinkedHashMap<K,V>集合 extends HashMap<K,V>集合
      LinkedHashMap的特点：
            1.LinkedHashMap集合底层是哈希表+链表（保证迭代的顺序 ）
            2.LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的
 */
public class Demo01Map {

    public static void main(String[] args) {
        show01();

        show02();

        show03();

        show04();
    }

    /*
       boolean containsKey(Object key) 如果此映射包含指定键的映射，则返回 true 。
     */
    private static void show04() {
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("赵丽颖",168);
        map2.put("杨颖",165);
        map2.put("林志玲",178);

        boolean b1 = map2.containsKey("赵丽颖");
        System.out.println(b1);
        boolean b2 = map2.containsKey("zhao");
        System.out.println(b2);

    }

    /*
       public V get(Object key) 返回指定键映射到的值，如果此映射不包含该键的映射，则返回 null 。
             返回值：
                  key存在，返回对应的value值
                  key不存在，返回null
     */
    private static void show03() {
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("赵丽颖",168);
        map2.put("杨颖",165);
        map2.put("林志玲",178);

        Integer v1 = map2.get("杨颖");
        System.out.println(v1);

        Integer v2 = map2.get("六六");
        System.out.println(v2 );

        System.out.println("----------------------");


    }

    /*
       public V remove(Object key) 如果存在（从可选的操作），从该地图中删除一个键的映射。
            返回值：V
            key存在，v返回被删除的值
            key不存在，v返回null
     */
    private static void show02() {

        Map<String,Integer> map2 = new HashMap<>();
        map2.put("赵丽颖",168);
        map2.put("杨颖",165);
        map2.put("林志玲",178);
        map2.put("邓亚萍",155);
        System.out.println(map2);
        Integer remove = map2.remove(155);
        System.out.println(remove);
        Integer remove2 = map2.remove("邓亚萍");
        System.out.println(remove2);
        System.out.println(map2);
        System.out.println("------------------------");

    }

    /*
      public V put(K key,V value)将指定的值与该映射中的指定键相关联（可选操作）。
            返回值：V
                 存储键值对的时候，key不重复，返回值v是null
                 存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回被替换的value值
     */
     static void show01() {
        //创建Map集合对象，多态
        Map<String,String> map = new HashMap<>();

        String v1 = map.put("李晨", "范冰冰");
        System.out.println("v1:"+v1);
        //key值重复，返回被替换的值
        String v2 = map.put("李晨", "范冰冰2");
        System.out.println("v2:"+v2);

        System.out.println(map);

        map.put("冷锋","龙小云");
        map.put("杨过","小龙女");
        map.put("尹志平","小龙女");
         System.out.println(map);

         System.out.println("------------------------");



     }
}

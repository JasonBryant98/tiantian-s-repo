package mapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合遍历的第二种方式：使用Entry对象遍历

    Map集合中的方法：
           Set<Map.Entry<K,V>> entrySet() 返回此地图中包含的映射的Set视图。
    实现步骤：
           1.使用Map集合中的方法，entrySet（），把Map集合中的多个entry对象取出，存储到set集合中
           2.遍历set集合，获取每一个entry对象
           3.使用entry对象中的方法getKey()和getValue()获取键与值
 */
public class Demo03EntrySet {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        //1.
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        //2.
        //使用迭代器
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> en = it.next();

            //3.
            String key = en.getKey();
            Integer value = en.getValue();
            System.out.println(key+" = "+ value);
        }

        System.out.println("--------------------------");

        //2.
        for (Map.Entry<String,Integer> entry:map.entrySet()){

            Integer value = entry.getValue();
            String key = entry.getKey();
            System.out.println(key+" : "+value);


        }
    }
}

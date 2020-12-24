package hashCodeDemo;

import langDemo.Person;

/*
      哈希值：是一个十进制的整数，有系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来得到的地址，不是数据实际的物理地址）
      int hashCode()返回该对象的哈希码值



 */
public class Demo01HashCode {
    public static void main(String[] args) {
        //Person类继承了Object类，所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);



        //toString
        System.out.println(p1);

        /*
            String类的哈希值
                 String类重写了Object累的hashCode方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

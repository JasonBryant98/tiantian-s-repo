package intergerDemo;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;

/*
   自动装箱与自动拆箱：基本类型的数据和包装类之间可以自动的相互转换
   JDK1.5之后出现的新特性

 */
public class Demo02Integer {

    public static void main(String[] args) {

        /*
         自动装箱
         */
        Integer in = 1;

        /*
        自动拆箱:自动转换为基本数据类型，再进行计算
         */
        in = in - 2;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //自动装箱

    }
}

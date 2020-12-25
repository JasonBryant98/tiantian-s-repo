package ObjectDemo;

import java.util.Objects;

public class Demo01Objects {
    public static void main(String[] args) {

        String s1 = null;
        String s2 = "abc";
        //boolean b = s1.equals(s2); //NullPointerException null是不能调用方法的，就会抛出空指针异常

        boolean b = Objects.equals(s1, s2);

        /*
            Objects类的equals方法：对两个对象进行比较，防止空指针异常
         */


        System.out.println(b);
    }
}

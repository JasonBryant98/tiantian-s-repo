package stringBuilderDemo;
/*
StringBuilder常用方法：
        public StringBuilder append(...):将任意类型数据的字符串附加到此字符序列。
 */
public class Demo02StringBuilder {

    public static void main(String[] args) {

        StringBuilder bu3 = new StringBuilder();

        StringBuilder bu1 = new StringBuilder();
        StringBuilder bu2 = bu1.append("abc");
        System.out.println(bu1);
        System.out.println(bu2);


        //使用append方法无需接收返回值
        bu3.append("abc");
        bu3.append(1);
        bu3.append(true);
        bu3.append('中');
        System.out.println(bu3);

        /*
             链式编程：方法返回值是一个对象，可以继续调用方法
         */
        System.out.println("abc".toUpperCase());

        bu3.append("abc").append(1);
        System.out.println(bu3);



    }
}

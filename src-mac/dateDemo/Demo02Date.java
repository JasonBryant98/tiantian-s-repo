package dateDemo;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo02();
    }


    /*
    Date类的带参数构造方法
    Data（long date）:传递毫秒值，把毫秒值转换为Date日期

     */
    private static void demo02(){
        Date date = new Date(0L);
        System.out.println(date);

    }

    /*
    Data类的空参数构造方法
    Date()获取当前系统的日期和时间
     */
    private static  void Demo01Date(){
        Date date = new Date();
        System.out.println(date);

    }
}

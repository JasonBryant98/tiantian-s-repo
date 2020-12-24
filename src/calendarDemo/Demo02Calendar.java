package calendarDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
   常用的成员方法：
   public int get(int field):返回给定日历字段的值
   public void set(int field, int amount)：将给定的日历字段设置为给定值
   public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量
   public Date gettime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象

   参数：
   int field：日历类的字段，可以使用calendar类的静态成员变量获取
 */
public class Demo02Calendar {
    public static void main(String[] args) {

        demo01();

        demo02();

        demo03();

        demo04();
    }

    /*
    getTime():将日历对象，转换成日期对象
     */
    private static void demo04() {

        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);


    }

    /*
        add方法
     */
    private static void demo03() {

        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,2);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

    }

    private static void demo01() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);

        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);

    }

/*
set方法进行设置， public void set(int field, int amount)
 */
    private static void demo02() {

        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR,2077);
        c.set(Calendar.MONTH,1);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);




    }
}

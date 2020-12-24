package calendarDemo;

import java.util.Calendar;

/*
     java.util.Calendar类：日历类
     Calendar类是一个抽象类，里面提供改了很多操作日历字段的方法 (YEAR、MONTH、DAY_OF_MONTH、HOUR)
     Calendar类无法直接创建对象使用，里面有一个静态方法叫getInstance(),该方法返回了Calendar子类的对象

      Calendar类重写了toString方法
 */
public class Demo01Calendar {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();//多态
        System.out.println(c);
    }
}

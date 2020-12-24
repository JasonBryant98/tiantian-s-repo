package langDemo;

import demo.Demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
   java.text.DateFormat：是日期/时间格式化子类的抽象类

   String format(Date date) 按照指定的模式，把Date日期，格式化为符合模式的字符串
   Data parse(String source)  把符合模式的字符串，解析为Date日期
   DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类

   java.text.SimpleDateFormat extends DateFormat
   构造方法
   SimpleDateFormat（String pattern）
    y    年
    M    月
    d    日
    H    时
    m    分
    s    秒
    写对应的模式，会把模式替换成对应的日期和时间
    "yyyy-MM-dd HH:mm:ss"
    注意：模式中的字母不能更改，连接模式的符号可以改变
 */
public class FormatDemo01 {
    public static void main(String[] args) throws ParseException {
        demo01();
        System.out.println("========================");
        demo02();

    }

    /*
    使用DateFormat类中的方法format,把日期格式化为文本
    使用步骤：
     1.创建SimpleFormat对象，构造方法中传递指定的模式
     2.调用调用SimpleFormat对象中的方法parse，把符合构造方法中模式的字符串，解析为Date日期
     注意：
     public Date parse(String source) throws ParseException
     parse方法声明了一个异常叫ParseException
     如果字符串和构造方法的模式不一样，那么程序就会抛出异常
     调用一个抛出了异常的方法，就必须处理这个异常，要么throws继续抛出这个异常，要么try catch 自己处理

     */
    private static void demo02() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        Date date = simpleDateFormat.parse("2020-12-10  21:10:49");
        System.out.println(date);


    }

    /*
    使用DateFormat类中的方法，把日期格式化为文本
    使用步骤：
        1.创建SimpleFormat对象，构造方法中传递指定的模式
        2.调用SimpleFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化成符合模式的字符串（文本）
     */
    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");

        Date date  = new Date();
        String dd = sdf.format(date);
        System.out.println(date);
        System.out.println(dd);


    }

}

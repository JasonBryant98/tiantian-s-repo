package langDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
计算一个人出生多少天

分析：
1.Scanner 获取出生日期
2.使用parse，把字符串的出生日期，解析成Date格式的出生日期
3.把Date格式的出生日期转换为毫秒值
4.获取当前的日期，转换为毫秒值
5.使用当前日期的毫秒值-出生毫秒值
6.转换为天（s/1000/60/60/24）
 */
public class FormatDemo02 {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的出生日期：");
        String birthdayString = sc.next();
        SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");

        Date birthday = spf.parse(birthdayString);
        long birthdayTime = birthday.getTime();

        long todayTime = System.currentTimeMillis();

        long time = todayTime - birthdayTime;


        System.out.println("您已出生：" + time/1000/60/60/24 + "天！");





    }
}

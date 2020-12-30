package exceptionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable类是Java语言中所有错误或异常的超类
        Exception：编译期异常，进行编译（写代码）Java程序出现的问题
            RuntimeException：运行期异常，java程序运行过程中出现的问题
            异常就相当于程序得了一个小毛病（感冒，发烧），把异常处理掉，程序可以继续执行（吃点药）
        Error：错误
            错误就相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能继续执行

 */
public class  demo01Exception {
    public static void main(String[] args) {
//        Exception：编译期异常，进行编译（写代码）Java程序出现的问题
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//格式化日期
        try {
             date = simpleDateFormat.parse("1999-09-09");//把字符串格式的日期，解析为Date格式的日期】
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("--------------------");


        //RuntimeException:运行期异常
        int[] arr = {1,2,3};
        try {
            //可能会出现异常的代码
            System.out.println(arr[3]);
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("后续代码");


        /*
            Error：错误
            内存溢出的错误，创建的数组太大了，超出了给JVM分配的内存
         */
        int[] arr2 = new int[1024*1024];

        //必须修改代码，创建的数组小一点
        System.out.println("后续代码");


    }
}

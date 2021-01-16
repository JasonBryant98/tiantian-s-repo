package ioDemo;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    追加写/续写：使用两个参数的构造方法
        FileOutputStream(String name, boolean append)  创建文件输出流以指定的名称写入文件。
        FileOutputStream(File file, boolean append)  创建文件输出流以写入由指定的 File对象表示的文件。
        参数：
            String name，File file：写入数据的目的地
            boolean append:追加写开关
                true：创建对象不会覆盖原文件，继续在文件的末尾追加写数据
                false：创建一个新文件覆盖原文件，重写数据

     写换行：写换行符号
        windows:\r\n
        linux:/n
        mac:/r
 */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\a.txt",true);

        for (int i = 0; i < 10; i++) {
            fos.write("再见".getBytes());
            fos.write("\r\n".getBytes());
        }



        fos.close();
    }
}

package reverseStreamDemo;

import java.io.*;

/*
    java.io.OutputStreamWriter extends Writer
    OutputStreamWriter：是从字符流到字节流的桥梁：使用指定的charset将写入的字符编码为字节。（编码：把能看懂的变成看不懂的）

    继承自父类的共性成员方法：
        abstract void close() 关闭流，先刷新。
        abstract void flush() 刷新流。
        void write(char[] cbuf) 写入一个字符数组。
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
        void write(int c) 写一个字符
        void write(String str) 写一个字符串
        void write(String str, int off, int len) 写一个字符串的一部分。

    构造方法：
        OutputStreamWriter(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter。
        OutputStreamWriter(OutputStream out, String charsetName) 创建一个使用命名字符集的OutputStreamWriter。

        参数：
            OutputStream out:字节输出流，可以用来写转换之后的字节到文件中
            String charsetName:指定的编码表名称，不区分大小写，可以使utf-8/UTF-8,gbk/GBK,...不指定默认使用UTF-8

    使用步骤：
        1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储到缓冲区中（编码）
        3.使用OutputStreamWriter对象中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        4.释放资源


 */
public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        write_utf_8();

        write_GBK();
    }

    private static void write_GBK() throws IOException {
        // 1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/reverseStreamDemo/GBK.txt"),"GBK");

        //2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储到缓冲区中（编码）
        osw.write("你好吗？？");

        osw.close();
    }

    /*
        使用转换流OutputStreamWriter写UTF-8格式的文件
     */
    private static void write_utf_8() throws IOException {
        // 1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/reverseStreamDemo/UTF-8.txt"),"utf-8");

        //2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储到缓冲区中（编码）
        osw.write("你好");

        osw.close();




    }


}

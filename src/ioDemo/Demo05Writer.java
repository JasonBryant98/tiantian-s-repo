package ioDemo;

import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.Writer:字符输出流，是所有字符输出流的最顶层的父类，是一个抽象类

    共性的成员方法：
        abstract void close() 关闭流，先刷新。
        abstract void flush() 刷新流。
        void write(char[] cbuf) 写入一个字符数组。
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
        void write(int c) 写一个字符
        void write(String str) 写一个字符串
        void write(String str, int off, int len) 写一个字符串的一部分。

     java.io.FileWriter extends OutputStreamWriter extends Writer
     FileWriter:文件字符输出流
     作用:把内存中字符数据写入到文件中

     构造方法
        FileWriter(File file) 给一个File对象构造一个FileWriter对象。
        FileWriter(String fileName) 构造一个给定文件名的FileWriter对象。
        参数：写入数据的目的地
            String fileName：文件的路径
            File file：是一个文件
        构造方法的作用：
            1.会创建一个FileWriter对象
            2.会根据构造方法中传递的文件/文件的路径，创建文件
            3.会把FileWriter对象指向创建的文件

     字符输出流的使用步骤（重点）：
        1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
        2.使用FileWriter中的方法write，把数据写入到内存缓冲区中（字符转换为字节的过程）
        3.使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
        4.释放资源（会先把内存缓冲区中的数据刷新到文件中）
 */
public class Demo05Writer {
    public static void main(String[] args) throws IOException {
        //1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("src\\ioDemo\\b.txt",true);
        //2.使用FileWriter中的方法write，把数据写入到内存缓冲区中（字符转换为字节的过程）
        // void write(int c) 写一个字符
        fw.write(97);
        //3.使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
        fw.flush();
        //4.释放资源（会先把内存缓冲区中的数据刷新到文件中）
        fw.close();



    }
}

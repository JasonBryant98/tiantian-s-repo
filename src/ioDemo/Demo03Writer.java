package ioDemo;

import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流写数据的其他方法
        void write(char[] cbuf) 写入一个字符数组。
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
        void write(String str) 写一个字符串
        void write(String str, int off, int len) 写一个字符串的一部分。

 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src\\ioDemo\\b.txt",true);
        // void write(char[] cbuf) 写入一个字符数组。
        char[]  cs = {'a','b','c'};
        fw.write(cs,1,2);

        fw.write("你是笨蛋",2,2);

        fw.close();
    }
}

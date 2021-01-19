package bufferedStreamDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.BufferedWriter extends Writer
    BufferedWriter:字符缓冲输出流

    继承自父类的共性成员方法：
         abstract void close() 关闭流，先刷新。
         abstract void flush() 刷新流。
         void write(char[] cbuf) 写入一个字符数组。
         abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
         void write(int c) 写一个字符
         void write(String str) 写一个字符串
         void write(String str, int off, int len) 写一个字符串的一部分。

     构造方法：
         BufferedWriter(Writer out) 创建使用默认大小的输出缓冲区的缓冲字符输出流。
         BufferedWriter(Writer out, int sz) 创建一个新的缓冲字符输出流，使用给定大小的输出缓冲区。
         参数：
            Writer out:字符输出流
                我们可以传递FileWriter，缓冲流会给FileWriter增加一个缓冲区，提高FileWriter的写入效率
            int sz：指定缓冲区的大小，若不指定，默认大小

      特有的成员方法：
            void newLine() 写一行行分隔符。   会根据不同的额操作系统，获取不同的行分隔符
       使用步骤：
       1.创建字符缓冲输出流对象，构造方法中传递字符输出流
       2.调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
       3.调用字符缓冲输出流中的方法flush，把内存缓冲区中的方法，刷新到文件中
       4.释放资源


 */
public class Demo03BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/bufferedStreamDemo/b.txt"));

        for (int i = 0; i < 10; i++) {
            bw.write("铁憨憨");
            bw.newLine();
        }

        bw.close();

    }
}

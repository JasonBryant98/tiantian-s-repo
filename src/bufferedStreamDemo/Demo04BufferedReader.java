package bufferedStreamDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    java.io.BufferedReader extends Reader

    继承自父类的共性成员方法：
        int read() 读取单个字符并返回
        int read(char[] cbuf) 一次读取多个字符，将字符读入数组
        void close() 关闭该流并释放与之相关联的所有资源

    构造方法：
        BufferedReader(Reader in) 创建使用默认大小的输入缓冲区的缓冲字符输入流。
        BufferedReader(Reader in, int sz) 创建使用指定大小的输入缓冲区的缓冲字符输入流。
        参数：
            Reader in:字符输入流
                我们可以传递FileReader，缓冲流会给FileReader增加一个缓冲区
    特有的成员方法：
        String readLine() 读一行文字。
        行的终止符号：读一行文字。 一行被视为由换行符（'\ n'），回车符（'\ r'）中的任意一个，紧跟换行符的回车符或通过到达文件末尾终止（EOF）。
        返回值：
             一个包含行的内容的字符串，不包括任何行终止字符，如果没有读取任何字符，如果流的结尾已经到达，则为null

    使用步骤：
        1.创建字符缓冲输入流对象，构造方法中传递字符输入流
        2.使用字符缓冲输入流对象中的方法read/readLine 读取文本
        3.释放资源


 */
public class Demo04BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/bufferedStreamDemo/b.txt"));

        String line ;
        while ((line=br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();

    }
}

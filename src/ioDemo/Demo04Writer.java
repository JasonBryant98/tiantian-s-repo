package ioDemo;

import java.io.FileWriter;
import java.io.IOException;

/*
    续写和换行
    续写，追加写：使用两个参数的构造方法
    FileWriter（String fileName， boolean append）
    FileWriter（File file， boolean append）
    参数：
        String fileName，File file：写入数据的目的地
        boolean append：续写开关 true：不会创建新的文件覆盖源文件，可以续写
                               false：创建新的文件覆盖原文件

    换行：换行符号
        windows：\r\n
        linux:/n
        mac:\r
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/liuyi/Downloads/tiantian-s-repo/src/ioDemo/c.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("Hello World"+i);
            fw.write("\r");
        }
        fw.close();
    }
}

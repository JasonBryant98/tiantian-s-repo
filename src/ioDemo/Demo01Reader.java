package ioDemo;

import jdk.internal.util.xml.impl.ReaderUTF8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;

/*
    使用字节流读取中文文件
    1个中文
        GBK：占用两个字节
        UTF-8：占用3个字节
 */
public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/liuyi/Downloads/Andriod Project/a.txt");
        Reader reader = new ReaderUTF8(fis);

        System.out.println(reader.read());
        fis.close();
    }
}

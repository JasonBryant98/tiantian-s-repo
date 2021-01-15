package ioDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    一次写多个字节的方法：
        public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流
        public void write(byte[] b, int off, int len):从指定的字节数组写入len字节，从偏移量 off开始输出到此输出流。
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream对象，构造方法中绑定要写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("/Users/liuyi/Downloads/tiantian-s-repo/b.txt"));
        //调用FileOutputStream对象中的方法write，把数据写入到文件中
        //在文件中显示100
        /*
             public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流
            一次写多个字节：
                如果写的第一个字节是正数（0～127），那么显示的时候会查询ASCII表
                如果写的第一个字节是负数，那么第一个字节会和第二个字节，两个字节组成一个中午显示，查询系统默认码表（GBK）
         */
//        byte[] bytes = {49,48,48};
        byte[] bytes = {-65,-66,-67,55,49};

        fos.write(bytes);

         /*
            public void write(byte[] b, int off, int len)：把字节数组的一部分写入到文件中
                从指定的字节数组写入len字节，从偏移量 off开始输出到此输出流
                int off:数组的开始索引
                int len：写几个字节
         */

        fos.write(bytes,1,3);
        //释放资源

        /*
            写入字符的方法：可以使用String类中的方法把字符串，转换为字节数组
                byte[] getBytes() 把字符串转换为字节数组
         */
        byte[] b1 = "sdadhsaiuhdsa".getBytes();
        System.out.println(Arrays.toString(b1));
        fos.write(b1);
        fos.close();
    }

}

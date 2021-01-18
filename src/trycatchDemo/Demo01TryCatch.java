package trycatchDemo;

import java.io.FileWriter;
import java.io.IOException;

/*
    在JDK1.7之前使用try catch finally 处理流中的异常
    格式：
        try {
            可能会产出异常的代码
        } catch(异常类的变量 变量名) {
            异常的处理逻辑
        } finally {
        一定会指定的代码
        资源释放
        }

 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        //提高变量fw的作用域，让finally可以使用
        //变量在定义的时候，可以没有值，但是使用的时候必须有值
        //fw = new FileWriter("/Users/liuyi/Downloads/tiantian-s-repo/src/ioDemo/c.txt",true);
        //如果执行失败，fw没有值，fw.close会报错
        FileWriter fw = null;
        try {
            //可能会产生异常的代码
            fw = new FileWriter("/Users/liuyi/Downloads/tiantian-s-repo/src/ioDemo/c.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("Hello World"+i);
                fw.write("\r");
            }
        } catch (IOException e) {
            //异常的处理逻辑
            e.printStackTrace();
        } finally {
            //一定会指定的代码
            //创建对象失败了，fw的默认值是null，null是不能调用方法的，会抛出空指针异常，需要增加一个判断，不是null再把资源释放
            try {
                //fw.close()方法声明抛出IOException异常对象，所以我们就得处理这个异常对象，要么throws，要么try catch
                if(fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

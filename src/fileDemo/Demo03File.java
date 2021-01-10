package fileDemo;

import sun.nio.cs.SingleByte;

import java.io.File;

/*
    String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串。
    String getName() 返回由此抽象路径名表示的文件或目录的名称。
    String getPath() 将此抽象路径名转换为路径名字符串。
    long length() 返回由此抽象路径名表示的文件的长度。
 */
public class Demo03File {
    public static void main(String[] args) {
        show01();

        System.out.println("------------------------------");
        
        show02();

        System.out.println("------------------------------");

        show03();

        System.out.println("------------------------------");

        show04();



    }

    /*
       long length() 返回由此抽象路径名表示的文件的长度。
       获取的是构造方法指定的文件的大小，以字节为单位
       注意：
        文件夹是没有大小概念的，不能获取文件夹的大小
        如果构造方法中给出的路径不存在，那么length方法返回0
     */
    private static void show04() {

        File f1 = new File("E:\\IdeaProjects\\tiantian-s-repo\\pom.xml");
        long length = f1.length();
        System.out.println(length);


    }


    /*
        String getName() 返回由此抽象路径名表示的文件或目录的名称。
        获取的就是构造方法传递路径的结尾部分（文件/文件夹）
     */
    private static void show03() {
        File f1 = new File("E:\\IdeaProjects\\a.txt");
        String name = f1.getName();
        System.out.println(name);

        File f2 = new File("E:\\IdeaProjects");
        String name1 = f2.getName();
        System.out.println(name1);


    }

    /*
        public String getPath():将此抽象路径名转换为路径名字符串。
        获取的构造方法中传递的路径
     */
    private static void show02() {
        File f1 = new File("E:\\IdeaProjects\\a.txt");
        File f2 = new File("a.txt");
        String path1 = f1.getPath();
        System.out.println(path1);
        String path2 = f2.getPath();
        System.out.println(path2);

//        System.out.println(f1.toString()); //调用的就是getPath（）方法
    }

    /*
        String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串。
        获取的构造方法中传递的路径
        无论路径是绝对的还是相对的，getAbsolutePath方法返回的都是绝对路径
     */
    private static void show01() {
        File f1 = new File("E:\\IdeaProjects\\a.txt");
        File absoluteFile1 = f1.getAbsoluteFile();
        System.out.println(absoluteFile1);

        File f2 = new File("a.txt");
        File absoluteFile2 = f2.getAbsoluteFile();
        System.out.println(absoluteFile2);
    }


}

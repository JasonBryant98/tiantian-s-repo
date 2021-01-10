package fileDemo;

import java.io.File;

/*
    File判断功能的方法：
        boolean exists() 测试此抽象路径名表示的文件或目录是否存在。
        boolean isDirectory() 测试此抽象路径名表示的文件是否为目录。
        boolean isFile() 测试此抽象路径名表示的文件是否为普通文件。
 */
public class Demo04File {
    public static void main(String[] args) {
        show01();

        System.out.println("-------------------------");
        
        show02();
    }

    /*
        boolean isDirectory() 测试此抽象路径名表示的文件是否为目录。
            用于判断构造方法给定的路径是否以文件夹结尾
                是：true
                否：false
        注意：
            电脑的硬盘中只有文件/文件夹，两个方法是互斥的
            这两个方法的适用前提，路径必须是存在的，否则都返回false
        boolean isFile() 测试此抽象路径名表示的文件是否为普通文件。
     */
    private static void show02() {
        File f1 = new File("E:\\IdeaProjects\\tiantian-s-repo");
        System.out.println(f1.isDirectory());
    }

    /*
        boolean exists() 测试此抽象路径名表示的文件或目录是否存在。
        用于判断构造方法中的路径是否存在
            存在：true
            不存在：false
     */
    private static void show01() {
        File f1 = new File("E:\\IdeaProjects\\tiantian-s-repo");
        boolean exists = f1.exists();
        System.out.println(exists);

        File f2 = new File("E:\\IdeaProjects\\tiantian-s-repo\\a.txt");
        System.out.println(f2.exists());
    }
}

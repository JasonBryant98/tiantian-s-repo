package filterDemo;

import java.io.File;

/*
    需求c:\\abc文件夹，及abc文件夹的子文件夹
    只要.java结尾的文件
    c:\\abc
    c:\\abc\\abc.java
    c:\\abc\\abc.txt
    c:\\abc\\a
    c:\\abc\\a\\a.jpg
    c:\\abc\\a\\a.java
    c:\\abc\\b
    c:\\abc\\b\\b.java
    c:\\abc\\b\\b.txt
    我们可以使用过滤器来实现
    在File类中有两个和ListFiles重载的方法，方法的参数传递的就是过滤器

    File[] listFiles(FileFilter filter) 返回一个抽象路径名数组，表示由此抽象路径名表示的满足指定过滤器的目录中的文件和目录。
        java.io.FileFilter接口：抽象路径名（File对象）的过滤器。
            作用：用来过滤文件（File对象）
            抽象方法：过滤文件的方法
                boolean accept(File pathname) 测试指定的抽象路径名是否应包含在路径名列表中。
                参数：
                    File pathname：使用ListFiles方法遍历目录，得到的每一个文件对象

    File[] listFiles(FilenameFilter filter) 返回一个抽象路径名数组，表示由此抽象路径名表示的满足指定过滤器的目录中的文件和目录。
        java.io.FilenameFilter接口：用于实现此接口的类的实例用于过滤文件名。
            作用：用于过滤文件名称
            抽象方法：
                boolean accept(File dir, String name) 测试指定文件是否应包含在文件列表中。
                参数：
                    File dir：构造方法中传递的被遍历的目录
                    String name：使用ListFiles方法遍历目录，获取的每一个文件/文件夹的名称


            注意：
                两个过滤器接口是没有实现类的，需要我们自己写实现类，重写过滤的方法accept，在方法中自己定义过滤的规则
 */
public class Demo01Filter {

    public static void main(String[] args) {
        File file = new File("c:\\abc");
        getAllFIle(file);



    }
    public static void getAllFIle(File dir) {
//        System.out.println(dir);//打印被遍历的目录名称
        File[] files = dir.listFiles(new FileFilterImpl()); //传递过滤器对象
        for (File f : files) {
            //对遍历得到的File对象f进行判断，判断是否为文件夹
            if(f.isDirectory()) {
                //f是一个文件夹，则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹，遍历文件夹的方法
                //我们直接调用getAllFile方法即可：递归（自己调用自己）
                getAllFIle(f);
            } else {
                //f是一个文件，直接打印即可
                System.out.println(f);
            }
        }
    }

}

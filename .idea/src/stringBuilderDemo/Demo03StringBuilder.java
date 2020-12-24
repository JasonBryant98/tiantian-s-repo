package stringBuilderDemo;

/*
             StringBuilder和String可以相互转换：
                    String --> StringBuilder可以试试用StringBuilder的构造方法
                    StringBuilder(String str)：构造一个初始化为指定字符串内容的字符串构建器。

                   StringBuilder --> String：可以使用StringBuilder中的toString方法
 */
public class Demo03StringBuilder {

    public static void main(String[] args) {

        String str = "hello";
        System.out.println(str);
        StringBuilder bu = new StringBuilder(str);
        System.out.println(bu);
        bu.append(" world");
        System.out.println(bu);
        System.out.println(bu.toString());
    }
}

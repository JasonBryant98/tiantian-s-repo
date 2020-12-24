package stringBuilderDemo;

/*
String类
    字符串是常量，他们的值在创建之后不能更改。
    字符串的底层是一个被final修饰的数组，不能改变，是一个常量
    private final byte[] value;

    进行字符串的相加，内存中就会有多个字符串，占用空间多，效率低下
    String s = "a" + "b" + "c";

    "a","b","c"  3个字符串
    “ab” "abc"   2个字符串

StringBuilder类
      字符串缓冲区，可以提高字符串的操作效率（看成一个长度可以变化的字符串）
      底层也是一个数组，但是没有被final修饰，可以改变长度
      byte[] value = new byte[16];
      在内存中始终是一个数组，占用空间少，效率高
      如果超出了StringBuilder的容量，会自动的扩容


java.lang.StringBuilder 类：字符串缓冲区，可以提高字符串的效率
       构造方法：StringBuilder：构造一个没有字符的字符串构建器，初始容量为16个字符。
               StringBuilder(String str)：构造一个初始化为指定字符串内容的字符串构建器。

 */
public class Demo01StringBuilder {

    public static void main(String[] args) {

        //空参数构造方法
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder); //默认是空字符串

        //带字符串的构造方法
        StringBuilder stringBuilder1 = new StringBuilder("sdaiolsahdkashdjka");
        System.out.println(stringBuilder1);





    }


}

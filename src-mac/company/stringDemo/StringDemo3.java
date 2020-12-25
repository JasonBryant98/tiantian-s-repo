package company.stringDemo;

/*
String当中与获取相关的常用方法有：

public int length(),获取字符串当中含有的字符个数，拿到字符串的长度。
public String concat(String str):将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index):获取指定索引位置的单字符
public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
 */
public class StringDemo3 {

    public static void main(String[] args) {
        System.out.println("dsahkdhwqkuhdiouqwhoejwlkq".length());

        //拼接字符串
        String str1 = "Hello ";
        String str2 = "World!";
        System.out.println(str1.concat(str2));

        //获取单个字符
        System.out.println("hello".charAt(1));


        String str3 = "HelloWorld";
        System.out.println(str3.indexOf("le"));

    }
}

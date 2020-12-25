package company.stringDemo;

/*
== 是进行对象的地址值比较，如果需要字符串的内容比较，可以使用两个方法：

public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true，否则返回false。
备注：
1.任何对象都能用Object进行接收。
2.equals方法具有对称性
3.如果比较双方一个常量一个变量，推荐把常量字符串写在前方。

public boolean equalsIgnoreCase(String str); 忽略大小写，进行内容比较。

 */
public class StringCommon {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] chars = {'h','e', 'l', 'l', 'o' };
        String str3 = new String(chars);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println("hello".equals(str1));

        String str5 = "Hello";
        System.out.println(str5.equalsIgnoreCase(str1));

    }
}

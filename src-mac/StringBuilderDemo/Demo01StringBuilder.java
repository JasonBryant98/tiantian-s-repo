package StringBuilderDemo;

public class Demo01StringBuilder {

    public static void main(String[] args) {

        StringBuilder bu = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this，调用方法的对象bu，this==bu
        StringBuilder bu2 = bu.append("abc");
        System.out.println(bu);
        System.out.println(bu2);

        //使用append方法无需接收返回值



    }
}

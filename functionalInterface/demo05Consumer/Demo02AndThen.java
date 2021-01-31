package demo05Consumer;
/*
    Consumer接口的默认方法andThen
    作用：需要两个Consumer接口，可以把两个Consumer接口组合到一起，在对数据进行消费

    例如：
    Consumer<String> con1
    Consumer<String> con2
    String s = "hello";
    con1.accept(s);
    con2.accept(s);
    连接两个Consumer接口  再进行消费
    con1.andThen(con2).accept(s);

 */
public class Demo02AndThen {
}

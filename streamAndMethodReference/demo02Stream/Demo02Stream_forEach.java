package demo02Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_forEach
    void forEach(Consumer<? super T> action);
    该方法接受一个Consumer接口函数，会将每一个流元素交给该函数进行处理
    Consumer接口是一个消费型的函数式接口，可以传递Lambda表达式，消费数据

    简单记
        forEach方法，用来遍历流中的数据
        是一个终结方法，遍历之后，就不能继续调用Stream流中的其他方法
 */
public class Demo02Stream_forEach {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("张三", "王五", "李四", "赵六");
        //使用Stream流中的方法forEach对Stream流中的数据进行遍历
        stream.forEach((String name) -> {
            System.out.println(name);
        });

    }

}
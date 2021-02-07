package demo02Stream;

import java.util.stream.Stream;

/*
    如果需要将留中的元素映射到另一个流中，可以使用map方法
    <R Stream<R> map(Function<? super T, ? extends R> mapper);
    该接口需要一个Function函数式接口参数，可以讲当前流中的T类型转换为R类型的流
    Fuction中的抽象方法：
        R apply(T t);
 */
public class Demo04Stream_map {
    public static void main(String[] args) {
        //获取一个String类型的流
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        //使用map方法，把字符串类型的整数转换（映射）为Integer类型的整数
        Stream<Integer> stream2 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        //遍历Stream2流
        stream2.forEach(s -> System.out.println(s));
    }
}

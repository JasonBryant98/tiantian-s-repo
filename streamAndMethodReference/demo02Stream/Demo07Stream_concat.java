package demo02Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法 concat：用于把流组合到一起
    如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
    static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class Demo07Stream_concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张催催", "王翊菲", "阿三");
        String[] arr = {"美羊羊", "懒羊羊", "喜洋洋", "沸羊羊", "灰太狼"};
        Stream<String> stream1 = Stream.of(arr);
        //把以上两个流组合成为一个流
        Stream<String> concat = Stream.concat(stream, stream1);

        concat.forEach(name -> System.out.println(name));

    }
}

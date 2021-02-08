package demo02Stream;

import java.util.stream.Stream;
/*
    Stream六中的方法skip：跳过元素
    希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流
    Stream<T> skip(long n);
    如果流的当前长度大于n，则跳过前几个，否则得到一个长度为0的空流。
 */
public class Demo06Stream_skip {
    public static void main(String[] args) {
        String[] arr = {"美羊羊","懒羊羊","喜洋洋","沸羊羊","灰太狼"};
        Stream<String> stream = Stream.of(arr);
        //使用skip方法跳过前三个元素
        Stream<String> skip = stream.skip(3);
        skip.forEach(name -> System.out.println(name));
    }
}

package demo02Stream;

import java.util.stream.Stream;

/*
    limit:用来截取流中的元素
    limit方法可以对流进行截取，只取用前n个，方法签名：
    Stream<T> limit(long maxSIze);
        参数是一个long型，如果集合当前长度大于参数则进行截取，否则不进行操作
    limit方法是一个延迟方法，只是对流中的元素进行截取，返回的是一个新的流，所以可以继续调用Stream流中的其他方法
 */
public class Demo06Stream_limit {
    public static void main(String[] args) {
        //获取一个Stream流
        String[] arr = {"美羊羊","懒羊羊","喜洋洋","沸羊羊","灰太狼"};
        Stream<String> stream = Stream.of(arr);
        //使用limit方法对Stream流进行截取
        Stream<String> str1 = stream.limit(3);
        str1.forEach(name -> System.out.println(name));

    }

}

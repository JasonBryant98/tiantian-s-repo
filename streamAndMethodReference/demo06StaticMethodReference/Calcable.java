package demo06StaticMethodReference;

@FunctionalInterface
public interface Calcable {
    //定义一个抽象方法，传递一个整数，对整数进行绝对值计算
    int calsAbs(int number);
}
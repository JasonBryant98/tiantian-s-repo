package intergerDemo;

/*
     装箱：把基本类型的数据，包装到包装类中（基本类型的数据 --> 包装类）
     构造方法：
     Integer(int value) 已过时。
     很少使用这个构造函数。 静态工厂valueOf(int)通常是一个更好的选择，因为它可能产生明显更好的空间和时间性能。
     Integer(String s) 已过时。
     很少使用这个构造函数。 使用parseInt(String)将字符串转换为int原语，或使用valueOf(String)将字符串转换为Integer对象。

     静态方法：
     static Integer valueOf(int i) 返回表示指定的 int值的 Integer实例。
     static Integer valueOf(String s) 返回一个保存指定值的 Integer对象 String 。

     拆箱：在包装类中取出基本类型的数据（包装类 --> 基本类型的数据）
     成员方法：
     int intValue() 返回 Integer的值作为 int 。
     long longValue() 在扩展原始转换后，返回 Integer的值作为 long 。


 */
public class Demo01Integer {

    public static void main(String[] args) {

        Integer in1 = new Integer(1);
        System.out.println(in1);

        Integer in2 = new Integer("1");
        System.out.println(in2);

        //静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);
    }

}

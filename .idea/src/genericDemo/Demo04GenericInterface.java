package genericDemo;

/*
    测试含有泛型的接口
 */
public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl gi = new GenericInterfaceImpl();
        gi.method("无语了奥！");


    //创建对象
    GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
    gi2.method(1);

    GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2<Double>();
    gi3.method(233.2);



    }

}

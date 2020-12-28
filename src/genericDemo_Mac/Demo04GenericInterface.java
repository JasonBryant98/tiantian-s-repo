package genericDemo_Mac;

/*
    测试含有泛型的接口
 */
public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterface_MacImpl gi = new GenericInterface_MacImpl();
        gi.method("无语了奥！");


    //创建对象
    GenericInterfaceMacImpl2<Integer> gi2 = new GenericInterfaceMacImpl2<>();
    gi2.method(1);

    GenericInterfaceMacImpl2<Double> gi3 = new GenericInterfaceMacImpl2<Double>();
    gi3.method(233.2);



    }

}

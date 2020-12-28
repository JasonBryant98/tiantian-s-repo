package genericDemo_Mac;

/*
    测试含有泛型的接口
 */
public class Demo03GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterfaceIMpl对象
        GenericInterface_MacImpl gi1 = new GenericInterface_MacImpl();
        gi1.method("字符串");
    }
}

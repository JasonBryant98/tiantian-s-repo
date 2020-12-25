package genericDemo;

/*
    测试含有泛型的接口
 */
public class Demo03GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterfaceIMpl对象
        GenericInterfaceImpl gi1 = new GenericInterfaceImpl();
        gi1.method("字符串");
    }
}

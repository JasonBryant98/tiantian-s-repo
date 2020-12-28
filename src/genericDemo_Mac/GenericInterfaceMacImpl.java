package genericDemo_Mac;

/*
   含有泛型的抽象接口的第一种使用方式：定义接口的实现类，实现接口，指定接口的泛型
 */
public class GenericInterfaceMacImpl implements GenericInterface_Mac<String> {


    @Override
    public void method(String s) {
        System.out.println(s);
    }

}

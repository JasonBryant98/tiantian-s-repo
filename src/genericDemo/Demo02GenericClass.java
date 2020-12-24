package genericDemo;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写泛型默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");

        Object obj = gc.getName();
        System.out.println(obj);
//        String name = gc.getName();
//        System.out.println(name);

        //创建对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(222);
        Integer name = gc2.getName();
        System.out.println(name);

        GenericClass<String> gc3= new GenericClass<>();
        gc3.setName("小明");
        System.out.println(gc3.getName());


    }
}

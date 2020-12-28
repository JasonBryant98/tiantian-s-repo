package genericDemo_Mac;
/*
    测试含有泛型的方法
 */
public class Demo03GenericMethod {
    public static void main(String[] args) {
          //创建GenericMethod对象
        GenericMethod gm = new GenericMethod();

        /*
            调用含有泛型的方法method01
            传递什么类型，泛型就是什么类型
         */
        gm.method01(1);
        gm.method01("abc");
        gm.method01("4.65");


        //静态方法使用类名.方法名（参数）可以直接调用
        GenericMethod.method02("das");
    }
}

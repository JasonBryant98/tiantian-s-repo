package finalDemo;

/*
3.final 修饰一个局部变量

4.final修饰成员变量
 */
public class Demo01Final {

    public static void main(String[] args) {
        int num1 = 10;

        final int num = 20;
//        num = 30;  //错误

        //对于基本类型来说，不可变说的是变量当中的数据不可改变
        //对于引用类型来说，不可变说的是变量当中的地址值不可改变
       final Student student1 = new Student("高圆圆");
        System.out.println(student1.getName());

       //错误写法！final的引用类型变量，其中的地址不可改变
//        student1 = new Student("sjdaoisd");
        //可通过set方法改变值
        student1.setName("嘻嘻嘻");
        System.out.println(student1.getName());

    }
}

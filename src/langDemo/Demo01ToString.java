package langDemo;

/*
java.lang.Object
类object是类层次结构的根类
每个类都是用Objec作父类
所有对象（包括数组）都实现这个类的方法
 */
public class Demo01ToString {

    public static void main(String[] args) {

        Person person = new Person("张三",19);
        String s = person.toString();
        //直接打印对象的名字，其实就是在调用对象的toString方法
        System.out.println(s);

        //看一个类是否重写了toString方法，直接打印这个类的对象即可，如果没有重写toString方法那么打印的是对象的地址值


    }
}

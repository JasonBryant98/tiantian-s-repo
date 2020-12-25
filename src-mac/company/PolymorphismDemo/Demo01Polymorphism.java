package company.PolymorphismDemo;

/*
代码当中体现多态性：父类引用指向子类对象
格式：
父类名称 对象名 = new 子类名称()；
接口名称 对象名 = new 实现类名称();

访问成员变量的两种方式

1.直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找
多态中，FU obj = new Zi（）；
obj.num中的数值是FU类中的定义。
2.间接通过成员方法访问成员变量，看该方法属于谁，优先用谁，没有则向上找
如果子类覆盖重写，则优先子类，如果没有覆盖重写则为父类。
 */
public class Demo01Polymorphism {

    public static void main(String[] args) {
        //左侧父类的引用，指向了右侧子类的对象
        FU obj = new Zi();
        obj.method();
    }

}

package company.PolymorphismDemo;

/*
多态："成员变量，静态方法看左边；非静态方法：编译看左边，运行看右边"
向上转型一定是安全的，没有问题，正确的，但是有一个弊端：
对象一但向上转型为父类，那么就无法调用子类原本特有的内容

解决方法：用对象的向下转型【还原】。

对象的向下转型：其实是一个【还原】的动作
格式：子类名称 对象名 = （子类名称）父类对象；
含义：将父类对象【还原】成为本来的子类对象。
注意事项：
1.必须保证对象本来创建的时候就是猫，才能向下转型成为猫
2.如果对象创建的时候不是猫，非要向下转型成为猫，就会报错
 */
public class Demo1Main_Mac {
    public static void main(String[] args) {
        //对象的向上转型，就是父类引用指向子类对象
        Animal animal =  new Cat(); //本来创建的时候是一只猫
        animal.eat();
        //向下转型
        Cat cat =(Cat) animal;
        cat.catchMouse();

    }
}

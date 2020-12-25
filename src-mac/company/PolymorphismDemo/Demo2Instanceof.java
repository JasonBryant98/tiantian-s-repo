package company.PolymorphismDemo;

/*
如何才能知道一个父类引用的对象，本来是什么子类？
格式：
对象：instanceof 类型
这将会得到一个boolean值结果，也就是判断前面的对象能不能当作后面类型的实例

 */
public class Demo2Instanceof {

    public static void main(String[] args) {

        Animal animal  = new Dog();
        animal.eat();

        //如果需要调用子类特有方法，需要向下转型
        if(animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.playBall();
        } else {
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
        giveMeAPet(new Dog());
    }

    public static  void giveMeAPet(Animal animal) {
        if(animal instanceof Cat) {
            Cat cat = (Cat)animal;
        }

    }
}

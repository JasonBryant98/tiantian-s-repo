package demo07SuperMethodReference;
/*
    定义子类
 */
public class Man extends Human{
    //重写sayHello的方法


    @Override
    public void sayHello() {
        System.out.println("Hello 我是Man！");
    }

    //定义一个方法参数传递Greetable接口
    public void method(Greetable g) {
        g.greet();
    }

    public void show() {
        //调用method方法，方法的参数Greetable是一个函数式接口，所以可以传递Lambda
        method(() -> {
            //创建父类Human对象
            Human h = new Human();
            //调用父类的sayHello方法
            h.sayHello();
        });
    }

    public static void main(String[] args) {
        new Man().show();
    }


}

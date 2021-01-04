package threadDemo;
/*
    线程的名称：
        主线程：main
        新县城：Thread-0，Thread-1
 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        Demo01MyThread mt = new Demo01MyThread();
        //调用start方法，开启新县城，执行run方法
        mt.start();

        new Demo01MyThread().start();

        //链式编程
        System.out.println(Thread.currentThread().getName());



    }
}

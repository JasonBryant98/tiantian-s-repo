package threadDemo;
/*
    设置线程的名称：
        1.使用Thread类中的方法setName（名字）
        2.创建一个带参数的构造方法，参数传递线程的名称，调用父类的带参构造方法，把线程名称传递给父类，让父类给子线程起一个名字

 */
public class Demo02MyThread extends Thread{

    public Demo02MyThread() {
    }

    public Demo02MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //获取线程的名称
        System.out.println(Thread.currentThread().getName());
    }
}

package threadDemo;

public class Demo02SetThread {
    public static void main(String[] args) {
        Demo02MyThread mt = new Demo02MyThread();
        mt.setName("小强");
        mt.start();

        //开启多线程
        new Demo02MyThread("旺财").start();
    }
}

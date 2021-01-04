package threadDemo;
/*
    获取线程的名称
        1.使用thread类中的方法getName() 返回线程的名称
        2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称
            static Thread currentThread()


 */
//定义一个thread类的子类
public class Demo01MyThread extends Thread {
    //重写thread类中的run方法，设置线程任务

    @Override
    public void run() {
//       //获取线程名称
//        String name = getName();
//        System.out.println(name);

//        Thread t = Thread.currentThread();
//        System.out.println(t);
//        String name = t.getName();
//        System.out.println(name);

        System.out.println(Thread.currentThread().getName());
    }
}

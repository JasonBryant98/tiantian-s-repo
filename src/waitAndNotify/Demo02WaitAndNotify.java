package waitAndNotify;

/*
    进入到TimeWaiting（计时等待）有两种方式
    1.使用sleep（long m）方法，在毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态
    2.使用wait（long m）方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，他就会自动醒来，线程睡醒进入到Runnable/Blocked状态

    唤醒方法：
    1.notify（）唤醒在此对象监视器上等待的单个线程，如果有多个，随机唤醒一个
    2.notifyAll() 唤醒在对象监视器上等待的所有线程
 */
public class Demo02WaitAndNotify {

}

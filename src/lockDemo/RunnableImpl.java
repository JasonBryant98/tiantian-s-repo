package lockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    实现卖票案例
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的第三种方案：使用lock锁
    java.util.concurrent.locks.Lock接口
    Lock接口中的方法：
        lock() 获取锁
        unlock() 释放锁

    使用步骤：
        reentrantLock 实现了 Lock接口
        1.在成员位置创建一个ReentrantLock对象
        2.在可能出现安全问题的代码前调用Lock接口中的方法Lock获取锁
        3.在可能出现安全问题的代码后调用Lock结偶中的方法unlock释放锁


 */
public class RunnableImpl implements Runnable{

    //定义一个多个线程共享的票源
    private static int ticket = 100;

    //1.在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();




    //设置线程任务：卖票
    @Override
    public void run() {
        while (true) {
            //2.在可能出现安全问题的代码前调用Lock接口中的方法Lock获取锁


            //先判断票是否存在
            l.lock();
            if (ticket > 0) {
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                    //票存在，卖票 ticket--
                    System.out.println(Thread.currentThread().getName() + "---->正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //3.在可能出现安全问题的代码后调用Lock结偶中的方法unlock释放锁
                    l.unlock();
                }

            }

        }
    }

    /*
        定义一个同步方法
        同步方法也会把方法内部的代码锁住
        只让一个线程执行
        同步方法的锁对象是谁？
        就是实现类对象 new RunnableImpl()
        也是就是this
     */
    public synchronized void payTicket(){
                //先判断票是否存在
                if (ticket > 0) {
                    //提高安全问题出现的概率，让程序睡眠
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //票存在，卖票 ticket--
                    System.out.println(Thread.currentThread().getName() + "---->正在卖第" + ticket + "张票");
                    ticket--;
            }
        }
    }
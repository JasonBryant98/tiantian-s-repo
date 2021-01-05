package synchronizedDemo02;

/*
    实现卖票案例
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的第二种方案：使用同步方法
    使用步骤：
        1.把访问了共享数据的代码抽取出来，放在一个方法中
        2.在方法上添加synchronize修饰符

    格式：定义方法的格式
    修饰符：synchronized 返回值类型  方法名（参数列表）{
        共享数据的代码
    }

        注意：
            1.通过代码块中的锁对象，可以使用任意的对象
            2.但是必须保证多个线程使用的锁对象是同一个
            3.锁对象作用：
                把同步代码块锁住，只让一个线程在同步代码块中执行
 */
public class RunnableImpl implements Runnable{

    //定义一个多个线程共享的票源
    private static int ticket = 100;

    //创建一个锁对象
    Object obj = new Object();



    //设置线程任务：卖票
    @Override
    public void run() {
        while (true) {
            payTicketStatic();
        }
    }

    /*
        静态的同步方法
        锁对象是谁？
        不能是this
        this是创建对象之后产生的，静态方法优先于对象
        静态方法的锁对象是本类的class属性-->class文件对象（反射）

     */
    public static synchronized void payTicketStatic(){
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

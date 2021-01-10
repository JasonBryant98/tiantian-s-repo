package lambdaDemo;

import com.sun.org.apache.xpath.internal.SourceTree;

/*
    创建Runnable接口的实现了，重写run方法，设置线程任务
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新线程创建了");
    }
}

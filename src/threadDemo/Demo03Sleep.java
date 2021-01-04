package threadDemo;
/*
    sleep(long millis)：是当前正在执行的线程以指定的毫秒数暂停
    毫秒数结束之后，线程继续执行
 */
public class Demo03Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);
            //使用thread类的sleep方法让程序睡眠1秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

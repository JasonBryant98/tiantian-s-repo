import java.util.Scanner;

public class QueueDemo {

    /*
        首先将第 1 个数删除，紧接着将第 2 个数放到这串数的末尾，再将第 3 个数删除并将第 4 个数放到这串数的末尾，再将第 5 个数删除……
        直到剩下最后一个数，将最后一个数也删除。按照刚才删除的顺序，把这些删除的数连在一起就是小哈的 QQ 啦
     */

    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要进行计算的数字个数：");
        int n = sc.nextInt();

        //设置队列的头和尾
        queue.setHead(1);
        queue.setTail(n+1);
        //用数组给Data赋值
        int[] a = new int[100];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        queue.setData(a);

        while (queue.getHead() < queue.getTail()) {
            //第一个出队
            System.out.print(a[queue.getHead()] + " ");
            queue.setHead(queue.getHead()+1);

            //后一个放到队列后
            a[queue.getTail()] = a[queue.getHead()];
            queue.setTail(queue.getTail()+1);
            queue.setHead(queue.getHead()+1);

        }

        System.out.println();
        System.out.print("开始时的data数组为：");
        System.out.println(queue);



    }
}

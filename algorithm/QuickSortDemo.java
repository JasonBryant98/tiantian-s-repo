import java.util.Scanner;

public class QuickSortDemo {
    public static void main(String[] args) {



        int[] a = new int[1000];

        System.out.println("请输入要排序数字的个数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        long begin = System.currentTimeMillis();

        //进行排序
        QuickSort2(1,n,a);

        long  last = System.currentTimeMillis();

        System.out.println("经过快速排序后的数组：");
        for (int i = 1; i < n ; i++) {
            System.out.print( a[i] + " ");
        }
        System.out.println(a[n]);

        System.out.println("快速排序用了" + (last-begin) + "毫秒完成");

    }



     public static void QuickSort1(int left, int right, int[] a){
        int i,j,tmp,basic;
        i = left;
        j = right;
        if(left > right) {
            return;
        }

       //获取基准数字
         basic = a[left];

        //两个哨兵没有相遇
        while (i != j) {

            //顺序很重要，一定要先从右往左找，哨兵从两边向中间集中，若基准值从左开始，就从右开始推哨兵，反之亦然
            while (i < j && a[j] >= basic) {
                j--;
            }

            while (i < j && a[i] <= basic) {
                i++;
            }

            //两哨兵找到目标
            if(i < j){
                //交换
                tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }

        //基准值归位
         a[left] = a[i];
         a[i] = basic;

         //进行递归
         QuickSort1(left, i-1, a);
         QuickSort1(i+1, right, a);

     }

    public static void QuickSort2(int left, int right, int[] a){
        if(left > right) {
            return;
        }
        int i = left, l = right;
        int basic = a[left];
        while (i < l) {
            while (i < l && a[l] >= basic) {
                l--;
            }
            if(i < l) {
                a[i] = a[l];
            }
            while (i < l && a[i] <= basic) {
                i++;
            }
            if (i < l) {
                a[l] = a[i];
            }
            if (i >= l) {
                a[i] = basic;
            }
        }
        QuickSort2(left, i - 1, a);
        QuickSort2(i + 1, right, a);
    }




}

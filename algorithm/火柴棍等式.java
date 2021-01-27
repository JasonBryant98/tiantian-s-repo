/*
    最多有24根火柴，希望拼出A+B=C的等式，数字0~9分别用【6,2,5,5,4,5,6,3,7,6】
    注意：
        1.加号和等号各自需要两根火柴棍
        2.如果A != B,则A+B=C与B+A=C视为不同的等式（A、B、C都大于0）
        3.所有火柴棍必须都用上

    24-4=20根火柴可以用于组成数字，最多组成10个1，那么A、B、C任意一个数都不能超过11111
 */

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Scanner;

public class 火柴棍等式 {
    public static void main(String[] args) {

        int a,b,c,total,num = 0;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("请输入拥有的火柴数（不大于24）：");
        total = scanner.nextInt();
        long start = System.currentTimeMillis();
        for ( a = 0; a <= 1111; a++) {
            for (b = 0;b <= 1111; b++) {
                c = a + b;
                if(fun(a) + fun(b) + fun(c) == total-4) {
                    System.out.println(a+" + "+b+" = "+c);
                    num++;
                }
            }
        }
        long last = System.currentTimeMillis();
        System.out.println("总共有"+num+"个不同的等式");
        System.out.println("该程序共耗时"+(last-start)+"毫秒！");

    }

    /*
        计算组成X需要总共的火柴
     */
   static int fun(int x) {
        int[] a = {6,2,5,5,4,5,6,3,7,6};
        int sum = 0;
        while (x / 10 != 0) {  //当数字不为1位
            int b = x % 10;
            sum += a[b];
            x = x / 10; //将末位数去除
        }
        sum += a[x % 10];
        return sum;
    }





}

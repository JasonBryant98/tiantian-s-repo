package systemDemo;

import java.util.ArrayList;
import java.util.Arrays;

/*
public static void arraycopy (Object src, int srcPos, Object dest, int destPos, int length)
将数组中指定的数据拷贝到另一个数组中
src - 源数组。
srcPos - 源数组中的起始位置。
dest - 目标数组。
destPos - 目的地数据中的起始位置。
length - 要复制的数组元素的数量。

 */
public class Demo01System {

    public static void main(String[] args) {

//        demo01();

        demo02();

    }

    private static void demo02() {

        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);
//        for (int i = 0; i < dest.length; i++) {
//            System.out.print(dest[i]+" ");
//        }

        System.out.println(Arrays.toString(dest));
    }

    private static void demo01() {

        int a = 0;
        //程序执行前，获取一次毫秒值
        long start = System.currentTimeMillis();
        for (int i = 1; i <9999 ; i++) {

            System.out.println(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }



}

package exceptionDemo03;

import java.util.ArrayList;
import java.util.List;

/*
    异常的注意事项
 */
public class Demo01Exception {
    public static void main(String[] args) {
           /*
        多个异常使用捕获又该如何处理呢？
        1.多个异常分别处理。
        2.多个异常一次捕获，多次处理。
        3.多个异常一个捕获一次处理。

     */

        //  1.多个异常分别处理。
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        try {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            System.out.println(list.get(2));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("后续代码");
        System.out.println("------------------");

        // 2.多个异常一次捕获，多次处理。

        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            System.out.println(list.get(2));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        /*
            一个try多个catch注意事项：
                catch里边定义的异常变量如果有子父类关系，那么子类的异常变量必须写在上面，否则就会报错
                ArrayIndexOutOfBoundsException extends IndexOutOfBoundException
         */
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            System.out.println(list.get(2));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
            //多态特性，可以将子类对象赋值给父类，不需要写
       } //catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
        System.out.println("-------------");

        //3.多个异常一次捕获 一次处理
        try {
            int[] arr = {1,2,3};
//            System.out.println(arr[3]);

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            System.out.println(list.get(2));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
            //多态特性，可以将子类对象赋值给父类
        }


    }

}

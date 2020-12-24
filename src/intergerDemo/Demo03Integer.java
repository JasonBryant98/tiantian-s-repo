package intergerDemo;

/*
     基本类型与字符串类型之间的相互转换
     基本类型 -->字符串（String）
          1.基本类型的值+ “” 最简单的方法（工作中常用）
          2.包装类的静态方法toString（参数），不是Object类的tostring（）
          属于 方法重载
          3.String类的静态方法valueOf（参数）
      字符串（String）-->基本类型
           使用包装类的静态方法parseXXX（“数值类型的字符串”）
               Integer类：static int parseInt(String s)
 */
public class Demo03Integer {

    public static void main(String[] args) {
        // 基本类型 -->字符串（String）

        int i1 = 100;
        String s1 = i1+"";
        System.out.println(s1+200);

        System.out.println(Integer.toString(100)+222);

        System.out.println(String.valueOf(100)+333);

       // 字符串（String）-->基本类型
        System.out.println(Integer.parseInt(s1)-20);


    }
}

package company.demo;

/*
局部变量和成员变量

1.定义的位置不一样【重点】
局部变量：在方法的内部
成员变量：在方法的外部，直接写在类当中

2.作用范围不一样
局部变量：只有方法当中才可以使用，初了方法就不能再用
成员变量：整个类都可以通用。

3.默认值不一样
局部变量：没有默认值，如果想使用，必须手动进行赋值
成员变量：如果没有赋值，会有默认值，规则和数组一样

4.内存的位置不一样
局部变量：位于栈内存
成员变量：位于堆内存

5.生命周期不一样
局部变量：随着方法进栈而诞生，随着方法出栈而消失
成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失

 */
public class Demo1 {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId(22);
        student.setName("Jason");
        System.out.println(student.getName() + "  " + student.getId());
        method();
        methodB();
    }


   static String  name = "bababa"; //成员变量

    public static void method(){
        int num = 20; //局部变量
        System.out.println(num);
    }

    public static void methodB(){
        System.out.println(name);
    }



}
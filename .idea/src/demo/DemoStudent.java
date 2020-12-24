package demo;


/*
通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用

1.导包，指出需要使用的类在什么位置
import 包名称.类名称；
import demo.Student;
对于和当前类属于同一个包的情况，可以省略导包语句不写

2.创建
类名称 对象名 = new 类名称（）；
Student stu = new Student();

3.使用
分为两种情况使用：
使用成员变量：对象名.成员变量名

使用成员方法：对象名.成员方法名（参数）


 */
public class DemoStudent {

    public static void main(String[] args) {

        Student student = new Student();
        student.name = "bibi";
        student.age = 18;
        System.out.println(student.name);
        System.out.println(student.age);
        student.eat();
        student.sleep();




    }

}

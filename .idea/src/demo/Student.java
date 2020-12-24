package demo;
/*
定义学生类

属性：

行为：

对应的JAVA类当中：
成员变量（属性）
String name;
int age;

成员方法（行为）
public void eat(){}
public void sleep(){}
public void study(){}

注意事项：
1.成员变量是直接定义在类当中，方法的外面
2.成员方法不要写static关键字
 */

public class Student {

    //成员变量
    String name;     //姓名
    int age;         //年龄


    public void eat(){
        System.out.println("吃饭饭！");
    }

    public void sleep(){
        System.out.println("睡觉觉！");
    }




}

package company.extendsDemo;

/*
在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式

直接通过子类对象访问成员变量：
     等号左边是谁，就优先用谁，没有则向上找。

间接通过成员方法访问成员变量：
     方法属于谁，优先用谁吗，没有则向上找。

局部变量：              直接写成员变量名
本类的成员变量：         this.成员变量名
父类的成员变量：         super.成员变量名

注意事项：
无论是成员方法还是成员变量，如果没有都是向上找父类，不会向下找子类

重写（Override）：方法的名称一样，参数列表【也一样】，覆盖、覆写
重载（Overload）：方法的名称一样，参数列表【不一样】

方法的覆盖重写特点，创建的是子类对象，则优先用子类对象。
 */
public class Demo02Extends {
}
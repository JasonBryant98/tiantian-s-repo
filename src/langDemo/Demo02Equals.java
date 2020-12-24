package langDemo;

public class Demo02Equals {
    /*
    Person类默认继承了Obje类，所以可以使用Object类的equals方法
    boolean equals（Object obj）指示其他某个对象是否与此对象“相等”
     */

    /*
    Object类的equals方法，默认比较的是两个对象的地址值，没有意义
    所以我们要重写equals方法，比较两个对象的属性（name，age）
    问题：
        隐含着一个多态
        多态的弊端：无法使用子类特有的内容（属性和方法）
        Object obj = p2
        解决：可以使用向下转型（强转）把obj类型转换为Person
     */
}

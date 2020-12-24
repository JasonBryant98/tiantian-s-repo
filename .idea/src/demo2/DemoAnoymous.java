package demo2;

/*
匿名对象就是只有右边的对象，没有左边的名字和赋值运算符

注意事项：匿名对象只能使用唯一的一次，下次使用必须创建一个新对象
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象
 */
public class DemoAnoymous {
    public static void main(String[] args) {

        Person one = new Person();
        one.name = "Kaasad ";
        one.showName();

        //匿名对象
        new Person().name = "哈哈";
        new Person().showName();


    }
}

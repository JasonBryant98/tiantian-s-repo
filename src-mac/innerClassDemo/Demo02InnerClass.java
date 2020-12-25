package innerClassDemo;

public class Demo02InnerClass {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }
}

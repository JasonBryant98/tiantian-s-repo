package recursionDemo;
/*
    递归：自己调用自己
    递归的分类：
        分为两种，直接递归和间接递归
        直接递归称为方法人自身调用自己
        间接递归可以A方法调用B方法，B方法调用C方法，C方法调用A方法
    注意事项：
        递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出
        在递归中虽然有限定条件，但是递归次数不能太多，否则也会发生栈内存溢出
        构造方法：禁止递归
    递归的适用前提：
        当调用方法的时候，方法的主体不变，每次调用方法的参数不同，可以使用递归
 */
public class Demo01Recurison {
    public static void main(String[] args) {
//        a();

        b(1);
    }

    /*
        在递归中虽然有限定条件，但是递归次数不能太多，否则也会发生栈内存溢出
     */
    private static void b(int i) {
        System.out.println(i);
        if(i == 20000) {
            return; //结束方法
        }
        b(++i);
    }

    /*
          递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出
     */
    private static void a() {
        System.out.println("a方法！");
        a();
    }
}

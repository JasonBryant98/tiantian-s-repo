package company.interfaceDemo2;

/*
这个子接口当中有几个方法？ 答：4个
methodA 来源于接口A
methodB 来源于接口B
methodCommon 同时来源于接口A和接口B
method 来源于我自己
 */
public interface MyInterface extends MyInterface1,MyInterface2{

    public abstract  void method();
}

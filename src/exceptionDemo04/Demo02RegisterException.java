package exceptionDemo04;

import java.util.Scanner;

public class Demo02RegisterException {
    //数组写在成员位置，让主方法和成员方法都能够调用
    static String[] userNames = {"张三","李四","王五"};

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的名字：");
        String userName = sc.next();

        checkUserName(userName);

    }

    public static void  checkUserName(String userName) /*throws RegisterException */{
        for (String name:userNames) {
            if(name.equals(userName)){
                throw new RegisterRuntimeException("亲，该用户名已经被注册");
            }
        }
        System.out.println("恭喜您，注册成功！");
    }

}


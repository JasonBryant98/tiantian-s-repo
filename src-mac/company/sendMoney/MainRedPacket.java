package company.sendMoney;

import java.util.ArrayList;

public class MainRedPacket {

    public static void main(String[] args) {

        Manager manager = new Manager("群主",100);

        Member member = new Member("成员A",0);
        Member member1 = new Member("成员2",0);
        Member member2 = new Member("成员3",0);
        Member member3 = new Member("成员4",0);

        manager.show();
        member.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("==========");

        ArrayList<Integer> redList = manager.send(20,4);
        member.receive(redList);
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);

        manager.show();
        member.show();
        member1.show();
        member2.show();
        member3.show();


    }
}

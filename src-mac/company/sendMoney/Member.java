package company.sendMoney;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包当中随便抽取
    int index =new Random().nextInt(list.size());
    int delta = list.remove(index);

    int money = super.getMoney();
    super.setMoney(money + delta);

    }

}

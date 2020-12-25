package company.sendMoney;

import java.util.ArrayList;

//群主
public class Manager extends User {
    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        //需要一个集合用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看金额够吗
        int leftMoney = super.getMoney();
        if(leftMoney >= totalMoney) {
            super.setMoney(leftMoney - totalMoney);
            int avg = totalMoney/count;
            int mod = totalMoney % count;
            for (int i = 0; i < count-1; i++) {
                redList.add(avg);
            }
            int last = avg + mod;
            redList.add(last);

            return redList;

        } else {
            System.out.println("余额不足");
            return redList;
        }
    }
}

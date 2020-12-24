package douDiZhu;

import java.util.ArrayList;
import java.util.Collections;

/*
    斗地主综合案例：
           1.准备牌
           2.洗牌
           3.发牌
           4.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个存储牌的花色，一个数组存储牌的序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王小王存储到poker中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组，组装52张牌
        for(String number:numbers){
            for (String color : colors) {
                poker.add(color + number);
            }
        }

        /*
            2.洗牌
            使用集合的工具类Collections中的方法
            public static void shuffle(List<?> list)使用默认的随机源随机排列指定的列表。
            所有排列都以大致相等的可能性发生。

         */
        Collections.shuffle(poker);
//        System.out.println(poker);

        /*
             3.发牌
             定义四个集合用来存储玩家和底牌
         */
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        /*
            遍历poker集合，获取每一张集合的索引
            %3，给三个玩家轮流发牌，剩余三张给底牌
            注意：
                先判断底牌（i>=51）,否则牌发没了
         */
        for (int i = 0; i < poker.size() ; i++) {

            String p = poker.get(i);
            if(i >=51){
                diPai.add(p);
            } else if(i%3==0) {
                player1.add(p);
            } else if(i%3==1) {
                player2.add(p);
            } else {
                player3.add(p);
            }

        }


            /*
                4.看牌
             */
        System.out.println("player1:"+player1);
        System.out.println("player2:"+player2);
        System.out.println("player3:"+player3);
        System.out.println("底牌:"+diPai);




    }


}

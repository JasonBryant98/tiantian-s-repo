package catCatchFish;

import java.util.Scanner;

/*
    小猫钓鱼游戏：
        将一副牌平均分成两份，每人拿一份，按顺序一人放一张在桌上，如果某人打出的牌与桌上的某张牌的排面一样
        则将两张相同的牌之间的牌赢走，并依次放入自己手牌的最后，当任意一人手中的牌全部取走，则对手获胜


 */
public class StackAndQueueDemo {
    public static void main(String[] args) {

        Queue xiaoming = new Queue();
        xiaoming.head = 0;
        xiaoming.tail = 0;

        Queue Bryant = new Queue();
        Bryant.head = 0;
        Bryant.tail = 0;

        System.out.println("请输入两人手中的牌的数量： ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //读取手中卡牌
        for (int i = 0; i < n ; i++) {
            xiaoming.data.add(sc.nextInt());
            xiaoming.tail++;
        }
        for (int i = 0; i < n ; i++) {
            Bryant.data.add(sc.nextInt());
            Bryant.tail++;
        }

        Stack deskStack = new Stack();
        deskStack.top = 0;
        //创建类似桶排序的记录数组
        int book[] = new int[10];


        //第一次配平top，先由Bryant给牌
        int tmp = Bryant.data.get(Bryant.head);
        if(book[Bryant.data.get(Bryant.head)] == 0) {
            //Bryant没有赢牌
            Bryant.head++;
            deskStack.data.add(tmp);
            book[tmp] =1;
        }

        //当两者的头尾指针都没有相遇，游戏继续
        while (xiaoming.head < xiaoming.tail && Bryant.head < Bryant.tail) {
            tmp = xiaoming.data.get(xiaoming.head); //小明出一张牌
            if(book[xiaoming.data.get(xiaoming.head)] == 0) {
                //小明没有赢牌
                xiaoming.head++;
                deskStack.top++;
                deskStack.data.add(tmp);
                book[tmp] = 1;

            }
            else {
                //小明赢牌
                xiaoming.head++;
                xiaoming.data.add(tmp);
                xiaoming.tail++;
                //继续拿牌
                while (deskStack.data.get(deskStack.top) != tmp) {
                    book[deskStack.data.get(deskStack.top)] = 0;
                    xiaoming.data.add(deskStack.data.get(deskStack.top));
                    xiaoming.tail++;
                    deskStack.top--;
                }
            }

                //Bryant给牌
                tmp = Bryant.data.get(Bryant.head);
                if(book[Bryant.data.get(Bryant.head)] == 0) {
                    //Bryant没有赢牌
                    Bryant.head++;
                    deskStack.data.add(tmp);
                    deskStack.top++;
                    book[tmp] =1;
                }
                else {
                    //赢牌
                    Bryant.head++;
                    Bryant.data.add(tmp);
                    Bryant.tail++;
                    while (tmp != deskStack.data.get(deskStack.top )) {
                        Bryant.data.add(deskStack.data.get(deskStack.top ));
                        book[deskStack.data.get(deskStack.top )] = 0;
                        Bryant.tail++;
                        deskStack.top--;
                    }
                }
        }

       //判断是谁赢
        if(xiaoming.head == xiaoming.tail) {
            System.out.println("Bryant赢得了这场游戏！");
            System.out.print("Bryant手中的牌为：");
            for (int i = Bryant.head; i < Bryant.tail; i++) {
                System.out.print(Bryant.data.get(i) + " ");
            }
            System.out.print("\n");
            if (deskStack.top != 0){
                System.out.println("桌子上剩余的牌为：");
                for (int i = 0; i < deskStack.top; i++) {
                    System.out.print(deskStack.data.get(i)+" ");
                }
                System.out.print("\n");
            } else {
                System.out.println("桌上已经没有剩余的牌了！");
            }
        } else {
            System.out.println("小明赢得了这场游戏！");
            System.out.print("小明手中的牌为：");
            for (int i = xiaoming.head; i < xiaoming.tail; i++) {
                System.out.print(xiaoming.data.get(i) + " ");
            }
            System.out.print("\n");
            if (deskStack.top != 0){
                System.out.println("桌子上剩余的牌为：");
                for (int i = 0; i < deskStack.top; i++) {
                    System.out.print(deskStack.data.get(i)+" ");
                }
                System.out.print("\n");
            } else {
                System.out.println("桌上已经没有剩余的牌了！");
            }
        }






    }





}

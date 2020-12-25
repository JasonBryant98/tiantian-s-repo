package company.sendMoney;

public class User {

    private String name;
    private  int money;//余额

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public User() {
    }

    //战术一下当前用户的钱
    public void show(){
        System.out.println("我叫"+name);
        System.out.println("我还有"+money+"元");
    }

}

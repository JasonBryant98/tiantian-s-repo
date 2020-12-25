package innerClassDemo;

public class Body {  //外部类
    //外部类属性
    private  String name;

    //成员内部类
    public class Heart{
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫" + name);
        }

        public void beat(String name){
            System.out.println("心脏跳动");
            System.out.println("我叫" + name);
        }
    }

    //外部类的方法
    public void methodBody(){
        System.out.println("外部类的方法");
        Heart heart = new Heart();
        heart.beat();
    }

    public Body() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

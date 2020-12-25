package company.PolymorphismDemo;

public class Dog extends Animal{
    @Override
    public void eat() {

        System.out.println("狗吃骨头");
    }

    public void playBall(){
        System.out.println("狗玩球球");
    }
}

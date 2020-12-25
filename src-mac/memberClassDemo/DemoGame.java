package memberClassDemo;

public class DemoGame {

    public static void main(String[] args) {

        Hero1 hero1 = new Hero1();
        hero1.setName("xixi");

        //设置英雄技能
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("biu~biu~biu~~");
            }
        };

        hero1.setSkill(skill);

        hero1.attack();
    }
}

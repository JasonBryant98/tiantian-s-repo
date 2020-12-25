package memberClassDemo;

public class Hero1 {

    private String name;

    private Skill skill;//英雄的技能

    public void attack(){
        System.out.println(name + "开始施放技能");
        skill.use();
        System.out.println("技能释放完毕！");

    }

    public Hero1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero1(String name, Skill skill) {
        this.name = name;
        this.skill = skill;


    }
}

package memberClassDemo;

public class DemoMain {

    public static void main(String[] args) {

        Hero hero = new Hero("盖伦",20);
        Weapon weapon = new Weapon();
        weapon.setCode("多兰剑");
        hero.setWeapon(weapon);

        hero.attack();

    }
}

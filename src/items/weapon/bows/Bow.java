package items.weapon.bows;

import items.weapon.Weapon;

public class Bow extends Weapon {
    public void doubleShot(){
        System.out.println("Lanza 2 flechas epicamente");
    }
    public Bow(String name, String description, int price, int attack) {
        super(name, description, price, attack);
    }
}

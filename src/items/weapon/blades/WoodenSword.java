package items.weapon.blades;

import items.weapon.Weapon;

public class WoodenSword extends Weapon {
    protected int bluntDmg;
    public WoodenSword(String name, String description, int price, int attack, int bluntDmg) {
        super(name, description, price, attack);
        this.bluntDmg=bluntDmg;
    }
}

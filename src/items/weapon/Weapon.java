package items.weapon;

import items.Item;

public abstract class Weapon extends Item {

    protected int attack;

    public Weapon(String name, String description, int price, int atk) {

        super(name, description, price);
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}


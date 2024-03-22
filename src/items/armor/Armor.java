package items.armor;

import items.Item;

public abstract class Armor extends Item {

    protected int defense;

    public Armor(String name, String description, int price, int defense) {

        super(name, description, price);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public abstract void effect();
}
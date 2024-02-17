package Items.weapons;

import Items.Item;

public class Weapon extends Item {
    protected String name;
    protected int attack;
    protected int price;
    protected String description;

    public Weapon(String name, int attack, int price, String description) {
        this.name = name;
        this.attack = attack;
        this.price = price;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}


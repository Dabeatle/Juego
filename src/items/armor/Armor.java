package items.armor;

import items.items;

import java.io.Serializable;

public abstract class Armor extends Item implements Serializable {

    protected int def;

    public Armor(String name, String description, int price, int def) {

        super(name, description, price);
        this.def = def;
    }
}}
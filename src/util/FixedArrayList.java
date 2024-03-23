package util;

import items.armor.Armor;
import items.weapon.Weapon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FixedArrayList<T> extends ArrayList<T> implements Serializable {

    private int capacity;

    public FixedArrayList(int capacity) {

        super(capacity);
        this.capacity = capacity;
    }

    @Override
    public boolean add(T e) {

        return size() < capacity && super.add(e);
    }

    public void expandCapacity(int amount) {

        capacity += amount;
        ensureCapacity(capacity);
    }

    public List<Armor> filterArmors() {

        List<Armor> armors = new ArrayList<>();
        for (T item : this) {
            if (item instanceof Armor) {
                armors.add((Armor) item);
            }
        }
        return armors;
    }

    public List<Weapon> filterWeapons() {

        List<Weapon> weapons = new ArrayList<>();
        for (T item : this) {
            if (item instanceof Weapon) {
                weapons.add((Weapon) item);
            }
        }
        return weapons;
    }
}
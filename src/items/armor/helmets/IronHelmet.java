package items.armor.helmets;

import items.armor.Armor;

public class IronHelmet extends Armor {
    protected int toughness;
    protected int slowResist;
    public IronHelmet(String name, String description, int price, int defense, int toughness, int slowResist) {
        super(name, description, price, defense);
        this.toughness=toughness;
        this.slowResist=slowResist;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getSlowResist() {
        return slowResist;
    }

    public void setSlowResist(int slowResist) {
        this.slowResist = slowResist;
    }

    @Override
    public void effect(){
        System.out.println("There's an effect on this helmet");
    }
}

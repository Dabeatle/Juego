package items.armor.helmets;

import items.armor.Armor;

public class HideHelmet extends Armor {
    protected int  mrBoost;
    public HideHelmet(String name, String description, int defense, int price, int mrBoost) {
        super(name, description, defense, price);
        this.mrBoost=mrBoost;
    }
    public int getMrBoost() {
        return mrBoost;
    }
    public void setMrBoost(int mrBoost) {
        this.mrBoost = mrBoost;
    }

    @Override
    public void effect(){
        System.out.println("There's an effect on this helmet");
    }
}
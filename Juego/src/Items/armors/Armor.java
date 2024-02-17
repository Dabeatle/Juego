package Items.armors;

import Items.Item;

public abstract class Armor extends Item {
    protected int def;
    public abstract void effect();

    public Armor(int def) {
        this.def = def;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}

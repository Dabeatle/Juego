package character;

import java.io.Serializable;

public abstract class BasicCharacter implements Serializable {

    protected String name;
    protected int hp;
    protected int mp;
    protected int maxHp;
    protected int maxMp;

    public BasicCharacter(String name, int hp, int mp) {

        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.maxHp = hp;
        this.maxMp = mp;
    }

    public abstract void displayData();

    public void takeDamage(int damage) {
        hp -= damage;
    }

    public void heal(int amount) {
        hp += amount;
        if (hp > maxHp) hp = maxHp;
    }

    public void recoverMp(int amount) {

        mp += amount;
        if (mp > maxMp) mp = maxMp;
    }

    public void useMp(int amount) {
        mp -= amount;
    }

    public boolean isDead() {
        return hp <= 0;
    }
}
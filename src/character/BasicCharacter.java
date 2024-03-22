package character;
import javax.swing.*;

public class BasicCharacter {
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

    public void displayData() {
        String output = String.format("Name: %s\n", name);
        output += String.format("\tHP: %d/%d\n", hp, maxHp);
        output += String.format("\tMP: %d/%d\n", mp, maxMp);
        JOptionPane.showMessageDialog(null, output);
    }

    public void takeDamage(int damage) {
        hp -= damage;
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
    }
}

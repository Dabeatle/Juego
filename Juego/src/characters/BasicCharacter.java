package characters;

import javax.swing.*;

public abstract class BasicCharacter {
    protected String name;
    protected int hp;
    protected int mp;
    protected int maxHp;
    protected int maxMp;

    public BasicCharacter(String name, int hp, int mp, int maxHp, int maxMp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.maxHp = maxHp;
        this.maxMp = maxMp;
    }
    public void displayData() {

        String output = String.format("Name: %s\n", name);
        output += String.format("\tHP: %d/%d\n", hp, maxHp);
        output += String.format("\tMP: %d/%d\n", mp, maxMp);
        JOptionPane.showMessageDialog(null, output);
    }
}

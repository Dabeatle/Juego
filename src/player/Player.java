package player;
import character.BasicCharacter;
import enemy.Enemy;
import items.armor.Armor;
import items.armor.helmets.HideHelmet;
import items.weapon.Weapon;
import items.weapon.blades.WoodenSword;
import util.Randomized;
import javax.swing.*;

public class Player extends BasicCharacter {
    protected int experience;
    protected int level;
    protected int damage;
    protected int defense;
    protected int gold;
    protected Weapon weapon;
    protected Armor armor;

    protected Inventory inventory;

    public Player() {
        super(JOptionPane.showInputDialog("Ingresa el nombre del jugador: "), 1200, 10);
        this.experience = 0;
        this.level = 1;
        this.damage = 56;
        this.defense = 20;
        this.gold = 0;
        this.weapon = null;
        this.armor = null;

        int capacity = 3;
        inventory = new Inventory(capacity);
        for(int i = 0; i < capacity; i++){
            inventory.addItem(new WoodenSword("Wooden Sword", "A wooden sword", 300, 24, 34));
        }
        randomizeStats(10);
    }

    public int attackDamage() {
        return weapon != null ? damage + weapon.getAttack() : damage;
    }

    public void takeDamage(int damage) {
        if (armor != null) {
            damage -= armor.getDefense();
            if (damage < 0) damage = 0;
        }
        super.takeDamage(damage);
        if (isDead()) printDeath();
    }

    public void attack(Enemy enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " for " + attackDamage() + " damage!");
        enemy.takeDamage(attackDamage());
        if (enemy.isDead()) {
            gainExperience(enemy.getExperience());
            gainGold(enemy.getGold());
        }
    }

    public void gainExperience(int experience) {
        this.experience += experience;
    }

    public void gainGold(int gold) {
        this.gold += gold;
    }

    public void randomizeStats(int maxPoints) {
        int stat = Randomized.randomizeNumber(1, 2);
        int currentPoints = maxPoints;
        while (currentPoints > 0) {
            switch (stat) {
                case 1 -> {
                    if (damage < (level * 5)) damage++;
                    else maxPoints++;
                }
                case 2 -> {
                    if (defense < (level * 5)) defense++;
                    else maxPoints++;
                }
            }
            currentPoints--;
            stat = Randomized.randomizeNumber(1, 2);
        }
    }

    public void printDeath(){
        displayData();
        JOptionPane.showMessageDialog(null, "A player has been slayed!");
    }

    @Override
    public void displayData() {
        String output = String.format("Name: %s\n", name);
        output += String.format("\tHP: %d/%d\n", hp, maxHp);
        output += String.format("\tMP: %d/%d\n", mp, maxMp);
        output += String.format("\tExperience: %d\n", experience);
        output += String.format("\tLevel: %d\n", level);
        output += String.format("\tStrength: %d\n", damage);
        output += String.format("\tDefense: %d\n", defense);
        JOptionPane.showMessageDialog(null, output);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }


    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}

package enemy.Jonia;
import enemy.Enemy;
import player.Player;
import static util.Randomized.randomizeNumber;

public class Zed extends Enemy {
    public Zed() {
        super("Zed", 654, 125, 750, 210);
    }

    @Override
    public void attack(Player player) {
        switch (randomizeNumber(0, 2)) {
            case 0 -> razorShuriken(player);
            case 1 -> shadowSlash(player);
            case 2 -> deathMark(player);
        }
    }

    private void razorShuriken(Player player) {
        System.out.println("Yone thrusts his Steel Sword into your butthole, player takes 420 damage!");
        player.takeDamage(420);
    }

    public void shadowSlash(Player player) {
        System.out.println("Yone unbounds his soul and starts slashing, player takes 160 damage!");
        player.takeDamage(160);
    }

    public void deathMark(Player player) {
        System.out.println("Yone prepares to impregnate you and leave you hanging, player takes 619 spiritual damage and loses 37 gold!");
        player.takeDamage(619);
        player.setGold(player.getGold() - 5);
    }
}

package enemy.Jonia;
import enemy.Enemy;
import player.Player;
import static util.Randomized.randomizeNumber;

public class Yone extends Enemy {
    public Yone() {
        super("Yone", 620, 60, 1000, 360);
    }

    @Override
    public void attack(Player player) {
        switch (randomizeNumber(0, 2)) {
            case 0 -> mortalSteel(player);
            case 1 -> soulUnbound(player);
            case 2 -> fateSealed(player);
        }
    }

    private void mortalSteel(Player player) {
        System.out.println("Yone thrusts his Steel Sword into your butthole, player takes 420 damage!");
        player.takeDamage(420);
    }

    public void soulUnbound(Player player) {
        System.out.println("Yone unbounds his soul and starts slashing, player takes 160 damage!");
        player.takeDamage(160);
    }

    public void fateSealed(Player player) {
        System.out.println("Yone prepares to impregnate you and leave you hanging, player takes 619 spiritual damage and loses 37 gold!");
        player.takeDamage(619);
        player.setGold(player.getGold() - 5);
    }
}


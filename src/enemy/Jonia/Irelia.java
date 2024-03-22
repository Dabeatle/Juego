package enemy.Jonia;
import enemy.Enemy;
import player.Player;
import static util.Randomized.randomizeNumber;

public class Irelia extends Enemy {
    public Irelia() {
        super("Irelia", 590, 100, 500, 160);
    }

    @Override
    public void attack(Player player) {
        switch (randomizeNumber(0, 2)) {
            case 0 -> bladeSurge(player);
            case 1 -> defiantDance(player);
            case 2 -> flawlessDuet(player);
        }
    }

    private void bladeSurge(Player player) {
        System.out.println("bladeSurge");
        player.takeDamage(420);
    }

    public void defiantDance(Player player) {
        System.out.println("defiantDance");
        player.takeDamage(160);
    }

    public void flawlessDuet(Player player) {
        System.out.println("flawlessDuet");
        player.takeDamage(619);
        player.setGold(player.getGold() - 200);
    }
}

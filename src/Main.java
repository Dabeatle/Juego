import enemy.Jonia.Irelia;
import enemy.Jonia.Yone;
import enemy.Jonia.Zed;
import player.Player;

import java.io.IOException;

import static util.Randomized.randomizeNumber;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Irelia irelia = new Irelia();
        Yone yone = new Yone();
        Zed zed = new Zed();

        System.out.println("Player items: ");
        player.getInventory().printItems();
        System.out.println("-------------------------------\n");

        int turnNumber = 0;
        while(!player.isDead() || irelia.isDead() && yone.isDead() && zed.isDead()){
            System.out.println("Turn: " + turnNumber);

            System.out.println("Player attacks");
            switch (randomizeNumber(0, 2)) {
                case 0 -> {
                    if (!irelia.isDead()) {
                        player.attack(irelia);
                    } else {
                        System.out.println(irelia.getName() + " ya esta muerta");
                    }
                }
                case 1 -> {
                    if (!zed.isDead()) {
                        player.attack(zed);
                    } else {
                        System.out.println(zed.getName() + " ya esta muerto");
                    }
                }
                case 2 -> {
                    if (!yone.isDead()) {
                        player.attack(yone);
                    } else {
                        System.out.println(yone.getName() + " ya esta muerto");
                    }
                }
            }

            System.out.println("\nEnemy attacks");
            switch (randomizeNumber(0, 2)) {
                case 0 -> irelia.attack(player);
                case 1 -> yone.attack(player);
                case 2 -> zed.attack(player);
            }
            player.getInventory().removeItemRandomly();
            System.out.println("Player items: ");
            player.getInventory().printItems();
            System.out.println("-------------------------------\n");

            try {
                System.out.println("-------------------------------");
                System.in.read();
                turnNumber++;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
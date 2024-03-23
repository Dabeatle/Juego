package player;

import items.Item;
import items.armor.Armor;
import items.Weapon.Weapon;
import util.FixedArrayList;
import util.Interactive;

import javax.swing.*;
import java.io.Serializable;
import java.util.List;

public class Inventory implements Serializable {

    private final FixedArrayList<Item> items;

    public Inventory() {

        items = new FixedArrayList<>(15);
    }

    public void equipArmorMenu(Player player) {

        List<Armor> armors = items.filterArmors();
        String message = getArmorMessage(armors);
        try {

            int option = Integer.parseInt(JOptionPane.showInputDialog(message));
            if (option > 0 && option <= armors.size()) equipArmorAction(player, armors, option);
        } catch (Exception e) {
            Interactive.printDialog("Opción inválida.");
            equipArmorMenu(player);
        }
    }

    private String getArmorMessage(List<Armor> armors) {

        StringBuilder message = new StringBuilder("Equipar Armadura:\n");
        String itemMessage;
        Armor actualArmor;
        for (int i = 0; i < armors.size(); i++) {

            actualArmor = armors.get(i);
            itemMessage = String.format("%d. %s - %s\n", i + 1, actualArmor.getName(), actualArmor.getDescription());
            message.append(itemMessage);
        }
        message.append("0. Salir\n");
        return message.toString();
    }

    private void equipArmorAction(Player player, List<Armor> armors, int option) {

        Armor selectedArmor = armors.get(option - 1);
        if (player.getArmor() != null)
            items.add(player.getArmor());
        player.equipArmor(selectedArmor);
        player.printEquipArmor(selectedArmor);
        items.remove(selectedArmor);
    }

    public void equipWeaponMenu(Player player) {

        List<Weapon> weapon = items.filterWeapons();
        String message = getWeaponMessage(weapons);
        try {
            int option = Integer.parseInt(JOptionPane.showInputDialog(message));
            if (option > 0 && option <= weapons.size()) {

                equipWeaponAction(player, weapons, option);
            }
        } catch (Exception e) {
            Interactive.printDialog("Opción inválida.");
            equipWeaponMenu(player);
        }
    }

    private void equipWeaponAction(Player player, List<Weapon> weapons, int option) {

        Weapon selectedWeapon = weapons.get(option - 1);
        if (player.getWeapon() != null)
            items.add(player.getWeapon());
        player.equipWeapon(selectedWeapon);
        player.printEquipWeapon(selectedWeapon);
        items.remove(selectedWeapon);
    }

    private String getWeaponMessage(List<Weapon> weapons) {

        StringBuilder message = new StringBuilder("Equipar Arma:\n");
        String itemMessage;
        Weapon actualWeapon;
        for (int i = 0; i < weapons.size(); i++) {

            actualWeapon = weapons.get(i);
            itemMessage = String.format("%d. %s - %s\n", i + 1, actualWeapon.getName(), actualWeapon.getDescription());
            message.append(itemMessage);
        }
        message.append("0. Salir\n");
        return message.toString();
    }

    public void addItem(Item item) {

        String addMessage = String.format("%s se ha agregado al Inventario!", item.getName());
        Interactive.printDialog(items.add(item) ? addMessage : "Inventario Lleno.");
    }

    public void removeItem(Item item) {

        items.remove(item);
    }

    public FixedArrayList<Item> getItems() {

        return items;
    }

    public void printItems() {

        if (items.isEmpty()) {

            Interactive.printDialog("Inventario Vació.");
        } else {
            StringBuilder message = new StringBuilder("Inventario:\n");
            String itemMessage;
            for (Item item : items) {
                itemMessage = String.format("%s - %s\n", item.getName(), item.getDescription());
                message.append(itemMessage);
            }
            Interactive.printDialog(message.toString());
        }
    }
}
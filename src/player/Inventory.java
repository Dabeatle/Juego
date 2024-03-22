package player;

import items.Item;
import util.FixedArrayList;

public class Inventory {

    private final FixedArrayList<Item> items;

    public Inventory(int capacity) {

        items = new FixedArrayList<>(capacity);
    }

    public void addItem(Item item) {

        System.out.println(items.add(item) ? item.getName() + " has been added to your inventory." : "Inventory is full.");
    }

    public void removeItem(Item item) {

        items.remove(item);
    }

    public void removeItemRandomly(){
        if(!items.isEmpty()){
            int rando = (int)((Math.random()*items.size()));
            items.remove(rando);
        }

    }

    public FixedArrayList<Item> getItems() {

        return items;
    }

    public void printItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Item item : items) {
                System.out.println(item.getName() + " - " + item.getDescription());
            }
        }
    }
}

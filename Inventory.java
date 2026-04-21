import java.util.*;

public class Inventory {

    private HashMap<String, Item> items = new HashMap<>();

    public void addItem(Item item) {
        items.put(item.getItemId(), item);
        System.out.println("Item added successfully");
    }

    public void removeItem(String id) {
        if(items.containsKey(id)) {
            items.remove(id);
            System.out.println("Item removed");
        }
        else {
            System.out.println("Item not found");
        }
    }

    public void updateQuantity(String id, int qty) {
        if(items.containsKey(id)) {
            items.get(id).setQuantity(qty);
            System.out.println("Quantity updated");
        }
        else {
            System.out.println("Item not found");
        }
    }

    public void searchById(String id) {
        if(items.containsKey(id)) {
            System.out.println(items.get(id));
        }
        else {
            System.out.println("Item not found");
        }
    }

    public void searchByName(String name) {
        boolean found = false;

        for(Item item : items.values()) {
            if(item.getItemName().equalsIgnoreCase(name)) {
                System.out.println(item);
                found = true;
            }
        }

        if(!found)
            System.out.println("Item not found");
    }

    public void displayItems() {
        if(items.isEmpty()) {
            System.out.println("Inventory empty");
            return;
        }

        for(Item item : items.values()) {
            System.out.println(item);
        }
    }
}
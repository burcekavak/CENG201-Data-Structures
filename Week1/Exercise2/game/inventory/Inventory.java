package game.inventory;

public class Inventory {

    private Item[] items;
    private int itemCount;

    // Constructor
    public Inventory() {
        items = new Item[10];
        itemCount = 0;
    }

    // Add an item to the inventory
    public void addItem(Item item) {

        if (item == null) {
            System.out.println("Warning: Cannot add a null item.");
            return;
        }

        if (itemCount >= items.length) {
            System.out.println("Warning: Inventory is full.");
            return;
        }

        items[itemCount] = item;
        itemCount++;

        System.out.println(item.getName() + " added to inventory.");
    }

    // Display all items
    public void displayAll() {

        System.out.println("\n=== Inventory Items ===");

        if (itemCount == 0) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (int i = 0; i < itemCount; i++) {

            Item item = items[i];

            System.out.println(
                "Name: " + item.getName()
                + ", Genre: " + item.getGenre()
                + ", Stock: " + item.getStockCount()
            );
        }
    }

    // Display serial codes
    public void auditSerialCodes() {

        System.out.println("\n=== Serial Code Audit ===");

        for (int i = 0; i < itemCount; i++) {

            Item item = items[i];

            System.out.println(
                item.getName() + " - " + item.getSerialCode()
            );
        }
    }
}
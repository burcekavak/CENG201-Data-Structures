import game.inventory.Item;
import game.inventory.Inventory;

public class GameShop {

    public static void main(String[] args) {

        System.out.println("=== Game Shop Inventory ===\n");

        // Create inventory
        Inventory inventory = new Inventory();

        // Create items
        Item item1 = new Item(
                "Minecraft",
                "Sandbox",
                10,
                "MC-1001"
        );

        Item item2 = new Item(
                "The Sims 4",
                "Simulation",
                5,
                "SIM-2002"
        );

        Item item3 = new Item(
                "FIFA 26",
                "Sports",
                8,
                "FIFA-3003"
        );

        // Add items
        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);

        // Display inventory
        inventory.displayAll();

        // Sell items
        System.out.println("\n=== Selling Items ===");

        item1.sell(3);
        item2.sell(2);

        // Try to sell more items than available
        item3.sell(20);

        // Display updated inventory
        inventory.displayAll();

        // Audit serial codes
        inventory.auditSerialCodes();

        // This line would cause a compilation error:
        // System.out.println(item1.getSerialCode());
        //
        // getSerialCode() is package-private.
        // GameShop is outside the game.inventory package.
    }
}
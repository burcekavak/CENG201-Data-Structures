package game.inventory;

public class Item {

    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;

        if (stockCount < 0) {
            System.out.println("Warning: Invalid stock count. Setting to 0.");
            this.stockCount = 0;
        } else {
            this.stockCount = stockCount;
        }

        this.serialCode = serialCode;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    private boolean isAvailable(int quantity) {
        return quantity > 0 && stockCount >= quantity;
    }

    public void sell(int quantity) {
        if (quantity <= 0) {
            System.out.println("Warning: Quantity must be greater than 0.");
            return;
        }

        if (isAvailable(quantity)) {
            stockCount -= quantity;
            System.out.println(quantity + " unit(s) of " + name + " sold.");
        } else {
            System.out.println("Warning: Not enough stock for " + name + ".");
        }
    }

    // Package-private method
    String getSerialCode() {
        return serialCode;
    }
}
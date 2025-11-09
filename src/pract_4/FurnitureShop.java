package pract_4;

public class FurnitureShop {
    private Furniture[] furnitureArray;
    private int count;

    public FurnitureShop(int capacity) {
        furnitureArray = new Furniture[capacity];
        count = 0;
    }

    public void addFurniture(Furniture furniture) {
        if (count < furnitureArray.length) {
            furnitureArray[count] = furniture;
            count++;
        } else {
            System.out.println("Магазин переполнен!");
        }
    }

    public void displayAssortment() {
        System.out.println("=== АССОРТИМЕНТ МАГАЗИНА МЕБЕЛИ ===");
        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Товар " + (i + 1) + " ---");
            furnitureArray[i].displayInfo();
            System.out.print("Процесс сборки: ");
            furnitureArray[i].assemble();
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += furnitureArray[i].getPrice();
        }
        return total;
    }
}
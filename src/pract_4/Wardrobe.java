package pract_4;

public class Wardrobe extends Furniture {
    private int numberOfShelves;
    private boolean hasMirror;

    public Wardrobe(String name, double price, String material, int numberOfShelves, boolean hasMirror) {
        super(name, price, material);
        this.numberOfShelves = numberOfShelves;
        this.hasMirror = hasMirror;
    }

    @Override
    public void assemble() {
        System.out.println("Сборка шкафа: устанавливаем " + numberOfShelves +
                " полок" + (hasMirror ? ", вешаем зеркало" : ""));
    }

    @Override
    public String getDescription() {
        return "Шкаф с " + numberOfShelves + " полками" +
                (hasMirror ? " и зеркалом" : " без зеркала");
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public boolean hasMirror() {
        return hasMirror;
    }
}
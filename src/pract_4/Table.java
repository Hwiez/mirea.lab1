package pract_4;

public class Table extends Furniture {
    private int numberOfLegs;
    private double tableArea;

    public Table(String name, double price, String material, int numberOfLegs, double tableArea) {
        super(name, price, material);
        this.numberOfLegs = numberOfLegs;
        this.tableArea = tableArea;
    }

    @Override
    public void assemble() {
        System.out.println("Сборка стола: устанавливаем " + numberOfLegs +
                " ножек и столешницу площадью " + tableArea + " м²");
    }

    @Override
    public String getDescription() {
        return "Стол с " + numberOfLegs + " ножками, площадь: " + tableArea + " м²";
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public double getTableArea() {
        return tableArea;
    }
}


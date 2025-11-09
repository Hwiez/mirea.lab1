package pract_4;

public class Chair extends Furniture {
    private boolean hasBackrest;

    public Chair(String name, double price, String material, boolean hasBackrest) {
        super(name, price, material);
        this.hasBackrest = hasBackrest;
    }

    @Override
    public void assemble() {
        System.out.println("Сборка стула: прикручиваем ножки и сиденье" +
                (hasBackrest ? ", устанавливаем спинку" : ""));
    }

    @Override
    public String getDescription() {
        return "Стул " + (hasBackrest ? "со спинкой" : "без спинки") +
                ", материал: " + material;
    }

    public boolean hasBackrest() {
        return hasBackrest;
    }
}

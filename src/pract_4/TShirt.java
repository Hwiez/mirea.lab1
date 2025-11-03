package pract_4;

// Классы одежды
class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: размер " + size + ", цвет " + color + ", цена " + cost);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: размер " + size + ", цвет " + color + ", цена " + cost);
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: размер " + size + ", цвет " + color + ", цена " + cost);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: размер " + size + ", цвет " + color + ", цена " + cost);
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка: размер " + size + ", цвет " + color + ", цена " + cost);
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук: размер " + size + ", цвет " + color + ", цена " + cost);
    }
}
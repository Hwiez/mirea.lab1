package pract_4;

class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 1500, "Красный"),
                new Pants(Size.L, 3000, "Синий"),
                new Skirt(Size.S, 2000, "Черный"),
                new Tie(Size.XS, 800, "Зеленый")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        System.out.println();
        atelier.dressMan(clothes);
    }
}

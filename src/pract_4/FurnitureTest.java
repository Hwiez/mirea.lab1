package pract_4;

public class FurnitureTest {
    public static void main(String[] args) {
        // Создание мебели
        Chair chair = new Chair("Офисный стул", 3500, "металл+ткань", true);
        Table table = new Table("Обеденный стол", 12000, "дерево", 4, 1.5);
        Wardrobe wardrobe = new Wardrobe("Гардеробный шкаф", 25000, "ЛДСП", 5, true);

        // Создание магазина и добавление мебели
        FurnitureShop shop = new FurnitureShop(10);
        shop.addFurniture(chair);
        shop.addFurniture(table);
        shop.addFurniture(wardrobe);

        // Отображение ассортимента
        shop.displayAssortment();

        System.out.println("\nОбщая стоимость всего ассортимента: " +
                shop.calculateTotalPrice() + " руб.");
    }
}
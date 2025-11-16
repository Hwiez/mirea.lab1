package pract_6;

import java.util.List;

public class Main_COMPUTER {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Computer computer1 = new Computer(
                Brand.DELL,
                new Processor("Intel i7", 3.5),
                new Memory(16, "DDR4"),
                new Monitor(24, "1920x1080")
        );

        Computer computer2 = new Computer(
                Brand.LENOVO,
                new Processor("AMD Ryzen 5", 3.2),
                new Memory(8, "DDR4"),
                new Monitor(22, "1920x1080")
        );

        shop.addComputer(computer1);
        shop.addComputer(computer2);

        // Поиск компьютеров по бренду
        List<Computer> dellComputers = shop.findComputersByBrand(Brand.DELL);
        for (Computer computer : dellComputers) {
            System.out.println(computer);
        }
    }
}

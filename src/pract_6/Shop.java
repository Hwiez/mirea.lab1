package pract_6;


import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public List<Computer> findComputersByBrand(Brand brand) {
        List<Computer> result = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                result.add(computer);
            }
        }
        return result;
    }
}
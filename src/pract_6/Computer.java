package pract_6;

public class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    // Геттер для бренда
    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return brand + " Computer [Processor: " + processor + ", Memory: " + memory + ", Monitor: " + monitor + "]";
    }
}
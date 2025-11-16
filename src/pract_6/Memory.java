package pract_6;

public class Memory {
    private int size;
    private String type;

    public Memory(int size, String type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return size + " GB " + type;
    }
}
package pract_6;

public class Monitor {
    private double size;
    private String resolution;

    public Monitor(double size, String resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return size + "\" " + resolution;
    }
}
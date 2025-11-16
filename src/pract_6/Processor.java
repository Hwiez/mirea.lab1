package pract_6;

import java.util.*;

public class Processor {
    private String model;
    private double speed;

    public Processor(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return model + " (" + speed + " GHz)";
    }
}
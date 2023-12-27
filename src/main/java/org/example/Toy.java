package org.example;

public class Toy {
    protected int id;
    protected String name;
    protected double frequency;

    public Toy(String name, double frequency) {
        this.id += 1;
        this.name = name;
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    public String getName() {
        return name;
    }
}

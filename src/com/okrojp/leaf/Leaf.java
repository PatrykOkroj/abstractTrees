package com.okrojp.leaf;

public class Leaf {
    private String color;
    private double length;
    private LeafType type;

    public Leaf(String color, double length, LeafType type) {
        this.color = color;
        this.length = length;
        this.type = type;
    }

    public LeafType getType() {
        return type;
    }

    public void setType(LeafType type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}

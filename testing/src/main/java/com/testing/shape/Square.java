package com.testing.shape;

public class Square implements Shape {

    private String name;
    private double sideA;

    public Square(String name, double sideA) {
        this.name = name;
        this.sideA = sideA;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return sideA * sideA;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", sideA=" + sideA +
                '}';
    }
}

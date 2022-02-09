package com.testing.shape;

public class Triangle implements Shape {

    private String name;
    private double sideA;
    private double height;

    public Triangle(String name, double sideA, double height) {
        this.name = name;
        this.sideA = sideA;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return sideA * height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", sideA=" + sideA +
                ", height=" + height +
                '}';
    }
}

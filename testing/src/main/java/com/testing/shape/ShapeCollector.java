package com.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape result = null;
        if (n >= 0 && n < shapes.size()) {
            result = shapes.get(n);
        }
        return result;
    }

    public String showFigures() {
        StringBuilder result = new StringBuilder();
        for (Shape figure : shapes) {
            result.append(figure).append(" ");
        }
        return result.toString();
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}

package com.testing.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCollectorTest {

    @Test
    public void addFigureTest() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 3);
        //When
        shapeCollector.addFigure(circle);
        int result = shapeCollector.getShapes().size();
        //Then
        assertEquals(1, result);
    }

    @Test
    public void removeFigureTest() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 3);
        Square square = new Square("Square", 2);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.removeFigure(square);
        int result = shapeCollector.getShapes().size();
        //Then
        assertEquals(1, result);
    }

    @Test
    public void getFigureTest() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("Triangle", 6, 3.5);
        shapeCollector.addFigure(triangle);
        //When
        String result = shapeCollector.getFigure(0).getShapeName();
        //Then
        assertEquals("Triangle", result);
    }

    @Test
    public void showFiguresTest() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("Triangle", 6, 3.5);
        Shape square = new Square("Square", 4);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        //When & Then
        System.out.println(shapeCollector.showFigures());
    }
}

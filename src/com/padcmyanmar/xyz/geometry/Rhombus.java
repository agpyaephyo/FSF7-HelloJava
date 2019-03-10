package com.padcmyanmar.xyz.geometry;

public class Rhombus extends Shape {

    private double width;
    private double height;

    public Rhombus(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void showCalculatedData(double perimeter) {
        System.out.println("The perimeter of your rhombus is " + perimeter + ".");
    }
}

package com.padcmyanmar.xyz.geometry;

public class Rectangle extends Shape {

    private static final char CHARACTER = 'R';

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public void showCalculatedData(double area, double perimeter) {
        System.out.println("The area of your rectangle is " + area + " & the perimeter is " + perimeter + ".");
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

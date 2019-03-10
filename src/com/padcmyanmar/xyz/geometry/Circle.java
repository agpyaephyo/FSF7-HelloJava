package com.padcmyanmar.xyz.geometry;

public class Circle extends Shape {

    private static final double PI = 3.142;
    private static final char CHARACTER = 'C';

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void showCalculatedData(double area, double perimeter) {
        System.out.println("The area of your circle is " + area + " & the perimeter is " + perimeter + ".");
    }
}

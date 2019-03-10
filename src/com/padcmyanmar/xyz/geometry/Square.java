package com.padcmyanmar.xyz.geometry;

public class Square extends Shape {

    private static final char CHARACTER = 'S';
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    public double getSide() {
        return side;
    }

    public void showCalculatedData(double area, double perimeter) {
        System.out.println("The area of your square is " + area + " & the perimeter is " + perimeter + ".");
    }
}

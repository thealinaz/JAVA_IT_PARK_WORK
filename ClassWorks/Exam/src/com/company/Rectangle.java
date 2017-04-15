package com.company;


public class Rectangle extends Figure{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        double s = a * b;
        return s;
    }

    public double perimetr() {
        double p = (a + b) * 2;
        return p;
    }
}

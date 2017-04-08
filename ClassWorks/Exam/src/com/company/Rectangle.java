package com.company;


public class Rectangle implements Figure{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area(double a, double b) {
        double s = a * b;
        return s;
    }

    @Override
    public double perimetr(double a, double b) {
        double p = (a + b) * 2;
        return p;
    }
}

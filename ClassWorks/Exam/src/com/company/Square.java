package com.company;



public class Square extends Rectangle{
    private double a;

    public Square(double a) {
        super(a, a);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double area() {
        double s = a * a;
        return s;
    }

    public double perimetr() {
        double p = 4 * a;
        return p;
    }
}

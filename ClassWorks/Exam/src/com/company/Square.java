package com.company;


public class Square implements Figure{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double area(double a) {
        double s = a * a;
        return s;
    }

    @Override
    public double perimetr(double a) {
        double p = 4 * a;
        return p;
    }
}

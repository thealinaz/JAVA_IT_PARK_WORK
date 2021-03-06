package com.company;


public class Triangle extends Figure {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double area() {
        double p = (a + b + c) / 2;
        double s =  java.lang.Math.sqrt(p*(p-a)*(p-b)*(p-c)) ;
        return s;
    }

    @Override
    public double perimetr() {
        double p = a + b + c;
        return p;
    }
}

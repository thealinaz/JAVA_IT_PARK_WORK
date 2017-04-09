package com.company;


import com.sun.javafx.geom.*;
import com.sun.org.apache.regexp.internal.RE;

public class Main {

    public static void main(String[] args) {
	    Figure square1 = new Square(5);
        Figure square2 = new Square(2);
        Figure square3 = new Square(5);
        Figure triangle1 = new Triangle(2, 3, 4);
        Figure triangle2 = new Triangle(4, 5, 4);
        Figure triangle3 = new Triangle(5, 6, 7);
        Figure rectangle1 = new Rectangle(5, 7);
        Figure rectangle2 = new Rectangle(10, 8);

        Figure figures[] = new Figure[8];
        figures[8] = {square1, square2, square3, triangle1, triangle2, triangle3, rectangle1, rectangle2};


        for (int i = 0; i < figures.length; i++) {
            for (int j = i; j < figures.length; j++) {
            if (figures[i].area() == figures[j].area() && figures[i].perimetr() == figures[j].perimetr() && figures[i] != NULL && figures[j] != NULL) {
                figures[i] = NULL;
                figures[j] = NULL;
            }
        }
    }
}

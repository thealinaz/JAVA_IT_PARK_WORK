package ArrayList;

import Objects.*;

public class Main {

    public static void main(String[] args) {

        Human marsel = new Human("Marsel", 23);
        Human regina = new Human("Regina", 19);
        Human alina = new Human("Alina", 18);

        Rectangle a = new Rectangle(2, 3);
        Rectangle b = new Rectangle(1, 2);
        Rectangle c = new Rectangle(4, 3);

        ArrayList<Human> humanArrayList = new ArrayList<Human>();
        humanArrayList.isEmpty();
        humanArrayList.add(marsel);
        humanArrayList.addFirst(regina);
        humanArrayList.add(alina);
        humanArrayList.delete(2);
        humanArrayList.delete(regina);
        humanArrayList.insert(alina, 1);
        humanArrayList.reverse();
        humanArrayList.isEmpty();

        ArrayList<Rectangle> rectangleArrayList = new ArrayList<Rectangle>();
        rectangleArrayList.add(a);
        rectangleArrayList.add(b);

        Human marselFromList = humanArrayList.get(0);
        System.out.println(marselFromList);
    }
}
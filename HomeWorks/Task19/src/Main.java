/*
Создать класс ParkingPlace (парковка
- парковать паркуемый объект по номеру
- пусть он уедет с парковки
Класс содержит массив "паркуемых объектов"
ParkingObject - интерфейс
getNumber()
Паркуемый объект - parking() и unparking()
Есть иерархия классов:
Транспорт - абстрактный
Машина
Мотоцикл
Велосипед - не паркуемый объект!!!
Перепределить equals, toString
*/

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ParkingPlace[] park = new ParkingPlace[10];
        Transport[] transport = new Transport[100];
        for (int i = 0; i < park.length; i++) {
            park[i] = new ParkingPlace(0, null);
        }

        for (int i = 0; true; i++) {
            switch (menu()) {
                case 1:
                    System.out.println("Enter type of transport (car, motorbike or bike):");
                    String s = in.nextLine();
                    switch (s) {
                        case "car":
                            System.out.println("Enter number of transport:");
                            transport[i] = new Car(in.next());
                            break;
                        case "motorbike":
                            System.out.println("Enter number of transport:");
                            transport[i] = new Motorbike(in.next());
                            break;
                        case "bike":
                            System.out.println("Enter number of transport:");
                            transport[i] = new Bike(in.next());
                            break;
                        default:
                            System.out.println("This type of transport do not park in our Parking Place.");
                            break;
                    }
                    try {
                        if (transport[i].parkable()) {
                            ParkingPlace.parkByNumber(transport[i], park);
                            System.out.println("Transport is parked.");
                        } else {
                            System.out.println("This type of transport is not parkable.");
                        }
                    } catch (java.lang.NullPointerException e) {
                        System.out.println("This transport is not exist in Parking Place");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Enter number of transport:");
                        String a = in.next();
                        ParkingPlace.unpark(a, park);
                    } catch (java.lang.NullPointerException e) {
                        System.out.println("Parking Place is empty!");
                    }
                    break;
                case 3:
                    showParkingPlace(park);
                    break;
                default:
                    System.out.println("Type number 1-3!");
            }
            util();
        }
    }

    public static int menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("If you want park transport - type '1'");
        System.out.println("If you want unpark transport - type '2'");
        System.out.println("If you want to see Parking Place - type '3'");
        try {
            int n = in.nextInt();
            return n;
        } catch (java.util.InputMismatchException e) {
            System.out.println("You must enter number 1 - 3!");
        }
        return menu();
    }

    public static void showParkingPlace(ParkingPlace[] park) {
        System.out.println("__________ Parking Place __________");
        for (int i = 0; i < park.length; i++) {
            if (park[i].getPlace() == 0) {
                System.out.println("Place " + (i + 1) + " is empty.");
            } else {
                System.out.println("Place " + (i + 1) + " occupied by transport number " + park[i].getNumber());
            }
        }
        System.out.println("___________________________________");
    }

    public static void util() {
        System.out.println("                                   ");
    }
}

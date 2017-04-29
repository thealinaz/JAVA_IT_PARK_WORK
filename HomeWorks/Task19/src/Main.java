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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Transport porsche = new Car("E911EE");
        Transport nissan = new Car("B005AB");
        Transport honda = new Motorbike("8776AE");
        Transport shkoda = new Car("A384AA");
        Transport specialized = new Bike("2274");

        ParkingPlace.park(porsche);
        ParkingPlace.park(nissan);
        ParkingPlace.park(honda);
        ParkingPlace.park(shkoda);
        ParkingPlace.park(specialized);
        ParkingPlace.show();
        ParkingPlace.unpark("E911EE");
        ParkingPlace.show();
    }
}
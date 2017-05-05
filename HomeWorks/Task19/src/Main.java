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
        ParkingPlace parkingPlace = new ParkingPlace();

        Transport porsche = new Car("E911EE");
        Transport nissan = new Car("B005AB");
        Transport honda = new Motorbike("8776AE");
        Transport shkoda = new Car("A384AA");
        Transport motor = new Bike("2274");

        parkingPlace.park(porsche);
        parkingPlace.park(nissan);
        parkingPlace.park(honda);
        parkingPlace.park(shkoda);
        parkingPlace.park(motor);
        parkingPlace.unpark("E911EE");
        parkingPlace.unpark("A384AA");
    }
}

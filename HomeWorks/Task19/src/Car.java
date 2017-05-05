public class Car extends Transport implements ParkingObject {

    public Car (String number) {
        super(number);
    }

    @Override
    public void goToThePark(Transport transport) {
        System.out.println("Car " + transport.toString() + " is parked.");
    }

    @Override
    public void goFromThePark(String number) {
        System.out.println("Car " + number + " is unparked.");
    }
}

public class Motorbike extends Transport implements ParkingObject{

    public Motorbike(String number) {
        super(number);
    }

    @Override
    public void goToThePark(Transport transport) {
        System.out.println("Motorbike " + transport.toString() + " is parked.");
    }

    @Override
    public void goFromThePark(String number) {
        System.out.println("Motorbike " + number + " is unparked.");
    }
}

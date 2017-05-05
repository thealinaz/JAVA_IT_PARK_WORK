public class ParkingPlace {
    private final int size = 10;
    private ParkingObject[] parkingObjects = new ParkingObject[size];

    public void park(Transport transport) {
        for (int i = 0; i < size; i++)
            if (parkingObjects[i] == null) {
                try {
                    parkingObjects[i] = (ParkingObject) transport;
                    parkingObjects[i].goToThePark(transport);
                } catch (ClassCastException e) {
                    System.out.println("This type of transport can not be parked.");
                }
                break;
            }
    }

    public void unpark(String number) {
        for (int i = 0; i < size; i++) {
            if (parkingObjects[i] != null && parkingObjects[i].getNumber() == number) {
                parkingObjects[i].goFromThePark(number);
                parkingObjects[i] = null;
                break;
            }
        }
    }
}


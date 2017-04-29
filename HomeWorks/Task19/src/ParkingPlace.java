public class ParkingPlace {
    private static final int size = 10;
    private static Transport transports[] = new Transport[size];

    public static void park(Transport transport) {
        for (int i = 0; i < size; i++)
            if (transport instanceof ParkingObject)
                if (transports[i] == null) {
                    transports[i] = transport;
                    break;
                }
    }

    public static void unpark(String number) {
        for (int i = 0; i < size; i++)
            if (transports[i] != null && transports[i].getNumber() == number)
                transports[i] = null;
    }

    public static void show() {
        for (int i = 0; i < size; i++)
            if (transports[i] != null) {
                System.out.println(transports[i].getNumber());
            }
<<<<<<< HEAD
        System.out.println();
=======
            if (i == 24) {
                System.out.println("Parking Place is full! Your transport do not park.");
            }
        }
    }


    public static void unpark(String str, ParkingPlace[] park) {
        boolean a = true;

        for (int i = 0; i < park.length; i++) {
            if (park[i].getNumber().equals(str)) {
                park[i].setPlace(0);
                park[i].setNumber(null);
                System.out.println("This transport is unparked.");
                a = false;
                break;
            }
        }
        if (a) {
            System.out.println("This transport is not exist in Parking Place");
        }
>>>>>>> f1401b3cd1ebe4403cc8a7283033e0b38926190c
    }
}

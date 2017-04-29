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
            if (transports[i] != null)
                System.out.println(transports[i].getNumber());
        System.out.println();
    }
}


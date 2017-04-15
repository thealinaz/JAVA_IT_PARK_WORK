public class ParkingPlace {
    private int place = 0;
    private String number = null;

    public ParkingPlace(int place, String number) {
        this.place = place;
        this.number = number;
    }

    public int getPlace() {
        return place;
    }

    public String getNumber() {
        return number;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static void parkByNumber(Transport transport, ParkingPlace[] park) {
        int i;
        for (i = 0; i < park.length; i++) {
            if (park[i].getPlace() == 0) {
                park[i].setPlace(1);
                park[i].setNumber(transport.getNumber());
                break;
            }
            if (i == 24) {
                System.out.println("Parking Place is full! Your transport do not park.");
            }
        }
    }

    public static void unpark(String s, ParkingPlace[] park) {
        int i;
        for (i = 0; i < park.length; i++) {
            if (park[i].getNumber() == s) {
                park[i].setPlace(0);
                park[i].setNumber(null);
                System.out.println("This transport is unparked.");
                break;
            }
        }
        if (i == park.length) {
            System.out.println("This transport is not exist in Parking Place");
        }
    }

}

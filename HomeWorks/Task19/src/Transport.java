abstract class Transport implements ParkingObject {
    private String number = null;

    public Transport(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}

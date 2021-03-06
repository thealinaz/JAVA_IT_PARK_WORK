abstract public class Transport {
    private String number = null;

    public Transport(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number;
    }

    public String getNumber() {
        return number;
    }
}

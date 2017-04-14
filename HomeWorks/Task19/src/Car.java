public class Car extends Transport{

    public Car(String number) {
        super(number);
    }

    public boolean parkable() {
        return true;
    }
}

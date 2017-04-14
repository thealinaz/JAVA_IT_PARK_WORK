public class Bike extends Transport{

    public Bike(String number) {
        super(number);
    }

    public boolean parkable() {
        return  false;
    }
}

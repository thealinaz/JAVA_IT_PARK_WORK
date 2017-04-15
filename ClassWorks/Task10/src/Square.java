public class Square extends Rectangle {
    private double a;

    public Square(String name,double a) {
        super(name, a, a);
    }
    public double getA() {
        return a;
    }
    public String toString() {
        return super.toString();
    }
}

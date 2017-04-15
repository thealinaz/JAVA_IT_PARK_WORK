public class Square extends Rectangle {
    private double a;

    public Square(double a) {
        super(a, a);
    }
    public double getA() {
        return a;
    }
    public String toString() {
        return (getA() + " ");
    }
}

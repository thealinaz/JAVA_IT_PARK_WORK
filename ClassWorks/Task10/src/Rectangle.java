public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public String toString() {
        return (super.getName() + " " + getA() + " " + getB());
    }
}

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public String toString() {
        return (super.getName() + " " + getA() + " " + getB() + " " + getC());
    }
}

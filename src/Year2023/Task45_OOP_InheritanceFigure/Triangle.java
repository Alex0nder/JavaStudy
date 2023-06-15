package Year2023.Task45_OOP_InheritanceFigure;

public class Triangle extends Figure {

    private double c;
    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }
    public Triangle(double size) {
        super(size, size);
        this.c = size;
    }


    // Heron's formula
    // a2 = h2 + (c − d)2 и b2 = h2 + d2

    @Override
    public double area() {
        double p = (getA() + getB() + c) / 2;
        double s = p * (p - getA()) * (p - getB()) * (p - c);
        return Math.sqrt(s);
    }
}

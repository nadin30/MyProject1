package HWFigures;

public class Circle implements Interface{
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double Square() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double Perimatr() {
        return 2 * Math.PI * this.radius;
    }
}

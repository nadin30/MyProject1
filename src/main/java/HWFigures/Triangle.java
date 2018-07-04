package HWFigures;

public class Triangle implements Interface {
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;

    public Triangle (double sideA, double sideB, double sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public double Square() {
        return 0.5 * this.sideA * this.height;
    }

    @Override
    public double Perimatr() {
        return this.sideA + this.sideB + this.sideC;
    }
}

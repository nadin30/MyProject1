package HWFigures;

public class Rectangle implements Interface {
    private double side_A;
    private double side_B;

    public Rectangle (double side_A, double side_B) {
        this.side_A = side_A;
        this.side_B = side_B;
    }
    @Override
    public double Square() {
        return this.side_A * this.side_B;
    }

    @Override
    public double Perimatr() {
        return (this.side_A + this.side_B) * 2;
    }
}

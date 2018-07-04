package HWFigures;

public class Quadrate implements Interface{
private double side;
public Quadrate(double side) {
    this.side = side;
}
    @Override
    public double Square() {
        return this.side * this.side;
    }

    @Override
    public double Perimatr() {
        return 4 * this.side;
    }
}

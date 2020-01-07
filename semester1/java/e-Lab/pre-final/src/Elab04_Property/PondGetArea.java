package Elab04_Property;

public class PondGetArea implements getAreable{
    private double radius;

    public PondGetArea(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }
}
